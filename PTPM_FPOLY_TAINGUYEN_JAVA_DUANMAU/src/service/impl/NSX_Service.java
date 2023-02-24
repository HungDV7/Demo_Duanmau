/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.ArrayList;
import java.util.List;
import model.NSX_Model;
import repository.impl.NSX_Repos;
import service.INSXService;
import ulti.JDBC_Helper;
import view_model.NSX_View;

/**
 *
 * @author baphuoc
 */
public class NSX_Service implements INSXService{
    NSX_Repos NSX = new NSX_Repos();
    @Override
    public  List<NSX_View> getAllNSX(){
        List<NSX_Model> list =  NSX.getAllNSX();
        List<NSX_View> listView = new ArrayList<>();
        int stt = 1;
        for (NSX_Model n: list) {
            listView.add(new NSX_View(stt,n.getMa(), n.getTen()));
            stt++;
        }
        return listView;
    }
    @Override
    public  NSX_Model getByMa(String ten){
        return NSX.getByMa(ten);
    }
    @Override
    public  int add(NSX_Model n){
        return NSX.add(n);
    }
    @Override
    public  int update(NSX_Model n){
        return NSX.update(n);
    }
    @Override
    public  int delete(NSX_Model n){
        return NSX.delete(n);
    }
}
