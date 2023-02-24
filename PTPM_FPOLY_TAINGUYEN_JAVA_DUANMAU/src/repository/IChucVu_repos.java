/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;

import java.util.List;
import model.ChucVu_model;

/**
 *
 * @author baphuoc
 */
public interface IChucVu_repos {
    List<ChucVu_model> getAllChucVu();
    ChucVu_model getChucVuByMa(String ma);
    int add(ChucVu_model cv);
    int delete(ChucVu_model cv);
    int update(ChucVu_model cv);
}
