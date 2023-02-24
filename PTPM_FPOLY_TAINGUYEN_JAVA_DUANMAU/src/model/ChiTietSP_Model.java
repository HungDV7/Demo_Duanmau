/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author baphuoc
 */
public class ChiTietSP_Model {
    private String id;
    private SanPham_Model sanPham;
    private NSX_Model nsx;
    private MauSac_Model mauSac;
    private DongSP_Model dongSP;
    private int NamBH;
    private String moTa;
    private int slTon;
    private float giaNhap;
    private float giaBan;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ChiTietSP_Model(String id, SanPham_Model sanPham, NSX_Model nsx, MauSac_Model mauSac, DongSP_Model dongSP, int NamBH, String moTa, int slTon, float giaNhap, float giaBan) {
        this.id = id;
        this.sanPham = sanPham;
        this.nsx = nsx;
        this.mauSac = mauSac;
        this.dongSP = dongSP;
        this.NamBH = NamBH;
        this.moTa = moTa;
        this.slTon = slTon;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
    }

    public ChiTietSP_Model() {
    }

    public ChiTietSP_Model(SanPham_Model sanPham, NSX_Model nsx, MauSac_Model mauSac, DongSP_Model dongSP, int NamBH, String moTa, int slTon, float giaNhap, float giaBan) {
        this.sanPham = sanPham;
        this.nsx = nsx;
        this.mauSac = mauSac;
        this.dongSP = dongSP;
        this.NamBH = NamBH;
        this.moTa = moTa;
        this.slTon = slTon;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
    }

    public SanPham_Model getSanPham() {
        return sanPham;
    }

    public void setSanPham(SanPham_Model sanPham) {
        this.sanPham = sanPham;
    }

    public NSX_Model getNsx() {
        return nsx;
    }

    public void setNsx(NSX_Model nsx) {
        this.nsx = nsx;
    }

    public MauSac_Model getMauSac() {
        return mauSac;
    }

    public void setMauSac(MauSac_Model mauSac) {
        this.mauSac = mauSac;
    }

    public DongSP_Model getDongSP() {
        return dongSP;
    }

    public void setDongSP(DongSP_Model dongSP) {
        this.dongSP = dongSP;
    }

    public int getNamBH() {
        return NamBH;
    }

    public void setNamBH(int NamBH) {
        this.NamBH = NamBH;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getSlTon() {
        return slTon;
    }

    public void setSlTon(int slTon) {
        this.slTon = slTon;
    }

    public float getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(float giaNhap) {
        this.giaNhap = giaNhap;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }
    
}
