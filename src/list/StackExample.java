package list;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();

        // adding the data
        stack1.push(33);
        stack1.push(65);
        stack1.push(63);
        stack1.push(52);
        stack1.push(39);
        stack1.push(null);
        System.out.println("stack1 is : " + stack1);

        // removing the data
        stack1.pop();
        System.out.println("stack1 after 1st pop " + stack1);

        stack1.pop();
        System.out.println("stack1 after 2nd pop " + stack1);

        stack1.pop();
        System.out.println("stack1 after 3rd pop " + stack1);

        stack1.pop();
        System.out.println("stack1 after 4th pop " + stack1);
    }
}
