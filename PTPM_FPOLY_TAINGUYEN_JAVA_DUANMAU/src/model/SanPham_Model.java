package model;

/**
 *
 * @author baphuoc
 */
public class SanPham_Model {

    String id;
    private String ma;
    private String ten;

    public SanPham_Model() {
    }

    public SanPham_Model(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }

    public SanPham_Model(String id, String ma, String ten) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    @Override
    public String toString() {
        return "SanPham_Model{" + "id=" + id + ", ma=" + ma + ", ten=" + ten + '}';
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

}
