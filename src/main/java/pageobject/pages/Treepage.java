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

public class Treepage {
	
	private WebDriver driver;

	private By getstarted=By.xpath("//button[@class='btn']");
	private By Signin=By.xpath("//div[@id='navbarCollapse']//div[2]//ul//a[3]");
	private By usernm=By.xpath("//input[@id='id_username']");
	private By passwrd=By.xpath("//input[@id='id_password']");
	private By login=By.xpath("//input[@value='Login']");
	private By datastructure=By.xpath("//div[@id='navbarCollapse']//div//a");
	private By treegetstarted=By.xpath("//a[@class='align-self-end btn btn-lg btn-block btn-primary' and @href='tree']");
	private By overviewoftr=By.xpath("/html/body/div[2]/ul[1]/a");
	private By overTryhere=By.xpath("//a[@class='btn btn-info' and @href='/tryEditor' ]");
	
	private  By run=By.xpath("//button[@type='button' and @onclick='runit()' ]");
	private By Terminologies=By.xpath("//a[@href='/tree/terminologies/']");
	private By Typeoftree=By.xpath("//a[@href='/tree/types-of-trees/']");
	private By Treetravesal=By.xpath("//a[@href='/tree/tree-traversals/']");
	private By Travesalsillustr=By.xpath("//a[@href='/tree/traversals-illustration/']");
	private By Binarytrees=By.xpath("//a[@href='/tree/binary-trees/']");
	private By TypeofBT=By.xpath("//a[@href='/tree/types-of-binary-trees/']");
	private By ImplementationinP=By.xpath("//a[@href='/tree/implementation-in-python/']");
	private By BinaryTrTrv=By.xpath("//a[@href='/tree/binary-tree-traversals/']");
	private By ImplementationofBT=By.xpath("//a[@href='/tree/implementation-of-binary-trees/']");
	private By ApplicationofBT=By.xpath("//a[@href='/tree/applications-of-binary-trees/']");
	private By BinarysearchT=By.xpath("//a[@href='/tree/binary-search-trees/']");
	private By ImplementationofBST=By.xpath("//a[@href='/tree/implementation-of-bst/']");
	
	public static String baseUrl="https://dsportalapp.herokuapp.com/";
	//Constructor
	public Treepage(WebDriver driver) {
		this.driver=driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
		public void clickSignin() {
			driver.findElement(Signin).click();
		}
	public void userName() {
		driver.findElement(usernm).sendKeys("komala");
	}
	public void passWord() {
		driver.findElement(passwrd).sendKeys("Koms@123");
	}
	public void clickLogin() {
		driver.findElement(login).click();
	}
	public boolean isDataStructure() {
		return driver.findElement(datastructure).isDisplayed();
	}
	public void openTree() {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofMillis(100))
				.ignoring(ElementClickInterceptedException.class)
				.ignoring(NoSuchElementException.class);
		
		WebElement getstarted =wait.until(ExpectedConditions.elementToBeClickable(treegetstarted));
		getstarted.click();
		
	}
	public void overViewOfT() {
		driver.findElement(overviewoftr).click();
	}
	public void termiNologies() {
		driver.findElement(Terminologies).click();
	}
	public void typeofTrees() {
		driver.findElement(Typeoftree).click();
	}
	public void treeTraversals() {
		driver.findElement(Treetravesal).click();
	}
	public void traverIllusT() {
		driver.findElement(Travesalsillustr).click();
	}
	public void binaryTrees() {
		driver.findElement(Binarytrees).click();
	}
	public void typeOfBinaryT() {
		driver.findElement(TypeofBT).click();
	}
	public void immplInPTn() {
		driver.findElement(ImplementationinP).click();
	}
	public void binaryTreeTrvs() {
		driver.findElement(BinaryTrTrv).click();
	}
	public void implBinaryT() {
		driver.findElement(ImplementationofBT).click();
	}
	public void tryHere() {
		driver.findElement(overTryhere).click();
	}
	public void clickRun() {
		
WebElement codeMirror = driver.findElement(By.className("CodeMirror"));

		
		WebElement codeLine = codeMirror.findElements(By.className("CodeMirror-line")).get(0);
		codeLine.click();


		WebElement txtbx = codeMirror.findElement(By.cssSelector("textarea"));
		txtbx.sendKeys("print'Hello World'");  
		driver.findElement(run).click();
		
	}
	public void appBinaryT() {
		driver.findElement(ApplicationofBT).click();
	}
	public void binarySearchT() {
		driver.findElement(BinarysearchT).click();
	}
	public void implmOfBST() {
		driver.findElement(ImplementationofBST).click();
	}
		
	}

