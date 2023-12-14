package stepdefination;

import java.util.List;
import java.util.Map;

import crossbrowsing.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.pages.Arraypage;

import pageobject.pages.Loginpage;

public class Array {
	private Arraypage arraypage= new Arraypage(DriverFactory.getDriver());
    private Loginpage loginpage= new Loginpage(DriverFactory.getDriver());
    
    @Given("user has logged to the application page")
	public void user_has_logged_to_the_application(DataTable dataTable) {
		List<Map<String, String>> credList=dataTable.asMaps();
		String userNm=credList.get(0).get("username");
		String passW=credList.get(0).get("password");
		DriverFactory.getDriver().get(Arraypage.baseUrl+"home");
		loginpage.doLogin(userNm, passW);
    }
	
	@Given("The user is in the Home page after login")
	public void the_user_is_in_the_home_page_after_login() {
		DriverFactory.getDriver().get(Arraypage.baseUrl+"home");  
	    
	}

	@When("user clicks Array Get Started button")
	public void user_clicks_array_get_started_button() {
	    
	    arraypage.clickArray();
	}

	@Then("user redirected to array page")
	public void user_redirected_to_array_page() {
		System.out.println("On Array Page");
	    
	}

	@Given("user on Array page")
	public void user_on_array_page() {
	    
		DriverFactory.getDriver().get(Arraypage.baseUrl+"array");
	}

	@When("The user clicks Arrays in Python button")
	public void the_user_clicks_arrays_in_python_button() {
	    
		arraypage.arrayINpython();
	}

	@Then("The user clicks <Try Here> button in the Array Python")
	public void the_user_clicks_try_here_button_in_the_array_python() {
		arraypage.tryHere();
	    
	}

	@Then("The user should be redirected to a page having an tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
	    
		arraypage.runCode();
	}

	@Given("The user is in the Array page after logged in")
	public void the_user_is_in_the_array_page_after_logged_in() {
		DriverFactory.getDriver().get(Arraypage.baseUrl+"array/arrays-in-python");
	    
	}

	@When("The user clicks Arrays Using List button")
	public void the_user_clicks_arrays_using_list_button() {
	    
		arraypage.arrayUsingList();
	}

	@Then("The user should be redirected to Arrays using List page")
	public void the_user_should_be_redirected_to_arrays_using_list_page() {
	    
		DriverFactory.getDriver().get(Arraypage.baseUrl+"array/arrays-in-python");
	}

	@Given("The user is in the Applications of Array page after logged in")
	public void the_user_is_in_the_applications_of_array_page_after_logged_in() {
		DriverFactory.getDriver().get(Arraypage.baseUrl+"array/arrays-in-python");
	    
		arraypage.applicationsOFA();
	}

	@When("The user clicks <Try Here> button in Arrays Using Lists page")
	public void the_user_clicks_try_here_button_in_arrays_using_lists_page() {
		arraypage.tryHere();
	    
	}

	@When("The user clicks Basic Operations in Lists button")
	public void the_user_clicks_basic_operations_in_lists_button() {
		arraypage.basicOperINL();
	    
	}

	@Then("The user should be redirected to Basic Operations in List page")
	public void the_user_should_be_redirected_to_basic_operations_in_list_page() {
		DriverFactory.getDriver().get(Arraypage.baseUrl+"array/arrays-in-python");
	    
	}

}
