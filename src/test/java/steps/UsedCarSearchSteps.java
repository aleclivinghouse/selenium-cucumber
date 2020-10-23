package steps;

import java.util.List;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.UsedCarsSearchPageActions;
import pages.actions.CarsGuideHomePageActions;
import utils.SeleniumDriver;

public class UsedCarSearchSteps{
	
	CarsGuideHomePageActions carsGuideHomePageActions = new CarsGuideHomePageActions();
	UsedCarsSearchPageActions usedCarsSearchPageActions= new UsedCarsSearchPageActions();
	
	@Given("^I am on the Home Page \"([^\"]*)\" of CarsGuide Website$")
	public void i_am_on_the_Home_Page_of_CarsGuide_website(String webSiteURL) {
		SeleniumDriver.openPage(webSiteURL);
	}
	
	@When("^I move to Car For Sale Menu$")
	public void i_move_to_Car_For_Sale_Menu(List<String> list) {
		carsGuideHomePageActions.moveToCarsForSaleMenu();
	}
	
	@And("^click on \"([^\"]*)\" link$")
	public void click_on_link(String searchcars)  {
	    //SeleniumDriver.waitForPageToLoad();
		carsGuideHomePageActions.clickOnUsedCarsSearchMenu();
	}
	
	@And("^select carbrand as \"([^\"]*)\" from AnyMake dropdown$")
	public void select_from_dropdown(String carBrand) throws InterruptedException  {
		 SeleniumDriver.waitForPageToLoad();
		 usedCarsSearchPageActions.selectCarMake(carBrand);
		System.out.println("Car Brand selected");  
	}
	
	@And("^select \"([^\"]*)\" as car model$")
	public void select_car_model(String carModel) throws InterruptedException {
		 Thread.sleep(3000);
		 usedCarsSearchPageActions.selectCarModel(carModel);
	    
	}
	
	@And("^select location as \"([^\"]*)\" from SelectLocation dropdown$")
	public void select_location_from_dropdown(String location)  {
		 SeleniumDriver.waitForPageToLoad();
		 usedCarsSearchPageActions.selectCarLocation(location);
	}

	@And("^select \"([^\"]*)\" as price$")
	public void select_price(String price)  {
		 SeleniumDriver.waitForPageToLoad();
		 usedCarsSearchPageActions.selectCarPrice(price);
	    
	}
	
	@And("^click on Find_My_Next_Car button$")
	public void click_on_Button()  {
		 SeleniumDriver.waitForPageToLoad();
		 usedCarsSearchPageActions.clickOnFindMyNextCarButton();
	}

	@Then("^I should see list of searched cars$")
	public void i_should_see_list_of_searched_cars()  {
	    
	    System.out.println("Car List Found");
	}


	@And("^the page title should be \"([^\"]*)\"$")
	public void the_page_title_should_be(String expectedPageTitle)  {
	    String ActualPageTitle= SeleniumDriver.getDriver().getTitle();
	    System.out.println("Actual page title-->"+ActualPageTitle);
	    System.out.println("Expected page title-->"+expectedPageTitle);
	    Assert.assertEquals(expectedPageTitle, ActualPageTitle);
	 
	}

}