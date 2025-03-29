/**
 * @ (#) Nuoc.java       1.0     29/03/2025
 * <p>
 * Copuright (c) 2025 IUH, All rights reserved
 */
package models;

public class Nuoc {
    private String maNuoc;
    private String tenNuoc;
    private double donGia;

    public Nuoc(String maNuoc, String tenNuoc, double donGia) {
        this.maNuoc = maNuoc;
        this.tenNuoc = tenNuoc;
        this.donGia = donGia;
    }

    public String getMaNuoc() {
        return maNuoc;
    }

    public void setMaNuoc(String maNuoc) {
        this.maNuoc = maNuoc;
    }

    public String getTenNuoc() {
        return tenNuoc;
    }

    public void setTenNuoc(String tenNuoc) {
        this.tenNuoc = tenNuoc;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
}
