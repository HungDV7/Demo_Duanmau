/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;

import service.*;
import java.util.List;
import model.ChiTietSP_Model;
import view_model.CTSP_View;

/**
 *
 * @author baphuoc
 */
public interface IChiTietSPRepos {
    List<ChiTietSP_Model> getAllSP();
     List<ChiTietSP_Model> getCTSPByMaSP(String MaSP);
     ChiTietSP_Model getCTSP(String MaSP,String maMau);
     int add(ChiTietSP_Model sp);
     int deleteBySP(String idSP);
     int deleteByColor(String id);
     int deleteByNSX(String id);
     int deleteByDongSP(String id);
     int delete(String id);
     int update(ChiTietSP_Model sp);
     int update(ChiTietSP_Model sp,int SL );
     List<ChiTietSP_Model> search(String keyWord);
     ChiTietSP_Model getCTSPByid(String idctSP);
}
