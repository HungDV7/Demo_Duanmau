/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.ArrayList;
import java.util.List;
import model.DongSP_Model;
import repository.impl.DongSP_Repos;
import service.IDongSPService;
import view_model.DongSP_View;

/**
 *
 * @author baphuoc
 */
public class DongSP_Service implements IDongSPService{
    DongSP_Repos DongSP = new DongSP_Repos();
    @Override
    public  List<DongSP_View> getAllNSX(){
        List<DongSP_Model> list =  DongSP.getAllNSX();
        List<DongSP_View> listView = new ArrayList<>();
        int stt = 1;
        for (DongSP_Model d : list) {
            listView.add(new DongSP_View(stt,d.getMa(), d.getTen()));
            stt++;
        }
        return listView;
    }
    @Override
    public  DongSP_Model getByMa(String ten){
        return DongSP.getByMa(ten);
    }
    @Override
    public  int add(DongSP_Model d){
        return DongSP.add(d);
    }
    @Override
    public  int update(DongSP_Model d){
        return DongSP.update(d);
    }
    @Override
    public  int delete(DongSP_Model d){
        return DongSP.delete(d);
    }
}
