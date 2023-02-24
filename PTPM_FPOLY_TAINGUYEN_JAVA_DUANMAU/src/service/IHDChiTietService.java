/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.HDChiTiet_Model;
import view_model.GioHang_QLHoaDon;

/**
 *
 * @author baphuoc
 */
public interface IHDChiTietService {
    List<HDChiTiet_Model> getHDCTByMaHD(String ma);
    List<GioHang_QLHoaDon> getHDCTView(String ma);
    int addSP(HDChiTiet_Model h);
    int updateSL(HDChiTiet_Model h);
    int delete(HDChiTiet_Model h);
}
