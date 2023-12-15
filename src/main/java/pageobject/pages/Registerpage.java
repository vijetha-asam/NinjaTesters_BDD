package pageobject.pages;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Registerpage {
	
	private  WebDriver driver;
	// By locators
	private By getstarted=By.xpath("//a[@href='/home']");
	private By register=By.xpath("//a[@href='/register']");
	private By usernm=By.xpath("//input[@id='id_username']");
	private By passwrd=By.xpath("//input[@id='id_password1']");
	private By passconf=By.xpath("//input[@id='id_password2']");
	private By regst=By.xpath("//input[@value='Register']");
	private By datastructure=By.xpath("//div[@id='navbarCollapse']//div//");
	
	public static String baseUrl = "https://dsportalapp.herokuapp.com/";
	
	//Constructor of page
	public Registerpage(WebDriver driver) {
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	

	public void getStarted() {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofMillis(100))
				.ignoring(ElementClickInterceptedException.class)
				.ignoring(NoSuchElementException.class);
		
		WebElement getstarted =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/home']")));
		getstarted.click();
	}
	public boolean isDatastructureExist() {
		return driver.findElement(datastructure).isDisplayed();
	}
	
	public void registration() {
		driver.findElement(register).click();
	}
	public void entUsername(String username) {
		driver.findElement(usernm).click();
	}
	

		public void entPassword(String password) {
		driver.findElement(passwrd).click();
		}
		public void entConfpassword(String confpassword) {
		driver.findElement(passconf).click();
	}
	
		public void clickRegister() {
			driver.findElement(regst).click();
		}
	
}
