package Selenium;

import java.util.List;

import org.openqa.selenium.WebDriver;
import ClassLibrary.*;

public class GlobalVariable {

	static String browserName;
	static String url;
	static WebDriver globalWebDriver;
	static int impliciteWait;
	static List<MarketSummary> lstMarketSummary;
	
	public static List<MarketSummary> getLstMarketSummary() {
		return lstMarketSummary;
	}

	public static void setLstMarketSummary(List<MarketSummary> lstMarketSummary) {
		GlobalVariable.lstMarketSummary = lstMarketSummary;
	}

	public static List<WorldMarket> getLstWorldMarket() {
		return lstWorldMarket;
	}

	public static void setLstWorldMarket(List<WorldMarket> lstWorldMarket) {
		GlobalVariable.lstWorldMarket = lstWorldMarket;
	}

	static List<WorldMarket> lstWorldMarket;

	public static String getBrowserName() {
		return browserName;
	}

	public static void setBrowserName(String browserName) {
		GlobalVariable.browserName = browserName;
	}

	public static String getUrl() {
		return url;
	}

	public static void setUrl(String url) {
		GlobalVariable.url = url;
	}

	public static int getImpliciteWait() {
		return impliciteWait;
	}

	public static void setImpliciteWait(int impliciteWait) {
		GlobalVariable.impliciteWait = impliciteWait;
	}

	public static WebDriver getGlobalWebDriver() {
		return globalWebDriver;
	}

	public static void setGlobalWebDriver(WebDriver globalWebDriver) {
		GlobalVariable.globalWebDriver = globalWebDriver;
	}
}
