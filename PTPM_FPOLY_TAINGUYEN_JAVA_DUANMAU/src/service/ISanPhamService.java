/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.SanPham_Model;
import view_model.SanPham_View;

/**
 *
 * @author baphuoc
 */
public interface ISanPhamService {
    List<SanPham_View> getALLSP();
    SanPham_Model getSPByMa(String ma);
    int Add(SanPham_Model sp);
    int delete(String idSP);
    int Update(SanPham_Model sp);
    List<SanPham_View> SearchSP(String KeyWord);
    
}
