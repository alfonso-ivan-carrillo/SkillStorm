package com.codeup.skillstorm.drive;
/**
 * The Vehicle that the Driver uses for work.
 *
 * TODO Requirements:
 * 1. Ensure the Vehicle class is-a Driveable so it can be
 * 	  assigned in the Driver class.
 *    Hint: implement Driveable
 *
 * 2. When anyone calls drive method, set 'inTransit' to the value of "true"
 *
 * 3. Ensure this class is properly encapsulated with getters/setters for each private field.
 *    Hint: Getters and setters must conform to JavaBean specification.
 *    Use the Ride class as an example for how to write these methods properly.
 *    You should not have any public variables in this class. All fields must be private.
 *    Note: getter methods are named differently for boolean values.
 */
public class Vehicle {

    public String year;
    public String make;
    String model;
    String plateNumber;
    public boolean inTransit;



}
