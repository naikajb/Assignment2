/**
 * @author naikajean-baptiste
 * Name(s) and ID(s): Naika Jean-Baptiste 40227367
 * COMP249
 * Assignment #2 - Part 1
 * Due Date: March 4, 2023
 */
package F;

public class WWIIAirplane extends Aircraft{

    protected boolean twinEngine;

    public WWIIAirplane(){
        super();
        twinEngine = false;
    }

    public WWIIAirplane(double price, double maxElevation, boolean hasTwinEngine){
        super(price, maxElevation);
        this.twinEngine = hasTwinEngine;
    }

    public WWIIAirplane(WWIIAirplane w){
        super(w);
        twinEngine = w.getTwinEngine();
    }

    public String toString(){

        if (twinEngine){
            return "This World War II airplane worth " + price + "$ and can reach up to " + maxElevation +" km in the air. It does not have a twin engine.\n";
        }
        else {
            return "This World War II airplane worth " + price + "$ and can reach up to " + maxElevation +" km in the air. It has a twin engine.\n";
        }
    }

    public boolean equals(Object o){

        if(this == o){
            return true;
        } else if (o == null || o instanceof  WWIIAirplane) {
            return false;
        }

        WWIIAirplane w = (WWIIAirplane) o;
        return super.equals(w) && twinEngine == w.getTwinEngine();
    }
    public boolean getTwinEngine(){
        return twinEngine;
    }
}
