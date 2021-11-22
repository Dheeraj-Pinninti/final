package com.cts.fms.eventmanagement.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
/**
 * This class hold the type of feedback
 * given by the user
 * @author 921661
 *
 */
@Entity
public class FeedbackType {

    @Id
    @GeneratedValue
    // field used as a primary key
    private Long id;
  //this field stores the name of the feedback type
    private String name;
 // this field itself is the feedback type
    private String description;
/**
 * Constructor FeedBackType holding all the parameters
 * required to serve the need of class
 * @param id
 * @param name
 * @param description
 */
    public FeedbackType(final Long id,final String name,final String description) {
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

    public void setName(final String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }
}
