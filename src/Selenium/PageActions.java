package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageActions {

	WebDriver objDriver;
	WebElement ele;
	List<WebElement> lstEle;

	public PageActions() {
		objDriver = GlobalVariable.getGlobalWebDriver();
	}

	public WebElement getElement(String method, String value) {

		switch (method.toLowerCase()) {
		case "id":
			ele = objDriver.findElement(By.id(value));
			break;
		case "name":
			ele = objDriver.findElement(By.name(value));
			break;
		case "xpath":
			ele = objDriver.findElement(By.xpath(value));
			break;
		case "classname":
			ele = objDriver.findElement(By.className(value));
			break;
		case "tagname":
			ele = objDriver.findElement(By.tagName(value));
			break;
		default:
			System.out.println("Invalid parameters...!");
			break;
		}

		return ele;
	}

	public List<WebElement> getElements(String method, String value) {
		switch (method.toLowerCase()) {
		case "id":
			lstEle = objDriver.findElements(By.id(value));
			break;
		case "name":
			lstEle = objDriver.findElements(By.name(value));
			break;
		case "xpath":
			lstEle = objDriver.findElements(By.xpath(value));
			break;
		case "classname":
			lstEle = objDriver.findElements(By.className(value));
			break;
		case "tagname":
			lstEle = objDriver.findElements(By.tagName(value));
			break;
		default:
			System.out.println("Invalid parameters...!");
			break;
		}

		return lstEle;
	}

}
