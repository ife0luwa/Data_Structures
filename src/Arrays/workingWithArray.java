package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // initialize an  integer array
//        int [] intArr = new int [3]; //1st way
//        intArr[0] = 2;
//        intArr[1] = 3;
//        intArr[2] = 2;
//        System.out.println(Arrays.toString(intArr));
//        int [] intArr2 =  {2, 3, 2}; //2nd way
//        System.out.println(Arrays.toString(intArr2));

        int [] myIntegers = getIntegers(5);
        for (int i = 0; i < myIntegers.length; i++) {
        System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }
        System.out.println("The average is " + getAverage(myIntegers));

}
        //create a method to get set of integers
        //get the integers by scanning for user input
        // store these integers in an array
        // create a method to find the average of the integers

        public static int[] getIntegers(int number) {
            System.out.println("Enter " + number + " integer values:");
            int [] values = new int[number];
            for (int i = 0; i < values.length; i++) {
                values[i] = input.nextInt();
            }
            return values;
        }

        public static double getAverage (int [] array) {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            return (double) sum / (double) array.length;
        }

}
