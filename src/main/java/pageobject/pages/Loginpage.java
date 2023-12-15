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

public class Loginpage {
	
	private WebDriver driver;
	private By getstarted=By.xpath("//button[@class='btn']");
	private By Signin=By.xpath("//div[@id='navbarCollapse']//div[2]//ul//a[3]");
	private By usernm=By.xpath("//input[@id='id_username']");
	private By passwrd=By.xpath("//input[@id='id_password']");
	private By login=By.xpath("//input[@value='Login']");
	private By datastructure=By.xpath("//div[@id='navbarCollapse']//div//a");
	
	public static String baseUrl="https://dsportalapp.herokuapp.com/";
	
	//Constructor
	public Loginpage(WebDriver driver) {
		this.driver=driver;
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
	public void clickSignin() {
		driver.findElement(Signin).click();
	}
	public void userName() {
		driver.findElement(usernm);
	}
	public void passWord() {
		driver.findElement(passwrd);
	}
	public void clickLogin() {
		driver.findElement(login);
	}
	public Loginpage doLogin(String usNm, String psWd) {
		driver.findElement(Signin).click();
		driver.findElement(usernm).sendKeys(usNm);;
		driver.findElement(passwrd).sendKeys(psWd);
		driver.findElement(login).click();
		return new Loginpage(driver);
	}
}
