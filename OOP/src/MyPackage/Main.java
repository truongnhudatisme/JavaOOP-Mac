package MyPackage;
import java.text.ParseException;
import java.util.*;
public class Main {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		ArrayList<KhachHang> ds = new ArrayList<KhachHang>();
		for(int i=1; i<=t; i++) {
			String ma = "KH"+String.format("%02d", i);
			KhachHang a = new KhachHang(ma, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
			ds.add(a);
		}
		Collections.sort(ds);
		for(KhachHang a : ds) {
			System.out.println(a);
		}
		sc.close();
	}
}
