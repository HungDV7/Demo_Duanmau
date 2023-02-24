/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;

import java.util.List;
import model.KhachHang_model;

/**
 *
 * @author baphuoc
 */
public interface IKhachHang_repos {
    List<KhachHang_model> getAllKH();
    KhachHang_model getKHByMa(String ma);
    List<KhachHang_model> findKH(String keyWord);
    int add(KhachHang_model k);
    int update(KhachHang_model k);
    int delete(KhachHang_model k);
}
