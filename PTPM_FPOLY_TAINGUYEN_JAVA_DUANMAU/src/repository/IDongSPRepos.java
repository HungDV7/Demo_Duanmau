/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;

import service.*;
import java.util.List;
import model.DongSP_Model;

/**
 *
 * @author baphuoc
 */
public interface IDongSPRepos {
    List<DongSP_Model> getAllNSX();
    DongSP_Model getByMa(String ten);
    int add(DongSP_Model d);
    int update(DongSP_Model d);
    int delete(DongSP_Model d);
}
