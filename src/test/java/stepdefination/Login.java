package stepdefination;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import crossbrowsing.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.pages.Loginpage;

public class Login {
	
	private Loginpage loginpage= new Loginpage(DriverFactory.getDriver());
	
	@Given("browser is home page")
	public void browser_is_home_page() {
		DriverFactory.getDriver().get(Loginpage.baseUrl);
	    
	}

	@When("click on getstart button")
	public void click_on_getstart_button() {
		loginpage.getStarted();
	    
	}

	@Then("user redirected to home page")
	public void user_redirected_to_home_page() {
		Assert.assertTrue( loginpage.isDatastructureExist());
	    
	}

	@Given("user on the home page")
	public void user_on_the_home_page() {
		DriverFactory.getDriver().get(Loginpage.baseUrl+"home");
	    
	}

	@When("user clicks on sign in")
	public void user_clicks_on_sign_in() {
	    
		loginpage.clickSignin();
	}

//	@When("user enters <username> and <password>")
//	public void user_enters_username_and_password() {
//		loginpage.userName();
//		loginpage.passWord();
//	} 
	
		
	    
	
@Then("user clicks on loginpage")
	public void user_clicks_on_login(DataTable dataTable) {
	List<Map<String, String>> credList=dataTable.asMaps();
	String userNm=credList.get(0).get("username");
	String passW=credList.get(0).get("password");
	loginpage.doLogin(userNm, passW);
}
}
