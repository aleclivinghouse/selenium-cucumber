package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class LoginStep {
	
	@Given("^user navigates to facebook website$")
	public void user_navigates_to_facebook_website() throws Throwable {
		System.out.println("@Given -- User navigates to Facebook.com");
	}
	
	@When("^user validates the homepage title$")
	public void user_validates_the_homepage_title() throws Throwable {
		System.out.println("@When -- the homepage title is correct");
	}
	
	@Then("^user entered the username$")
	public void user_entered_the_username() throws Throwable {
		System.out.println("@Then -- the user entered the username");
	}
	
	@Then("^user entered the password$")
	public void user_entered_the_password() throws Throwable {
		System.out.println("@Then -- the user entered the password");
	}
	
	@Then("^user should be successfully logged in$")
	public void user_should_be_successfully_logged_in() throws Throwable {
		System.out.println("@Then -- the user entered is successfully logged in");
	}
	
	
}
