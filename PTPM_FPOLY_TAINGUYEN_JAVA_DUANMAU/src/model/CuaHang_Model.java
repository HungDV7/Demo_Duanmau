/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author baphuoc
 */
public class CuaHang_Model {
    private String id;
    private String ma;
    private String Ten;
    private String DiaChi;
    private String ThanhPho;
    private String QuocGia;

    public CuaHang_Model() {
    }

    public CuaHang_Model(String id, String ma, String Ten, String DiaChi, String ThanhPho, String QuocGia) {
        this.id = id;
        this.ma = ma;
        this.Ten = Ten;
        this.DiaChi = DiaChi;
        this.ThanhPho = ThanhPho;
        this.QuocGia = QuocGia;
    }
    public CuaHang_Model( String ma, String Ten, String DiaChi, String ThanhPho, String QuocGia) {
        this.ma = ma;
        this.Ten = Ten;
        this.DiaChi = DiaChi;
        this.ThanhPho = ThanhPho;
        this.QuocGia = QuocGia;
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
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getThanhPho() {
        return ThanhPho;
    }

    public void setThanhPho(String ThanhPho) {
        this.ThanhPho = ThanhPho;
    }

    public String getQuocGia() {
        return QuocGia;
    }

    public void setQuocGia(String QuocGia) {
        this.QuocGia = QuocGia;
    }

    @Override
    public String toString() {
        return ma + " - " + Ten ;
    }
    
}
