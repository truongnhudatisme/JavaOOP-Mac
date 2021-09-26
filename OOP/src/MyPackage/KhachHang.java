package MyPackage;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class KhachHang implements Comparable<KhachHang>{
	private String ma, ten, phong, phatSinh;
	private Date ngayNhan, ngayTra;
	public KhachHang(String ma, String ten, String phong, String ngayNhan, String ngayTra, String phatSinh) throws ParseException {
		this.ma=ma;
		this.ten=ten.trim();
		this.phong=phong.trim();
		this.ngayNhan= new SimpleDateFormat("dd/MM/yyyy",Locale.ENGLISH).parse(ngayNhan.trim());
		this.ngayTra= new SimpleDateFormat("dd/MM/yyyy",Locale.ENGLISH).parse(ngayTra.trim());
		this.phatSinh=phatSinh.trim();
	}
	private long SoNgayO() {
		long diff = ngayTra.getTime() - ngayNhan.getTime();
        TimeUnit time = TimeUnit.DAYS;
        return time.convert(diff, TimeUnit.MILLISECONDS) + 1;
	}
	private long thanhTien() {
		if(phong.charAt(0)=='1') return 25*SoNgayO()+Long.parseLong(phatSinh);
		if(phong.charAt(0)=='2') return 34*SoNgayO()+Long.parseLong(phatSinh);
		if(phong.charAt(0)=='3') return 50*SoNgayO()+Long.parseLong(phatSinh);
		return 80*SoNgayO()+Long.parseLong(phatSinh);
	}
	public String toString() {
		return ma+" "+ten+" "+phong+" "+SoNgayO()+" "+thanhTien();
	}
	@Override
	public int compareTo(KhachHang o) {
		if(thanhTien()<o.thanhTien()) return 1;
		else if(thanhTien()>o.thanhTien()) return -1;
		return 0;
	}
}