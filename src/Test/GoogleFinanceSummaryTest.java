package Test;

import org.testng.Assert;
import org.testng.annotations.Test;
import Page.GoogleFinanceSummary;
import Selenium.BaseSelenium;
import Selenium.GlobalVariable;

public class GoogleFinanceSummaryTest extends BaseSelenium {
	@Test
	public void GoogleFinanceSummaryDetailTest() throws Exception {
		start();
		GoogleFinanceSummary objGoogleFinanceSummary = new GoogleFinanceSummary();
		objGoogleFinanceSummary.GetWorldMarketSummaryDetails();

		Assert.assertEquals(GlobalVariable.getLstMarketSummary().get(0).getStockName(), ".DJI");
		Assert.assertEquals(GlobalVariable.getLstMarketSummary().get(0).getHigh(), "26543.63");
		Assert.assertEquals(GlobalVariable.getLstMarketSummary().get(0).getLow(), "26543.63");
		Assert.assertEquals(GlobalVariable.getLstMarketSummary().get(0).getOpen(), "26543.63");

		Assert.assertEquals(GlobalVariable.getLstMarketSummary().get(1).getStockName(), "DAX");
		Assert.assertEquals(GlobalVariable.getLstMarketSummary().get(1).getHigh(), "26543.63");
		Assert.assertEquals(GlobalVariable.getLstMarketSummary().get(1).getLow(), "26543.63");
		Assert.assertEquals(GlobalVariable.getLstMarketSummary().get(0).getOpen(), "26543.63");

	}

}
