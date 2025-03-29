/**
 * @ (#) NhanVien.java       1.0     29/03/2025
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
public class NhanVien {
    private String maNV;
    private String tenNV;
    private String chucVu;
    private double luong;

    public NhanVien(String maNV, String tenNV, String chucVu, double luong) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.chucVu = chucVu;
        this.luong = luong;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
}
