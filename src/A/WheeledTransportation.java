/**
 * Naika Jean-Baptiste (40227367)
 * COMP249
 * Assignment 2
 * Friday, February 24, 2023
 */
package A;

import transpo.Transportation;

import java.util.Objects;

public class WheeledTransportation extends Transportation {
    protected int numOfWheels;
    protected double maxSpeed;

    /**
     * default constructor
     */
    public WheeledTransportation() {
        numOfWheels = 2;
        maxSpeed = 45;
    }

    /**
     *
     * @param numOfWheels
     * @param maxSpeed
     */
    public WheeledTransportation(int numOfWheels, double maxSpeed) {
        this.numOfWheels = numOfWheels;
        this.maxSpeed = maxSpeed;
    }

    /**
     *
     * @param w
     */
    public WheeledTransportation(WheeledTransportation w) {
        numOfWheels = w.getNumOfWheels();
        maxSpeed = w.getMaxSpeed();
    }

    @Override
    public String toString() {
        return "This is a Wheeled Transportation that has "
                + numOfWheels
                + ", and a maximum speed of " + maxSpeed;
    }

    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }

        if(o == null || !(o instanceof WheeledTransportation)){
            return false;
        }

        WheeledTransportation w = (WheeledTransportation) o;
        return maxSpeed == w.getMaxSpeed() && numOfWheels == w.getNumOfWheels();
    }

    /**
     *
     * @return
     */
    public double getMaxSpeed() {
        return maxSpeed;
    }

    /**
     *
     * @return
     */
    public int getNumOfWheels() {
        return numOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
