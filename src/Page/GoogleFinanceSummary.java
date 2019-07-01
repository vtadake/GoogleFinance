package Page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Selenium.FormSelenium;
import Selenium.GlobalVariable;
import Selenium.PageActions;
import ClassLibrary.MarketSummary;

public class GoogleFinanceSummary extends FormSelenium {

	public GoogleFinanceSummary() {

		PageFactory.initElements(GlobalVariable.getGlobalWebDriver(), this);
	}

	public void GetWorldMarketSummaryDetails() throws Exception {
		PageActions action = new PageActions();
		List<WebElement> lstSummaryDetails;
		List<MarketSummary> lstMarketSummary = new ArrayList<MarketSummary>();
		WebElement eleStock;

		WebElement eleDJI = action.getElement("xpath", ".//div[@data-hveid='175']//div[@class='ML43Jb fw-wli bm7Wje']");
		eleDJI.click();

		GlobalVariable.getGlobalWebDriver().get(GlobalVariable.getGlobalWebDriver().getCurrentUrl());
		GlobalVariable.getGlobalWebDriver().navigate().refresh();

		lstSummaryDetails = action.getElements("xpath", ".//td[@class='iyjjgb']");
		eleStock = action.getElement("xpath", ".//div[@data-attrid='subtitle']");

		MarketSummary objDJIMarketSummary = new MarketSummary();
		objDJIMarketSummary.setStockName(eleStock.getText());
		objDJIMarketSummary.setOpen(Double.parseDouble(lstSummaryDetails.get(0).getText()));
		objDJIMarketSummary.setHigh(Double.parseDouble(lstSummaryDetails.get(1).getText()));
		objDJIMarketSummary.setLow(Double.parseDouble(lstSummaryDetails.get(2).getText()));

		GlobalVariable.getGlobalWebDriver().navigate().back();

		WebElement eleDAX = action.getElement("xpath", ".//div[@data-hveid='175']//div[@data-mid='/m/0877z']");
		eleDAX.click();

		GlobalVariable.getGlobalWebDriver().get(GlobalVariable.getGlobalWebDriver().getCurrentUrl());
		GlobalVariable.getGlobalWebDriver().navigate().refresh();

		lstSummaryDetails = action.getElements("xpath", ".//td[@class='iyjjgb']");
		eleStock = action.getElement("xpath", ".//div[@data-attrid='subtitle']");

		MarketSummary objDAXMarketSummary = new MarketSummary();
		objDAXMarketSummary.setStockName(eleStock.getText());
		objDAXMarketSummary.setOpen(Double.parseDouble(lstSummaryDetails.get(0).getText()));
		objDAXMarketSummary.setHigh(Double.parseDouble(lstSummaryDetails.get(1).getText()));
		objDAXMarketSummary.setLow(Double.parseDouble(lstSummaryDetails.get(2).getText()));

		GlobalVariable.getGlobalWebDriver().navigate().back();

		WebElement eleSensex = action.getElement("xpath", ".//div[@data-hveid='175']//div[@data-mid='/m/046k_p']");
		eleSensex.click();

		GlobalVariable.getGlobalWebDriver().get(GlobalVariable.getGlobalWebDriver().getCurrentUrl());
		GlobalVariable.getGlobalWebDriver().navigate().refresh();

		lstSummaryDetails = action.getElements("xpath", ".//td[@class='iyjjgb']");
		eleStock = action.getElement("xpath", ".//div[@data-attrid='subtitle']");

		MarketSummary objSensexMarketSummary = new MarketSummary();
		objSensexMarketSummary.setStockName(eleStock.getText());
		objSensexMarketSummary.setOpen(Double.parseDouble(lstSummaryDetails.get(0).getText()));
		objSensexMarketSummary.setHigh(Double.parseDouble(lstSummaryDetails.get(1).getText()));
		objSensexMarketSummary.setLow(Double.parseDouble(lstSummaryDetails.get(2).getText()));

		GlobalVariable.getGlobalWebDriver().navigate().back();

		WebElement eleUKX = action.getElement("xpath", ".//div[@data-hveid='175']//div[@data-mid='/m/02hl6w']");
		eleUKX.click();

		GlobalVariable.getGlobalWebDriver().get(GlobalVariable.getGlobalWebDriver().getCurrentUrl());
		GlobalVariable.getGlobalWebDriver().navigate().refresh();

		lstSummaryDetails = action.getElements("xpath", ".//td[@class='iyjjgb']");
		eleStock = action.getElement("xpath", ".//div[@data-attrid='subtitle']");

		MarketSummary objUKXMarketSummary = new MarketSummary();
		objUKXMarketSummary.setStockName(eleStock.getText());
		objUKXMarketSummary.setOpen(Double.parseDouble(lstSummaryDetails.get(0).getText()));
		objUKXMarketSummary.setHigh(Double.parseDouble(lstSummaryDetails.get(1).getText()));
		objUKXMarketSummary.setLow(Double.parseDouble(lstSummaryDetails.get(2).getText()));

		GlobalVariable.getGlobalWebDriver().navigate().back();

		WebElement eleIB = action.getElement("xpath", ".//div[@data-hveid='175']//div[@data-mid='/m/04ww1p']");
		eleIB.click();

		GlobalVariable.getGlobalWebDriver().get(GlobalVariable.getGlobalWebDriver().getCurrentUrl());
		GlobalVariable.getGlobalWebDriver().navigate().refresh();

		lstSummaryDetails = action.getElements("xpath", ".//td[@class='iyjjgb']");
		eleStock = action.getElement("xpath", ".//div[@data-attrid='subtitle']");

		MarketSummary objIBMarketSummary = new MarketSummary();
		objIBMarketSummary.setStockName(eleStock.getText());
		objIBMarketSummary.setOpen(Double.parseDouble(lstSummaryDetails.get(0).getText()));
		objIBMarketSummary.setHigh(Double.parseDouble(lstSummaryDetails.get(1).getText()));
		objIBMarketSummary.setLow(Double.parseDouble(lstSummaryDetails.get(2).getText()));

		lstMarketSummary.add(objDJIMarketSummary);
		lstMarketSummary.add(objDAXMarketSummary);
		lstMarketSummary.add(objSensexMarketSummary);
		lstMarketSummary.add(objUKXMarketSummary);
		lstMarketSummary.add(objIBMarketSummary);

		GlobalVariable.setLstMarketSummary(lstMarketSummary);
	}

}
