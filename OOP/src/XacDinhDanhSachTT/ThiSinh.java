package XacDinhDanhSachTT;


public class ThiSinh implements Comparable<ThiSinh> {
    private String mats, hotents;
    private double diemtoan, diemly, diemhoa;
    private double diemuutien, tongdiem;
    private String trangthai;
    public ThiSinh(String mats, String hotents, String diemtoan, String diemly, String diemhoa){
        this.mats = mats;
        this.hotents = hotents;
        this.diemtoan = chuanhoadiem(diemtoan);
        this.diemhoa  = chuanhoadiem(diemhoa);
        this.diemly = chuanhoadiem(diemly);
        xuly();
    }

    private void xuly(){
        String kv = mats.substring(0,3);
        if(kv.equals("KV1"))    diemuutien = 0.5;
        else if (kv.equals("KV2"))  diemuutien = 1.0;
        else diemuutien = 2.5;
        tongdiem = diemtoan*2 + diemly + diemhoa + diemuutien;
    }

    private double chuanhoadiem(String diem){
        String s = "";
        if(diem.length() == 2 && Double.parseDouble(diem) != 10.0){
            s += diem.charAt(0);
            s += ".";
            s += diem.charAt(1);
        }
        else
            s = diem;
        return Double.parseDouble(s);
    }

    private String xulidiem(double tongdiem){
        int x = (int) tongdiem;
        if(x-tongdiem ==0)
            return String.valueOf(x);
        else
            return String.format("%.1f", tongdiem);
    }
    public double getTongdiem(){
        return tongdiem;
    }
    public void setTrangthai(String trangthai){
        this.trangthai = trangthai;
    }
    @Override
    public String toString(){
        return mats + " " + hotents + " " + xulidiem(diemuutien) + " " + xulidiem(tongdiem) + " " + trangthai;
    }

    @Override
    public int compareTo(ThiSinh o) {
        if(this.tongdiem < o.tongdiem) return 1;
        else if(this.tongdiem > o.tongdiem) return -1;
        else{
            if(this.mats.compareTo(o.mats) < 0) return -1;
            else return 1;
        }
    }
}