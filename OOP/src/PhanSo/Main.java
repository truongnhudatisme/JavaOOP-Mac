package PhanSo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            PhanSo p1 = new PhanSo(sc.nextLong(),sc.nextLong());
            PhanSo p2 = new PhanSo(sc.nextLong(),sc.nextLong());
            PhanSo p3 = p1.cong(p2);
            PhanSo c = p3.nhan(p3);
            PhanSo d = c.nhan(p1).nhan(p2);
            System.out.println(c + " " + d);
        }
        sc.close();
    }
}
