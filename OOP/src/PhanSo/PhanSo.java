package PhanSo;

public class PhanSo {
    private long tu, mau;

    private PhanSo(){

    }
    public PhanSo(long tu, long mau){
        long uc = gcd(tu,mau);
        this.tu = tu/uc;
        this.mau = mau/uc;
    }

    private static long gcd(long a, long b){
        while(b!=0){
            long tmp = a%b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public PhanSo cong(PhanSo p1){
        PhanSo kq = new PhanSo();
        kq.tu = this.tu*p1.mau + this.mau*p1.tu;
        kq.mau = this.mau*p1.mau;
        long uc = gcd(kq.tu, kq.mau);
        kq.tu /= uc;
        kq.mau /= uc;
        return kq;
    }

    public PhanSo nhan(PhanSo p1){
        PhanSo kq = new PhanSo();
        kq.tu = this.tu * p1.tu;
        kq.mau = this.mau*p1.mau;
        long uc = gcd(kq.tu,kq.mau);
        kq.tu /= uc;
        kq.mau /= uc;
        return kq;
    }
    @Override
    public String toString(){
        return tu + "/" + mau;
    }
}
