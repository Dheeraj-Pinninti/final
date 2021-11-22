package com.cts.fms.eventmanagement.domain;


public class Dashboard {
	//field totalEvents used to fetch count of events
    private Integer totalEvents;
    //field livesImpacted used to fetch count of the Lives Impacted
    private Integer livesImpacted;
    //field totalVolunteers used to fetch count of the all Volunteers
    private Integer totalVolunteers;
    //field totalParticipants used to fetch count of the all Participants
    private Integer totalParticipants;//

   public Dashboard() {
	   //default constructor
    }
/**
 * Constructor called with following parameters
 * @param totalEvents
 * @param livesImpacted
 * @param totalVolunteers
 * @param totalParticipants
 */
    public Dashboard(final Integer totalEvents, final Integer livesImpacted, final Integer totalVolunteers, final Integer totalParticipants) {
        this.totalEvents = totalEvents;
        this.livesImpacted = livesImpacted;
        this.totalVolunteers = totalVolunteers;
        this.totalParticipants = totalParticipants;
    }

    public Integer getTotalEvents() {
        return totalEvents;
    }

    public void setTotalEvents(final Integer totalEvents) {
        this.totalEvents = totalEvents;
    }

    public Integer getLivesImpacted() {
        return livesImpacted;
    }

    public void setLivesImpacted(final Integer livesImpacted) {
        this.livesImpacted = livesImpacted;
    }

    public Integer getTotalVolunteers() {
        return totalVolunteers;
    }

    public void setTotalVolunteers(final Integer totalVolunteers) {
        this.totalVolunteers = totalVolunteers;
    }

    public Integer getTotalParticipants() {
        return totalParticipants;
    }

    public void setTotalParticipants(Integer totalParticipants) {
        this.totalParticipants = totalParticipants;
    }
}
