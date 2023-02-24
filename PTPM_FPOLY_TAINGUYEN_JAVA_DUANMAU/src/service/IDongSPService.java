/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.DongSP_Model;
import view_model.DongSP_View;

/**
 *
 * @author baphuoc
 */
public interface IDongSPService {
    List<DongSP_View> getAllNSX();
    DongSP_Model getByMa(String ten);
    int add(DongSP_Model d);
    int update(DongSP_Model d);
    int delete(DongSP_Model d);
}
