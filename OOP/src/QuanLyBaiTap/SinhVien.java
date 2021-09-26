package QuanLyBaiTap;

public class SinhVien implements Comparable<SinhVien>{
    private String masv,hoten, sodienthoai;
    private int sttnhom;
    public SinhVien(String masv, String hoten, String sodienthoai, String sttnhom){
        this.masv = masv;
        this.hoten = hoten;
        this.sodienthoai = sodienthoai;
        this.sttnhom = Integer.parseInt(sttnhom);
    }

    public int getSttnhom() {
        return sttnhom;
    }

    @Override 
    public String toString(){
        return masv + " " + hoten + " " + sodienthoai + " " + sttnhom; 
    }

    @Override
    public int compareTo(SinhVien o) {
        if(this.masv.compareTo(o.masv) < 0)
            return -1;
        else
            return 1;
    }
}
