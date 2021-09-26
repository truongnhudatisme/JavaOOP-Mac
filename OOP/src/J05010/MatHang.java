package J05010;

public class MatHang implements Comparable<MatHang> {
    private int stt;
    private String tenhang, loaihang;
    private double loinhuan;

    public MatHang(int stt, String tenhang, String loaihang, String giamua, String giaban){
        this.stt = stt;
        this.tenhang = tenhang;
        this.loaihang = loaihang;
        this.loinhuan = Double.parseDouble(giaban) - Double.parseDouble(giamua);
    }
    @Override
    public String toString(){
        return stt + " " + tenhang + " " + loaihang + " " + String.format("%.2f",loinhuan);
    }
    @Override
    public int compareTo(MatHang o) {
        if(this.loinhuan < o.loinhuan)
            return 1;
        else if(this.loinhuan == o.loinhuan)
            return 0;
        else
            return -1;
    }
    

}
