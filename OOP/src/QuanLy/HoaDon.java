package QuanLy;

import java.util.ArrayList;

public class HoaDon implements Comparable<HoaDon>{
    private String mahoadon;
    private String makhachhang;
    private String mamathang;
    private int soluong;
    private ArrayList<MatHang> dshang;
    private ArrayList<KhachHang> dskhach;
    private long tongtienban,tongtienmua,loinhuan;
    private int sttkhachang, stthang;
    public HoaDon(int stt, String makhachhang, String mamathang, String soluong, ArrayList<MatHang> dshang, ArrayList<KhachHang> dskhach){
        this.mahoadon = "HD" + String.format("%03d", stt);
        this.makhachhang = makhachhang;
        this.mamathang = mamathang;
        this.soluong = Integer.parseInt(soluong);
        this.dshang = dshang;
        this.dskhach = dskhach;
        xuly();
    }

    public void xuly(){
        sttkhachang = Integer.parseInt(makhachhang.substring(2));
        stthang = Integer.parseInt(mamathang.substring(2));
        tongtienban = dshang.get(stthang-1).getGiaban() *  soluong; 
        tongtienmua = dshang.get(stthang-1).getGiamua() *  soluong;   
        loinhuan = tongtienban - tongtienmua;
    }
    @Override
    public String toString(){
        return mahoadon + " " + dskhach.get(sttkhachang-1) + " " + dshang.get(stthang-1) + " " + soluong + " " + tongtienban + " " + loinhuan;
    }

    @Override
    public int compareTo(HoaDon o) {
        if(this.loinhuan < o.loinhuan)
            return 1;
        else if(this.loinhuan == o.loinhuan)
            return 0;
        else
            return -1;
    }
}
