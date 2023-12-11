package stepdefination;

import java.util.List;
import java.util.Map;

import crossbrowsing.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.pages.Graphpage;
import pageobject.pages.Loginpage;
import pageobject.pages.Registerpage;

public class Graph {
	
	private Graphpage graphpage= new Graphpage(DriverFactory.getDriver());
    private Loginpage loginpage= new Loginpage(DriverFactory.getDriver());
	
	@Given("user has logged to the application")
	public void user_has_logged_to_the_application(DataTable dataTable) {
		List<Map<String, String>> credList=dataTable.asMaps();
		String userNm=credList.get(0).get("username");
		String passW=credList.get(0).get("password");
		DriverFactory.getDriver().get(Graphpage.baseUrl+"home");
		loginpage.doLogin(userNm, passW);
		
		
	}
	@Given("User on home page")
	public void user_on_home_page() {
	    
		DriverFactory.getDriver().get(Graphpage.baseUrl+"home");
	}

	@When("user clicks open the Graph")
	public void user_clicks_open_the_graph() {
		graphpage.clickGraph();
	    
	}

	@Then("user click graph topic")
	public void user_click_graph_topic() {
		graphpage.graphTopic();
	    
	}

	@Given("user on graph page")
	public void user_on_graph_page() {
		DriverFactory.getDriver().get(Graphpage.baseUrl+"graph/graph");
	    
	}

	@When("user clicks <Try Here> under the topic of graph")
	public void user_clicks_try_here_under_the_topic_of_graph() {
		graphpage.tryHere();
	    
	}

	@Then("the user should move to a page having an tryEditor with a Run button to test")
	public void the_user_should_move_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
	    
		graphpage.runCode();
	}

	@Given("user comes back graph page")
	public void user_comes_back_graph_page() {
		DriverFactory.getDriver().get(Graphpage.baseUrl+"graph/graph");
	    
	}

	@When("user clicks on Graph Representation")
	public void user_clicks_on_graph_representation() {
	    
		graphpage.graphRepresentation();
	}

	@Then("user clicks <Try Here> under the topic of Graph Representation")
	public void user_clicks_try_here_under_the_topic_of_graph_representation() {
		graphpage.tryHere();
	    
	}

	@Then("User should move to a page having an tryEditor with a Run button to test")
	public void user_should_move_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
		graphpage.runCode();
	    
	}

	@Given("user go back to previous page of graph")
	public void user_go_back_to_previous_page_of_graph() {
	    
		DriverFactory.getDriver().get(Graphpage.baseUrl+"home");
	}

	@When("user clicks Sign out")
	public void user_clicks_sign_out() {
		graphpage.logOut();
	    
	}

	@Then("user comes back to home page")
	public void user_comes_back_to_home_page() {
		graphpage.onHomepage();
	    
	}



	
	
	

}
