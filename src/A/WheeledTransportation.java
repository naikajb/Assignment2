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
        return "This Wheeled Transportation has " +numOfWheels+ " wheels, and a maximum speed of "+ maxSpeed;
    }

    /**
     * @param o object to compare to
     * @return true if objects are the same
     */
    public boolean equals(Object o){
        if (o == null){
            return false;
        }else{
            if (!(o instanceof WheeledTransportation)){
                return false;
            }else{

            }
        }
        return false;
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
