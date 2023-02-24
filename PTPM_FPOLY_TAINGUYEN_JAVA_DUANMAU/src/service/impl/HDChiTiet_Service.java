/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.ArrayList;
import java.util.List;
import model.HDChiTiet_Model;
import repository.impl.HDChiTiet_repos;
import service.IHDChiTietService;
import view_model.GioHang_QLHoaDon;

/**
 *
 * @author baphuoc
 */
public class HDChiTiet_Service implements IHDChiTietService {

    HDChiTiet_repos HDCT = new HDChiTiet_repos();

    @Override
    public List<HDChiTiet_Model> getHDCTByMaHD(String ma) {
        return HDCT.getHDCTByMaHD(ma);
    }

    @Override
    public int addSP(HDChiTiet_Model h) {
        return HDCT.addSP(h);
    }

    @Override
    public List<GioHang_QLHoaDon> getHDCTView(String ma) {
        List<HDChiTiet_Model> listHDCT = HDCT.getHDCTByMaHD(ma);
        List<GioHang_QLHoaDon> listGH = new ArrayList<>();
        int stt = 1;
        for (HDChiTiet_Model h : listHDCT) {
            listGH.add(new GioHang_QLHoaDon(stt, h.getChiTietSP().getSanPham().getMa(), h.getChiTietSP().getMauSac().getTen(), h.getSL(), h.getChiTietSP().getGiaBan(), h.getDonGia()));
            stt++;
        }
        System.out.println("asd");
        return listGH;
    }

    @Override
    public int updateSL(HDChiTiet_Model h) {
        return HDCT.updateSL(h);
    }

    @Override
    public int delete(HDChiTiet_Model h) {
        return HDCT.delete(h);
    }
}
