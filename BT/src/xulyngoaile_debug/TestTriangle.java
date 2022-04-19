package xulyngoaile_debug;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap canh 1: ");
        double side1 = scanner.nextDouble();
        System.out.print("Nhap canh 2: ");
        double side2 = scanner.nextDouble();
        System.out.print("Nhap canh 3: ");
        double side3 = scanner.nextDouble();
        Triangle triangle;

        try {
            triangle = new Triangle(side1, side2, side3);
        } catch (IllegalTriangleException e) {
            System.err.println(e.getMessage());
        }
    }
}
