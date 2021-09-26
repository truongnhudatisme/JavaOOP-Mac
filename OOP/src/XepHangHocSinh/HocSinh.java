package XepHangHocSinh;


public class HocSinh {
    private String mahs, tenhs;
    private double diemtb;
    private String xl;
    private int rank;
    public HocSinh(int stt, String tenhs, String diemtb){
        this.mahs = "HS" + String.format("%02d",stt);
        this.tenhs = tenhs;
        this.diemtb = Double.parseDouble(diemtb);
        xuly();
    }
    private void xuly(){
        if(diemtb < 5.0) xl = "Yeu";
        else if(5<= diemtb && diemtb < 7) xl = "Trung Binh";
        else if(7 <= diemtb && diemtb < 9) xl = "Kha";
        else xl = "Gioi";
    }
    public double getDiemtb(){
        return diemtb;
    }
    public void setRank(int rank){
        this.rank = rank;
    }
    public int getRank(){
        return rank;
    }
    public String getMahs(){
        return mahs;
    }
    @Override
    public String toString(){
        return mahs + " " + tenhs + " " + String.format("%.1f",diemtb) + " " + xl + " " + rank;
    }
}
