package com.codeup.skillstorm.drive;

/**
 * Your ride-sharing app/taxi driver.
 *
 * TODO Requirements:
 * 1. The Passenger is-a User, so they also have 'name' and 'email' properties. Hint: extend User
 *
 * 2. Ensure this class is properly encapsulated with getters/setters for each field.
 *    Hint: Getters and setters must conform to JavaBean specification.
 *    Use the Ride class as an example for how to write these methods properly.
 *    You should not have any public variables in this class. All fields must be private.
 */
public class Passenger extends User{

    private String name;
    private String email;

    // BUSINESS, PERSONAL, etc.
    public String accountType;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
}

