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
import model.MauSac_Model;
import repository.IMauSacRepos;
import ulti.JDBC_Helper;

/**
 *
 * @author baphuoc
 */
public class MauSac_repos implements IMauSacRepos{
    @Override
    public  List<MauSac_Model> getAllNSX() {
        List<MauSac_Model> list = new ArrayList<>();
        String sql = "SELECT * FROM MauSac";
        ResultSet rs = JDBC_Helper.Query(sql);
        try {
            while(rs.next()){
                String id = rs.getString(1);
                String ma = rs.getString(2);
                String ten = rs.getString(3);
                list.add(new MauSac_Model(id, ma, ten));
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(NSX_Repos.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
            return null;
        }
    }
    @Override
    public  MauSac_Model getByMa(String ma){
        MauSac_Model m = null;
        String sql = "SELECT * FROM MauSac WHERE Ma = ? ";
        ResultSet rs = JDBC_Helper.Query(sql,ma);
        try {
            while(rs.next()){
                String id = rs.getString(1);
                String ma1 = rs.getString(2);
                String ten = rs.getString(3);
                m = new MauSac_Model(id, ma1, ten);
            }
            return m;
        } catch (SQLException ex) {
            Logger.getLogger(NSX_Repos.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
            return null;
        }
    }
    @Override
    public  int add(MauSac_Model m){
        String sql = "INSERT INTO MauSac(Ma,Ten) VALUES (?,?)";
        return JDBC_Helper.Update(sql,m.getMa(),m.getTen());
    }
    @Override
    public  int update(MauSac_Model m){
        String sql = "Update MauSac Set Ma = ?, Ten = ? WHERE Ma = ?";
        return JDBC_Helper.Update(sql,m.getMa(),m.getTen(),m.getMa());
    }
    @Override
    public  int delete(MauSac_Model m){
        String sql = "DELETE FROM MauSac WHERE Ma = ?";
        return JDBC_Helper.Update(sql,m.getMa());
    }
}
