package com.cts.fms.eventmanagement.controller;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.compress.utils.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.fms.eventmanagement.domain.Dashboard;
import com.cts.fms.eventmanagement.domain.Event;
import com.cts.fms.eventmanagement.domain.User;
import com.cts.fms.eventmanagement.exporter.AbstractExcelFileExporter;
import com.cts.fms.eventmanagement.repository.EventRepository;
import com.cts.fms.eventmanagement.repository.UserRepository;


@RestController
@RequestMapping("/event/api/v1/")
/**
 * This is the Main controller class for
 * Event Management, the code approach starts from here
 * to the services and repository layer
 * @author 921661
 *
 */
public class EventController {

	// Object of Class EventRepository to access Event's database
    @Autowired
    private EventRepository eventRepository;
 
  //Object of Class UserRepository to access User's database
    @Autowired
   private UserRepository userRepository;

    @Autowired
   //private RoleRepository roleRepository;//Object of Class RoleRepository to access Role's database

    /**
     * This method is used to retrieve the Event related entity values from DB
     * retrieve all the Events present in the DB
     *
     * @return object of the Repository as a List
     *
     */
    @GetMapping("/listAll")
    public List<Event> eventList() {
        return eventRepository.findAll();
    }

    @GetMapping("/welcome")
    public String welcome() {
    	return "WELCOME";
    }

    /**
     * This method is used to find an event by userName
     * retrieve the Employee by EmployeeId
     *
     * @return findByPoc
     */
    @PostMapping("/findEventByUser")
    public List<Event> findEventByUser(@RequestBody final User userIns) {
        final User poc = userRepository.findByUsername(userIns.getUsername());
         return eventRepository.findByPoc(poc);
       
    }
    
    /**
     * This method is used to retrieve the Events from the DB
     * retrieve the events by eventId
     *
     * @return the Events matching with eventId
     * @PathVariable This is the parameter to findById method
     */

    @GetMapping("/findByEventId/{eventId}")
    public Event findById(@PathVariable final String eventId) {
        
        return eventRepository.findByEventId(eventId);
    }

    /**
     * This method is used to retrieve Dash board from the DB
     * retrieve all info in Dash Board
     *
     * @return the Dash board Object with totalEvents,livesImpacted,totalVolunteer,totalParticipants
     * 
     */
    @GetMapping("/dashboard")
    public Dashboard dashboard() {
        final List<Event> eventList = eventRepository.findAll();
        final int totalEvents = eventList.size();
        final int livesImpacted = eventList.stream().mapToInt(x -> Integer.parseInt(x.getLivesImpacted())).sum();
        final int totalVolunteer = eventList.stream().mapToInt(x -> Integer.parseInt(x.getTotalVolunteer())).sum();
        final int totalParticipants = eventList.stream().mapToInt(x -> x.getUserEventFeedbackResponseList().size()).sum();
        return new Dashboard(totalEvents,livesImpacted,totalVolunteer,totalParticipants);
        
    }
    /**
     * This method is used to retrieve all the POC Dash board table contents
     * 
     *
     * @return Dash board object with parameters totalEvents,livesImpacted,totalVolunteer,totalParticipants
     */

    @PostMapping("/pocDashboard")
    public Dashboard pocDashboard(@RequestBody final Map<String,String> params) {//

        final String username = params.get("username");
        final User poc = userRepository.findByUsername(username);
        
        final List<Event> eventList = eventRepository.findByPoc(poc);

        final int totalEvents = eventList.size();
        final int livesImpacted = eventList.stream().mapToInt(x -> Integer.parseInt(x.getLivesImpacted())).sum();
        final int totalVolunteer = eventList.stream().mapToInt(x -> Integer.parseInt(x.getTotalVolunteer())).sum();
        final int totalParticipants = eventList.stream().mapToInt(x -> x.getUserEventFeedbackResponseList().size()).sum();
        return new Dashboard(totalEvents,livesImpacted,totalVolunteer,totalParticipants);

       

    }
    
    /**
     * This method is used to download the report.xlsx file
     * 
     *
     * 
     *      
     *      */
    @PostMapping("/download/report.xlsx")
    public void downloadCsv(final HttpServletResponse response,@RequestBody final Map<String,String> params) throws IOException {//
        response.setContentType("application/octet-stream");
        response.setHeader("Content-Disposition", "attachment; filename=report.xlsx");
        final String username = params.get("username");
        final User poc = userRepository.findByUsername(username);
        List<Event> eventList;
        if("admin".equals(poc.allRole()))	{
            eventList = eventRepository.findAll();
        } else {
            eventList = eventRepository.findByPoc(poc);
        }
        
        final ByteArrayInputStream stream = AbstractExcelFileExporter.contactListToExcelFile(eventList);
        IOUtils.copy(stream, response.getOutputStream());
    }

}
