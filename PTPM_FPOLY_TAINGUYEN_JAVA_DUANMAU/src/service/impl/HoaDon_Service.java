/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.ArrayList;
import java.util.List;
import model.HoaDon_Model;
import repository.impl.HoaDon_repos;
import service.IHoaDonService;
import view_model.HoaDon_QLHoaDon;

/**
 *
 * @author baphuoc
 */
public class HoaDon_Service implements IHoaDonService {
    HoaDon_repos HoaDon = new HoaDon_repos();
   
    @Override
    public HoaDon_Model getHDByMa(String ma) {
        return HoaDon.getHDByMa(ma);
    }

    @Override
    public int add(HoaDon_Model h) {
        return HoaDon.add(h);
    }

    @Override
    public int ThanhToan(HoaDon_Model h) {
        return HoaDon.ThanhToan(h);
    }

    @Override
    public List<HoaDon_QLHoaDon> getViewHoaDon() {
        List<HoaDon_QLHoaDon> listViewHD = new ArrayList<>();
        List<HoaDon_Model> listHD = HoaDon.getAllHD();
        int i = 1;
        for (HoaDon_Model h : listHD) {
            listViewHD.add(new HoaDon_QLHoaDon(i,h.getMa(),h.getNgayTao(),"",h.getTrangThai()));
            i++;
        }
        return listViewHD;
    }

    @Override
    public List<HoaDon_QLHoaDon> getViewHoaDonByTT(Integer TinhTrang) {
        List<HoaDon_QLHoaDon> listViewHD = new ArrayList<>();
        List<HoaDon_Model> listHD = HoaDon.getHDByTT(TinhTrang);
        int i = 1;
        for (HoaDon_Model h : listHD) {
            listViewHD.add(new HoaDon_QLHoaDon(i,h.getMa(),h.getNgayTao(),"",h.getTrangThai()));
            i++;
        }
        return listViewHD;
    }
}
