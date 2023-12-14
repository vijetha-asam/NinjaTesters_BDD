package stepdefination;

import java.util.List;
import java.util.Map;

import crossbrowsing.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.pages.Datastructurepage;
import pageobject.pages.Graphpage;
import pageobject.pages.Loginpage;

public class Datastructure {
	
	private Datastructurepage datastructurepage= new Datastructurepage(DriverFactory.getDriver());
    private Loginpage loginpage= new Loginpage(DriverFactory.getDriver());
	@Given("user has logged on the application")
	public void user_has_logged_on_the_application(DataTable dataTable) {
	  
		List<Map<String, String>> credList=dataTable.asMaps();
		String userNm=credList.get(0).get("username");
		String passW=credList.get(0).get("password");
		DriverFactory.getDriver().get(Datastructurepage.baseUrl+"home");
		loginpage.doLogin(userNm, passW);
		
	}

	@Given("User clicks the Get Started button")
	public void user_clicks_the_get_started_button() {
		DriverFactory.getDriver().get(Graphpage.baseUrl+"home");
		datastructurepage.dsgetstartbtn();
	}

	@When("when user the clicks the time complexity link")
	public void when_user_the_clicks_the_time_complexity_link() {
		datastructurepage.timecomplexlink();
	    
	}

	@When("user clicks try here>>>")
	public void user_clicks_try_here() {
		datastructurepage.tryHere();
	    
	}

	@Then("validate the python editor code")
	public void validate_the_python_editor_code() {
		datastructurepage.runCode();
	    
	}

	


}
