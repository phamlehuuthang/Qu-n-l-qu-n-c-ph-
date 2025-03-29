/**
 * @ (#) Ban.java       1.0     29/03/2025
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
public class Ban {
    private final String maBan;
    private TrangThaiBan trangThai;
    private HoaDon hoaDon;

    //constructor getter setter
    public Ban(String maBan, TrangThaiBan trangThai, HoaDon hoaDon) {
        this.maBan = maBan;
        this.trangThai = trangThai;
        this.hoaDon = hoaDon;
    }

    public Ban(String maBan, TrangThaiBan trangThai) {
        this(maBan,trangThai,null);
    }

    public String getMaBan() {
        return maBan;
    }

    public TrangThaiBan getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(TrangThaiBan trangThai) {
        this.trangThai = trangThai;
    }

    public HoaDon getHoaDon() {
        return hoaDon;
    }

    public void setHoaDon(HoaDon hoaDon) {
        this.hoaDon = hoaDon;
    }

    //Phương thức
    public void datBan(HoaDon hoaDonMoi) {
        setHoaDon(hoaDonMoi);
        setTrangThai(TrangThaiBan.DANG_SU_DUNG);
    }

    public void huyBan() {
        setHoaDon(null);
        setTrangThai(TrangThaiBan.TRONG);
    }

    public void thanhToan() {
        setHoaDon(null);
        setTrangThai(TrangThaiBan.TRONG);
    }
}
