package waits;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CaptureDate2 {

	public static void main(String[] args) {

		
		
		//SimpleDateFormat dateformat=new SimpleDateFormat("HH:mm:ss_DD_MM_YYYY");
		
		String date=new SimpleDateFormat("HH:mm:ss_DD_MM_YYYY").format(new Date());
		System.out.println(date);
		
		
		
		
	}

}
