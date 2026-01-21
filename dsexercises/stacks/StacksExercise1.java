package dsexercises.stacks;

import java.util.Stack;

public class StacksExercise1 {
//Check if a string of parentheses is balanced, meaning each opening parenthesis has a
//corresponding closing parenthesis in the correct order. The output of each check should be
//either true or false. Use the following examples to be evaluated:
//        . parentheses1 = ((()))
//        · parentheses2 = (()())
//        · parentheses3 = (()
//        · parentheses4 = ())

    public static void run() {
        //Initialize the parentheses
        String parentheses1 = "((()))";
        String parentheses2 = "(()())";
        String parentheses3 = "(()";
        String parentheses4 = "())";

        display(parentheses1);
        display(parentheses2);
        display(parentheses3);
        display(parentheses4);

    }

    private static void display(String parentheses) {
        String matching = isMatching(parentheses) ? "" : "not ";
        System.out.println("The parentheses \"" + parentheses + "\" are " + matching + "matching in correct order");
    }

    private static boolean isMatching(String parentheses) {
        int i = 0;
        String[] parts = parentheses.split("");
        Stack<String> stack = new Stack<>();

        while (i < parts.length) {
            if (parts[i].equals("(")) {
                stack.add("(");
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    stack.pop();
                }
            }
            i++;
        }



        return stack.isEmpty();
    }

}
