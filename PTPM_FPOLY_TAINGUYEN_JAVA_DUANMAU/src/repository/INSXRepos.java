/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;

import service.*;
import java.util.List;
import model.NSX_Model;

/**
 *
 * @author baphuoc
 */
public interface INSXRepos {
    List<NSX_Model> getAllNSX();
    NSX_Model getByMa(String ten);
    int add(NSX_Model n);
    int update(NSX_Model n);
    int delete(NSX_Model n);
}
