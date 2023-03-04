/**
 * @author naikajean-baptiste
 * Name(s) and ID(s): Naika Jean-Baptiste 40227367
 * COMP249
 * Assignment #2 - Part 1
 * Due Date: March 4, 2023
 */
package B;

import C.Metro;

public class Tram extends Metro {
    protected  int yearOfCreation;

    /**
     * default constructor
     */
    public Tram(){
        super();
        yearOfCreation = 1990;
    }

    /**
     * parameterized constructor
     * @param numOfWheels
     * @param maxSpeed
     * @param start
     * @param dest
     * @param noOfStops
     * @param yearOfCreation
     */
    public Tram(int numOfWheels, double maxSpeed, String start, String dest, int noOfStops, int vehicles, int yearOfCreation){
        super(numOfWheels, maxSpeed, start, dest,noOfStops,vehicles);
        this.yearOfCreation  = yearOfCreation;
    }

    /**
     * Copy constructor
     * @param t
     */
    public Tram(Tram t){
        super(t);
        yearOfCreation = t.getYearOfCreation();
    }

    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return "This Tram has " + numOfWheels+ " wheels, " +numOfVehicles+" vehicles and a maximum speed of " + maxSpeed+ " km/h. It starts in " +startingStation+ " and ends in " +destinationStation+ " and has " +noOfStops+" stops. It was created in "
                + yearOfCreation + ".";
    }

    @Override
    public boolean equals(Object o){
        //if Tram object  passed is the same as Tram object calling the method
        if (this == o){
            return true;
        }

        //if object hasn't been initialized
        //or if object isn't of the same class
        if( o == null || getClass() == o.getClass()){
            return false;
        }

        Tram t = (Tram) o;

        //both the super.equals() and yearOfCreation comparison must return true for the method to return true
        return super.equals(t) && yearOfCreation == t.yearOfCreation;
    }

    public int getYearOfCreation() {
        return yearOfCreation;
    }
}
