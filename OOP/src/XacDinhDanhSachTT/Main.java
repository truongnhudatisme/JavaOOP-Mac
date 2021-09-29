package XacDinhDanhSachTT;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ThiSinh> ds = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            ds.add(new ThiSinh(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        int m = Integer.parseInt(sc.nextLine());
        Collections.sort(ds);
        double diemchuan = ds.get(m-1).getTongdiem();
        for(ThiSinh ts: ds){
            if(ts.getTongdiem() < diemchuan)
                ts.setTrangthai("TRUOT");
            else
                ts.setTrangthai("TRUNG TUYEN");
        }
        System.out.println(String.format("%.1f", diemchuan));
        for(ThiSinh ts:ds){
            System.out.println(ts);
        }
        sc.close();
    }
}
