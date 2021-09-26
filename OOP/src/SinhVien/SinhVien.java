package SinhVien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class SinhVien implements Comparable<SinhVien> {
    private String hoten, lop,masv;
    private Date ns;
    private float gpa;
    public SinhVien(int stt,String hoten, String lop, String ns, float gpa) throws ParseException{
        this.masv = "B20DCCN" + String.format("%03d",stt);
        this.hoten = chuanhoaten(hoten);
        this.lop = lop;
        this.ns = new SimpleDateFormat("dd/MM/yyyy").parse(ns);
        this.gpa = gpa;
    }

    private String chuanhoaten(String hoten){
        StringBuilder s = new StringBuilder();
        StringTokenizer s1 = new StringTokenizer(hoten);
        while(s1.hasMoreTokens()){
            String tmp = s1.nextToken();
            s.append(Character.toUpperCase(tmp.charAt(0)));
            for(int i = 1; i < tmp.length(); i++)
                s.append(Character.toLowerCase(tmp.charAt(i)));
            s.append(" ");
        }
        return s.toString().trim();
    }
    @Override
    public String toString(){
        return masv + " " + hoten + " " + lop + " " + new SimpleDateFormat("dd/MM/yyyy").format(ns) + " " + String.format("%.2f",gpa);
    }

    @Override
    public int compareTo(SinhVien o) {
        if(this.gpa < o.gpa)
            return 1;
        else
            return -1;
    }
}
