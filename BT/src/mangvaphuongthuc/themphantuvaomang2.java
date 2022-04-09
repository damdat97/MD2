package mangvaphuongthuc;

import java.util.Scanner;

public class themphantuvaomang2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so phan tu trong mang: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Nhap gia tri vao mang: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = ");
            arr[i] = scanner.nextInt();
        }

        System.out.println("Mang truoc khi them phan tu: ");
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        System.out.println("Nhap vao gia tri can them: ");
        int soThem = scanner.nextInt();

        n = themVaoMang(arr, n, soThem, 2);
        System.out.println("Mang sau khi them: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    static int themVaoMang(int[] arr, int n, int soThem, int viTri) {
        if (n >= arr.length) { //Neu so luong cac phan tu lon hon hoac bang suc chua mang thi khong the them
            return n;
        }
        if (viTri < 0 || viTri > n) { //Vi tri them phai thuoc khoang [0, n]
            return n;
        }
        for (int i = n; i > viTri; i--) {
            arr[i] = arr[i - 1];
        }
        //Them gia tri vao vi tri can them
        arr[viTri] = soThem;
        return n + 1; //Tang suc chua cua mang +1
    }
}
