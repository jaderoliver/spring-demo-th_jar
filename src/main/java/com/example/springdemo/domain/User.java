package com.example.springdemo.domain;

import org.springframework.stereotype.Component;

/**
 * User domain to wrapper class.
 * 
 * @author willes.reis
 */
@Component
public class User {

    private String firstName;
    private String lastName;
    private int age;

    protected User() {}

    public User(String firstName, String lastName, int age) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.age = age;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
	return firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
	return lastName;
    }

    /**
     * @return the age
     */
    public int getAge() {
	return age;
    }

}
