/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.impl;

import java.util.ArrayList;
import java.util.List;
import model.KhachHang_model;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import repository.IKhachHang_repos;
import ulti.JDBC_Helper;

/**
 *
 * @author baphuoc
 */
public class KhachHang_repos implements IKhachHang_repos {

    @Override
    public List<KhachHang_model> getAllKH() {
        List<KhachHang_model> list = new ArrayList<>();
        String sql = "SELECT Id,Ma,concat(Ho,' ',TenDem,' ',Ten) ,NgaySinh,Sdt,DiaChi,ThanhPho,QuocGia,MatKhau FROM KhachHang;";
        ResultSet rs = JDBC_Helper.Query(sql);
        try {
            while (rs.next()) {
                KhachHang_model kh = new KhachHang_model(rs.getString(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9));
                list.add(kh);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(KhachHang_repos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public KhachHang_model getKHByMa(String ma) {
        KhachHang_model kh = null;
        String sql = "SELECT Id,Ma,concat(Ho,' ',TenDem,' ',Ten) ,NgaySinh,Sdt,DiaChi,ThanhPho,QuocGia,MatKhau FROM KhachHang"
                + " WHERE Ma = ?";
        ResultSet rs = JDBC_Helper.Query(sql, ma);
        try {
            while (rs.next()) {
                kh = new KhachHang_model(rs.getString(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9));
            }
            return kh;
        } catch (SQLException ex) {
            Logger.getLogger(KhachHang_repos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public List<KhachHang_model> findKH(String keyWord) {
        List<KhachHang_model> list = new ArrayList<>();
        String sql = "SELECT Id,Ma,concat(Ho,' ',TenDem,' ',Ten) ,NgaySinh,Sdt,DiaChi,ThanhPho,QuocGia,MatKhau FROM KhachHang"
                + " WHERE concat(Ho,' ',TenDem,' ',Ten) LIKE concat('%',?,'%')";
        ResultSet rs = JDBC_Helper.Query(sql,keyWord);
        try {
            while (rs.next()) {
                KhachHang_model kh = new KhachHang_model(rs.getString(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9));
                list.add(kh);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(KhachHang_repos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    @Override
    public int add(KhachHang_model k) {
        String ten[] = k.getHoTen().split(" ");
        String ho = ten[0];
        String tenDem = ten[1];
        String name = "";
        for (int i = 2; i < ten.length; i++) {
            name += ten[i];
        }
        String sql = "INSERT INTO KhachHang(Ma,Ho,TenDem,Ten,NgaySinh,Sdt,DiaChi,ThanhPho,QuocGia,MatKhau) VALUES (?,?,?,?,?,?,?,?,?,?)";
        return JDBC_Helper.Update(sql,k.getMa(),ho,tenDem,name,k.getNgaySinh(),k.getSdt(),k.getDiaChi(),k.getThanhPho(),k.getQuocGia(),k.getPassword());
    }

    @Override
    public int update(KhachHang_model k) {
        String ten[] = k.getHoTen().split(" ");
        String ho = ten[0];
        String tenDem = ten[1];
        String name = "";
        for (int i = 2; i < ten.length; i++) {
            name += ten[i];
        }
        String sql = "UPDATE KhachHang SET Ho= ?,TenDem = ?,Ten = ?,NgaySinh = ?,Sdt = ?,DiaChi = ?,ThanhPho = ?,QuocGia = ?,MatKhau = ? WHERE Ma = ?";
        return JDBC_Helper.Update(sql,ho,tenDem,name,k.getNgaySinh(),k.getSdt(),k.getDiaChi(),k.getThanhPho(),k.getQuocGia(),k.getPassword(),k.getMa());
    }

    @Override
    public int delete(KhachHang_model k) {
        String sql = "DELETE FROM KhachHang WHERE Ma = ?";
        return JDBC_Helper.Update(sql,k.getMa());
    }

    public static void main(String[] args) {
        KhachHang_repos kh = new KhachHang_repos();
        for (KhachHang_model khachHang_model : kh.findKH("Đỗ")) {
            System.out.println(khachHang_model.toString());
        }
        System.out.println(kh.getKHByMa("KH1").toString());
    }

}
