package BangXepHang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> ds = new ArrayList<>();
        for(int i = 0 ; i < n; i++){
            String hoten = sc.nextLine();
            String[] data = sc.nextLine().split("\\s+");
            ds.add(new SinhVien(hoten, data[0], data[1]));
        }
        Collections.sort(ds);
        for(SinhVien sv: ds)
            System.out.println(sv);
        sc.close();
    }
}
