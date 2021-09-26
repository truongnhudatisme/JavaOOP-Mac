package TimKiem;

public class ThiSinh implements Comparable<ThiSinh> {
    private int stt;
    private String ten, ngaysinh;
    private double tongdiem;
    public ThiSinh(int stt, String ten, String ngaysinh, String diem1, String diem2, String diem3){
        this.stt = stt;
        this.ten = ten;
        this.ngaysinh = ngaysinh;
        this.tongdiem = Double.parseDouble(diem1) + Double.parseDouble(diem2) + Double.parseDouble(diem3);
    }

    public double getTongdiem(){
        return tongdiem;
    }

    @Override
    public int compareTo(ThiSinh o) {
        if(this.tongdiem < o.tongdiem)
            return 1;
        else if(this.tongdiem == o.tongdiem){
            if(this.stt < o.stt)
                return -1;
            else
                return 1;
        }
        return -1;
    }

    @Override
    public String toString(){
        return stt + " " + ten + " " + ngaysinh + " " + String.format("%.1f", tongdiem);
    }
}
