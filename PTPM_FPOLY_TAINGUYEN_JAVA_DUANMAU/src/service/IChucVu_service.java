/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import repository.*;
import java.util.List;
import model.ChucVu_model;
import view_model.ChucVu_View;

/**
 *
 * @author baphuoc
 */
public interface IChucVu_service {
    List<ChucVu_View> getAllChucVu();
    ChucVu_model getChucVuByMa(String ma);
    int add(ChucVu_model cv);
    int delete(ChucVu_model cv);
    int update(ChucVu_model cv);
}
