package J05010;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<MatHang> dsmh = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            dsmh.add(new MatHang(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(dsmh);
        for(MatHang mh: dsmh)
            System.out.println(mh);
        sc.close();
    }
}
