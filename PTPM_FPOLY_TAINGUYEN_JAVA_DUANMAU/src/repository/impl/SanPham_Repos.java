/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.impl;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.SanPham_Model;
import repository.ISanPhamRepos;
import ulti.JDBC_Helper;

/**
 *
 * @author baphuoc
 */
public class SanPham_Repos implements ISanPhamRepos{

    @Override
    public  List<SanPham_Model> getALLSP() {
        List<SanPham_Model> list = new ArrayList<>();
        String sql = "SELECT * FROM SanPham ORDER BY Ma";
        ResultSet rs = JDBC_Helper.Query(sql);
        try {
            while (rs.next()) {
                list.add(new SanPham_Model(rs.getString(1), rs.getString(2), rs.getString(3)));
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    @Override
    public  SanPham_Model getSPByMa(String ma) {
        SanPham_Model sp = null;
        String sql = "SELECT * FROM SanPham WHERE Ma = ? ";
        ResultSet rs = JDBC_Helper.Query(sql, ma);
        try {
            while (rs.next()) {
                sp = new SanPham_Model(rs.getString(1), rs.getString(2), rs.getString(3));
            }
            return sp;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    @Override
    public  int Add(SanPham_Model sp){
        String sql = "INSERT INTO SanPham(Ma,Ten) VALUES (? , ?)";
        return JDBC_Helper.Update(sql,sp.getMa(),sp.getTen());
    }
    @Override
    public  int delete(String idSP){
        String sql = "DELETE FROM SanPham WHERE Id = ?";
        return JDBC_Helper.Update(sql,idSP);
    }
    @Override
    public  int Update(SanPham_Model sp){
        String sql = "UPDATE SanPham SET Ten = ? WHERE Ma = ?";
        return JDBC_Helper.Update(sql,sp.getTen(),sp.getMa());
    }
    @Override
    public  List<SanPham_Model> SearchSP(String KeyWord) {
        List<SanPham_Model> list = new ArrayList<>();
        String sql = "SELECT * FROM SanPham "
                + "WHERE Ten like CONCAT('%',?,'%') "
                + " ORDER BY Ma";
        ResultSet rs = JDBC_Helper.Query(sql,KeyWord);
        try {
            while (rs.next()) {
                list.add(new SanPham_Model(rs.getString(1), rs.getString(2), rs.getString(3)));
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
   
}
