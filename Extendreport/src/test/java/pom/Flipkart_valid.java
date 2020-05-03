package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_page;

public class Flipkart_valid extends Base_page {
	//Declaration
		@FindBy(xpath="//body/div/div/div/div/div/div/div/div/div/a[1]")
		private WebElement log;
		
		@FindBy(xpath="//div//div//div//div//div//div//div//form//div[1]//input[1]") 
		private WebElement Uname;
		
		@FindBy(xpath="//div//div//div//div//div//div//div[2]//input[1]")  
		private WebElement pword;
		
		@FindBy(xpath="//html//body//div//div//div//div//div//div//div//form//div//button//span")
		private WebElement login;
		
		//@FindBy(xpath="//body/div[@id='container']/div/div[@class='_3ybBIU']/div[@class='_1tz-RS']/div[@class='_3pNZKl']/div[3]/div[1]/*[1]")
		//private WebElement drop;
		
		//@FindBy(className="//div[@class='_1Q5BXB']")
		//private WebElement logout;

	public Flipkart_valid(WebDriver driver)
	{
		//PageFactory.initElements(driver, this);
		super(driver);
	}

	//Utilization

	public void setUsername(String Username)
	{
		Uname.sendKeys(Username);
		
	}
	public void setPassword(String Password)
	{
		pword.sendKeys(Password);
	}
	public void loginClick()
	{
		login.click();
	}
	/*public void logoutClick()
	{
		logout.click();
		Reusable_methods.mousehover(driver, logout);
	}*/
	}


