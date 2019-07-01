package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class LaunchBrowser {

	public void LaunchIE()
	{
		DesiredCapabilities dcObject=DesiredCapabilities.internetExplorer();

		dcObject.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
		dcObject.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION,true);
		dcObject.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
		dcObject.setCapability(InternetExplorerDriver.UNEXPECTED_ALERT_BEHAVIOR, true);
		//dcObject.setCapability("initialBrowserUrl", "https://www.google.co.in/");
		dcObject.setCapability("ignoreZoomSetting", true);
		
		System.setProperty("webdriver.ie.driver","D:\\Selenium\\IEDriverServer_x64_3.4.0\\IEDriverServer.exe");	
		GlobalVariable.setGlobalWebDriver(new InternetExplorerDriver(dcObject));	
		
	}
	
	public void LaunchChrome()
	{
		System.setProperty("webdriver.chrome.driver","G:\\Selenium\\chromedriver.exe");
		
		/*ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		chromeOptions.addArguments("--no-sandbox","--ignore-certificate-errors");
		//chromeOptions.addExtensions(new File("/path/to/extension.crx"));
		GlobalVariable.setGlobalWebDriver(new ChromeDriver(chromeOptions));*/
		GlobalVariable.setGlobalWebDriver(new ChromeDriver());
	}	
	
	public void LaunchFireFox()
	{
		
	}
}

