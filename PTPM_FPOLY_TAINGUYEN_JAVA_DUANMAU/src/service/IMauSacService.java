/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.MauSac_Model;
import view_model.MauSac_View;

/**
 *
 * @author baphuoc
 */
public interface IMauSacService {
    List<MauSac_View> getAllNSX();
    MauSac_Model getByMa(String ma);
    int add(MauSac_Model m);
    int update(MauSac_Model m);
    int delete(MauSac_Model m);
}
