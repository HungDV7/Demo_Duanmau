/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.NSX_Model;
import view_model.NSX_View;

/**
 *
 * @author baphuoc
 */
public interface INSXService {
    List<NSX_View> getAllNSX();
    NSX_Model getByMa(String ten);
    int add(NSX_Model n);
    int update(NSX_Model n);
    int delete(NSX_Model n);
}
