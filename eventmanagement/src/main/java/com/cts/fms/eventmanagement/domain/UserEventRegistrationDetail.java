package com.cts.fms.eventmanagement.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
/**
 * The class UserEventRegistrationDetail
 * serves as a holder for 
 * all the registration details of a User
 * @author 921661
 *
 */
@Entity
public class UserEventRegistrationDetail {

    @Id
    @GeneratedValue
    //this field is a primary key
    private Long id;

    @OneToOne(targetEntity=User.class)
    //this field is of type User(class)
    private User user;

    @OneToOne(targetEntity=Event.class)
    //this is an object of class Event
    private Event event;

    @OneToOne(targetEntity =  UserStatusType.class)
  //this is an object of class UserStatusType
    private UserStatusType userStatusType;

    public UserEventRegistrationDetail() {/* This constructor is intentionally empty. Nothing special is needed here.*/}
/**
 * This constructor holds the parameters
 * required for the class
 * @param id
 * @param user
 * @param event
 */
    public UserEventRegistrationDetail(final Long id, final User user, final Event event) {
        this.id = id;
        this.user = user;
        this.event = event;
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(final User user) {
        this.user = user;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(final Event event) {
        this.event = event;
    }

    public UserStatusType getUserStatusType() {
        return userStatusType;
    }

    public void setUserStatusType(final UserStatusType userStatusType) {
        this.userStatusType = userStatusType;
    }
}
