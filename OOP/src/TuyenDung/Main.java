package TuyenDung;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<NhanVien> ds = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            ds.add(new NhanVien(i,sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(ds);
        for(NhanVien nv:ds)
            System.out.println(nv);
        sc.close();
    }
}
