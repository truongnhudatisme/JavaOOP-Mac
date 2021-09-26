package HoaDonTienNuoc;

public class KhachHang implements Comparable<KhachHang> {
    private String makh, tenkh;
    private int csm, csc;
    private double tongtien;
    public KhachHang(int stt, String tenkh, String csc, String csm){
        this.makh = "KH" + String.format("%02d",stt);
        this.tenkh = tenkh;
        this.csc = Integer.parseInt(csc);
        this.csm = Integer.parseInt(csm);
        xuly();
    }
    
    private void xuly(){
        int cst = csm - csc;
        if(0 <= cst  && cst <= 50)
        tongtien = cst * 100 + Math.round(cst*100*2/100.0);
        else if(50 < cst && cst <= 100){
            tongtien = 50*100 + (cst - 50)*150;
            tongtien = Math.round(tongtien*103/100.0);
        }
        else{
            tongtien = 50*100 + 50*150 + (cst - 100) * 200;
            tongtien = Math.round(tongtien*105/100.0);
        }
    }

    @Override
    public String toString(){
        return makh + " " + tenkh + " " +(int) tongtien;
    }

    @Override
    public int compareTo(KhachHang o) {
        if(this.tongtien < o.tongtien)
            return 1;
        else if(this.tongtien == o.tongtien)
            return 0;
        else
            return -1;
    }
}
