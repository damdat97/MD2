package io_binary;

import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class QuanLySanPham {
    public static Scanner scanner = new Scanner(System.in);
    private List<SanPham> sanPhamList;
    private SanPhamFile sanPhamFile;

    public QuanLySanPham() throws IOException {
        sanPhamFile = new SanPhamFile();
        sanPhamList = sanPhamFile.read();
    }

    public List<SanPham> getSanPhamList() {
        return sanPhamList;
    }

    public void setSanPhamList(List<SanPham> sanPhamList) {
        this.sanPhamList = sanPhamList;
    }

    public SanPhamFile getSanPhamDao() {
        return sanPhamFile;
    }

    public void setSanPhamDao(SanPhamFile sanPhamFile) {
        this.sanPhamFile = sanPhamFile;
    }

    public SanPham them() throws IOException {
        System.out.println("Nhap ma: ");
        int ma = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap ten san pham: ");
        String ten = scanner.nextLine();
        System.out.println("Nhap hang san xuat: ");
        String hang = scanner.nextLine();
        System.out.println("Nhap gia san pham: ");
        double gia = scanner.nextDouble();
        SanPham sanPham= new SanPham(ma, ten, hang, gia);
        sanPhamList.add(sanPham);
        sanPhamFile.write(sanPhamList);
        return sanPham;
    }

    public static void outputSanPham(SanPham sanPham) {
        System.out.println("Ten san pham: " + sanPham.getTen() + ", gia: " + sanPham.getGia() + ", hang san xuat: " + sanPham.getHangSanXuat());
    }

    public void hienThi() {
        for (SanPham sanPham: sanPhamList) {
            System.out.println(sanPham.toString());
        }
    }

    public int timKiem(int id) {
        for (int i = 0; i < sanPhamList.size(); i++){
            if (Objects.equals(this.sanPhamList.get(i).getMa(), id)) {
                return i;
            }
        }
        return -1;
    }
}
