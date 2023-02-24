/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.HoaDon_Model;
import view_model.HoaDon_QLHoaDon;

/**
 *
 * @author baphuoc
 */
public interface IHoaDonService {
    List<HoaDon_QLHoaDon> getViewHoaDon();
    List<HoaDon_QLHoaDon> getViewHoaDonByTT(Integer TinhTrang);
    HoaDon_Model getHDByMa(String ma);
    int add(HoaDon_Model h);
    int ThanhToan(HoaDon_Model h);
}
