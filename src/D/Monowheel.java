package D;

import A.WheeledTransportation;


public class Monowheel extends WheeledTransportation {

    protected double maxWeight;

    /**
     * default constructor
     */
    public Monowheel(){
        super();
        super.setNumOfWheels(1);
        maxWeight = 160;
    }

    /**
     * parameterized constructor
     * @param numOfWheels number of wheel
     * @param maxSpeed maximum speed in km/h
     * @param maxWeight maximum weight in lbs
     */
    public Monowheel(int numOfWheels, double maxSpeed, double maxWeight){
        super(1, maxSpeed);
        this.maxWeight = maxWeight;
    }

    /**
     * default constructor
     * @param m Monowheel to copy
     */
    public Monowheel(Monowheel m){
        super(m);
        this.maxWeight = m.getMaxWeight();
    }

    /**
     *
     * @return info of the Monowheel
     */
    @Override
    public String toString(){
        return "\nThis Monowheel has 1 wheel and a maximum speed of "
                + maxSpeed + "It has a maximum weight of "
                + maxWeight + " lbs.\n";
    }

    public boolean equals(Object o){
        if (this == o){
            return true;
        }

        //if object hasn't been initialized
        //or if object isn't of the same class
        if( o == null || getClass() == o.getClass()){
            return false;
        }

        Monowheel m = (Monowheel) o;

        //both the super.equals() and yearOfCreation comparison must return true for the method to return true
        return super.equals(m) && maxWeight == m.getMaxWeight();
    }

    private double getMaxWeight() {
        return maxWeight;
    }




}
