package questions;

import java.util.Stack;

public class Greater_Element {
    // Function to print all elements which are greater than all
    // elements present to their right

    public static void main(String[] args) {
        int[] arr = {10, 4, 6, 3, 5};
        find(arr);
    }

    public static void find(int[] arr) {
        Stack<Integer> numStack = new Stack<>();
        int max = Integer.MIN_VALUE;

        for (int each : arr) {
            numStack.push(each);
        }

        for (int each : numStack) {
            if (each>max) System.out.print(each + ", ");
            max = each;
        }
    }

}
