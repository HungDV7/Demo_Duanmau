/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import repository.*;
import java.util.List;
import model.NhanVien_Model;
import view_model.NhanVien_View;

/**
 *
 * @author baphuoc
 */
public interface INhanVien_sevice {
    List<NhanVien_View> getALllNV();
    NhanVien_Model getNVByMa(String ma);
    List<NhanVien_View> findNV(String ketWord);
    int add(NhanVien_Model nv);
    int delete(NhanVien_Model nv);
    int update(NhanVien_Model nv);
}
