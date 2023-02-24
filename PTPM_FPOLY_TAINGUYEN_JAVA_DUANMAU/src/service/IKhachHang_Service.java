/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import repository.*;
import java.util.List;
import model.KhachHang_model;
import view_model.KhachHang_view;

/**
 *
 * @author baphuoc
 */
public interface IKhachHang_Service {
    List<KhachHang_view> getAllKH();
    KhachHang_model getKHByMa(String ma);
    List<KhachHang_view> findKH(String keyWord);
    int add(KhachHang_model k);
    int update(KhachHang_model k);
    int delete(KhachHang_model k);
}
