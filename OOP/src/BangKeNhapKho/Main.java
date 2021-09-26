package BangKeNhapKho;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<MatHang> ds = new ArrayList<>();
        HashMap<String, Integer> arr = new HashMap<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i =0; i < n; i++){
            String tenhang = sc.nextLine();
            String[] parsetenhang = tenhang.split("\\s+");
            StringBuilder s = new StringBuilder();
            s.append(Character.toUpperCase(parsetenhang[0].charAt(0)));
            s.append(Character.toUpperCase(parsetenhang[1].charAt(0)));
            String ten = s.toString().trim();
            if(arr.get(ten) == null){
                arr.put(ten,1);
            }
            else
                arr.put(ten, arr.get(ten)+1);
            ds.add(new MatHang(String.format("%s%02d",ten,arr.get(ten)), tenhang, sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(ds);
        for(MatHang mh: ds)
            System.out.println(mh);



        sc.close();
    }
}
