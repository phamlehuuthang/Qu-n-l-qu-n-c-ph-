/**
 * @ (#) KhachHang.java       1.0     29/03/2025
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
public class KhachHang {
    private final  String maKH;
    private String tenKH;
    private String soDienThoai;

    public KhachHang(String maKH, String tenKH, String soDienThoai) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.soDienThoai = soDienThoai;
    }

    public KhachHang(String maKH) {
        this(maKH,"","");
    }

    public String getMaKH() {
        return maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }
}
