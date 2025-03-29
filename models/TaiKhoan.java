/**
 * @ (#) TaiKhoan.java       1.0     29/03/2025
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
public class TaiKhoan {
    private String tenDangNhap;
    private String matKhau;
    private NhanVien nhanVien;

    public TaiKhoan(String tenDangNhap, String matKhau, NhanVien nhanVien) {
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
        this.nhanVien = nhanVien;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }
}
