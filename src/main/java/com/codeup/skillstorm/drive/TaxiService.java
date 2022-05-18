package com.codeup.skillstorm.drive;

/**
 *	Operations for our ride sharing application
 *
 * TODO Requirements:
 * 1. Implement the process method, which creates a new Ride and returns it.
 *    You need to create a new Ride object, set the driver and passenger fields,
 *    and then return the Ride object.
 *
 */
public class TaxiService extends Ride{

    public Ride process(Driver driver, Passenger[] passengers) {
        Ride newRide = new Ride(driver, passengers);
        return newRide; // create a Ride and return it
    }

}

