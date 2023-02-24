/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.impl;

import java.util.ArrayList;
import java.util.List;
import model.ChiTietSP_Model;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.DongSP_Model;
import model.MauSac_Model;
import model.NSX_Model;
import model.SanPham_Model;
import repository.IChiTietSPRepos;
import ulti.JDBC_Helper;

/**
 *
 * @author baphuoc
 */
public class SPChiTiet_Repos implements IChiTietSPRepos{

    @Override
    public  List<ChiTietSP_Model> getAllSP() {
        List<ChiTietSP_Model> list = new ArrayList<>();
        String sql = "SELECT ChiTietSP.id ,SanPham.Ma, SanPham.Ten, Nsx.Ma, Nsx.Ten, MauSac.Ma, MauSac.Ten, DongSP.Ma, DongSP.Ten, NamBH,MoTa, SoLuongTon,GiaNhap,GiaBan FROM ChiTietSP \n"
                + "                Join SanPham on ChiTietSP.idSP = SanPham.id\n"
                + "                join Nsx on ChiTietSP.IdNsx = Nsx.Id\n"
                + "                join MauSac on ChiTietSP.IdMauSac = MauSac.Id\n"
                + "                Join DongSP on ChiTietSP.IdDongSP = DongSP.Id\n"
                + "                order by SanPham.Ma";
        ResultSet rs = JDBC_Helper.Query(sql);
        try {
            while (rs.next()) {
                String id = rs.getString(1);
                SanPham_Model sp = new SanPham_Model(rs.getString(2), rs.getString(3));
                NSX_Model NSX = new NSX_Model(rs.getString(4), rs.getString(5));
                MauSac_Model ms = new MauSac_Model(rs.getString(6), rs.getString(7));
                DongSP_Model d = new DongSP_Model(rs.getString(8), rs.getString(9));
                int nambh = Integer.parseInt(rs.getString(10));
                String mota = rs.getString(11);
                int SL = Integer.parseInt(rs.getString(12));
                int gianhap = Integer.parseInt(rs.getString(13));
                int giaBan = Integer.parseInt(rs.getString(14));
                list.add(new ChiTietSP_Model(id, sp, NSX, ms, d, nambh, mota, SL, gianhap, giaBan));
            }
            return list;

        } catch (SQLException ex) {
            Logger.getLogger(SPChiTiet_Repos.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
            return null;
        }

    }

    @Override
    public  List<ChiTietSP_Model> getCTSPByMaSP(String MaSP) {
        List<ChiTietSP_Model> list = new ArrayList<>();
        String sql = "SELECT ChiTietSP.id,SanPham.Ma, SanPham.Ten, Nsx.Ma, Nsx.Ten, MauSac.Ma, MauSac.Ten, DongSP.Ma, DongSP.Ten, NamBH,MoTa, SoLuongTon,GiaNhap,GiaBan FROM ChiTietSP \n"
                + "                Join SanPham on ChiTietSP.idSP = SanPham.id\n"
                + "                join Nsx on ChiTietSP.IdNsx = Nsx.Id\n"
                + "                join MauSac on ChiTietSP.IdMauSac = MauSac.Id\n"
                + "                Join DongSP on ChiTietSP.IdDongSP = DongSP.Id\n"
                + "WHERE SanPham.Ma = ?\n"
                + "                order by SanPham.Ma";
        ResultSet rs = JDBC_Helper.Query(sql, MaSP);
        try {
            while (rs.next()) {
                SanPham_Model sp = new SanPham_Model(rs.getString(2), rs.getString(3));
                NSX_Model NSX = new NSX_Model(rs.getString(4), rs.getString(5));
                MauSac_Model ms = new MauSac_Model(rs.getString(6), rs.getString(7));
                DongSP_Model d = new DongSP_Model(rs.getString(8), rs.getString(9));
                int nambh = Integer.parseInt(rs.getString(10));
                String mota = rs.getString(11);
                int SL = Integer.parseInt(rs.getString(12));
                int gianhap = Integer.parseInt(rs.getString(13));
                int giaBan = Integer.parseInt(rs.getString(14));
                list.add(new ChiTietSP_Model(rs.getString(1),sp, NSX, ms, d, nambh, mota, SL, gianhap, giaBan));
            }
            return list;

        } catch (SQLException ex) {
            Logger.getLogger(SPChiTiet_Repos.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
            return null;
        }

    }

    @Override
    public  int add(ChiTietSP_Model sp) {
        String sql = "INSERT INTO ChiTietSP(IdSP, IdNsx, IdMauSac, IdDongSP, NamBH, Mota, SoLuongTon, GiaNhap, GiaBan) VALUES (?,?,?,?,?,?,?,?,?)";
        return JDBC_Helper.Update(sql, sp.getSanPham().getId(), sp.getNsx().getId(), sp.getMauSac().getId(), sp.getDongSP().getId(), sp.getNamBH(), sp.getMoTa(), sp.getSlTon(), sp.getGiaNhap(), sp.getGiaBan());
    }

    @Override
    public  int deleteBySP(String idSP) {
        String sql = "DELETE FROM ChiTietSP WHERE IdSP = ?";
        return JDBC_Helper.Update(sql, idSP);
    }

    @Override
    public  int deleteByColor(String id) {
        String sql = "DELETE FROM ChiTietSP WHERE IdMauSac = ?";
        return JDBC_Helper.Update(sql, id);
    }

    @Override
    public  int deleteByNSX(String id) {
        String sql = "DELETE FROM ChiTietSP WHERE IdNsx = ?";
        return JDBC_Helper.Update(sql, id);
    }

    @Override
    public  int deleteByDongSP(String id) {
        String sql = "DELETE FROM ChiTietSP WHERE IdDongSP = ?";
        return JDBC_Helper.Update(sql, id);
    }

    @Override
    public  int delete(String id) {
        String sql = "DELETE FROM ChiTietSP WHERE Id = ?";
        return JDBC_Helper.Update(sql, id);
    }

    @Override
    public  int update(ChiTietSP_Model sp) {
        String sql = "UPDATE ChiTietSP SET IdNsx = ?, IdMauSac = ?, IdDongSP = ?, NamBH = ?, Mota = ?, SoLuongTon = ?, GiaNhap = ?, GiaBan = ? WHERE Id = ? ";
        return JDBC_Helper.Update(sql, sp.getNsx().getId(), sp.getMauSac().getId(), sp.getDongSP().getId(), sp.getNamBH(), sp.getMoTa(), sp.getSlTon(), sp.getGiaNhap(), sp.getGiaBan(), sp.getId());
    }

    @Override
    public  int update(ChiTietSP_Model sp, int SL) {
        int SLSP = sp.getSlTon() - SL;
        String sql = "UPDATE ChiTietSP SET SoLuongTon = ? WHERE Id = ?  ";
        return JDBC_Helper.Update(sql, SLSP, sp.getId());
    }

    @Override
    public  List<ChiTietSP_Model> search(String keyWord) {
        List<ChiTietSP_Model> list = new ArrayList<>();
        String sql = "SELECT ChiTietSP.id, SanPham.Ma, SanPham.Ten, Nsx.Ma, Nsx.Ten, MauSac.Ma, MauSac.Ten, DongSP.Ma, DongSP.Ten, NamBH,MoTa, SoLuongTon,GiaNhap,GiaBan FROM ChiTietSP \n"
                + "                Join SanPham on ChiTietSP.idSP = SanPham.id\n"
                + "                join Nsx on ChiTietSP.IdNsx = Nsx.Id\n"
                + "                join MauSac on ChiTietSP.IdMauSac = MauSac.Id\n"
                + "                Join DongSP on ChiTietSP.IdDongSP = DongSP.Id\n"
                + "                WHERE SanPham.Ten like CONCAT('%',?,'%') \n"
                + "OR SanPham.Ma like CONCAT('%',?,'%') \n"
                + "order by SanPham.Ma";
        ResultSet rs = JDBC_Helper.Query(sql, keyWord,keyWord);
        try {
            while (rs.next()) {
                SanPham_Model sp = new SanPham_Model(rs.getString(2), rs.getString(3));
                NSX_Model NSX = new NSX_Model(rs.getString(4), rs.getString(5));
                MauSac_Model ms = new MauSac_Model(rs.getString(6), rs.getString(7));
                DongSP_Model d = new DongSP_Model(rs.getString(8), rs.getString(9));
                int nambh = Integer.parseInt(rs.getString(10));
                String mota = rs.getString(11);
                int SL = Integer.parseInt(rs.getString(12));
                int gianhap = Integer.parseInt(rs.getString(13));
                int giaBan = Integer.parseInt(rs.getString(14));
                list.add(new ChiTietSP_Model(rs.getString(1),sp, NSX, ms, d, nambh, mota, SL, gianhap, giaBan));
            }
            return list;

        } catch (SQLException ex) {
            Logger.getLogger(SPChiTiet_Repos.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
            return null;
        }

    }

    @Override
    public ChiTietSP_Model getCTSP(String MaSP,String maMau) {
        ChiTietSP_Model SP = null;
        String sql = "SELECT ChiTietSP.id ,SanPham.Ma, SanPham.Ten, Nsx.Ma, Nsx.Ten, MauSac.Ma, MauSac.Ten, DongSP.Ma, DongSP.Ten, NamBH,MoTa, SoLuongTon,GiaNhap,GiaBan FROM ChiTietSP \n"
                + "                Join SanPham on ChiTietSP.idSP = SanPham.id\n"
                + "                join Nsx on ChiTietSP.IdNsx = Nsx.Id\n"
                + "                join MauSac on ChiTietSP.IdMauSac = MauSac.Id\n"
                + "                Join DongSP on ChiTietSP.IdDongSP = DongSP.Id\n"
                + " WHERE SanPham.Ma = ? AND MauSac.Ma = ? "
                + "                order by SanPham.Ma";
        ResultSet rs = JDBC_Helper.Query(sql,MaSP,maMau);
        try {
            while (rs.next()) {
                String id = rs.getString(1);
                SanPham_Model sp = new SanPham_Model(rs.getString(2), rs.getString(3));
                NSX_Model NSX = new NSX_Model(rs.getString(4), rs.getString(5));
                MauSac_Model ms = new MauSac_Model(rs.getString(6), rs.getString(7));
                DongSP_Model d = new DongSP_Model(rs.getString(8), rs.getString(9));
                int nambh = Integer.parseInt(rs.getString(10));
                String mota = rs.getString(11);
                int SL = Integer.parseInt(rs.getString(12));
                int gianhap = Integer.parseInt(rs.getString(13));
                int giaBan = Integer.parseInt(rs.getString(14));
                SP = new ChiTietSP_Model(id, sp, NSX, ms, d, nambh, mota, SL, gianhap, giaBan);
            }
            return SP;

        } catch (SQLException ex) {
            Logger.getLogger(SPChiTiet_Repos.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
            return null;
        }
    }
    @Override
    public ChiTietSP_Model getCTSPByid(String idctSP) {
        ChiTietSP_Model SP = null;
        String sql = "SELECT ChiTietSP.id ,SanPham.Ma, SanPham.Ten, Nsx.Ma, Nsx.Ten, MauSac.Ma, MauSac.Ten, DongSP.Ma, DongSP.Ten, NamBH,MoTa, SoLuongTon,GiaNhap,GiaBan FROM ChiTietSP \n"
                + "                Join SanPham on ChiTietSP.idSP = SanPham.id\n"
                + "                join Nsx on ChiTietSP.IdNsx = Nsx.Id\n"
                + "                join MauSac on ChiTietSP.IdMauSac = MauSac.Id\n"
                + "                Join DongSP on ChiTietSP.IdDongSP = DongSP.Id\n"
                + " WHERE ChiTietSP.id = ?";
        ResultSet rs = JDBC_Helper.Query(sql,idctSP);
        try {
            while (rs.next()) {
                String id = rs.getString(1);
                SanPham_Model sp = new SanPham_Model(rs.getString(2), rs.getString(3));
                NSX_Model NSX = new NSX_Model(rs.getString(4), rs.getString(5));
                MauSac_Model ms = new MauSac_Model(rs.getString(6), rs.getString(7));
                DongSP_Model d = new DongSP_Model(rs.getString(8), rs.getString(9));
                int nambh = Integer.parseInt(rs.getString(10));
                String mota = rs.getString(11);
                int SL = Integer.parseInt(rs.getString(12));
                int gianhap = Integer.parseInt(rs.getString(13));
                int giaBan = Integer.parseInt(rs.getString(14));
                SP = new ChiTietSP_Model(id, sp, NSX, ms, d, nambh, mota, SL, gianhap, giaBan);
            }
            return SP;

        } catch (SQLException ex) {
            Logger.getLogger(SPChiTiet_Repos.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
            return null;
        }
    }

    
}
