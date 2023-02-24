/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.ArrayList;
import java.util.List;
import model.KhachHang_model;
import repository.impl.KhachHang_repos;
import service.IKhachHang_Service;
import view_model.KhachHang_view;

/**
 *
 * @author baphuoc
 */
public class KhachHang_Service implements IKhachHang_Service {

    KhachHang_repos repos = new KhachHang_repos();

    @Override
    public List<KhachHang_view> getAllKH() {
        List<KhachHang_model> list = repos.getAllKH();
        List<KhachHang_view> view = new ArrayList<>();
        int stt = 1;
        for (KhachHang_model k : list) {
            view.add(new KhachHang_view(stt,k.getMa(), k.getHoTen(), k.getNgaySinh(), k.getSdt(), k.getDiaChi(), k.getThanhPho(), k.getQuocGia()));
            stt++;
        }
        return view;
    }

    @Override
    public KhachHang_model getKHByMa(String ma) {
        return repos.getKHByMa(ma);
    }

    @Override
    public List<KhachHang_view> findKH(String keyWord) {
        List<KhachHang_model> list = repos.findKH(keyWord);
        List<KhachHang_view> view = new ArrayList<>();
        int stt = 1;
        for (KhachHang_model k : list) {
            view.add(new KhachHang_view(stt,k.getMa(), k.getHoTen(), k.getNgaySinh(), k.getSdt(), k.getDiaChi(), k.getThanhPho(), k.getQuocGia()));
            stt++;
        }
        return view;
    }

    @Override
    public int add(KhachHang_model k) {
        return repos.add(k);
    }

    @Override
    public int update(KhachHang_model k) {
        return repos.update(k);
    }

    @Override
    public int delete(KhachHang_model k) {
        return repos.delete(k);
    }
}
