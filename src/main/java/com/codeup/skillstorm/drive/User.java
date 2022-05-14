package com.codeup.skillstorm.drive;

/**
 * The base class for anyone who logs into the app.
 *
 * TODO Requirements:
 * 1. Every User has a specific type (Driver, Passenger, etc.), so
 * 	  this class should be a generalization for those classes.
 * 	  No one will instantiate a User directly, rather a subclass of User.
 *    Hint: User is abstract
 *
 * 2. Ensure this class is properly encapsulated with getters/setters for each field.
 *    Hint: Getters and setters must conform to JavaBean specification.
 *    Use the Ride class as an example for how to write these methods properly.
 *    You should not have any public variables in this class. All fields must be private.
 */
public class User {

    public String name;
    public String email;

}

