package stepdefination;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import crossbrowsing.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.pages.Graphpage;
import pageobject.pages.Loginpage;
import pageobject.pages.Treepage;

public class Tree {
	private Treepage treepage= new Treepage(DriverFactory.getDriver());

private Loginpage loginpage= new Loginpage(DriverFactory.getDriver());
	
	@Given("user has logged to the homepage")
	public void user_has_logged_to_the_application(DataTable dataTable) {
		List<Map<String, String>> credList=dataTable.asMaps();
		String userNm=credList.get(0).get("username");
		String passW=credList.get(0).get("password");
		DriverFactory.getDriver().get(Treepage.baseUrl+"home");
		System.out.println("test println");
		loginpage.doLogin(userNm, passW);
	}
	@Given("user open the homepage")
	public void user_open_the_homepage() {
	    
		DriverFactory.getDriver().get(Treepage.baseUrl);
	}

//	@Given("user clicks sign in button")
//	public void user_clicks_sign_in_button() {
//	    
//	    treepage.clickSignin();
//	}
//
//	
//
//	@When("user enter <username> and <password> values")
//	public void user_enter_username_and_password_values() {
//		treepage.userName();
//		treepage.passWord();
//	    
//	}
//
//	@When("The user clicks login button")
//	public void the_user_clicks_login_button() {
//		treepage.clickLogin();
//	    
//	}
//	
//
//	@Then("The user should be able to open the datastructure page")
//	public void the_user_should_be_able_to_open_the_datastructure_page() {
//	    
//		Assert.assertTrue(treepage.isDataStructure());
//	}
	@Given("user on home page")
	public void user_on_home_page() {
		DriverFactory.getDriver().get(Treepage.baseUrl+"home" );
	}

	@When("user clicks opens the Tree")
	public void user_clicks_opens_the_tree() {
		treepage.openTree();
	    
	}

	@When("user click on overview of tree")
	public void user_click_on_overview_of_tree() {
		treepage.overViewOfT();
	    
	}

	@When("The user clicks <Try Here> under  the topics")
	public void the_user_clicks_try_here_under_the_topics() {
	    
		treepage.tryHere();
	}

	@Then("The user enter to a page having an tryEditor with a Run button to test")
	public void the_user_enter_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
		treepage.clickRun();
	    
	}

	@Given("user go previous page")
	public void user_go_previous_page() {
		DriverFactory.getDriver().get(Treepage.baseUrl+"tree/overview-of-trees" );
	    
	}

	@Given("user clicks on Terminologies button")
	public void user_clicks_on_terminologies_button() {
		treepage.termiNologies();
	    
	}

	@When("The user clicks <Try Here> under  the topic Terminologies")
	public void the_user_clicks_try_here_under_the_topic_terminologies() {
	    
		treepage.tryHere();
	}

	@Then("The user should move to a page having an tryEditor with a Run button to test")
	public void the_user_should_move_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
		treepage.clickRun();
	    
	}

	@Given("user come to previous page")
	public void user_come_to_previous_page() {
		DriverFactory.getDriver().get(Treepage.baseUrl+"tree/overview-of-trees" );
	    
	}

	@Given("user clicks on Types of Trees")
	public void user_clicks_on_types_of_trees() {
	    
		treepage.typeofTrees();
	}

	@When("the user clicks <Try Here> under the topic")
	public void the_user_clicks_try_here_under_the_topic() {
		treepage.tryHere();
	    
	}

	@Then("user on page having an tryEditor with a Run Button to test")
	public void user_on_page_having_an_try_editor_with_a_run_button_to_test() {
	    
		treepage.clickRun();
	}

	@Given("user go back")
	public void user_go_back() {
		DriverFactory.getDriver().get(Treepage.baseUrl+"tree/overview-of-trees" );
	    
	}

	@Given("user clicks Tree Traversals")
	public void user_clicks_tree_traversals() {
	    
		treepage.treeTraversals();
	}

	@When("user clicks <Try Here> under topic of Tree Traversals")
	public void user_clicks_try_here_under_topic_of_tree_traversals() {
	    
		treepage.tryHere();
	}

	@Then("The user  move to a page having an tryEditor with a Run button to test")
	public void the_user_move_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
	    
		treepage.clickRun();
	}

	@Given("the user come to previous page")
	public void the_user_come_to_previous_page() {
		DriverFactory.getDriver().get(Treepage.baseUrl+"tree/overview-of-trees" );
	    
	}

	@Given("user clicks Traversals Illustration")
	public void user_clicks_traversals_illustration() {
		treepage.traverIllusT();
	    
	}

	@When("user clicks <Try Here> under the topic of Traversals Illustration")
	public void user_clicks_try_here_under_the_topic_of_traversals_illustration() {
		treepage.tryHere();
	    
	}

	@Then("The user should move  a page having an tryEditor with a Run button to test")
	public void the_user_should_move_a_page_having_an_try_editor_with_a_run_button_to_test() {
	    
		treepage.clickRun();
	}

	@Given("user on previous page")
	public void user_on_previous_page() {
		DriverFactory.getDriver().get(Treepage.baseUrl+"tree/overview-of-trees" );
	    
	}

	@Given("user clicks Binary Trees")
	public void user_clicks_binary_trees() {
		treepage.binaryTrees();
	    
	}

	@When("user clicks <Try Here> under the topic of Binary Trees")
	public void user_clicks_try_here_under_the_topic_of_binary_trees() {
		treepage.tryHere();
	    
	}

	@Then("user should move to a page having an tryEditor with a Run button to test")
	public void user_should_move_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
		treepage.clickRun();
	    
	}

	@Given("the user go back")
	public void the_user_go_back() {
		DriverFactory.getDriver().get(Treepage.baseUrl+"tree/overview-of-trees" );
	    
	}

	@Given("user clicks Types of Binary Trees")
	public void user_clicks_types_of_binary_trees() {
	    
		treepage.typeOfBinaryT();
	}

	@When("user clicks <Try Here> under the topic of Types of Binary Trees")
	public void user_clicks_try_here_under_the_topic_of_types_of_binary_trees() {
	    
		treepage.tryHere();
	}

	@Then("The user on a page having an tryEditor with a Run button to test")
	public void the_user_on_a_page_having_an_try_editor_with_a_run_button_to_test() {
		treepage.clickRun();
	    
	}

	@Given("the user on previous page")
	public void the_user_on_previous_page() {
		DriverFactory.getDriver().get(Treepage.baseUrl+"tree/overview-of-trees" );
	    
	}

	@Given("user clicks implementation in python")
	public void user_clicks_implementation_in_python() {
		treepage.immplInPTn();
	    
	}

	@When("user clicks <Try Here> under the topic of implementation in python")
	public void user_clicks_try_here_under_the_topic_of_implementation_in_python() {
		treepage.tryHere();
	    
	}

	@Then("user should move a page having an tryEditor with a Run button to test")
	public void user_should_move_a_page_having_an_try_editor_with_a_run_button_to_test() {
	    
		treepage.clickRun();
	}

	@Given("user go  again previous")
	public void user_go_again_previous() {
		DriverFactory.getDriver().get(Treepage.baseUrl+"tree/overview-of-trees" );
	    
	}

	@Given("user clicks on binary tree trversals")
	public void user_clicks_on_binary_tree_trversals() {
		treepage.binaryTrees();
	    
	}

	@When("user clicks <Try Here> under the topic of binary tree trversals")
	public void user_clicks_try_here_under_the_topic_of_binary_tree_trversals() {
		treepage.tryHere();
	    
	}

	@Then("The user should move to a page  and tryEditor with a Run button to test")
	public void the_user_should_move_to_a_page_and_try_editor_with_a_run_button_to_test() {
		treepage.clickRun();
	    
	}

	@Given("user goes previous page")
	public void user_goes_previous_page() {
		DriverFactory.getDriver().get(Treepage.baseUrl+"tree/overview-of-trees" );
	    
	}

	@Given("user clicks Implementation of binary trees")
	public void user_clicks_implementation_of_binary_trees() {
		treepage.implBinaryT();
	    
	}

	@When("user clicks <Try Here> under the topic of Implementation of binary trees")
	public void user_clicks_try_here_under_the_topic_of_implementation_of_binary_trees() {
		treepage.tryHere();
	    
	}

	@Then("user on page have tryEditor with a Run Button to test")
	public void user_on_page_have_try_editor_with_a_run_button_to_test() {
		treepage.clickRun();
	    
	}

	@Given("the user move back to previous page")
	public void the_user_move_back_to_previous_page() {
		DriverFactory.getDriver().get(Treepage.baseUrl+"tree/overview-of-trees" );
	    
	}

	@Given("user clicks application of binary trees")
	public void user_clicks_application_of_binary_trees() {
		treepage.appBinaryT();
	    
	}

	@When("user clicks <Try Here> under the topic of application of binary trees")
	public void user_clicks_try_here_under_the_topic_of_application_of_binary_trees() {
	    
		treepage.tryHere();
	}

	@Then("user will go a page having an tryEditor with a Run Button to test")
	public void user_will_go_a_page_having_an_try_editor_with_a_run_button_to_test() {
		treepage.clickRun();
	    
	}

	@Given("the user go back again")
	public void the_user_go_back_again() {
	    
		DriverFactory.getDriver().get(Treepage.baseUrl+"tree/overview-of-trees" );
	}

	@Given("user clicks Binary search tree")
	public void user_clicks_binary_search_tree() {
	    
		treepage.binarySearchT();
	}

	@Then("user clicks <Try Here> under the topic of Binary search tree")
	public void user_clicks_try_here_under_the_topic_of_binary_search_tree() {
		treepage.tryHere();
	    
	}

	@When("user enter to a page having an tryEditor with a Run button to test")
	public void user_enter_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
	    
		treepage.clickRun();
	}

	@Given("the user move to previous page")
	public void the_user_move_to_previous_page() {
		DriverFactory.getDriver().get(Treepage.baseUrl+"tree/overview-of-trees" );
	    
	}

	@Given("user clicks Implementation of BST")
	public void user_clicks_implementation_of_bst() {
		treepage.implmOfBST();
	    
	}

	@When("user clicks <Try Here> under the topic of Implementation of BST")
	public void user_clicks_try_here_under_the_topic_of_implementation_of_bst() {
		treepage.tryHere();
	    
	}

	@When("The user enter to  page having an tryEditor with a Run button to test")
	public void the_user_enter_to_page_having_an_try_editor_with_a_run_button_to_test() {
		treepage.clickRun();
	    
	}

	@Then("the enter to previous page")
	public void the_enter_to_previous_page() {
		DriverFactory.getDriver().get(Treepage.baseUrl+"tree" );
	    
	}




}
