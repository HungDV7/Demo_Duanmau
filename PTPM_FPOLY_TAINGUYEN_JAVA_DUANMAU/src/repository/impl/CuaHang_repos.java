/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.impl;

import java.util.ArrayList;
import java.util.List;
import model.CuaHang_Model;
import repository.ICuaHang_repos;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import ulti.JDBC_Helper;

/**
 *
 * @author baphuoc
 */
public class CuaHang_repos implements ICuaHang_repos{

    @Override
    public List<CuaHang_Model> getAllCH() {
        List<CuaHang_Model> list = new ArrayList<>();
        String sql = "SELECT * FROM CuaHang";
        ResultSet rs = JDBC_Helper.Query(sql);
        try {
            while(rs.next()){
                list.add(new CuaHang_Model(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4), rs.getString(5), rs.getString(6)));
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(CuaHang_repos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public CuaHang_Model getCHByMa(String ma) {
        CuaHang_Model ch = null;
        String sql = "SELECT * FROM CuaHang WHERE Ma = ?";
        ResultSet rs = JDBC_Helper.Query(sql,ma);
        try {
            while(rs.next()){
                ch =new CuaHang_Model(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4), rs.getString(5), rs.getString(6));
            }
            return ch;
        } catch (SQLException ex) {
            Logger.getLogger(CuaHang_repos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public int add(CuaHang_Model ch) {
        String sql = "INSERT INTO CuaHang(Ma,Ten,DiaChi,ThanhPho,QuocGia) VALUES (?,?,?,?,?)";
        return JDBC_Helper.Update(sql, ch.getMa(),ch.getTen(),ch.getDiaChi(),ch.getThanhPho(),ch.getQuocGia());
    }

    @Override
    public int update(CuaHang_Model ch) {
        String sql = "UPDATE CuaHang SET Ten = ?,DiaChi = ?,ThanhPho = ?,QuocGia = ? WHERE Ma = ?";
        return JDBC_Helper.Update(sql,ch.getTen(),ch.getDiaChi(),ch.getThanhPho(),ch.getQuocGia(), ch.getMa());
    }

    @Override
    public int delete(CuaHang_Model ch) {
        String sql = "DELETE FROM CuaHang WHERE Ma =?";
        return JDBC_Helper.Update(sql,ch.getMa());
    }
    
}
