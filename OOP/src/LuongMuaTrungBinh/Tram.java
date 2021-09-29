package LuongMuaTrungBinh;
import java.text.ParseException;
public class Tram {
    private String matram, tentram;
    // private Date timebd,timekt;
    private double tongthoigian;
    private int luongmua;
    private double luongmuatb;
    public Tram(int stt, String tentram) throws ParseException{
        this.matram = "T" + String.format("%02d",stt);
        this.tentram = tentram;
        // this.timebd = new SimpleDateFormat("HH:mm").parse(timebd);
        // this.timekt = new SimpleDateFormat("HH:mm").parse(timekt);
        // this.luongmua = Integer.parseInt(luongmua);
        // xuly();
    }
    public void xuly() throws ParseException{
        // long diff = timekt.getTime() - timebd.getTime();
        // String s = String.format("%02d:%02d", diff/(3600*1000)%24, diff/(60*1000)%60);
        // tongthoigian = new SimpleDateFormat("HH:mm").parse(s);
        // tongthoigian = diff/(3600*1000)%24 + (diff/(3600*1000)%24)/60;
        luongmuatb = luongmua/tongthoigian;
    }
    public void setLuongmua(int luongmua){
        this.luongmua = luongmua;
    }
    public int getLuongmua(){
        return luongmua;
    }
    public void setTongthoigian(double tonngthoigian){
        this.tongthoigian = tonngthoigian;
    }
    public double getTongthoigian(){
        return tongthoigian;
    }
    @Override
    public String toString(){
        return matram + " " + tentram + " " + String.format("%.2f",luongmuatb);
    }
}
