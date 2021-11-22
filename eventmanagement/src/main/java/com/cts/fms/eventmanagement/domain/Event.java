package com.cts.fms.eventmanagement.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="event")
@Data
/**
 * This class Event is used to store the
 * tables values of the following parameters in DB
 * @author 921661
 *
 */
public class Event {//
    @Id
    @GeneratedValue
    // field id used as a primary key for tables
	private Long id;
    // field eventId used to store and retrieve details of event
    private String eventId;
    // field name used to store and retrieve all the names
    private String name;
    // field description used to store and retrieve description
    private String description;
    // field to get details of start date
    private String startDate;
    // field to get the baseLocation
    private String baseLocation;
 //field to get the beneficiaryName
    private String beneficiaryName;
 // field to get the venueAddress
    private String venueAddress;
 // field to get the councilName
    private String councilName;
 // field to get the projectName
    private String projectName;
 // field to get the category
    private String category;
 // field to get the businessUnit
    private String businessUnit;
 // field to get the totalVolunteer
    private String totalVolunteer;
 // field to get the totalVolunteerHour
    private String totalVolunteerHour;
 // field to get the totalTravelHour
    private String totalTravelHour;
 // field to get the volunterHour
    private String volunterHour;
 // field to get the livesImpacted
    private String livesImpacted;
 // field to get the activityType
    private String activityType;
 // field to get the status
    private String status;

    @OneToOne(targetEntity =  User.class,fetch = FetchType.LAZY)
    private User poc;

    @OneToMany(targetEntity = UserEventFeedbackResponse.class)
    private List<UserEventFeedbackResponse> feedbackResponseList;

    public Event() {
    	//Default Constructor
    }

  

    public List<UserEventFeedbackResponse> getUserEventFeedbackResponseList() {
        return feedbackResponseList;
    }

    public void setUserEventFeedbackResponseList() {
        this.feedbackResponseList = feedbackResponseList;
    }


}
