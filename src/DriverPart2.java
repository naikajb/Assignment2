/**
 * @author naikajean-baptiste
 * Name(s) and ID(s): Naika Jean-Baptiste 40227367
 * COMP249
 * Assignment #2 - Part 1
 * Due Date: March 4, 2023
 */

/**
 * Description of program:
 *  creates copyTheObjects() method that takes an array of Transportation and returns a copy of it
 *
 */

import A.WheeledTransportation;
import B.Train;
import C.Metro;
import D.Monowheel;
import E.Ferry;
import F.Aircraft;
import F.WWIIAirplane;
import transpo.Transportation;

public class DriverPart2 {

    public static Transportation[]  copyTheObjects(Transportation[] arr){

        //create array to store the copy
        Transportation[] newArr = new Transportation[arr.length];

        //iterates through all the elements of the original array
        for(int i =0; i < arr.length; i++ ){
            //copy constructor used to copy the original array
            //can't explicitly find the type of each element so just use Transportation Class
            newArr[i] = new Transportation(arr[i]);
        }

        return newArr;
    }

    public static void main(String[] args){

        Aircraft a1 = new Aircraft(30000,15);
        Aircraft a2 = new Aircraft(a1);
        Aircraft a3 = new Aircraft();

        WWIIAirplane wa1 = new WWIIAirplane(3000,12,true);
        WWIIAirplane wa2 = new WWIIAirplane(30000,12,false);

        Ferry f1 = new Ferry();
        Ferry f2 = new Ferry(50,700);
        Ferry f3 = new Ferry(f2);

        WheeledTransportation wt1 = new WheeledTransportation();
        WheeledTransportation wt2 = new WheeledTransportation();
        WheeledTransportation wt3 = new WheeledTransportation(20,60);

        Monowheel mo1 = new Monowheel();
        Monowheel mo2 = new Monowheel(14,50,1000);
        Monowheel mo3 = new Monowheel(1,70,150);

        Train train1 = new Train(10,90,"Montreal", "New York ",35);
        Train train2 = new Train();
        Train train3 = new Train(30,100,"New York", "Chicago",10);

        Metro me1 = new Metro(40,45,"Rimouski", "Gatineau", 30,15);
        Metro me2 = new Metro();

        //initializes array that's a mix of all the transportation types.
        Transportation[] transportation = {a1,a2,a3,wa1,wa2,f1,f2,f3,wt1,wt2,wt3,mo1,mo2,mo3,train1,train2,train3,me1,me2};
        //second array is the copy of first w/ the copyOfObjects() method declared above
        Transportation[] transportationCopy = copyTheObjects(transportation);

        //prints out the info in both of each element of both of the arrays.
        for(int i = 0; i< transportation.length;i++){
            System.out.println(transportation[i]);
            System.out.println(transportationCopy[i] +"\n");
        }
    }
}
