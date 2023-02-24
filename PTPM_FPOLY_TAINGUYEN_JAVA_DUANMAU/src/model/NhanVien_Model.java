/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author baphuoc
 */
public class NhanVien_Model {
    private String id;
    private String ma;
    private String ten;
    private String gioiTinh;
    private Date NgaySinh;
    private String diaChi;
    private String sdt;
    private String MatKhau;
    private CuaHang_Model cuaHang;
    private ChucVu_model chucVu;
    private int trangThai;

    public NhanVien_Model() {
    }

    public NhanVien_Model(String id, String ma, String ten, String gioiTinh, Date NgaySinh, String diaChi, String sdt, String MatKhau, CuaHang_Model cuaHang, ChucVu_model chucVu, int trangThai) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.NgaySinh = NgaySinh;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.MatKhau = MatKhau;
        this.cuaHang = cuaHang;
        this.chucVu = chucVu;
        this.trangThai = trangThai;
    }

    public NhanVien_Model(String ma, String ten, String gioiTinh, Date NgaySinh, String diaChi, String sdt, String MatKhau, CuaHang_Model cuaHang, ChucVu_model chucVu, int trangThai) {
        this.ma = ma;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.NgaySinh = NgaySinh;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.MatKhau = MatKhau;
        this.cuaHang = cuaHang;
        this.chucVu = chucVu;
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "NhanVien_Model{" + "id=" + id + ", ma=" + ma + ", ten=" + ten + ", gioiTinh=" + gioiTinh + ", NgaySinh=" + NgaySinh + ", diaChi=" + diaChi + ", sdt=" + sdt + ", MatKhau=" + MatKhau + ", cuaHang=" + cuaHang + ", chucVu=" + chucVu + ", trangThai=" + trangThai + '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
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
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public CuaHang_Model getCuaHang() {
        return cuaHang;
    }

    public void setCuaHang(CuaHang_Model cuaHang) {
        this.cuaHang = cuaHang;
    }

    public ChucVu_model getChucVu() {
        return chucVu;
    }

    public void setChucVu(ChucVu_model chucVu) {
        this.chucVu = chucVu;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }
    
}
