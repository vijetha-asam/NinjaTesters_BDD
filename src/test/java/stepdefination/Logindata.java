package stepdefination;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import crossbrowsing.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.pages.Logindatapage;
import pageobject.pages.Loginpage;
import utilities.ElementUtilities;

public class Logindata {
	
	private Logindatapage logindatapage= new Logindatapage(DriverFactory.getDriver());
	
	@Given("usre on login page")
	public void usre_on_login_page() {
		DriverFactory.getDriver().get(Logindatapage.baseUrl);
	    
	}

	@When("user fills the sheet from given sheetname {string} andrownumber {int}")
	public void user_fills_the_sheet_from_given_sheetname_andrownumber(String sheetName, Integer rowNumber) {
	    
		ElementUtilities reader= new ElementUtilities();
		try {
			List<Map<String,String>> testData= reader.getData("E:\\excel\\datadriven.xlsx", sheetName);
			String username=testData.get(rowNumber).get("username");
			String password=testData.get(rowNumber).get("password");
			System.out.println("Username: " + username +" Password: " + password);
			logindatapage.fillLoginsheet(username, password);
			
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("user click login button")
	public void user_click_login_button() {
		logindatapage.clickLogin();
	    
	}

	@Then("user enters homepage")
	public void user_enters_homepage() {
		logindatapage.isDatastructureExist();
	    
	}

	
	

}
