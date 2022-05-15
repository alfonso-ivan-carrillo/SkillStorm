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
public class TaxiService {

    public Ride process(Driver driver, Passenger[] passengers) {
         // create a Ride and return it
        Ride rider = new Ride(driver, passengers);
        return rider;
    }

}

