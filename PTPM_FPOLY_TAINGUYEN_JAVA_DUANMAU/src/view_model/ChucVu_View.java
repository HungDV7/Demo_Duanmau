/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view_model;

/**
 *
 * @author baphuoc
 */
public class ChucVu_View {
    private int stt;
    private String ma;
   private String ten;

    public ChucVu_View() {
    }

    public ChucVu_View(int stt, String ma, String ten) {
        this.stt = stt;
        this.ma = ma;
        this.ten = ten;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
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
