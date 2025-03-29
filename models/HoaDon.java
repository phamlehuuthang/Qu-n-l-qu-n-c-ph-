/**
 * @ (#) HoaDon.java       1.0     29/03/2025
 * <p>
 * Copuright (c) 2025 IUH, All rights reserved
 */
package models;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * @description:
 * @auther: Pham Le Huu Thang
 * @date: 29/03/2025
 * @version: 1.0
 */
public class HoaDon {
    private String maHoaDon;
    private LocalDateTime ngayTao;
    private KhachHang khachHang;
    private NhanVien nhanVien;
    private Ban ban;
    private ArrayList<ChiTietHoaDon> chiTietHoaDon = new ArrayList<ChiTietHoaDon>();

    public HoaDon(String maHoaDon, LocalDateTime ngayTao, KhachHang khachHang, NhanVien nhanVien, Ban ban, ArrayList<ChiTietHoaDon> chiTietHoaDon) {
        this.maHoaDon = maHoaDon;
        this.ngayTao = ngayTao;
        this.khachHang = khachHang;
        this.nhanVien = nhanVien;
        this.ban = ban;
        this.chiTietHoaDon = (chiTietHoaDon != null) ? chiTietHoaDon : new ArrayList<ChiTietHoaDon>();
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public LocalDateTime getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(LocalDateTime ngayTao) {
        this.ngayTao = ngayTao;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public Ban getBan() {
        return ban;
    }

    public void setBan(Ban ban) {
        this.ban = ban;
    }

    public ArrayList<ChiTietHoaDon> getChiTietHoaDon() {
        return chiTietHoaDon;
    }

    public void setChiTietHoaDon(ArrayList<ChiTietHoaDon> chiTietHoaDon) {
        this.chiTietHoaDon = chiTietHoaDon;
    }

    // Phương thức
    public void themChiTiet(ChiTietHoaDon chiTiet) {
        if(chiTiet != null) {
            chiTietHoaDon.add(chiTiet);
        }
    }

    public double tinhTongTien() {
        return chiTietHoaDon.stream().mapToDouble(value -> value.tinhThanhTien()).sum();
    }
}
