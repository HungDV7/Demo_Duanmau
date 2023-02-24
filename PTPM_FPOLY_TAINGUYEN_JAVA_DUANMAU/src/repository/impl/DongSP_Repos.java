/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.DongSP_Model;
import repository.IDongSPRepos;
import ulti.JDBC_Helper;

/**
 *
 * @author baphuoc
 */
public class DongSP_Repos implements IDongSPRepos{
    @Override
    public  List<DongSP_Model> getAllNSX() {
        List<DongSP_Model> list = new ArrayList<>();
        String sql = "SELECT * FROM DongSP ORDER BY Ma ";
        ResultSet rs = JDBC_Helper.Query(sql);
        try {
            while(rs.next()){
                String id = rs.getString(1);
                String ma = rs.getString(2);
                String ten = rs.getString(3);
                list.add(new DongSP_Model(id, ma, ten));
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(NSX_Repos.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
            return null;
        }
    }
    @Override
    public  DongSP_Model getByMa(String mad){
        DongSP_Model d = null;
        String sql = "SELECT * FROM DongSP WHERE Ma = ?";
        ResultSet rs = JDBC_Helper.Query(sql,mad);
        try {
            while(rs.next()){
                String id = rs.getString(1);
                String ma = rs.getString(2);
                String ten = rs.getString(3);
                d = new DongSP_Model(id, ma, ten);
            }
            return d;
        } catch (SQLException ex) {
            Logger.getLogger(NSX_Repos.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
            return null;
        }
    }
    @Override
    public  int add(DongSP_Model d){
        String sql = "INSERT INTO DongSP(Ma,Ten) VALUES (?,?)";
        return JDBC_Helper.Update(sql,d.getMa(),d.getTen());
    }
    @Override
    public  int update(DongSP_Model d){
        String sql = "Update DongSP Set Ma = ?, Ten = ? WHERE Ma = ?";
        return JDBC_Helper.Update(sql,d.getMa(),d.getTen(),d.getMa());
    }
    @Override
    public  int delete(DongSP_Model d){
        String sql = "DELETE FROM DongSP WHERE Ma = ?";
        return JDBC_Helper.Update(sql,d.getMa());
    }
    
}
