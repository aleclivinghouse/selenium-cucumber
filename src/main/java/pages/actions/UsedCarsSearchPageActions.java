package pages.actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.CarSearchPageLocators;
import pages.locators.UsedCarSearchPageLocators;
import utils.SeleniumDriver;

public class UsedCarsSearchPageActions {
	//WebDriver driver=null;
	
CarSearchPageLocators usedCarsSearchPageLocators = null;
	
	public UsedCarsSearchPageActions(){
		this.usedCarsSearchPageLocators = new CarSearchPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), usedCarsSearchPageLocators);
	}
	
	public void selectCarMake(String carBrand) {
		Select selectCarMaker = new Select(usedCarsSearchPageLocators.carMakerDropDown);
		selectCarMaker.selectByVisibleText(carBrand);
	}
	
	public void selectCarModel(String carModel) {
		Select selectCarMaker = new Select(usedCarsSearchPageLocators.selectModelDropDown);
		selectCarMaker.selectByVisibleText(carModel);
	}
	
	public void selectCarLocation(String location) {
		Select selectCarMaker = new Select(usedCarsSearchPageLocators.selectLocation);
		selectCarMaker.selectByVisibleText(location);
	}
	
	public void selectCarPrice(String carPrice) {
		Select selectCarMaker = new Select(usedCarsSearchPageLocators.selectPrice);
		selectCarMaker.selectByVisibleText(carPrice);
	}
	
	public void clickOnFindMyNextCarButton() {
		usedCarsSearchPageLocators.findMyNextCarButton.click();
	}
	
	
	
}
