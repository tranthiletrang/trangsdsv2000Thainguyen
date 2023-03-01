package KiemTraKetThucMon.Cau2;

public class KyThuat extends NhanVien{

    private String chuyenNganh;

    public KyThuat(){}
    public KyThuat(String maNhanVien){
        super(maNhanVien);
    }
    public KyThuat(String maNhanVien, String hoTen, String namSinh, String diaChi, String chuyenNganh) {
        super(maNhanVien, hoTen, namSinh, diaChi);
        this.chuyenNganh = chuyenNganh;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    @Override
    public String moTaCongViec() {
        return chuyenNganh;
    }

    @Override
    public String toString() {
        return "KyThuat{" + super.toString()+
                "chuyenNganh='" + chuyenNganh + '\'' +
                '}';
    }
}
