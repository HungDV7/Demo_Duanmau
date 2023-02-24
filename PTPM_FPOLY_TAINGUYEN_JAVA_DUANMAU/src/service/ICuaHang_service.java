/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import repository.*;
import java.util.List;
import model.CuaHang_Model;
import view_model.CuaHang_View;

/**
 *
 * @author baphuoc
 */
public interface ICuaHang_service {
    List<CuaHang_View> getAllCH();
    CuaHang_Model getCHByMa(String ma);
    int add(CuaHang_Model ch);
    int update(CuaHang_Model ch);
    int delete(CuaHang_Model ch);
}
