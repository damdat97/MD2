package io_binary;

import java.io.Serializable;

public class SanPham implements Serializable {
    private int ma;
    private String ten;
    private String hangSanXuat;
    private double gia;

    public SanPham() {
    }

    public SanPham(int ma, String ten, String hangSanXuat, double gia) {
        this.ma = ma;
        this.ten = ten;
        this.hangSanXuat = hangSanXuat;
        this.gia = gia;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "ma= " + ma +
                ", ten= '" + ten + '\'' +
                ", hangSanXuat= '" + hangSanXuat + '\'' +
                ", gia= " + gia +
                '}';
    }
}
