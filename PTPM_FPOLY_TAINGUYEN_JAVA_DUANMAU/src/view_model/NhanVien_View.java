/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view_model;

import java.util.Date;

/**
 *
 * @author baphuoc
 */
public class NhanVien_View {
    private int stt;
    private String Ma;
    private String ten;
    private String gioiTinh;
    private Date ngaySinh;
    private String ChucVu;
    private String cuaHang;
    private int trangThai;

    public NhanVien_View() {
    }

    public NhanVien_View(int stt, String Ma, String ten, String gioiTinh, Date ngaySinh, String ChucVu, String cuaHang, int trangThai) {
        this.stt = stt;
        this.Ma = Ma;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.ChucVu = ChucVu;
        this.cuaHang = cuaHang;
        this.trangThai = trangThai;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    

    public String getMa() {
        return Ma;
    }

    public void setMa(String Ma) {
        this.Ma = Ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getChucVu() {
        return ChucVu;
    }

    public void setChucVu(String ChucVu) {
        this.ChucVu = ChucVu;
    }

    public String getCuaHang() {
        return cuaHang;
    }

    public void setCuaHang(String cuaHang) {
        this.cuaHang = cuaHang;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }
    
}
