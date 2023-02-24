/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view_model;

/**
 *
 * @author baphuoc
 */
public class SanPham_View {
    private int stt;
    private String ma;
    private String Ten;

    public SanPham_View() {
    }

    public SanPham_View(int stt, String ma, String Ten) {
        this.stt = stt;
        this.ma = ma;
        this.Ten = Ten;
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
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

}
