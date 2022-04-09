package vonglap;

import java.util.Scanner;

public class hienthicacloaihinh {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 4) {
            System.out.println("Menu:");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, bottom-left, bottom-right");
            System.out.println("3. Print Isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Draw the ractangle");
                    for (int i = 1; i <= 3; i++) {
                        for (int j = 1; j <= 7; j++) {
                            System.out.printf("* ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 2:
                    for (int i = 1; i <= 6; i++) {
                        for (int j = 1; j < i; j++) {
                            System.out.printf("* ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 3:
                    for (int i = 5; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.printf("* ");
                        }
                        System.out.print("\n");
                    }
                case 4:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
                    break;
            }
        }
    }
}
