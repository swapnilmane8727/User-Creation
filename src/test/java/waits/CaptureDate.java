package waits;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CaptureDate {

	public static void main(String[] args) {

		Date d=new Date();
		System.out.println(d);
		
		SimpleDateFormat customdate=new SimpleDateFormat("HH:mm:ss_dd_MM_yyyy");
		String date=customdate.format(d);
		System.out.println(date);
		
}

}
