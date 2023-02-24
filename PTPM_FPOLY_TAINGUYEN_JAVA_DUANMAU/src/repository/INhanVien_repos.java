/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;

import java.util.List;
import model.NhanVien_Model;

/**
 *
 * @author baphuoc
 */
public interface INhanVien_repos {
    List<NhanVien_Model> getALllNV();
    NhanVien_Model getNVByMa(String ma);
    List<NhanVien_Model> findNV(String ketWord);
    int add(NhanVien_Model nv);
    int delete(NhanVien_Model nv);
    int update(NhanVien_Model nv);
}
