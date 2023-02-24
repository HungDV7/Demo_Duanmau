/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.ArrayList;
import java.util.List;
import model.ChucVu_model;
import repository.impl.ChucVu_repos;
import service.IChucVu_service;
import view_model.ChucVu_View;

/**
 *
 * @author baphuoc
 */
public class ChucVu_Service implements IChucVu_service{
    ChucVu_repos repos = new ChucVu_repos();
    @Override
    public List<ChucVu_View> getAllChucVu() {
        List<ChucVu_model> list = repos.getAllChucVu();
        List<ChucVu_View> view = new ArrayList<>();
        int stt = 1;
        for (ChucVu_model c : list) {
            view.add(new ChucVu_View(stt, c.getMa(), c.getTen()));
            stt++;
        }
        return view;
    }

    @Override
    public ChucVu_model getChucVuByMa(String ma) {
        return repos.getChucVuByMa(ma);
    }

    @Override
    public int add(ChucVu_model cv) {
        return repos.add(cv);
    }

    @Override
    public int delete(ChucVu_model cv) {
        return repos.delete(cv);
    }

    @Override
    public int update(ChucVu_model cv) {
        return repos.update(cv);
    }
    
}
