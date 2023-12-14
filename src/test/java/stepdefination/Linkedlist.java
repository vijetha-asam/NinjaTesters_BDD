package stepdefination;

import java.util.List;
import java.util.Map;

import crossbrowsing.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageobject.pages.Linkedlistpage;
import pageobject.pages.Loginpage;

public class Linkedlist {
	
	private Linkedlistpage linkedlistpage= new Linkedlistpage(DriverFactory.getDriver());
    private Loginpage loginpage= new Loginpage(DriverFactory.getDriver());
    
    @Given("the user has logged to the application")
    public void the_user_has_logged_to_the_application(DataTable dataTable){
		List<Map<String, String>> credList=dataTable.asMaps();
		String userNm=credList.get(0).get("username");
		String passW=credList.get(0).get("password");
		DriverFactory.getDriver().get(Linkedlistpage.baseUrl+"home");
		loginpage.doLogin(userNm, passW);
		
    }
    @Given("User on the home page")
	public void user_on_the_home_page() {
	    
		DriverFactory.getDriver().get(Linkedlistpage.baseUrl+"home");
	}
	
	@Then("user clicks Linked List get started button")
	public void user_clicks_linked_list_get_started_button() {
	    
		linkedlistpage.linkedstartfn();
	}

	@Given("The user is in the Linked List  page after logged in")
	public void the_user_is_in_the_linked_list_page_after_logged_in() {
	    
		DriverFactory.getDriver().get(Linkedlistpage.baseUrl+"linked-list");
	}

	@When("The user clicks Introduction button")
	public void the_user_clicks_introduction_button() {
		linkedlistpage.list1fn();
	   
	}

	@When("The user clicks <Try Here> button")
	public void the_user_clicks_try_here_button() {
		linkedlistpage.tryHere();
	   
	}

	@Then("The user should be redirected to a page having an tryEditor with Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_run_button_to_test() {
		linkedlistpage.runCode();
	}

	@When("The user clicks the Creating a Linked List button")
	public void the_user_clicks_the_creating_a_linked_list_button() {
		linkedlistpage.list2fn();
	   
	}
	@Then("user should be redirected to a page having an tryEditor with  Run button to test")
	public void user_should_be_redirected_to_a_page_having_an_try_editor_with_run_button_to_test() {
		
	}

	@When("The user clicks the Types of Linked List button")
	public void the_user_clicks_the_types_of_linked_list_button() {
	    
		linkedlistpage.list3fn();
	}
	@Then("The user should  redirected to a page having an tryEditor with  Run button to test")
	public void the_user_should_redirected_to_a_page_having_an_try_editor_with_run_button_to_test() {
		
	}

	@When("The user clicks the Implement Linked List in Python button")
	public void the_user_clicks_the_implement_linked_list_in_python_button() {
	    
		linkedlistpage.list4fn();
	}
	@Then("The user should be redirected to  page having an tryEditor with  Run button to test")
	public void the_user_should_be_redirected_to_page_having_an_try_editor_with_run_button_to_test() {
		
	}

	@When("The user clicks the Traversal button")
	public void the_user_clicks_the_traversal_button() {
		linkedlistpage.list5fn();
	   
	}
	@Then("The user should be redirected to a page having  tryEditor with  Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_try_editor_with_run_button_to_test() {
		
	}

	@When("The user clicks the Insertion button")
	public void the_user_clicks_the_insertion_button() {
	    
		linkedlistpage.list6fn();
	}
	@Then("user should be redirected to  page having an tryEditor with  Run button to test")
	public void user_should_be_redirected_to_page_having_an_try_editor_with_run_button_to_test() {
		
	}

	@When("The user clicks the Deletion button")
	public void the_user_clicks_the_deletion_button() {
		linkedlistpage.list7fn();
	   
	}


	

}
