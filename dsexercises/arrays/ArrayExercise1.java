package dsexercises.arrays;

public class ArrayExercise1 {

//Write a Java program that sums the array's values with the following elements:
//25, 4, 16, 9, 10.

    public static void run() {
        //Initialize the array and the total variable
        int[] array = {25, 4, 16, 9, 10};
        int total = 0;
        String arrayPreview = "";

        //Traverse to each item and add it to the total variable
        for (int i = 0; i < array.length; i++) {
            total += array[i];


            //Add the current element to the preview string
            //Add a comma before if it is not the first element
            if (i > 0) {
                arrayPreview += ", ";
            }
            arrayPreview += array[i];

        }

        System.out.println("Array: " + arrayPreview);
        System.out.println("Total: " + total);
    }
}
