package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class CarsGuideHomePageLocators {
	
	@FindBy(how=How.LINK_TEXT,using="Cars For Sale")
	public WebElement carsForSaleLink;
	
	@FindBy(how=How.LINK_TEXT,using="Sell My Car")
	public WebElement sellMyCarLink;
	
	@FindBy(how=How.LINK_TEXT,using="Car Reviews")
	public WebElement carReviewsLink;
	
	@FindBy(how=How.LINK_TEXT,using="Search Cars")
	public WebElement searchCarsLink;
	
	@FindBy(how=How.LINK_TEXT,using="buy + sell")
	public WebElement navItem;
	
	@FindBy(how=How.LINK_TEXT,using="Used")
	public WebElement usedSearchCarsLink;
	
}
