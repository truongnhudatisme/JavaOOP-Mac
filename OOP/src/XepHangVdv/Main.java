package XepHangVdv;

import java.text.ParseException;
// import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<VanDongVien> ds = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            ds.add(new VanDongVien(i, sc.nextLine(),sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(ds, new Comparator<VanDongVien>(){
            @Override
            public int compare(VanDongVien v1, VanDongVien v2){
                if(v1.getThoigianxephang().compareTo(v2.getThoigianxephang()) < 0)
                    return -1;
                else if(v1.getThoigianxephang().compareTo(v2.getThoigianxephang()) == 0)
                    return 0;
                else
                    return 1;

            }
        });
        int rank = 1;
        for(VanDongVien vdv: ds){
            vdv.setRank(rank);
            rank++;
        }
        for(int i = 0; i < ds.size()-1; i++){
            if(ds.get(i).getThoigianxephang().equals(ds.get(i+1).getThoigianxephang())){
                int rank1 = ds.get(i).getRank();
                ds.get(i+1).setRank(rank1);
            }
        }
        // Collections.sort(ds, new Comparator<VanDongVien>(){
        //     @Override
        //     public int compare(VanDongVien v1, VanDongVien v2){
        //         if(v1.getMavdv().compareTo(v2.getMavdv()) < 0)
        //             return -1;
        //         else
        //             return 1;
        //     }
        // });
        for(VanDongVien vdv: ds)
            System.out.println(vdv);
        sc.close();
    }
}
