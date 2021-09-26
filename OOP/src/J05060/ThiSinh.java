package J05060;

public class ThiSinh implements Comparable<ThiSinh> {
    private String mats, hotents, ngaysinh;
    private double diemlt,diemth;
    private int tuoi;
    private double tongdiem;
    private String trangthai;
    public ThiSinh(int stt,String hotents, String ngaysinh, String diemlt, String diemth) {
        this.mats = "PH" + String.format("%02d",stt);
        this.hotents = hotents;
        this.ngaysinh = ngaysinh;
        this.diemlt = xuydiem(diemlt);
        this.diemth = xuydiem(diemth);
        xuly();
    }
    private double xuydiem(String diem){
        String kq = "";
        if(diem.length() == 2 && Double.parseDouble(diem) != 10){
            kq += diem.charAt(0);
            kq += ".";
            kq += diem.charAt(1);
        }
        else
            kq = diem;
        return Double.parseDouble(kq);
    }
    private void xuly(){
        String[] arrns = ngaysinh.split("/");
        tuoi = 2021 - Integer.parseInt(arrns[2]);
        double diemthuong;
        if(diemlt >= 8 && diemth >= 8)
            diemthuong = 1.0;
        else if(diemlt >= 7.5 && diemth >= 7.5)
            diemthuong = 0.5;
        else
            diemthuong = 0;
        tongdiem = Math.round((diemlt + diemth)/2 + diemthuong);
        if(tongdiem > 10)
            tongdiem = 10;
        if(tongdiem < 5)
            trangthai = "Truot";
        else if(5 <= tongdiem && tongdiem <= 6)
            trangthai = "Trung binh";
        else if(tongdiem == 7)
            trangthai = "Kha";
        else if(tongdiem == 8)
            trangthai = "Gioi";
        else if(tongdiem == 9 || tongdiem == 10)
            trangthai = "Xuat sac";
        else
            trangthai = " ";
    }
    @Override
    public String toString(){
        return mats + " " + hotents + " " + tuoi + " " + String.format("%.0f",tongdiem) + " " + trangthai;
    }
    @Override
    public int compareTo(ThiSinh o) {
        if(this.tongdiem < o.tongdiem)
            return 1;
        else if(this.tongdiem == o.tongdiem){
            if(this.mats.compareTo(o.mats) < 0)
                return -1;
            else
                return 1;
        }
        return -1;
    }
    
}