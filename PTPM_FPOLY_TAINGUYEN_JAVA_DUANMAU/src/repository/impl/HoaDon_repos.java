/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.impl;

import java.util.ArrayList;
import java.util.List;
import model.HoaDon_Model;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import ulti.JDBC_Helper;
import java.sql.*;
import repository.IHoaDonRepos;

/**
 *
 * @author baphuoc
 */
public class HoaDon_repos implements IHoaDonRepos{

    @Override
    public List<HoaDon_Model> getAllHD() {
        List<HoaDon_Model> list = new ArrayList<>();
        String sql = "SELECT id, Ma, NgayTao,TinhTrang FROM HoaDon order by CAST(substring(Ma,3,4) AS Varchar ) desc ";
        ResultSet rs = JDBC_Helper.Query(sql);
        try {
            while (rs.next()) {
                list.add(new HoaDon_Model(rs.getString(1), rs.getString(2), rs.getDate(3), rs.getInt(4)));
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    @Override
    public  List<HoaDon_Model> getHDByTT(Integer TinhTrang) {
        List<HoaDon_Model> list = new ArrayList<>();
        String sql = "SELECT id, Ma, NgayTao,TinhTrang FROM HoaDon WHERE TinhTrang = ?"
                + " order by CAST(substring(Ma,3,4) AS Varchar ) desc ";
        ResultSet rs = JDBC_Helper.Query(sql,TinhTrang);
        try {
            while (rs.next()) {
                list.add(new HoaDon_Model(rs.getString(1), rs.getString(2), rs.getDate(3), rs.getInt(4)));
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    @Override
    public  HoaDon_Model getHDByMa(String ma) {
        HoaDon_Model h  = new HoaDon_Model();
        String sql = "SELECT id, Ma, NgayTao,TinhTrang FROM HoaDon WHERE Ma = ?";
        ResultSet rs = JDBC_Helper.Query(sql,ma);
        try {
            while (rs.next()) {
                h =new HoaDon_Model(rs.getString(1), rs.getString(2), rs.getDate(3), rs.getInt(4));
            }
            return h;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    @Override
    public  int add(HoaDon_Model h){
        String sql = "INSERT INTO HoaDon(Ma, NgayTao,TinhTrang) VALUES (?,?,?)";
        return JDBC_Helper.Update(sql, h.getMa(),h.getNgayTao(),0);
    }
    @Override
    public  int ThanhToan(HoaDon_Model h){
        String sql = "UPDATE HoaDon SET TinhTrang = 1 WHERE Ma = ?";
        return JDBC_Helper.Update(sql, h.getMa());
    }
}
