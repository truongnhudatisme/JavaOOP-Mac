package XepHangHocSinh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<HocSinh> ds = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            ds.add(new HocSinh(i,sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(ds, new Comparator<HocSinh>(){
            @Override
            public int compare(HocSinh h1, HocSinh h2){
                if(h1.getDiemtb() < h2.getDiemtb())
                    return 1;
                else if(h1.getDiemtb() > h2.getDiemtb())
                    return -1;
                else 
                    return 0;
            }
        });
        int rank = 1;
        for(HocSinh hs: ds){
            hs.setRank(rank);
            rank++;
        }
        for(int i = 0; i < ds.size() - 1; i++){
            if(ds.get(i).getDiemtb() == ds.get(i+1).getDiemtb()){
                int rank1= ds.get(i).getRank();
                ds.get(i+1).setRank(rank1);
            }
        }
        Collections.sort(ds, new Comparator<HocSinh>(){
            @Override
            public int compare(HocSinh h1, HocSinh h2){
                if(h1.getMahs().compareTo(h2.getMahs()) < 0)
                    return -1;
                else 
                    return 1;
            }
        });
        for(HocSinh hs: ds)
            System.out.println(hs);
        sc.close();
    }
}
