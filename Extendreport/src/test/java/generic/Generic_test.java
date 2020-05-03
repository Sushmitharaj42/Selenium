package generic;



import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Generic_test implements Auto_cons {
	public WebDriver driver;
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports reports;
	public static ExtentTest test;
	FileManager fm=new FileManager();
	Browser_factory bff=new Browser_factory();
	@BeforeSuite
	public void setUp()
	{
		htmlReporter=new ExtentHtmlReporter("./reports/" + new Date().toString().replace(":", "-")+"E.html");
		reports=new ExtentReports();
		reports.attachReporter(htmlReporter);
		
	}
	@Parameters({"browser"})
	@BeforeMethod
	public void OpenApp(@Optional("chrome")String browser)
	{
		if(browser.equals("chrome"))
		{
			driver=bff.getBrowser("chrome");
			//driver.get("https://www.flipkart.com/");
			driver.get(fm.getUrl());
			//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			//driver.get(FileManager.getappurl());
			
		}
		else if(browser.equals("firefox")){
			driver=bff.getBrowser("firefox");
			driver.get(fm.getUrl());
			//driver.get("https://www.flipkart.com/");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			//driver.get(FileManager.getappurl());
		}
	}

@AfterMethod
public void closeApp(ITestResult res)
{
	System.out.println(res.getStatus());
	if(ITestResult.FAILURE==res.getStatus())
	{
		String testName=res.getName();
		try{
			Generic_SS.captureimg(driver, testName);
			
		}
		catch(IOException e){
			e.printStackTrace();
			
		}
	}
	driver.quit();
}
   @AfterSuite
public void tearDown()
{
	   reports.flush();
}


}
