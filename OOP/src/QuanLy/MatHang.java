package QuanLy;

public class MatHang {
    private String mahang, tenhang, donvi;
    private long giamua,giaban;

    public MatHang(int stt, String tenhang, String donvi, String giamua, String giaban){
        this.mahang = "MH" + String.format("%03d",stt);
        this.tenhang = tenhang;
        this.donvi = donvi;
        this.giaban = Long.parseLong(giaban);
        this.giamua = Long.parseLong(giamua);
    }

    public long getGiamua(){
        return giamua;
    }
    public long getGiaban(){
        return giaban;
    }
    @Override
    public String toString(){
        return tenhang;
    }
}
