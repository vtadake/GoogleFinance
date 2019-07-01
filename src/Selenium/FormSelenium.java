package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormSelenium {

	
	WebDriver objDriver;
	
	public FormSelenium(){
		objDriver=GlobalVariable.getGlobalWebDriver();
	}
	
	public void clickButton(WebElement webEle){
		if(webEle.isDisplayed() && webEle.isEnabled())
		{
			webEle.click();
		}
		else
		{
			System.out.println("Button is not Displayed or Not Editable");
		}
	}
	
	public void ClickButton(String method,String value)
	{
		PageActions objPageActions=new PageActions();
		
		//clickButton(objPageActions.getElement(method, value));
		WebElement webEle=objPageActions.getElement(method, value);
		clickButton(webEle);
	}
	
	public void CheckBox()
	{
		
	}
	public void ClickRadioButton()
	{
		
	}
	
	public void SelectOptionByIndex()
	{
		
	}
	
	public void SetText(WebElement ele,String text)
	{
		if(ele.isDisplayed() && ele.isEnabled())
			ele.sendKeys(text);
		else
			System.out.println("Unable to enter value for selected element");
	}
	
	
	
	
	
	
}
