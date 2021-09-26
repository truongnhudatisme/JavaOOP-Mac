package XepHangVdv;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class VanDongVien {
    private String mavdv, tenvdv;
    private String ngaysinh;
    private Date timexp, timekt;
    private Date uutien;
    private Date tongthoigian;
    private Date thoigianxephang;
    private int rank;
    
    public VanDongVien(int stt, String tenvdv, String ngaysinh, String timexp, String timekt) throws ParseException{
        this.mavdv = "VDV" + String.format("%02d",stt);
        this.tenvdv = tenvdv;
        this.ngaysinh = ngaysinh;
        this.timexp = new SimpleDateFormat("HH:mm:ss").parse(timexp);
        this.timekt = new SimpleDateFormat("HH:mm:ss").parse(timekt);
        xuly();
    }
    private void xuly() throws ParseException{
        String[] ars = ngaysinh.split("/");
        int tuoi = 2021 - Integer.parseInt(ars[2]);
        if(tuoi < 18)   uutien = new SimpleDateFormat("HH:mm:ss").parse("00:00:00");
        else if(18 <= tuoi && tuoi < 25) uutien = new SimpleDateFormat("HH:mm:ss").parse("00:00:01");
        else if(25<= tuoi && tuoi < 32) uutien = new SimpleDateFormat("HH:mm:ss").parse("00:00:02");
        else uutien = new SimpleDateFormat("HH:mm:ss").parse("00:00:03");
        long diff = timekt.getTime() - timexp.getTime();
        tongthoigian = new SimpleDateFormat("HH:mm:ss").parse(String.format("%02d:%02d:%02d",diff/(3600*1000)%24, diff/(60*1000)%60, diff/1000%60));
        diff = tongthoigian.getTime() - uutien.getTime();
        thoigianxephang = new SimpleDateFormat("HH:mm:ss").parse(String.format("%02d:%02d:%02d",diff/(3600*1000)%24, diff/(60*1000)%60, diff/1000%60));

    }
    
    public Date getThoigianxephang() {
        return thoigianxephang;
    }
    public String getMavdv(){
        return mavdv;
    }
    public void setRank(int rank){
        this.rank = rank;
    }
    public int getRank(){
        return rank;
    }
    @Override
    public String toString(){
        return mavdv + " " + tenvdv + " " + new SimpleDateFormat("HH:mm:ss").format(tongthoigian) + " " + new SimpleDateFormat("HH:mm:ss").format(uutien) + " " + new SimpleDateFormat("HH:mm:ss").format(thoigianxephang) + " " + rank;
    }
}
