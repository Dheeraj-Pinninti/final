package com.cts.fms.eventmanagement.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
/**
 * the class UserStatusType defines
 * the status type of a User
 * @author 921661
 *
 */
@Entity
public class UserStatusType {

    @Id
    @GeneratedValue
    //this field acts as a primary key for this Entity
    private Long id;
  //this field stores the name of the User
    private String name;
    // this field elaborated the status type
    private String description;

    public UserStatusType() {/* This constructor is intentionally empty. Nothing special is needed here.*/}
/**
 * This constructor holds the parameters required 
 * for the class 
 * @param id
 * @param name
 * @param description
 */
    public UserStatusType(final Long id, final String name, final String description) {
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
