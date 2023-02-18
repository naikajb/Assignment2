/**
 * @author naikajean-baptiste
 * Name(s) and ID(s): Naika Jean-Baptiste 40227367
 * COMP249
 * Assignment #2 - Part 1
 * Due Date: March 4, 2023
 */
package B;

import A.WheeledTransportation;

public class Train extends WheeledTransportation {

    protected int numOfVehicles = 0;
    protected String startingStation = "";
    protected String destinationStation = "";

    /**
     * default constructor
     */
    public Train(){
        super();
        numOfVehicles = 16;
        startingStation = "Montreal";
        destinationStation = "Toronto";
    }

    /**
     * Parameterized constructor
     * @param numOfWheels number of wheel
     * @param maxSpeed maximum speed
     * @param start name of origin station
     * @param dest name of destination
     */
    public Train(int numOfWheels, double maxSpeed, String start, String dest, int numOfVehicles){
        super(numOfWheels, maxSpeed);
        startingStation = start;
        destinationStation = dest;
        this.numOfVehicles = numOfVehicles;
    }

    /**
     * @return info of train and super.toString()
     */
    @Override
    public String toString(){
        return "This Train has " + numOfWheels + " wheels, and a maximum speed of " +maxSpeed+ " km/h.There are " + numOfVehicles +
                " vehicles on this train. The starting station is "
                +startingStation+ " and the destination is " +destinationStation+".\n";
    }

    /**
     *
     * @param o object to compare to another object
     * @return
     */
    @Override
    public boolean equals(Object o){

        //if Train object  passed is the same as Train object calling the method
        if (this == o){
            return true;
        }

        //if object hasn't been initialized
        //or if object isn't of the same class
        if( o == null || getClass() == o.getClass()){
            return false;
        }

        Train t = (Train) o;

        //both the super.equals() and yearOfCreation comparison must return true for the method to return true
        return super.equals(t) && numOfVehicles == t.getNumOfVehicles()
                && startingStation.equals(t.startingStation)
                && destinationStation.equals(t.destinationStation);
    }

    /**
     *
     * @param train
     */
    public Train (Train train){
        super(train);
        numOfVehicles = train.getNumOfVehicles();
        startingStation = train.getStartingStation();
        destinationStation = train.getDestinationStation();
    }


    /**
     *
     * @return
     */
    public int getNumOfVehicles() {
        return numOfVehicles;
    }

    public String getStartingStation(){
        return startingStation;
    }

    public String getDestinationStation() {
        return destinationStation;
    }
}
