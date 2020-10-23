package pages.actions;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



import pages.locators.CarSearchPageLocators;
import utils.SeleniumDriver;

public class CarSearchPageActions {
	
	CarSearchPageLocators carSearchPageLocators = null;
	
	public CarSearchPageActions(){
		this.carSearchPageLocators = new CarSearchPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carSearchPageLocators);
	}
	
	public void selectCarMake(String carBrand) {
		Select selectCarMaker = new Select(carSearchPageLocators.carMakerDropDown);
		selectCarMaker.selectByVisibleText(carBrand);
	}
	
	public void selectCarModel(String carModel) {
		Select selectCarMaker = new Select(carSearchPageLocators.selectModelDropDown);
		selectCarMaker.selectByVisibleText(carModel);
	}
	
	public void selectCarLocation(String location) {
		Select selectCarMaker = new Select(carSearchPageLocators.selectLocation);
		selectCarMaker.selectByVisibleText(location);
	}
	
	public void selectCarPrice(String carPrice) {
		Select selectCarMaker = new Select(carSearchPageLocators.selectPrice);
		selectCarMaker.selectByVisibleText(carPrice);
	}
	
	public void clickOnFindMyNextCarButton() {
		carSearchPageLocators.findMyNextCarButton.click();
	}
	
	
	
	
}
