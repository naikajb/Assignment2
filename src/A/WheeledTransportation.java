/**
 * @author naikajean-baptiste
 * Name(s) and ID(s): Naika Jean-Baptiste 40227367
 * COMP249
 * Assignment #2 - Part 1
 * Due Date: March 4, 2023
 */
package A;

import transpo.Transportation;

public class WheeledTransportation extends Transportation {

    protected int numOfWheels;
    protected double maxSpeed;

    /**
     * default constructor
     */
    public WheeledTransportation(){
        numOfWheels = 4;
        maxSpeed = 70;
    }

    /**
     * parameterized constructor
     * @param numOfWheels number of wheels
     * @param maxSpeed in km/h
     */
    public WheeledTransportation(int numOfWheels, double maxSpeed){
        this.numOfWheels = numOfWheels;
        this.maxSpeed = maxSpeed;
    }

    /**
     * Copy constructor
     * @param w object to copy
     */
    public WheeledTransportation(WheeledTransportation w){
        numOfWheels = w.getNumOfWheels();
        maxSpeed = w.getMaxSpeed();
    }

    /**
     * @return info of the object
     */
    public String toString(){
        return "This Wheeled Transportation has " +numOfWheels
                + " wheel(s), and a maximum speed of "
                + maxSpeed+" km/h.\n";
    }

    /**
     * @param o object to compare to
     * @return true if objects are the same
     */
    public boolean equals(Object o){

        if(this == o){
            return true;
        } else if (o == null || getClass() == o.getClass()) {
            return false;
        }

        WheeledTransportation w = (WheeledTransportation) o;

        return numOfWheels == w.getNumOfWheels() && maxSpeed == w.getMaxSpeed();
    }
    /**
     * accessor for number of wheels
     * @return numOfWheels
     */
    public int getNumOfWheels(){
        return numOfWheels;
    }

    /**
     * accessor for maximum speed
     * @return maxSpeed
     */
    public double getMaxSpeed(){
        return maxSpeed;
    }

    /**
     *
     * @param maxSpeed
     */
    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    /**
     * mutator
     * @param numOfWheels
     */
    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }


}
