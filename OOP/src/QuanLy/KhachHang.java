package QuanLy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class KhachHang {
    private String makhach, tenkhach, gioitinh;
    private Date ngaysinh;
    private String diachi;

    public KhachHang(int stt, String tenkhach, String gioitinh, String ngaysinh, String diachi) throws ParseException{
        this.makhach = "KH" + String.format("%03d",stt);
        this.tenkhach = tenkhach;
        this.gioitinh = gioitinh;
        this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaysinh);
        this.diachi = diachi;
    }
    
    @Override 
    public String toString(){
        return tenkhach + " " + diachi;
    }
}
