package SinhVien;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NumberFormatException, ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> ds = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            ds.add(new SinhVien(i,sc.nextLine(), sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine())));
        }
        Collections.sort(ds);
        for(SinhVien sv: ds)
            System.out.println(sv);
        sc.close();
    }
}
