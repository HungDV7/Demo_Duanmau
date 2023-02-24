/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author baphuoc
 */
public class ChucVu_model {
    private String id;
    private String ma;
    private String ten;

    public ChucVu_model() {
    }

    public ChucVu_model(String id, String ma, String ten) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
    }
    public ChucVu_model(String ma, String ten) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
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
    @Override
    public String toString() {
        return ma + " - " + ten ;
    }
}
