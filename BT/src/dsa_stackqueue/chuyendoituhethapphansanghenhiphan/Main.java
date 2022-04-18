package dsa_stackqueue.chuyendoituhethapphansanghenhiphan;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int numbers = 25;
        int temp;
        Stack<Integer> stack = new Stack<>();
        System.out.print("Before: " + numbers);
        System.out.print("\nAfter: ");
        while (numbers != 0) {
            temp = numbers % 2;
            stack.push(temp);
            numbers = numbers / 2;
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
