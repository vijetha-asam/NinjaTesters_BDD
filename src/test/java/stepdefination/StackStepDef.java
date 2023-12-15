package stepdefination;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import crossbrowsing.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.pages.Graphpage;
import pageobject.pages.Loginpage;
import pageobject.pages.StackPage;


public class StackStepDef {
	
	
	private StackPage stackpage= new StackPage(DriverFactory.getDriver());
    private Loginpage loginpage= new Loginpage(DriverFactory.getDriver());
	
    @Given("THE user has logged on application")
    public void the_user_has_logged_on_application(DataTable dataTable) {
		List<Map<String, String>> credList=dataTable.asMaps();
		String userNm=credList.get(0).get("username");
		String passW=credList.get(0).get("password");
		DriverFactory.getDriver().get(StackPage.baseUrl+"home");
		loginpage.doLogin(userNm, passW);
		
		
	}

    @Given("user on Stack page")
    public void user_on_stack_page() {
    	DriverFactory.getDriver().get(Graphpage.baseUrl+"stack");
    }

	

	@When("when user the clicks the operations in stack link")
	public void when_user_the_clicks_the_operations_in_stack_link() {
		stackpage.firstlink();

	}
	@When("user clicks try here button")
	public void user_clicks_try_here_button() {
		stackpage.tryHerebtn();
	}
	@Then("click  run button and check the output")
	public void click_run_button_and_check_the_output() {
		stackpage.enterText();
		stackpage.runbtn();
	}

	@When("when user the clicks the implementation link")
	public void when_user_the_clicks_the_implementation_link() {
		stackpage.secondlink();
		
		

	}

	@When("when user the clicks the applications link")
	public void when_user_the_clicks_the_applications_link() {
		stackpage.thirdlink();
		
	}
	
	 

	
	/*
	 * @After public void tearDown() { DriverFactory.quitDriver(); }
	 */
	 
}
