package pages.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pages.locators.CarsGuideHomePageLocators;
import utils.SeleniumDriver;

public class CarsGuideHomePageActions {
	CarsGuideHomePageLocators carsGuideHomePageLocators=null;
	
	public CarsGuideHomePageActions() {
	this.carsGuideHomePageLocators = new CarsGuideHomePageLocators();
	PageFactory.initElements(SeleniumDriver.getDriver(),carsGuideHomePageLocators);
	}
	
	public void moveToCarsForSaleMenu(){
		Actions action = new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsGuideHomePageLocators.navItem).perform();
	}
	
	public void clickOnSearchCarsMenu() {
		carsGuideHomePageLocators.searchCarsLink.click();
	}
	
	public void clickOnUsedCarsSearchMenu() {
		carsGuideHomePageLocators.usedSearchCarsLink.click();
	}
	
	public void moveToSellMyCarMenu() {
		Actions action = new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsGuideHomePageLocators.sellMyCarLink);
	}
	
	
}