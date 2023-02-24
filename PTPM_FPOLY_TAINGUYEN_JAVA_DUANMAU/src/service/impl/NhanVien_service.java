/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.ArrayList;
import java.util.List;
import model.NhanVien_Model;
import repository.impl.NhanVien_repos;
import service.INhanVien_sevice;
import view_model.NhanVien_View;

/**
 *
 * @author baphuoc
 */
public class NhanVien_service implements INhanVien_sevice{
    NhanVien_repos repos = new NhanVien_repos();
    @Override
    public List<NhanVien_View> getALllNV() {
        List<NhanVien_Model> list  = repos.getALllNV();
        List<NhanVien_View> view = new ArrayList<>();
        int stt = 1;
        for (NhanVien_Model n : list) {
            view.add(new NhanVien_View(stt,n.getMa(), n.getTen(),n.getGioiTinh(), n.getNgaySinh(),n.getChucVu().getTen(), n.getCuaHang().getTen(), n.getTrangThai()));
            stt++;
        }
        return view;
    }

    @Override
    public NhanVien_Model getNVByMa(String ma) {
        return repos.getNVByMa(ma);
    }

    @Override
    public List<NhanVien_View> findNV(String ketWord) {
        List<NhanVien_Model> list  = repos.findNV(ketWord);
        List<NhanVien_View> view = new ArrayList<>();
        int stt = 1;
        for (NhanVien_Model n : list) {
            view.add(new NhanVien_View(stt,n.getMa(), n.getTen(),n.getGioiTinh(), n.getNgaySinh(),n.getChucVu().getTen(), n.getCuaHang().getTen(), n.getTrangThai()));
            stt++;
        }
        return view;
    }

    @Override
    public int add(NhanVien_Model nv) {
        return repos.add(nv);
    }

    @Override
    public int delete(NhanVien_Model nv) {
        return repos.delete(nv);
    }

    @Override
    public int update(NhanVien_Model nv) {
        return repos.update(nv);
    }
    
}
