package BangXepHang;

public class SinhVien implements Comparable<SinhVien> {
    private String hoten;
    private int sobaidung;
    private long soluotsub;
    public SinhVien(String hoten, String sobaidung, String soluotsub){
        this.hoten = hoten;
        this.sobaidung = Integer.parseInt(sobaidung);
        this.soluotsub = Long.parseLong (soluotsub);
    }
    @Override
    public int compareTo(SinhVien o) {
        if(this.sobaidung < o.sobaidung)
            return 1;
        else if(this.sobaidung == o.sobaidung){
            if(this.soluotsub < o.soluotsub)
                return 1;
            else if(this.soluotsub == o.soluotsub){
                if(this.hoten.compareTo(o.hoten) < 0)
                    return -1;
                else if(this.hoten.compareTo(o.hoten)==0)
                    return 0;
                else
                    return 1;
            }
            else
                return -1;
        }
        return -1;
    }
    @Override
    public String toString(){
        return hoten + " " + sobaidung + " " + soluotsub;
    }
}
