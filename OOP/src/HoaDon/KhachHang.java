package HoaDon;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class KhachHang implements Comparable<KhachHang> {
    private String makh, tenkh, sophong;
    private Date ngaynhan,ngaytra;
    private int tienps;
    private long songay;
    private long tongtien;

    public KhachHang(int stt, String tenkh, String sophong, String ngaynhan, String ngaytra, String tienps) throws ParseException{
        this.makh = "KH" + String.format("%02d",stt);
        this.tenkh = tenkh;
        this.sophong = sophong;
        this.ngaynhan = new SimpleDateFormat("dd/MM/yyyy",Locale.ENGLISH).parse(ngaynhan);
        this.ngaytra = new SimpleDateFormat("dd/MM/yyyy",Locale.ENGLISH).parse(ngaytra);
        this.tienps = Integer.parseInt(tienps);
        xuly();
    }

    private void xuly(){
        long diff = ngaytra.getTime() - ngaynhan.getTime();
        TimeUnit time = TimeUnit.DAYS;
        songay = time.convert(diff, TimeUnit.MILLISECONDS) + 1;
        if(sophong.charAt(0) == '1')
            tongtien = songay*25 + tienps;
        else if(sophong.charAt(0) == '2')
            tongtien = songay*34 + tienps;
        else if(sophong.charAt(0) == '3')
            tongtien = songay*50 + tienps;
        else
            tongtien = songay*80 + tienps;
    }

    @Override 
    public String toString(){
        return makh + " " + tenkh + " " + sophong + " " + songay + " " + tongtien;
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
