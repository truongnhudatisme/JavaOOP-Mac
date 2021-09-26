package TraCuu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<DonHang> ds = new ArrayList<>();
        for(int i =0 ; i < n; i++){
            ds.add(new DonHang(sc.nextLine(), sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(ds);
        for(DonHang dh: ds){
            System.out.println(dh);
        }
        sc.close();
    }
}
