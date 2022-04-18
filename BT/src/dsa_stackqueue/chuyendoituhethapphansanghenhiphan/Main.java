package dsa_stackqueue.chuyendoituhethapphansanghenhiphan;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int number = 25;
        int temp;
        Stack<Integer> stack = new Stack<>();
        System.out.print("Before: " + number);
        System.out.print("\nAfter: ");
        while (number != 0) {
            temp = number % 2;
            stack.push(temp);
            number = number / 2;
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
