/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.ArrayList;
import java.util.List;
import model.SanPham_Model;
import repository.impl.SanPham_Repos;
import service.ISanPhamService;
import view_model.SanPham_View;

/**
 *
 * @author baphuoc
 */
public class SanPham_Service implements ISanPhamService{
    SanPham_Repos SP = new SanPham_Repos();
    public  List<SanPham_View> getALLSP() {
        List<SanPham_Model> listSP =  SP.getALLSP();
        List<SanPham_View> listView = new ArrayList<>();
        int stt = 1;
        for (SanPham_Model s : listSP) {
            listView.add(new SanPham_View(stt, s.getMa(), s.getTen()));
            stt++;
        }
        return listView;
    }
    public  SanPham_Model getSPByMa(String ma){
        return SP.getSPByMa(ma);
    }
    public  int Add(SanPham_Model sp){
        return SP.Add(sp);
    }
    public  int delete(String idSP){
        return SP.delete(idSP);
    }
    public  int Update(SanPham_Model sp){
        return SP.Update(sp);
    }
    public  List<SanPham_View> SearchSP(String KeyWord){
        List<SanPham_Model> listSP =  SP.SearchSP(KeyWord);
        List<SanPham_View> listView = new ArrayList<>();
        int stt = 1;
        for (SanPham_Model s : listSP) {
            listView.add(new SanPham_View(stt, s.getMa(), s.getTen()));
            stt++;
        }
        return listView;
    }
}
