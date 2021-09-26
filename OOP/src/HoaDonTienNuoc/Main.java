package HoaDonTienNuoc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> ds = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            ds.add(new KhachHang(i,sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(ds);
        for(KhachHang kh: ds)
            System.out.println(kh);
        sc.close();
    }
}
