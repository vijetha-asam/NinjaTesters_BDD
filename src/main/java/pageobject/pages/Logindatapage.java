package pageobject.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logindatapage {

	private WebDriver driver;
	
	private By usernm=By.xpath("//input[@id='id_username']");
	private By passwrd=By.xpath("//input[@id='id_password']");
	private By login=By.xpath("//input[@value='Login']");
	private By datastructure=By.xpath("//div[@id='navbarCollapse']//div//a");
	
public static String baseUrl="https://dsportalapp.herokuapp.com/login";
	
	//Constructor
	public Logindatapage(WebDriver driver) {
		this.driver=driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
	}
	public void fillLoginsheet(String usrnm, String passwd){
		
	driver.findElement(usernm).sendKeys(usrnm);
	driver.findElement(passwrd).sendKeys(passwd);
		
	}
	
	public void clickLogin() {
		driver.findElement(login);
	}
	
	public boolean isDatastructureExist() {
		return driver.findElement(datastructure).isDisplayed();
	}
	
	
	
}
