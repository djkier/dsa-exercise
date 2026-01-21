package dsexercises.stacks;

import java.util.Stack;

public class StacksExercise2{
//Write a series of code that:
//    . Pushes three elements onto the stack - Alice, Bob, Charlie
//    . Pops the pushed elements
//    . Prints the popped elements using system.out. println (observe how LIFO is applied)
//    . Checks if the stack is empty (this should return true)

    public static void run() {
        //Initialize the stack
        Stack<String> names = new Stack<>();

        names.push("Alice");
        display(names);

        names.push("Bob");
        display(names);

        names.push("Charlie");
        display(names);

        names.pop();
        display(names);

        names.pop();
        display(names);

        names.pop();
        display(names);

        System.out.println("Stack size: " + names.size());
    }

    public static void display(Stack stack) {
        System.out.println(stack);
    }
}
