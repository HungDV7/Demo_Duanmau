/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;

import service.*;
import java.util.List;
import model.HoaDon_Model;

/**
 *
 * @author baphuoc
 */
public interface IHoaDonRepos {
    List<HoaDon_Model> getAllHD();
    List<HoaDon_Model> getHDByTT(Integer TinhTrang);
    HoaDon_Model getHDByMa(String ma);
    int add(HoaDon_Model h);
    int ThanhToan(HoaDon_Model h);
}
