package com.cts.fms.eventmanagement.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
/**
 * This class defines the Role of the user
 * Entity
 * @author 921661
 *
 */
@Entity
public class Role {

    @Id
    @GeneratedValue
 // field used as a primary key
    private Long id;
    //this field stores the name of the role
    private String name;
 // this field holds the role Description
    private String description;

    public Role() {/* This constructor is intentionally empty. Nothing special is needed here.*/}

    /**
     * This constructor holds the class requirements
     * @param id
     * @param name
     * @param description
     */
    public Role(final Long id, final String name, final String description) {
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
