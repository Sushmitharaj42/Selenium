package generic;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser_factory implements Auto_cons {
	private  Map<String, WebDriver> drivers= new HashMap<String, WebDriver>();
	public  WebDriver getBrowser(String browsername){
		WebDriver driver=null;
		switch (browsername) {
		case "chrome":
			driver=drivers.get("chrome");
			if(driver==null)
				System.setProperty(chrome_key, chrome_value);
			driver=new ChromeDriver();
			drivers.put("chrome",driver);
			
			break;
		case "firefox":
			driver=drivers.get("firefox");
	
			if(driver==null)
				System.setProperty(gecko_key, gecko_value);
			driver=new FirefoxDriver();
			drivers.put("firefox",driver);
			break;


		default:
			break;
		}
		return driver;
	}

}
