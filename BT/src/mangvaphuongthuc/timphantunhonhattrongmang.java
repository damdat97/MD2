package mangvaphuongthuc;

import java.util.Scanner;

public class timphantunhonhattrongmang {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhap so gia tri: ");
            size = scanner.nextInt();
        } while (size <= 0);

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhap gia tri thu " + i + " : ");
            arr[i] = scanner.nextInt();
        }

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Gia tri nho nhat trong mang: " + min);
    }
}
