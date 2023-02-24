/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.impl;

import java.util.ArrayList;
import java.util.List;
import model.ChucVu_model;
import repository.IChucVu_repos;
import java.sql.*;
import ulti.JDBC_Helper;

/**
 *
 * @author baphuoc
 */
public class ChucVu_repos implements IChucVu_repos{

    @Override
    public List<ChucVu_model> getAllChucVu() {
        List<ChucVu_model> list = new ArrayList<>();
        String sql = "SELECT * FROM ChucVu";
        ResultSet rs = JDBC_Helper.Query(sql);
        try {
            while(rs.next()){
                list.add(new ChucVu_model(rs.getString(1),rs.getString(2),rs.getString(3)));
            }
            return list;
        } catch (SQLException ex) {
            return null;
        }
    }

    @Override
    public ChucVu_model getChucVuByMa(String ma) {
        ChucVu_model cv = null;
        String sql = "SELECT * FROM ChucVu WHERE Ma = ?";
        ResultSet rs = JDBC_Helper.Query(sql,ma);
        try {
            while(rs.next()){
                
                cv = new ChucVu_model(rs.getString(1),rs.getString(2),rs.getString(3));
            }
            return cv;
        } catch (SQLException ex) {
            return null;
        }
    }

    @Override
    public int add(ChucVu_model cv) {
        String sql = "INSERT INTO ChucVu(Ma,Ten) VALUES (?,?)";
        return JDBC_Helper.Update(sql,cv.getMa(),cv.getTen());
    }

    @Override
    public int delete(ChucVu_model cv) {
        String sql = "DELETE FROM ChucVu WHERE Ma = ?";
        return JDBC_Helper.Update(sql,cv.getMa());
    }

    @Override
    public int update(ChucVu_model cv) {
        String sql = "UPDATE ChucVu SET Ten = ? WHERE Ma = ?";
        return JDBC_Helper.Update(sql,cv.getTen(),cv.getMa());
    }
    public static void main(String[] args) {
        ChucVu_repos cv = new ChucVu_repos();
        for (ChucVu_model c : cv.getAllChucVu()) {
            System.out.println(c.toString());
        }
    }
}
