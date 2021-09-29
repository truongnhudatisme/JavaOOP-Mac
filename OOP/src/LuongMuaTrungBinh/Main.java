package LuongMuaTrungBinh;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        ArrayList<Tram> dsTram = new ArrayList<>();
        HashMap<String,Integer> dsHash = new HashMap<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            String tentram = sc.nextLine();
            if(dsHash.get(tentram) == null){
                dsHash.put(tentram,i);
                dsTram.add(new Tram(i,tentram));
                Date timebd = new SimpleDateFormat("HH:mm").parse(sc.nextLine());
                Date timekt = new SimpleDateFormat("HH:mm").parse(sc.nextLine());
                int luongmua = Integer.parseInt(sc.nextLine());
                long diff = timekt.getTime() - timebd.getTime();
                double phut = diff/(60*1000)%60;
                dsTram.get(i-1).setTongthoigian(phut/60 + diff/(3600*1000)%24);
                dsTram.get(i-1).setLuongmua(luongmua);
            }
            else{
                int pos = dsHash.get(tentram);
                Date timebd = new SimpleDateFormat("HH:mm").parse(sc.nextLine());
                Date timekt = new SimpleDateFormat("HH:mm").parse(sc.nextLine());
                int luongmua = Integer.parseInt(sc.nextLine());
                long diff = timekt.getTime() - timebd.getTime();
                double phut = diff/(60*1000)%60;
                double timecu = dsTram.get(pos-1).getTongthoigian();
                int luongmuacu = dsTram.get(pos-1).getLuongmua();
                dsTram.get(pos-1).setTongthoigian(timecu + phut/60 + diff/(3600*1000)%24);
                dsTram.get(pos-1).setLuongmua(luongmua + luongmuacu);
            }
        }
        for(Tram t: dsTram){
            t.xuly();
            System.out.println(t);
        }
        sc.close();
    }
}
