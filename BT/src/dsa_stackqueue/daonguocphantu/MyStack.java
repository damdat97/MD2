package dsa_stackqueue.daonguocphantu;

import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        //Dao nguoc so nguyen
        Stack<Integer> number = new Stack<Integer>();
        number.push(1);
        number.push(2);
        number.push(3);
        number.push(4);
        number.push(5);
        System.out.print("Before: ");
        for (Integer elements : number) {
            System.out.print(elements + "\t");
        }
        System.out.print("\nAfter: ");
        while (!number.isEmpty()) {
            System.out.print(number.pop() + "\t");
        }

        //dao nguoc chuoi
        String first = "xinchao";
        Stack<Character> string = new Stack<>();
        System.out.print("\nBefore: " + first);
        for (int i = 0; i < first.length(); i++) {
            string.push(first.charAt(i));
        }
        System.out.print("\nAfter: ");
        while (!string.isEmpty()) {
            System.out.print(string.pop());
        }
    }
}



