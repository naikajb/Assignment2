/**
 * @author naikajean-baptiste
 * Name(s) and ID(s): Naika Jean-Baptiste 40227367
 * COMP249
 * Assignment #2 - Part 1
 * Due Date: March 4, 2023
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

import java.util.Random;

/**
 * Program Description:
 * Driver creates array of 16 transpo.Transportation Objects and checks test different methods,
 * The driver also has a method to find the most and least expensive aircrafts of the array
 */


public class Driver {
    public static void main(String[] args) {

        //create 16 objects of Transportation class
        Aircraft a1 = new Aircraft(30000,15);
        System.out.println(a1.toString());
        Aircraft a2 = new Aircraft(a1);
        System.out.println(a2.toString());
        Aircraft a3 = new Aircraft();
        System.out.println(a3.toString());

        WWIIAirplane wa1 = new WWIIAirplane(30000,12,true);
        System.out.println(wa1.toString());
        WWIIAirplane wa2 = new WWIIAirplane(30000,12,false);
        System.out.println(wa2.toString());

        Ferry f1 = new Ferry();
        System.out.println(f1.toString());

        WheeledTransportation wt1 = new WheeledTransportation();
        System.out.println(wt1.toString());
        WheeledTransportation wt2 = new WheeledTransportation();
        System.out.println(wt2.toString());

        Monowheel mo1 = new Monowheel();
        System.out.println(mo1.toString());
        Monowheel mo2 = new Monowheel(14,50,1000);
        System.out.println(mo2.toString());

        Train train1 = new Train(10,90,"Montreal", "New York",35);
        System.out.println(train1.toString());
        Train train2 = new Train();
        System.out.println(train2.toString());

        Metro me1 = new Metro(40,45,"Rimouski", "Gatineau", 30,15);
        System.out.println(me1.toString());
        Metro me2 = new Metro();
        System.out.println(me2.toString());


        Tram tram1  = new Tram(15,60,"Montreal", "Vancouver", 30, 15,1970);
        System.out.println(tram1.toString());
        Tram tram2 = new Tram();
        System.out.println(tram2.toString());

        System.out.println("The equality of objects is tested below:"
                + "\n\ta1 and tram2 are equal: " +a1.equals(tram2)
                + "\n\tme1 and me2 are equal: " +me1.equals(me2)
                + "\n\ttram2 and tram1 are equal: " +tram2.equals(tram1));

    }

    public static void findLeastAndMostExpensiveAircraft(Transportation[] transpo){

        int aMost;
        int aLeast;

        //keep track of number of aircraft in the array

        int aircrafts = 0;
        double least = 10000;
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
                   least = ((Aircraft) transpo[i]).getPrice();
                   aMost = i;
               }
           }
        }

        if(aircrafts == 0){
            System.out.println("No Aircraft were found in the array of Transportations");
        }

    }
}