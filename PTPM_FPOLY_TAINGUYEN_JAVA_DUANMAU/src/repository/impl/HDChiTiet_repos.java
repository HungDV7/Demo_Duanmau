/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.impl;

import java.util.ArrayList;
import java.util.List;
import model.HDChiTiet_Model;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ChiTietSP_Model;
import model.DongSP_Model;
import model.HoaDon_Model;
import model.MauSac_Model;
import model.NSX_Model;
import model.SanPham_Model;
import repository.IHDChiTietRepos;
import ulti.JDBC_Helper;

/**
 *
 * @author baphuoc
 */
public class HDChiTiet_repos implements IHDChiTietRepos{

    @Override
    public  List<HDChiTiet_Model> getHDCTByMaHD(String ma) {
        List<HDChiTiet_Model> list = new ArrayList<>();
        String sql = "SELECT HoaDon.id, HoaDon.Ma,HoaDon.NgayTao,HoaDon.TinhTrang,\n"
                + "ChiTietSP.id,SanPham.Ma, SanPham.Ten, Nsx.Ma, Nsx.Ten, MauSac.Ma, MauSac.Ten, DongSP.Ma, DongSP.Ten, NamBH,MoTa, SoLuongTon,GiaNhap,GiaBan,\n"
                + "SoLuong,\n"
                + "DonGia\n"
                + "FROM HoaDonChiTiet \n"
                + "Join HoaDon ON HoaDon.id = HoaDonChiTiet.idHoaDon\n"
                + "join ChiTietSP on ChiTietSP.id = HoaDonChiTiet.idChiTietSP\n"
                + "Join SanPham on ChiTietSP.idSP = SanPham.id\n"
                + "join Nsx on ChiTietSP.IdNsx = Nsx.Id\n"
                + "join MauSac on ChiTietSP.IdMauSac = MauSac.Id\n"
                + "Join DongSP on ChiTietSP.IdDongSP = DongSP.Id WHERE HoaDon.Ma = ?";
        ResultSet rs = JDBC_Helper.Query(sql, ma);
        try {
            while (rs.next()) {
                HoaDon_Model h = new HoaDon_Model(rs.getString(1),rs.getString(2), rs.getDate(3), rs.getInt(4));
                SanPham_Model sp = new SanPham_Model(rs.getString(6), rs.getString(7));
                NSX_Model NSX = new NSX_Model(rs.getString(8), rs.getString(9));
                MauSac_Model ms = new MauSac_Model(rs.getString(10), rs.getString(11));
                DongSP_Model d = new DongSP_Model(rs.getString(12), rs.getString(13));
                int nambh = Integer.parseInt(rs.getString(14));
                String mota = rs.getString(15);
                int SL = Integer.parseInt(rs.getString(16));
                int gianhap = Integer.parseInt(rs.getString(17));
                int giaBan = Integer.parseInt(rs.getString(18));
                ChiTietSP_Model spCT = new ChiTietSP_Model(rs.getString(5),sp, NSX, ms, d, nambh, mota, SL, gianhap, giaBan);
                int soLuong = rs.getInt(19);
                float dongia = rs.getFloat(20);
                list.add(new HDChiTiet_Model(h, spCT, soLuong, dongia));
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(HDChiTiet_repos.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
            return null;
        }
    }
    @Override
    public  int addSP(HDChiTiet_Model h){
        String sql = "INSERT INTO HoaDonChiTiet(idHoaDon,idChiTietSP,SoLuong,DonGia) VALUES (?,?,?,?)";
        return JDBC_Helper.Update(sql,h.getHoaDon().getId(),h.getChiTietSP().getId(),h.getSL(),h.getDonGia());
    }

    @Override
    public int updateSL(HDChiTiet_Model h) {
        String sql = "UPDATE HoaDonChiTiet SET SoLuong = ?, DonGia = ? WHERE idHoaDon= ? and idChiTietSP = ?";
        return JDBC_Helper.Update(sql,h.getSL(),h.getDonGia(),h.getHoaDon().getId(),h.getChiTietSP().getId());
    }

    @Override
    public int delete(HDChiTiet_Model h) {
        String sql = "DELETE FROM HoaDonChiTiet WHERE idHoaDon= ? and idChiTietSP = ?";
        return JDBC_Helper.Update(sql,h.getHoaDon().getId(),h.getChiTietSP().getId());
    }
    
}
