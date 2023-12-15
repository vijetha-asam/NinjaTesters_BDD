package stepdefination;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import crossbrowsing.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.pages.Graphpage;
import pageobject.pages.Loginpage;
import pageobject.pages.QueuePage;


public class QueueStepDef {
	private QueuePage queuepage= new QueuePage(DriverFactory.getDriver());
    private Loginpage loginpage= new Loginpage(DriverFactory.getDriver());
	
	@Given("user has logged to the applicationpage")
	public void user_has_logged_to_the_applicationpage(DataTable dataTable) {
		List<Map<String, String>> credList=dataTable.asMaps();
		String userNm=credList.get(0).get("username");
		String passW=credList.get(0).get("password");
		DriverFactory.getDriver().get(QueuePage.baseUrl+"home");
		loginpage.doLogin(userNm, passW);
	}

	
	
		@Given("user on Queue page")
		public void user_on_queue_page() {
			DriverFactory.getDriver().get(Graphpage.baseUrl+"queue");
	}

	@When("when user the clicks the Implementation of Queue in Python link")
	public void when_user_the_clicks_the_implementation_of_queue_in_python_link() {
		queuepage.firstqueuelink();
	}
	@When("user clicks try here")
	public void user_clicks_try_here() {
		queuepage.tryHerebtn();
	}
	@Then("click the run button and check  output")
	public void click_the_run_button_and_check_output() {
		queuepage.enterText();
	}
	@Given("the user on Queue page")
	public void the_user_on_queue_page() {
		DriverFactory.getDriver().get(Graphpage.baseUrl+"queue");
	}

	@When("when user the clicks the Implementation using collections.deque link")
	public void when_user_the_clicks_the_implementation_using_collections_deque_link() {
		queuepage.secondqueuelink();
	}
	@Given("user on Queue page application")
	public void user_on_queue_page_application() {
		DriverFactory.getDriver().get(Graphpage.baseUrl+"queue");
	}

	@When("when user the clicks the Implementation using array link")
	public void when_user_the_clicks_the_implementation_using_array_link() {
		queuepage.thirdqueuelink();
	}
	@Given("user on the Queue page")
	public void user_on_the_queue_page() {
		DriverFactory.getDriver().get(Graphpage.baseUrl+"queue");
	}

	@When("when user the clicks the Queue Operations link")
	public void when_user_the_clicks_the_queue_operations_link() {
		queuepage.fourthqueuelink();
	}




}
