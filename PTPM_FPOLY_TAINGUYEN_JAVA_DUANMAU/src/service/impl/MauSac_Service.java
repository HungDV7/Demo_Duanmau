/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.ArrayList;
import java.util.List;
import model.MauSac_Model;
import repository.impl.MauSac_repos;
import service.IMauSacService;
import view_model.MauSac_View;

/**
 *
 * @author baphuoc
 */
public class MauSac_Service implements IMauSacService{
    MauSac_repos MauSac = new MauSac_repos();
    @Override
    public  List<MauSac_View> getAllNSX(){
        List<MauSac_Model> list =  MauSac.getAllNSX();
        List<MauSac_View> listView = new ArrayList<>();
        int stt = 1;
        for (MauSac_Model m : list) {
            listView.add(new MauSac_View(stt, m.getMa(), m.getTen()));
            stt++;
        }
        return listView ;
    }
    @Override
    public  MauSac_Model getByMa(String ma){
        return MauSac.getByMa(ma);
    }
    @Override
    public  int add(MauSac_Model m){
        return MauSac.add(m);
    }
    @Override
    public  int update(MauSac_Model m){
        return MauSac.update(m);
    }
    @Override
    public  int delete(MauSac_Model m){
        return MauSac.delete(m);
    }
}
