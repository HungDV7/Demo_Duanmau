/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author baphuoc
 */
public class HDChiTiet_Model {
    private HoaDon_Model hoaDon;
    private ChiTietSP_Model chiTietSP;
    private int SL;
    private float donGia;

    public HDChiTiet_Model() {
    }

    public HDChiTiet_Model(HoaDon_Model hoaDon, ChiTietSP_Model chiTietSP, int SL, float donGia) {
        this.hoaDon = hoaDon;
        this.chiTietSP = chiTietSP;
        this.SL = SL;
        this.donGia = donGia;
    }

    public HoaDon_Model getHoaDon() {
        return hoaDon;
    }

    public void setHoaDon(HoaDon_Model hoaDon) {
        this.hoaDon = hoaDon;
    }

    public ChiTietSP_Model getChiTietSP() {
        return chiTietSP;
    }

    public void setChiTietSP(ChiTietSP_Model chiTietSP) {
        this.chiTietSP = chiTietSP;
    }

    public int getSL() {
        return SL;
    }

    public void setSL(int SL) {
        this.SL = SL;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }
    
}
