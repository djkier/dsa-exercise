package dsexercises.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueExercise1 {
//Problem: Simulate a line at a store or bank using a queue. The program should allow the use
//to enter a name, "join" the line, and wait for service. The program should then "serve"
//customers in the order they joined the line.
    public static void run() {
        Scanner input = new Scanner(System.in);
        boolean isExiting = false;
        Queue<String> line = new LinkedList<>();

        while (!isExiting) {
            System.out.println("=====================================");
            System.out.println("Queue: " + line);
            System.out.println("=====================================");
            System.out.println("What would you like to do?");
            System.out.println("1. Add new entry on the queue");
            System.out.println("2. Serve the person on the queue");
            System.out.println("3. Exit");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter the name of the new entry: ");
                    String name = input.nextLine();
                    System.out.println(name + " is added to the line");
                    line.offer(name);
                    break;
                case 2:
                    if (line.isEmpty()) {
                        System.out.println("There is no people on the line.");
                    } else {
                        System.out.println("Serving customer " + line.poll());
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    isExiting = !isExiting;
                    break;
                default:
                    System.out.println("Choice not found. Enter again.");
            }

        }

    }
}
