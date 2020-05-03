package regression;

import org.openqa.selenium.WebDriver;


import org.testng.annotations.Test;

import generic.Excel_read;
import generic.Generic_test;
import pom.Flipkart_valid;


public class Fpk_login_gen extends Generic_test {
	@Test
	public void login() throws InterruptedException 
	{
		String username=Excel_read.getData("Data", 1, 0);
		String password=Excel_read.getData("Data", 1, 1);
	
			
			test=reports.createTest("ValidLogin", "user logins with valid credentials");

			Flipkart_valid lp = new Flipkart_valid(driver);
			test.info("test started");
			lp.setUsername(username);
			test.pass("user entered username");

			lp.setPassword(password);
			test.pass("user entered password");

			lp.loginClick();
			test.pass("user clicked on login");


}

}
