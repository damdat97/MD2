package mangvaphuongthuc;

import java.util.Scanner;

public class timphantulonnhatmang2chieu {
    public static void main(String[] args) {
        int m, n;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so dong cua ma tran: ");
        m = scanner.nextInt();
        System.out.println("Nhap so cot cua ma tran");
        n = scanner.nextInt();

        //Khai bao ma tran arr co m dong, n cot
        int arr[][] = new int[m][n];

        System.out.println("Nhap ca phan tu cho ma tran: ");
        for (int i = 0; i < m; i++) {
            for (int j= 0; j < n; j++) {
                System.out.print("arr[" + i + "][" + j + "] = ");
                arr[i][j] = scanner.nextInt();
            }
        }

        int max = arr[0][0];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Phan tu lon nhat trong ma tran: " + max);
    }
}
