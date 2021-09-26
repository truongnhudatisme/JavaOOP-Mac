package TimKiem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ThiSinh> dsts = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            dsts.add(new ThiSinh(i, sc.nextLine(),sc.nextLine(), sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(dsts);
        double max = dsts.get(0).getTongdiem();
        for(ThiSinh ts: dsts){
            if(ts.getTongdiem() == max)
                System.out.println(ts);
        }
        sc.close();
    }
}
