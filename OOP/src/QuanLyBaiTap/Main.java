package QuanLyBaiTap;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[]mxn = sc.nextLine().split("\\s+");
        ArrayList<SinhVien> dssv = new ArrayList<>();
        ArrayList<String> dsbtap = new ArrayList<>();
        for(int i = 1; i <= Integer.parseInt(mxn[0]); i++){
            dssv.add(new SinhVien(sc.nextLine(),sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        for(int j = 1; j <= Integer.parseInt(mxn[1]); j++){
            dsbtap.add(sc.nextLine());
        }
        Collections.sort(dssv);
        for(SinhVien sv: dssv)
            System.out.println(sv + " " + dsbtap.get(sv.getSttnhom()-1));
        sc.close();
    }
}
