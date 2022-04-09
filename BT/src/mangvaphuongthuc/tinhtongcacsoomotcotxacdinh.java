package mangvaphuongthuc;

import java.util.Scanner;

public class tinhtongcacsoomotcotxacdinh {
    public static void main(String[] args) {
        int m, n;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so dong cua ma tran: ");
        m = scanner.nextInt();
        System.out.print("Nhap so cot cua ma tran: ");
        n = scanner.nextInt();

        int arr[][] = new int[m][n];

        System.out.println("Nhap so phan tu cho ma tran: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("arr[" + i + "][" + j + "] = ");
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Ma tran vua nhap: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("\n");
        }


    }
}
