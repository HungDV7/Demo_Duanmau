/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.ArrayList;
import java.util.List;
import model.ChiTietSP_Model;
import repository.impl.SPChiTiet_Repos;
import service.IChiTietSPService;
import view_model.CTSP_View;

/**
 *
 * @author baphuoc
 */

public class ChiTietSP_Service implements IChiTietSPService{
    SPChiTiet_Repos SP = new SPChiTiet_Repos();
    @Override
    public List<CTSP_View> getAllSPView(){
        List<ChiTietSP_Model> listSP =  SP.getAllSP();
        List<CTSP_View> listCTSP = new ArrayList<>();
        int i = 1;
        for (ChiTietSP_Model S : listSP) {
            listCTSP.add(new CTSP_View(i,S.getId(), S.getSanPham().getMa(), S.getSanPham().getTen(), S.getMauSac().getTen(), S.getNamBH(), S.getMoTa(),S.getSlTon(), S.getGiaNhap(), S.getGiaBan()));
            i++;
        }
        
        return listCTSP;
    }
    @Override
    public  List<CTSP_View> getCTSPByMaSPView(String MaSP) {
        List<ChiTietSP_Model> listSP = SP.getCTSPByMaSP(MaSP);
        List<CTSP_View> listCTSP = new ArrayList<>();
        int i = 1;
        for (ChiTietSP_Model S : listSP) {
            listCTSP.add(new CTSP_View(i,S.getId(), S.getSanPham().getMa(), S.getSanPham().getTen(), S.getMauSac().getTen(), S.getNamBH(), S.getMoTa(),S.getSlTon(), S.getGiaNhap(), S.getGiaBan()));
            i++;
        }
        return listCTSP;
    }
    @Override
    public  int add(ChiTietSP_Model sp){
        return SP.add(sp);
    }
    @Override
    public  int deleteBySP(String idSP){
        return SP.delete(idSP);
    }
    @Override
    public  int deleteByColor(String id) {
        return SP.deleteByColor(id);
    }
    @Override
    public  int deleteByNSX(String id) {
        return SP.deleteByNSX(id);
    }
    @Override
    public  int deleteByDongSP(String id) {
        return SP.deleteByDongSP(id);
    }
    @Override
    public  int delete(String id){
        return SP.delete(id);
    }
    @Override
    public  int update(ChiTietSP_Model sp){
        return SP.update(sp);
    }
    @Override
    public  int update(ChiTietSP_Model sp,int SL ){
        return SP.update(sp, SL);
    }
    
    @Override
    public  List<CTSP_View> search(String keyWord){
        List<ChiTietSP_Model> listSP =  SP.search(keyWord);
        List<CTSP_View> listCTSP = new ArrayList<>();
        int i = 1;
        for (ChiTietSP_Model S : listSP) {
            listCTSP.add(new CTSP_View(i,S.getId(), S.getSanPham().getMa(), S.getSanPham().getTen(), S.getMauSac().getTen(), S.getNamBH(), S.getMoTa(),S.getSlTon(), S.getGiaNhap(), S.getGiaBan()));
            i++;
        }
        return listCTSP;
    }

    @Override
    public ChiTietSP_Model getCTSP(String MaSP,String maMau) {
        return  SP.getCTSP(MaSP,maMau);
    }

    @Override
    public ChiTietSP_Model getCTSPByid(String idctSP) {
        return SP.getCTSPByid(idctSP);
    }
}
