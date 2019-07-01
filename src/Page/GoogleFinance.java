package Page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import ClassLibrary.WorldMarket;
import Selenium.FormSelenium;
import Selenium.GlobalVariable;
import Selenium.PageActions;

public class GoogleFinance extends FormSelenium {

	public GoogleFinance() {

		PageFactory.initElements(GlobalVariable.getGlobalWebDriver(), this);
	}

	public void GetWorldMarketDetails() throws Exception {
		PageActions action = new PageActions();

		List<WebElement> lstStockName = action.getElements("xpath", "//div[@data-hveid='175']//div[@class='j7FfMb']");
		List<WebElement> lstPrice = action.getElements("xpath", "//div[@data-hveid='175']//span[1]/span");
		List<WebElement> lstPercent = action.getElements("xpath",
				"//div[@data-hveid='175']//span[2]/span[@aria-hidden='true']");

		List<WorldMarket> lstWorldMarket = new ArrayList<WorldMarket>();

		for (int i = 0; i < lstStockName.size(); i++) {
			WorldMarket objWorldMarket = new WorldMarket();
			objWorldMarket.setStockName(lstStockName.get(i).getText());
			objWorldMarket.setPrice(Double.parseDouble(lstPrice.get(i).getText()));
			objWorldMarket.setPercent(Double.parseDouble(lstPercent.get(i).getText()));

			lstWorldMarket.add(objWorldMarket);

		}

		GlobalVariable.setLstWorldMarket(lstWorldMarket);

	}

}
