/**
 * @author naikajean-baptiste
 * Name(s) and ID(s): Naika Jean-Baptiste 40227367
 * COMP249
 * Assignment #2 - Part 1
 * Due Date: March 4, 2023
 */

package C;

import B.Train;

import java.util.Objects;

public class Metro extends Train {
    protected int noOfStops;

    public Metro(){
        super();
        super.setNumOfWheels(40);
        noOfStops = 4;
    }

    /**
     * parameterized constructor
     * @param numOfWheels
     * @param maxSpeed
     * @param start
     * @param dest
     * @param noOfStops
     */
    public Metro(int numOfWheels, double maxSpeed, String start, String dest, int noOfStops, int vehicles){
        super(numOfWheels, maxSpeed, start, dest,vehicles);
        this.noOfStops = noOfStops;
    }

    /**
     * copy constructor
     * @param m metro to copy
     */
    public Metro(Metro m){
        super(m);
        noOfStops = m.noOfStops;
    }

    @Override
    public boolean equals(Object o) {
        //if Metro object passed is the same as Metro object calling the method
        if (this == o){
            return true;
        }

        //if object hasn't been initialized
        //or if object isn't of the same class
        if( o == null || getClass() == o.getClass()){
            return false;
        }

        Metro m = (Metro) o;

        return super.equals(m) && noOfStops == m.getNoOfStops();
    }


    @Override
    public String toString() {
        return "This Metro has " + numOfWheels+ " wheels,"  +numOfVehicles+ " vehicles and a maximum speed of "
                + maxSpeed+ " km/h. It starts in " +startingStation
                + " and it ends in " +destinationStation+ " and has " +noOfStops+" stops.\n";
    }

    /**
     *
     * @return number of stops
     */
    public int getNoOfStops() {
        return noOfStops;
    }

    /**
     * sets the number of stops
     * @param noOfStops
     */
    public void setNoOfStops(int noOfStops) {
        this.noOfStops = noOfStops;
    }
}
