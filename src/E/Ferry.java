/**
 * @author naikajean-baptiste
 * Name(s) and ID(s): Naika Jean-Baptiste 40227367
 * COMP249
 * Assignment #2 - Part 1
 * Due Date: March 4, 2023
 */
package E;

import A.WheeledTransportation;
import transpo.Transportation;

public class Ferry extends Transportation {
    protected double maxSpeed;

    protected double maxLoad;

    /**
     * default constructor
     */
    public Ferry(){
        super();
        maxSpeed = 80;
        maxLoad = 1000;
    }

    public Ferry(double maxSpeed, double load){
        this.maxSpeed = maxSpeed;
        this.maxLoad = load;
    }

    /**
     *
     * @param f
     */
    public Ferry(Ferry f){
        maxSpeed = f.getMaxSpeed();
        maxLoad = f.getMaxLoad();
    }


    public String toString(){
        return "This Ferry has a maximum speed of "
                + maxSpeed +" km/h and a maximum load of "
                + maxLoad + " lbs.";
    }

    @Override
    public boolean equals(Object o) {
        if(this == o){
            return true;
        } else if (o == null || getClass() == o.getClass()) {
            return false;
        }

        Ferry f = (Ferry) o;

        return maxSpeed == f.getMaxSpeed() && maxLoad == f.getMaxLoad();

    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public double getMaxLoad() {
        return maxLoad;
    }
}
