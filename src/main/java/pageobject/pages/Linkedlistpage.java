package pageobject.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Linkedlistpage {
	
	private WebDriver driver;

	private By getstarted=By.xpath("//button[@class='btn']");
	private By Signin=By.xpath("//div[@id='navbarCollapse']//div[2]//ul//a[3]");
	private By usernm=By.xpath("//input[@id='id_username']");
	private By passwrd=By.xpath("//input[@id='id_password']");
	private By login=By.xpath("//input[@value='Login']");
	private By datastructure=By.xpath("//div[@id='navbarCollapse']//div//a");
	private By Tryhere=By.xpath("//a[@class='btn btn-info' and @href='/tryEditor' ]");
	private  By run=By.xpath("//button[@type='button' and @onclick='runit()' ]");
	private By linkedliststart=By.xpath("(//a[contains(text(),'Get Started')])[3]");
	
	private By list1=By.xpath("//a[contains(text(),'Introduction')]");
	private By list2=By.xpath("//a[contains(text(),'Creating Linked LIst')]");
	private By list3=By.xpath("//a[contains(text(),'Types of Linked List')]");
	private By list4=By.xpath("//a[contains(text(),'Implement Linked List in Python')]");
	private By list5=By.xpath("//a[contains(text(),'Traversal')]");
	private By list6=By.xpath("//a[contains(text(),'Insertion')]");
	private By list7=By.xpath("//a[contains(text(),'Deletion')]");
	
	public static String baseUrl="https://dsportalapp.herokuapp.com/";
	//Constructor
	public Linkedlistpage(WebDriver driver) {
		this.driver=driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
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
	    public void linkedstartfn()
	    {
	    	driver.findElement(linkedliststart).click();
	    }
	    public void list1fn()
	    {
	    	driver.findElement(list1).click();
	    }
	    public void list2fn()
	    {
	    	driver.findElement(list2).click();
	    }
	    public void list3fn()
	    {
	    	driver.findElement(list3).click();
	    }
	    
	    public void list4fn()
	    {
	    	driver.findElement(list4).click();
	    }
	    public void list5fn()
	    {
	    	driver.findElement(list5).click();
	    }
	    public void list6fn()
	    {
	    	driver.findElement(list6).click();
	    }
	    public void list7fn()
	    {
	    	driver.findElement(list7).click();
	    }
	    
	    
}
