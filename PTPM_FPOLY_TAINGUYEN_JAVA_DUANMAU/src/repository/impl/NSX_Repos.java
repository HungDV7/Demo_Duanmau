/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.impl;

import java.util.ArrayList;
import java.util.List;
import model.NSX_Model;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.ldap.Rdn;
import repository.INSXRepos;
import ulti.JDBC_Helper;
import view.SanPham;

/**
 *
 * @author baphuoc
 */
public class NSX_Repos implements INSXRepos{

    @Override
    public  List<NSX_Model> getAllNSX() {
        List<NSX_Model> list = new ArrayList<>();
        String sql = "SELECT * FROM NSX ORDER BY Ma ";
        ResultSet rs = JDBC_Helper.Query(sql);
        try {
            while(rs.next()){
                String id = rs.getString(1);
                String ma = rs.getString(2);
                String ten = rs.getString(3);
                list.add(new NSX_Model(id, ma, ten));
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(NSX_Repos.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
            return null;
        }
    }
    @Override
    public  NSX_Model getByMa(String ten){
        NSX_Model d = null;
        String sql = "SELECT * FROM Nsx WHERE Ma = ?";
        ResultSet rs = JDBC_Helper.Query(sql,ten);
        try {
            while(rs.next()){
                String id = rs.getString(1);
                String ma = rs.getString(2);
                String ten1 = rs.getString(3);
                d = new NSX_Model(id, ma, ten1);
            }
            return d;
        } catch (SQLException ex) {
            Logger.getLogger(NSX_Repos.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
            return null;
        }
    }
    @Override
    public  int add(NSX_Model n){
        String sql = "INSERT INTO Nsx(Ma,Ten) VALUES (?,?)";
        return JDBC_Helper.Update(sql,n.getMa(),n.getTen());
    }
    @Override
    public  int update(NSX_Model n){
        String sql = "Update Nsx Set Ma = ?, Ten = ? WHERE Ma = ?";
        return JDBC_Helper.Update(sql,n.getMa(),n.getTen(),n.getMa());
    }
    @Override
    public  int delete(NSX_Model n){
        String sql = "DELETE FROM Nsx WHERE Ma = ?";
        return JDBC_Helper.Update(sql,n.getMa());
    }
}
