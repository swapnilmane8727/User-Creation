package ddtViaExcel;

import java.io.IOException;
import org.testng.annotations.Test;

import helper.ConfigReader;

public class ReadingConfiguration3 {

	@Test
	public void readConfig() throws IOException
	{
		String url=ConfigReader.getProperty("stagingURL");
        System.out.println(url);
	}
	
	
	
}
