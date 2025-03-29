/**
 * @ (#) ChiTietHoaDon.java       1.0     29/03/2025
 * <p>
 * Copuright (c) 2025 IUH, All rights reserved
 */
package models;

/**
 * @description:
 * @auther: Pham Le Huu Thang
 * @date: 29/03/2025
 * @version: 1.0
 */
public class ChiTietHoaDon {
    private HoaDon hoaDon;
    private Nuoc nuoc;
    private int soLuong;
    private double donGia;

    // Constructor getter setter

    public ChiTietHoaDon(HoaDon hoaDon, Nuoc nuoc, int soLuong, double donGia) {
        this.hoaDon = hoaDon;
        setNuoc(nuoc);
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public HoaDon getHoaDon() {
        return hoaDon;
    }

    public void setHoaDon(HoaDon hoaDon) {
        this.hoaDon = hoaDon;
    }

    public Nuoc getNuoc() {
        return nuoc;
    }

    public void setNuoc(Nuoc nuoc) {
        this.nuoc = nuoc;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    // Phương thức
    public double tinhThanhTien() {
        return soLuong * donGia;
    }
}
