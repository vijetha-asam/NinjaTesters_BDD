package pageobject.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Arraypage {
	
	private WebDriver driver;
	

	By getstarted=By.xpath("(//a[contains(text(),'Get Started')])[2]");
	By link1=By.xpath("//a[contains(text(),'Arrays in Python')]");
	By tryhere=By.xpath("//a[@class='btn btn-info' and @href='/tryEditor' ]");
	By editor=By.xpath("//textarea[@autocorrect='off']");
	By button=By.xpath("//button[@type='button']");
	By link2=By.xpath("//a[contains(text(),'Arrays Using List')]");
	By link3=By.xpath("//a[contains(text(),'Basic Operations in Lists')]");
	By link4=By.xpath("//a[contains(text(),'Applications of Array')]");
	By run=By.xpath("//button[@type='button' and @onclick='runit()' ]");
	public static String baseUrl="https://dsportalapp.herokuapp.com/";
	//Constructor
	public Arraypage(WebDriver driver) {
		this.driver=driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
    public void clickArray() {
    	driver.findElement(getstarted).click();
    }
    public void arrayINpython() {
    	driver.findElement(link1).click();
    }
	public void tryHere() {
		driver.findElement(tryhere).click();
		
	}
	 public void runCode() {
		 WebElement codeMirror = driver.findElement(By.className("CodeMirror"));

		 		
		 		WebElement codeLine = codeMirror.findElements(By.className("CodeMirror-line")).get(0);
		 		codeLine.click();


		 		WebElement txtbx = codeMirror.findElement(By.cssSelector("textarea"));
		 		txtbx.sendKeys("print'Hello World'");  
		 		driver.findElement(run).click();
}
	 public void arrayUsingList() {
		 driver.findElement(link2).click();
	 }
	 public void basicOperINL() {
		 driver.findElement(link3).click();
	 }
	 public void applicationsOFA() {
		 driver.findElement(link4).click();
	 }
}