package ddtViaExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadingConfiguration2 {

	@Test
	public void readConfig() throws IOException
	{
		
		Properties pro=new Properties();
		pro.load(new FileInputStream(new File(System.getProperty("user.dir")+"./config/config.properties")));
		
		System.out.println(pro.get("stagingURL"));
		System.out.println(pro.get("qaURL"));
		System.out.println(pro.get("prodURL"));
		System.out.println(pro.get("headless"));
		System.out.println(pro.get("port"));
	}
	
	
	
}
