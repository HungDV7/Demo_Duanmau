/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.ArrayList;
import java.util.List;
import model.CuaHang_Model;
import repository.impl.CuaHang_repos;
import service.ICuaHang_service;
import view_model.CuaHang_View;

/**
 *
 * @author baphuoc
 */
public class CuaHang_Service implements ICuaHang_service{
    CuaHang_repos repos= new CuaHang_repos();
    @Override
    public List<CuaHang_View> getAllCH() {
        List<CuaHang_Model> list = repos.getAllCH();
        List<CuaHang_View> view = new ArrayList<>();
        int stt = 1;
        for (CuaHang_Model c : list) {
            view.add(new CuaHang_View(stt, c.getMa(), c.getTen(), c.getDiaChi(), c.getThanhPho(), c.getQuocGia()));
            stt++;
        }
        return view;
    }

    @Override
    public CuaHang_Model getCHByMa(String ma) {
        return repos.getCHByMa(ma);
    }

    @Override
    public int add(CuaHang_Model ch) {
        return repos.add(ch);
    }

    @Override
    public int update(CuaHang_Model ch) {
    return repos.update(ch);
    }

    @Override
    public int delete(CuaHang_Model ch) {
        return repos.delete(ch);
    }
    
}
