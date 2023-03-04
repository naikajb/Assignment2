/**
 * @author naikajean-baptiste
 * Name(s) and ID(s): Naika Jean-Baptiste 40227367
 * COMP249
 * Assignment #2 - Part 1
 * Due Date: March 4, 2023
 */

/**
 * Description of program:
 *      creates the findLeastAndMostExpensiveAircraft() method which can accept any
 *      array of Transportation object.
 *
 *      If the array has no Aircraft objects, the method prints out a message to let user know.
 *      If there is only one, it is both the least and most expensive aircraft.
 *      Otherwise, the method will find the most and least expensive aircraft and print
 *      out there info by implicitly using the toString() methods.
 */


import A.WheeledTransportation;
import B.Train;
import B.Tram;
import C.Metro;
import D.Monowheel;
import E.Ferry;
import F.Aircraft;
import F.WWIIAirplane;
import transpo.Transportation;


/**
 * Program Description:
 * Driver creates array of 16 Transportation Objects and checks test different methods,
 * The driver also has a method to find the most and least expensive aircraft of the array
 */


public class DriverPart1 {

    /**
     *
     * @param transpo array of Transportation objects
     */
    public static void findLeastAndMostExpensiveAircraft(Transportation[] transpo){

        int aMost = 0;
        int aLeast= 0;

        //keep track of number of aircraft in the array
        int aircrafts = 0;
        double least = 1000000;
        double most = 0;

        for (int i = 0; i < transpo.length; i++){

            //checks if the object is an Aircraft
            if( transpo[i] instanceof Aircraft) {
                //increments the number of aircraft every time one is found
                aircrafts++;

                //check if the price of the aircraft is the lowest found
                if(((Aircraft) transpo[i]).getPrice() < least){
                    least = ((Aircraft) transpo[i]).getPrice();
                    aLeast = i;
                }

                //check if the price of the aircraft is the highest found
                if(((Aircraft) transpo[i]).getPrice() > most){
                    most = ((Aircraft) transpo[i]).getPrice();
                    aMost = i;
                }
            }
        }

        if(aircrafts == 0){
            System.out.println("No Aircraft were found in the array of Transportations");
        }else if(aircrafts == 1){
            System.out.println("The most expensive aircraft is also the least expensive because there was only one aircraft. Here is it's info:\n\t " + transpo[aMost]);
        }else{
            System.out.println("This is the information for the most expensive Aircraft:\n\t" + transpo[aMost]);
            System.out.println("This is the information for the least expensive Aircraft:\n\t" + transpo[aLeast]);
        }

    }

    public static void main(String[] args) {

        //create 16 objects of Transportation class
        Aircraft a1 = new Aircraft(30000,15);
        System.out.println(a1);
        System.out.println("");
        Aircraft a2 = new Aircraft(a1);
        System.out.println(a2);
        System.out.println("");
        Aircraft a3 = new Aircraft();
        System.out.println(a3);
        System.out.println("");

        WWIIAirplane wa1 = new WWIIAirplane(3000,12,true);
        System.out.println(wa1);
        System.out.println("");
        WWIIAirplane wa2 = new WWIIAirplane(30000,12,false);
        System.out.println(wa2);
        System.out.println("");

        Ferry f1 = new Ferry();
        System.out.println(f1);
        System.out.println("");
        Ferry f2 = new Ferry(50,700);
        System.out.println(f2);
        System.out.println("");
        Ferry f3 = new Ferry(f2);
        System.out.println(f3);
        System.out.println("");

        WheeledTransportation wt1 = new WheeledTransportation();
        System.out.println(wt1);
        System.out.println("");
        WheeledTransportation wt2 = new WheeledTransportation();
        System.out.println(wt2);
        System.out.println("");
        WheeledTransportation wt3 = new WheeledTransportation(20,60);
        System.out.println(wt3);
        System.out.println("");

        Monowheel mo1 = new Monowheel();
        System.out.println(mo1);
        System.out.println("");
        Monowheel mo2 = new Monowheel(14,50,1000);
        System.out.println(mo2);
        System.out.println("");
        Monowheel mo3 = new Monowheel(1,70,150);
        System.out.println(mo3);
        System.out.println("");

        Train train1 = new Train(10,90,"Montreal", "New York",35);
        System.out.println(train1);
        System.out.println("");
        Train train2 = new Train();
        System.out.println(train2);
        System.out.println("");
        Train train3 = new Train(30,100,"New York", "Chicago",10);
        System.out.println(train3);
        System.out.println("");

        Metro me1 = new Metro(40,45,"Rimouski", "Gatineau", 30,15);
        System.out.println(me1);
        System.out.println("");
        Metro me2 = new Metro();
        System.out.println(me2);
        System.out.println("");

        Tram tram1  = new Tram(15,60,"Montreal", "Vancouver", 30, 15,1970);
        System.out.println(tram1);
        System.out.println("");
        Tram tram2 = new Tram();
        System.out.println(tram2);
        System.out.println("");

        System.out.println("The equality of objects is tested below:"
                + "\n\ta1 and tram2 are equal:\t" +a1.equals(tram2)
                + "\n\tme1 and me2 are equal:\t" +me1.equals(me2)
                + "\n\ttram2 and tram1 are equal:\t" +tram2.equals(tram1)
                + "\n\tme1 and me1:\t" + me1.equals(me1));

        //first array: with aircraft objects
        Transportation[] arr1 = {f1,a1,tram1,wa1,me2,train1,train2,mo2,mo1,wt1,wt2,wt3,f2,mo3,f3,train3};

        //second array: without aircraft objects
        Transportation[] arr2 = {f1,tram2,tram1,me1,me2,train1,train2,mo2,mo1,wt1,wt2,wt3,f2,mo3,f3,train3};
        System.out.println(arr1.length);
        findLeastAndMostExpensiveAircraft(arr2);
        findLeastAndMostExpensiveAircraft(arr1);

    }

}