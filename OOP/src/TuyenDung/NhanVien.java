package TuyenDung;


public class NhanVien implements Comparable<NhanVien> {
    private String hoten;
    private double diemlt, diemth;
    private double tongdiem;
    private String xeploai;
    private String manv;
    public NhanVien(int i,String hoten, String diemlt, String diemth){
        this.manv = "TS" + String.format("%02d", i);
        this.hoten = hoten;
        this.diemlt = chuanhoadiem(diemlt);
        this.diemth = chuanhoadiem(diemth);
        xuli();
    }

    private double chuanhoadiem(String diem){
        String s = "";
        if(diem.length() == 2 && Integer.parseInt(diem) != 10){
            s += diem.charAt(0);
            s += ".";
            s += diem.charAt(1);
        }
        else
            s += diem;
        return Double.parseDouble(s);
    }

    private void xuli(){
        tongdiem = (diemlt + diemth) / 2;
        if(tongdiem < 5.0)
            xeploai = "TRUOT";
        else if(5.0 <= tongdiem && tongdiem < 8.0)
            xeploai = "CAN NHAC";
        else if(8.0 <= tongdiem && tongdiem < 9.5)
            xeploai = "DAT";
        else
            xeploai = "XUAT SAC";

    }
    @Override
    public int compareTo(NhanVien o){
        if(this.tongdiem < o.tongdiem)
            return 1;
        else if (this.tongdiem == o.tongdiem)
            return 0;
        else
            return -1;
    }
    @Override 
    public String toString(){
        return manv + " " + hoten + " " + String.format("%.2f", tongdiem) + " " + xeploai;
    }
}
