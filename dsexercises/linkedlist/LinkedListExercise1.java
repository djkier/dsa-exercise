package dsexercises.linkedlist;

import java.util.LinkedList;

public class LinkedListExercise1 {
//Create a list with the following elements: apple, banana, and cherry. Write code that
//accomplishes the following:
//. Print the list using println.
//. Add orange to the beginning of the list.
//. Print the list again.
//. Remove an element from the list.
//. Print the list again.
//. Get an element at a specific index.
//. Print the size of the list.
    public static void run() {
        //Initialize fruits linked list
        LinkedList<String> fruits = new LinkedList<>();

        //Add fruit on the fruits
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");

        System.out.println("Fruits: "+ fruits);

        fruits.addFirst("orange");
        System.out.println("Fruits: " + fruits);

        fruits.remove(1);
        System.out.println("Fruits: " + fruits);

        System.out.println("Fruits[1]: " + fruits.get(1));
        System.out.println("Fruits size: " + fruits.size());

    }
}
