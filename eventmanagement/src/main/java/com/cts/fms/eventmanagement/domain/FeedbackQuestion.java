package com.cts.fms.eventmanagement.domain;

import javax.persistence.*;

@Entity
/**
 * This class hold user Questions
 * in the feedback section
 * @author 921661
 *
 */
public class FeedbackQuestion {

    @Id
    @GeneratedValue
  //this field acts as a primary key in the DB table
    private Long id;
  //this field stores the name of the feedback questionnaire
    private String name;
 // this field itself stores the feedback
    private String description;

   // @OneToOne(targetEntity = UserStatusType.class)
   // private UserStatusType userStatusType;

    //@OneToOne(targetEntity = FeedbackType.class)
    //private FeedbackType feedbackType;

   // @OneToMany(targetEntity = FeedbackAnswer.class)
   // private List<FeedbackAnswer> feedbackAnswerList;
/**
 * Constructor with following parameters to serve the class
 * requirements
 * @param id
 * @param name
 * @param description
 */
    public FeedbackQuestion(final Long id,final String name,final String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
