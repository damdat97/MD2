package io_binary;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void hienThiMenu() {
        System.out.println("----Menu----");
        System.out.println("1. Them san pham");
        System.out.println("2. Hien thi san pham");
        System.out.println("3. Tim kiem thong tin san pham");
        System.out.println("4. Thoat");
        System.out.println("----------");
        System.out.println("Chon!");
    }
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        QuanLySanPham quanLySanPham = new QuanLySanPham();

        while (true) {
            hienThiMenu();
            int choice = -1;
            while (choice == -1) {
                try {
                    choice = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.err.println("Chi nhap vao so");
                } finally {
                    scanner.nextLine();
                }
            }
           switch (choice) {
               case 1:
                   quanLySanPham.them();
                   break;
               case 2:
                   quanLySanPham.hienThi();
                   break;
               case 3:
                   System.out.println("Nhap vao ma can tim: ");
                   int maTim = scanner.nextInt();
                   int viTri = quanLySanPham.timKiem(maTim);
                   if (viTri == -1) {
                       System.out.println("Khong co");
                   } else {
                       QuanLySanPham.outputSanPham(quanLySanPham.getSanPhamList().get(viTri));
                   }
                   break;
               case 4:
                   System.exit(0);
                   break;
               default:
                   System.err.println("Nhap sai !");
                   break;
           }
        }
    }


}
