/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;

import service.*;
import java.util.List;
import model.HDChiTiet_Model;

/**
 *
 * @author baphuoc
 */
public interface IHDChiTietRepos {
    List<HDChiTiet_Model> getHDCTByMaHD(String ma);
    int addSP(HDChiTiet_Model h);
    int updateSL(HDChiTiet_Model h);
    int delete(HDChiTiet_Model h);
}
