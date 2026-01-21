package dsexercises.arrays;

public class ArrayExercise2 {

    //Write a Java program to test if an array contains a specific value.
    //Create an array with five elements
    public static void run() {
        //Initialize arr
        int[] arr = {24, 56, 12, 78, 2};
        int guessValue1 = 45;
        int guessValue2 = 12;

        answer(arr, guessValue1);
        answer(arr, guessValue2);
    }

    private static void answer(int[] array, int key) {
        boolean isExisting = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                isExisting = true;
                break;

            }
        }
        if (isExisting) {
            System.out.println("The number " + key + " exists in the array");
        } else {
            System.out.println("The number " + key + " does not exist in the array");
        }
    }
}
