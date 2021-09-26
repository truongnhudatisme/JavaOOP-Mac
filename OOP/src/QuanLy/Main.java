package QuanLy;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        ArrayList<KhachHang> dskhach = new ArrayList<>();
        ArrayList<MatHang> dshang = new ArrayList<>();
        ArrayList<HoaDon> dshoadon = new ArrayList<>();
        int soluongkhach = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= soluongkhach; i++){
            dskhach.add(new KhachHang(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        int soluonghang = Integer.parseInt(sc.nextLine());
        for(int j = 1; j <= soluonghang; j++){
            dshang.add(new MatHang(j, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        int sohoadon = Integer.parseInt(sc.nextLine());
        for(int k = 1; k <= sohoadon; k++){
            String[] data = sc.nextLine().split("\\s+");
            dshoadon.add(new HoaDon(k, data[0], data[1], data[2], dshang, dskhach));
        }
        Collections.sort(dshoadon);
        for(HoaDon hd: dshoadon)
            System.out.println(hd);
        sc.close();
    }
}
