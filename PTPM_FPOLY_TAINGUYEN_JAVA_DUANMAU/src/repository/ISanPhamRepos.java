/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;

import service.*;
import java.util.List;
import model.SanPham_Model;

/**
 *
 * @author baphuoc
 */
public interface ISanPhamRepos {
    List<SanPham_Model> getALLSP();
    SanPham_Model getSPByMa(String ma);
    int Add(SanPham_Model sp);
    int delete(String idSP);
    int Update(SanPham_Model sp);
    List<SanPham_Model> SearchSP(String KeyWord);
    
}
