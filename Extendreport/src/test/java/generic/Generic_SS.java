package generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Generic_SS {
public static void captureimg(WebDriver driver, String testName) throws IOException
{
	String path=("E://Photos/.png");
	Date d=new Date();
	String d1=d.toString();
	String date1=d1.replace(":", "-");
	TakesScreenshot ts=(TakesScreenshot) (driver);
	File src=ts.getScreenshotAs(OutputType.FILE);
	File dest=new File(path+date1+testName+".png");
	FileHandler.copy(src, dest);
}

}
