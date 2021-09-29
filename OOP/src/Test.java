import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Date timebd = new SimpleDateFormat("HH:mm").parse(sc.nextLine());
        Date timekt = new SimpleDateFormat("HH:mm").parse(sc.nextLine());
        long diff = timekt.getTime() - timebd.getTime();
        // double tonngthoigian = diff/(3600*1000)%24 + (diff/(60*1000)%60)/60;
        double phut = diff/(60*1000)%60;
        System.out.println(String.format("%f",phut/60));
    }
}
