/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository.impl;

import java.util.ArrayList;
import java.util.List;
import model.NhanVien_Model;
import repository.INhanVien_repos;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ChucVu_model;
import model.CuaHang_Model;
import ulti.JDBC_Helper;

/**
 *
 * @author baphuoc
 */
public class NhanVien_repos implements INhanVien_repos {

    @Override
    public List<NhanVien_Model> getALllNV() {
        List<NhanVien_Model> list = new ArrayList<>();
        String sql = "SELECT NhanVien.id,NhanVien.Ma,concat(NhanVien.Ho,' ',NhanVien.TenDem,' ',NhanVien.Ten),NhanVien.GioiTinh,NhanVien.NgaySinh,NhanVien.DiaChi,NhanVien.Sdt,NhanVien.MatKhau,\n"
                + "CuaHang.Ma,CuaHang.ten,CuaHang.DiaChi,CuaHang.ThanhPho,CuaHang.QuocGia,\n"
                + "ChucVu.Ma,ChucVu.Ten,\n"
                + "NhanVien.TrangThai\n"
                + "FROM NhanVien\n"
                + "Join CuaHang on CuaHang.id = NhanVien.IdCH\n"
                + "Join ChucVu on ChucVu.id = NhanVien.IdCV"
                + " ORDER BY NhanVien.Ma ";
        ResultSet rs = JDBC_Helper.Query(sql);
        try {
            while (rs.next()) {
                CuaHang_Model ch = new CuaHang_Model(rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13));
                ChucVu_model cv = new ChucVu_model(rs.getString(14), rs.getString(15));
                NhanVien_Model nv = new NhanVien_Model(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5), rs.getString(6), rs.getString(7), rs.getString(8), ch, cv, rs.getInt(16));
                list.add(nv);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(NhanVien_repos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public NhanVien_Model getNVByMa(String ma) {
        NhanVien_Model nv = null;
        String sql = "SELECT NhanVien.id,NhanVien.Ma,concat(NhanVien.Ho,' ',NhanVien.TenDem,' ',NhanVien.Ten),NhanVien.GioiTinh,NhanVien.NgaySinh,NhanVien.DiaChi,NhanVien.Sdt,NhanVien.MatKhau,\n"
                + "CuaHang.Ma,CuaHang.ten,CuaHang.DiaChi,CuaHang.ThanhPho,CuaHang.QuocGia,\n"
                + "ChucVu.Ma,ChucVu.Ten,\n"
                + "NhanVien.TrangThai\n"
                + "FROM NhanVien\n"
                + "Join CuaHang on CuaHang.id = NhanVien.IdCH\n"
                + "Join ChucVu on ChucVu.id = NhanVien.IdCV"
                + " WHERE NhanVien.Ma = ?";
        ResultSet rs = JDBC_Helper.Query(sql, ma);
        try {
            while (rs.next()) {
                CuaHang_Model ch = new CuaHang_Model(rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13));
                ChucVu_model cv = new ChucVu_model(rs.getString(14), rs.getString(15));
                nv = new NhanVien_Model(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5), rs.getString(6), rs.getString(7), rs.getString(8), ch, cv, rs.getInt(16));
            }
            return nv;
        } catch (SQLException ex) {
            Logger.getLogger(NhanVien_repos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public List<NhanVien_Model> findNV(String ketWord) {
        List<NhanVien_Model> list = new ArrayList<>();
        String sql = "SELECT NhanVien.id,NhanVien.Ma,concat(NhanVien.Ho,' ',NhanVien.TenDem,' ',NhanVien.Ten),NhanVien.GioiTinh,NhanVien.NgaySinh,NhanVien.DiaChi,NhanVien.Sdt,NhanVien.MatKhau,\n"
                + "CuaHang.Ma,CuaHang.ten,CuaHang.DiaChi,CuaHang.ThanhPho,CuaHang.QuocGia,\n"
                + "ChucVu.Ma,ChucVu.Ten,\n"
                + "NhanVien.TrangThai\n"
                + "FROM NhanVien\n"
                + "Join CuaHang on CuaHang.id = NhanVien.IdCH\n"
                + "Join ChucVu on ChucVu.id = NhanVien.IdCV"
                + " WHERE concat(NhanVien.Ho,' ',NhanVien.TenDem,' ',NhanVien.Ten) like concat('%',?,'%') or NhanVien.Ma like concat('%',?,'%')"
                + " ORDER BY NhanVien.Ma ";
        ResultSet rs = JDBC_Helper.Query(sql, ketWord, ketWord);
        try {
            while (rs.next()) {
                CuaHang_Model ch = new CuaHang_Model(rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13));
                ChucVu_model cv = new ChucVu_model(rs.getString(14), rs.getString(15));
                NhanVien_Model nv = new NhanVien_Model(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5), rs.getString(6), rs.getString(7), rs.getString(8), ch, cv, rs.getInt(16));
                list.add(nv);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(NhanVien_repos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public int add(NhanVien_Model nv) {
        String ten[] = nv.getTen().split(" ");
        String sql = "INSERT INTO NhanVien(Ma,Ten,TenDem,Ho,GioiTinh,NgaySinh,DiaChi,Sdt,MatKhau,idCH,idCV,TrangThai) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
        String ho = ten[0];
        String tenDem = ten[1];
        String name = "";
        for (int i = 2; i < ten.length; i++) {
            name += ten[i];
        }
        return JDBC_Helper.Update(sql, nv.getMa(), name, tenDem, ho, nv.getGioiTinh(), nv.getNgaySinh(), nv.getDiaChi(), nv.getSdt(), nv.getMatKhau(), nv.getCuaHang().getId(), nv.getChucVu().getId(), nv.getTrangThai());
    }

    @Override
    public int delete(NhanVien_Model nv) {
        String sql = "DELETE FROM NhanVien WHERE Ma = ?";
        return JDBC_Helper.Update(sql, nv.getMa());
    }

    @Override
    public int update(NhanVien_Model nv) {
        String ten[] = nv.getTen().split(" ");
        String ho = ten[0];
        String tenDem = ten[1];
        String name = "";
        for (int i = 2; i < ten.length; i++) {
            name += ten[i];
        }
        String sql = "UPDATE NhanVien SET Ten =  ?,TenDem = ?,Ho = ?,GioiTinh = ?,NgaySinh = ?,DiaChi = ?,Sdt = ?,MatKhau = ?,idCH = ?,idCV = ?,TrangThai = ? WHERE Ma = ?";
        return JDBC_Helper.Update(sql, name, tenDem, ho, nv.getGioiTinh(), nv.getNgaySinh(), nv.getDiaChi(), nv.getSdt(), nv.getMatKhau(), nv.getCuaHang().getId(), nv.getChucVu().getId(), nv.getTrangThai(), nv.getMa());
    }

    public static void main(String[] args) {
        String a[] = {"a", "a"};
        System.out.println(a[0].concat(a[1]));

    }

}
