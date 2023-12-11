package stepdefination;



import org.junit.Assert;

import crossbrowsing.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.pages.Registerpage;


public class Register {

	private Registerpage registerpage= new Registerpage(DriverFactory.getDriver());
	
	@Given("User opens the Ds Algo portal link")
	public void user_opens_the_ds_algo_portal_link() {
		
	    DriverFactory.getDriver().get(Registerpage.baseUrl);
	    
	}

	@When("The user clicks the Get Started button")
	public void the_user_clicks_the_get_started_button()  {
	    
	    registerpage.getStarted();
	}

	@Then("The user on  homepage")
	public void the_user_on_homepage( ) {
	    
	   Assert.assertTrue( registerpage.isDatastructureExist());
	}
	@Given("User opens the homepage")
	public void user_opens_the_homepage() {
		DriverFactory.getDriver().get(Registerpage.baseUrl+"home");
	}

	@Given("User clicks Register")
	public void user_clicks_register() {
	    registerpage.getStarted();
	    
	}

	@When("User should redirected to register page")
	public void user_should_redirected_to_register_page() {
		DriverFactory.getDriver().get(Registerpage.baseUrl+"register");
	    
	}
	@When("User enters username {string}") 
	public void user_enters_username(String username) {
	    
		registerpage.entUsername(username);
	}

	@When("user enters password {string}")
	public void user_enters_password(String password) {
	    
		registerpage.entPassword(password);
	}

	@When("user enters confpassword {string}")
	public void user_enters_confpassword(String confpassword) {
		registerpage.entConfpassword(confpassword);
	   
	}



	@When("User click the Register button")
	public void user_click_the_button() {
	    
		registerpage.clickRegister();
	}
}
