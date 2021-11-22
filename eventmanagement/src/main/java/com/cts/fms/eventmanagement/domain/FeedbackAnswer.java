package com.cts.fms.eventmanagement.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
/**
 * This class FeedBackAnswer keeps track of the
 * answers given to the questions from the
 * other class FeedBackQuestions
 * @author 921661
 *
 */

@Entity
public class FeedbackAnswer {

    @Id
    @GeneratedValue
    //this field acts as a primary key in the DB table
    private Long id;
    //this field stores the name of the feedback answerer
    private String name;
    // this field itself stores the feedback
    private String description;

    /**
     * Constructor with following parameters
     * @param id
     * @param name
     * @param description
     */
    public FeedbackAnswer(final Long id,final String name, final String description) {//
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
