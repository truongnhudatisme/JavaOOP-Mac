package TraCuu;

public class DonHang implements Comparable<DonHang>{
    private String tenhang, madonhang;
    private int dongia,soluong;
    private int stt;
    private int thanhtien,tiengiamgia;
    public DonHang(String tenhang, String madonhang, int dongia, int soluong){
        this.tenhang = tenhang;
        this.madonhang = madonhang;
        this.dongia = dongia;
        this.soluong = soluong;
        this.stt = Integer.parseInt(madonhang.substring(1,4));
        tinhtiengiam(madonhang);
    }

    private void tinhtiengiam(String madonhang){
        int tongtien = dongia*soluong;
        if(madonhang.charAt(4) == '1'){
            tiengiamgia = (int) Math.round(tongtien*5/10.0);
        }
        else
            tiengiamgia = (int) Math.round(tongtien*3/10.0);
        thanhtien = tongtien - tiengiamgia;
    }

    @Override 
    public String toString(){
        return tenhang + " " + madonhang + " " + String.format("%03d",stt) + " " + tiengiamgia + " " + thanhtien;
    }

    @Override
    public int compareTo(DonHang o) {
        if(this.stt < o.stt)
            return -1;
        else
            return 1;
    }

}
