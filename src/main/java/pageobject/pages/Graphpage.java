package pageobject.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Graphpage {
	
	private WebDriver driver;
	By getstarted=By.xpath("//button[@class='btn']");
	By Signin=By.xpath("//div[@id='navbarCollapse']//div[2]//ul//a[3]");
	By usernm=By.xpath("//input[@id='id_username']");
	By passwrd=By.xpath("//input[@id='id_password']");
	By login=By.xpath("//input[@value='Login']");
	By graphgetstarted=By.xpath("//a[@class='align-self-end btn btn-lg btn-block btn-primary' and @href='graph']");
	By graphtopic=By.xpath("//a[@class='list-group-item' and @href='graph']");
	By Tryhere=By.xpath("//a[@class='btn btn-info' and @href='/tryEditor' ]");
	By run=By.xpath("//button[@type='button' and @onclick='runit()' ]");
	By GraphR=By.xpath("//a[@href='/graph/graph-representations/']");
	By logout=By.xpath("//a[@href='/logout']");
	public static String baseUrl="https://dsportalapp.herokuapp.com/";
	//Constructor
	public Graphpage(WebDriver driver) {
		this.driver=driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
    public void clickGraph() {
    	driver.findElement(graphgetstarted).click();
    }
    public void graphTopic() {
    	driver.findElement(graphtopic).click();
    }
    public void tryHere() {
    	driver.findElement(Tryhere).click();
    }
    public void runCode() {
WebElement codeMirror = driver.findElement(By.className("CodeMirror"));

		
		WebElement codeLine = codeMirror.findElements(By.className("CodeMirror-line")).get(0);
		codeLine.click();


		WebElement txtbx = codeMirror.findElement(By.cssSelector("textarea"));
		txtbx.sendKeys("print'Hello World'");  
		driver.findElement(run).click();
    }
	public void graphRepresentation() {
		 driver.findElement(GraphR).click();
	}
	public void logOut() {
		driver.findElement(logout).click();
	}
	public void onHomepage() {
		driver.findElement(Signin).isDisplayed();
	}

}
