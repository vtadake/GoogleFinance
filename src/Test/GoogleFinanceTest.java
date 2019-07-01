package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import Page.GoogleFinance;
import Selenium.BaseSelenium;
import Selenium.GlobalVariable;

public class GoogleFinanceTest extends BaseSelenium {
	@Test
	public void GoogleFinanceMarketDetailTest() throws Exception {
		start();
		GoogleFinance objGoogleFinance = new GoogleFinance();
		objGoogleFinance.GetWorldMarketDetails();

		Assert.assertEquals(GlobalVariable.getLstWorldMarket().get(0).getStockName(), ".DJI");
		Assert.assertEquals(GlobalVariable.getLstWorldMarket().get(0).getPrice(), "26543.63");
		Assert.assertEquals(GlobalVariable.getLstWorldMarket().get(0).getPercent(), "0.064%");

		Assert.assertEquals(GlobalVariable.getLstWorldMarket().get(1).getStockName(), "DAX");
		Assert.assertEquals(GlobalVariable.getLstWorldMarket().get(1).getPrice(), "26543.63");
		Assert.assertEquals(GlobalVariable.getLstWorldMarket().get(1).getPercent(), "0.064%");

	}
}
