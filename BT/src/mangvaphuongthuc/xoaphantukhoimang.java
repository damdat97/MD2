package mangvaphuongthuc;

import java.util.Scanner;

public class xoaphantukhoimang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so luong phan tu trong mang: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Nhap vao cac phan tu: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = ");
            arr[i] = scanner.nextInt();
        }

        System.out.println("Mang truoc khi xoa");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Nhap vao so can xoa: ");
        int soCanXoa = scanner.nextInt();
        int viTriCanXoa = timViTriPhanTu(arr, soCanXoa);

        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < viTriCanXoa; i++) {
            newArr[i] = arr[i];
        }
        for (int i = viTriCanXoa; i < arr.length - 1; i++) {
            newArr[i] = arr[i + 1];
        }
        arr = newArr;
        inMang(arr);
    }

    static int timViTriPhanTu(int[] arr, int soCanTim) {
        int viTri = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == soCanTim) {
                viTri = i;
            }
        }
        return viTri;
    }

    static void inMang(int[] arr) {
        System.out.println("Mang la: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t");
        }
    }
}

