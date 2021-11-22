package com.cts.fms.eventmanagement.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class User {

    @Id
    @GeneratedValue
    //this field acts as a primary key for this Entity
    private Long id;
    //this field stores the name of the User
    private String name;
  //this field stores the user name of the User
    private String username;
  //this field stores the password of the User
    private String password;
  //this field stores the mobile number of the User
    private String mobile;
  //this field stores the email of the User
    private String email;

    @OneToOne
    private Role role;
/**
 * The construction user holds the 
 * following parameters
 * @param id
 * @param name
 * @param username
 * @param password
 * @param mobile
 * @param email
 */
    public User(final Long id, final String name, final String username, final String password, final String mobile, final String email) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.mobile = mobile;
        this.email = email;
    }

    public User() {
    	/* This constructor is intentionally empty. Nothing special is needed here.*/
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

    public String getUsername() {
        return username;
    }

    public void setUsername(final String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(final String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public Role getRole() {
        return role;
    }
    
   public String allRole() {
	   return role.getName();
   }

    public void setRole(final Role role) {
        this.role = role;
    }
}
