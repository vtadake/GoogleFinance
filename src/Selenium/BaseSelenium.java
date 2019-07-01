package Selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseSelenium {

	WebDriver driver;
	String propertyValue=null; 
	String browser;
	
	public WebDriver start()
	{
		GlobalVariable.setBrowserName(getCustomProperty("browsername"));
		GlobalVariable.setUrl(getCustomProperty("url"));
		//System.out.println(getCustomProperty("url"));
		GlobalVariable.setImpliciteWait(Integer.parseInt(getCustomProperty("ImpliciteWaitTime")));
		
		LaunchBrowser objLaunchBrowser=new LaunchBrowser();
		
		switch (GlobalVariable.getBrowserName()) {
		case "FireFox":
			driver=new FirefoxDriver();
			break;
		case "Chrome":
			objLaunchBrowser.LaunchChrome();
			System.out.println("In Chrome Case");
			break;
		case "IE":
			objLaunchBrowser.LaunchIE();
			break;
		default:
			System.out.println("Invalid Browser Selection");
			break;				
		}		
		
		driver=GlobalVariable.getGlobalWebDriver();
		//driver.manage().window().maximize(); //for chrome it is not working
		driver.manage().timeouts().implicitlyWait(GlobalVariable.getImpliciteWait(),TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get(GlobalVariable.getUrl());
		return driver;
	}
	
	public String getCustomProperty(String key)
	{
		String property=System.getProperty("user.dir");	
		
		File f=new File(property+"\\selenium.properties");
			
		try {
		FileInputStream fis = new FileInputStream(f);
		
		Properties p=new Properties();
		p.load(fis);
		
	
		propertyValue=p.getProperty(key);
		
		System.out.println(propertyValue);
		}
		catch (FileNotFoundException e) {
			System.out.println("Property File is not available...!!!");
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return propertyValue;
	}
	
	/*
	public static void main(String[] orgs)
	{
		BaseSelenium baseSeleniumObj=new BaseSelenium();
		
		baseSeleniumObj.getCustomProperty("url");
		
		baseSeleniumObj.start();
		
	}
	*/
}
