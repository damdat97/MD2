package mangvaphuongthuc;

import java.util.Scanner;

public class tinhtongcacsoduongcheo {
    public static void main(String[] args) {
        int n;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao bac cua ma tran: ");
        n = scanner.nextInt();

        int arr[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("arr[" + i + "][" + j + "] = ");
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Ma tran vua nhap: ");
        for (int i = 0; i < n; i++) {
             for (int j = 0; j < n; j++) {
                 System.out.print(arr[i][j] + "\t");
             }
            System.out.println("\n");
        }


        for (int i = 0; i < n; i++) {
             for (int j = 0; j < n; j++) {
                 //neu i = j moi tinh tong
                 if (i == j) {
                     sum += arr[i][j];
                 }
             }
        }
        System.out.println("Tong cac so duong cheo chinh trong ma tran: " + sum);
    }
}
