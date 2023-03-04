/**
 * @author naikajean-baptiste
 * Name(s) and ID(s): Naika Jean-Baptiste 40227367
 * COMP249
 * Assignment #2 - Part 1
 * Due Date: March 4, 2023
 */
package F;

import transpo.Transportation;

public class Aircraft extends Transportation {
    protected double price;

    //maximum elevation of the plain in km
    protected double maxElevation;

    /**
     * default constructor
     */
    public Aircraft(){
        price = 10000;
        maxElevation = 10;
    }

    /**
     *
     * @param price
     * @param maxElevation
     */
    public Aircraft(double price, double maxElevation){
        this.price = price;
        this.maxElevation = maxElevation;
    }

    /**
     *
     * @param a
     */
    public Aircraft(Aircraft a){
        maxElevation = a.getMaxElevation();
        price = a.getPrice();
    }

    /**
     *
     * @return the aircraft's info
     */
    @Override
    public String toString(){
        return "This Aircraft is worth "
                +price +"$ and can reach up to "
                +maxElevation + " km in the air.";
    }

    @Override
    public boolean equals(Object o) {
        if(this == o){
            return true;
        } else if (o == null || !(o instanceof Aircraft)) {
            return false;
        }

        Aircraft a = (Aircraft) o;
        return price == a.getPrice() && maxElevation == a.getMaxElevation();
    }

    public double getMaxElevation() {
        return maxElevation;
    }

    public double getPrice() {
        return price;
    }
}
