package com.cts.fms.eventmanagement.domain;

import javax.persistence.*;
import java.util.List;
/**
 * This class UserFeedbackResponse
 * is defined to gather feedback responses from the user
 * and community
 * @author 921661
 *
 */
@Entity
public class UserEventFeedbackResponse {

    @Id
    @GeneratedValue
    private Long id;

    @OneToOne(targetEntity=User.class)
    private User participant;

    private Double overallRating;

    @OneToOne(targetEntity=Event.class)
    private Event event;

//    @OneToMany(targetEntity = FeedbackQuestion.class)
//    private List<FeedbackQuestion> questionList;
/**
 * This constructor holds the following parameters
 * @param participant
 * @param overallRating
 * @param event
 */
    public UserEventFeedbackResponse(final User participant, final Double overallRating, final Event event) {
        this.participant = participant;
        this.overallRating = overallRating;
        this.event = event;
    }

    public User getParticipant() {
        return participant;
    }

    public void setParticipant(final User participant) {
        this.participant = participant;
    }

    public Double getOverallRating() {
        return overallRating;
    }

    public void setOverallRating(final Double overallRating) {
        this.overallRating = overallRating;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(final Event event) {
        this.event = event;
    }
}
