package dsexercises.arrays;

import java.util.Scanner;

public class ArrayExercise3 {

//   Write a Java program that creates an array of 5 integers and prompts the user to
//   enter 5 integer values to fill the array. The program should then find the sum of all the
//   elements in the array and print the result.
    public static void run() {
        //Initialize the array with 5 integers, and the total to zero
        int[] arr = new int[5];
        int total = 0;
        String arrayPreview = "";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 numbers: (Use enter to make a new entry)");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        //Add all the numbers
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
            //Add the current element to the preview string
            //Add a comma before if it is not the first element
            if (i > 0) {
                arrayPreview += ", ";
            }
            arrayPreview += arr[i];
        }

        System.out.println("Entered numbers: " + arrayPreview);
        System.out.println("Total: " + total);
    }
}
