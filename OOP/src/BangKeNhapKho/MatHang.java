package BangKeNhapKho;

public class MatHang implements Comparable<MatHang> {
    private String mahang, tenhang;
    private int soluong,dongia;
    private double tienck, tongtien;

    public MatHang(String mahang , String tenhang, String soluong, String dongia){
        this.mahang = mahang;
        this.tenhang = tenhang;
        this.soluong = Integer.parseInt(soluong);
        this.dongia = Integer.parseInt(dongia);
        xuly();
    }

    private void xuly(){
        double tienchuack = soluong*dongia;
        if(soluong > 10)
            tienck = Math.round(tienchuack*5/100.0);
        else if(8<= soluong && soluong <= 10)
            tienck = Math.round(tienchuack*2/100.0);
        else if(5<= soluong && soluong < 8)
            tienck = Math.round(tienchuack/100.0);
        else
            tienck = 0;
        tongtien = tienchuack - tienck;
    }
    @Override
    public String toString(){
        return mahang + " " + tenhang + " " + String.format("%.0f %.0f",tienck, tongtien);
    }

    @Override
    public int compareTo(MatHang o) {
        if(this.tienck < o.tienck)
            return 1;
        else if(this.tienck == o.tienck)
            return 0;
        else
            return -1;
    }
    
}
