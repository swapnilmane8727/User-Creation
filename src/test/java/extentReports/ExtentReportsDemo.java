package extentReports;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportsDemo {
	
	
	@Test
	public void generateReport()
	{
		ExtentReports report=new ExtentReports();
		
		ExtentSparkReporter sparkReporter=new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/MyHtmlReport.html");
		sparkReporter.config().setReportName("Automation Report");
		sparkReporter.config().setTheme(Theme.DARK);
		sparkReporter.config().setDocumentTitle("Sprint 1 Automation report");
		
		report.attachReporter(sparkReporter);
		
		ExtentTest t1 = report.createTest("Login Test");
		t1.pass("Started application");
		t1.pass("Enter username");
		t1.pass("Enter password");
		t1.pass("Click to login");
		
		
		ExtentTest t2 = report.createTest("Payment Status");
		t2.fail("Payment test failed",MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\I4750\\Desktop\\Sel\\SS\\Selenium_Logo.png").build());
		ExtentTest t3 = report.createTest("Account status");
		t3.skip("Account test skipped");
		
		report.flush();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
