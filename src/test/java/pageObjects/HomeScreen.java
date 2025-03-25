package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import testBase.TB1;
import testUtility.Helper;

public class HomeScreen extends TB1 {
	Helper helper = new Helper();
	@FindBy(xpath="//input[@name=\"operator\"][1]")
	public
	WebElement operator;

	@FindBy(xpath="//li[@data-name=\"telcel\"]")
	public WebElement TelcelOption;
	
	@FindBy(xpath="//input[@name=\"mobile\"][1]")
	public WebElement number;
	
	@FindBy(xpath="//input[@name=\"amount\"][1]")
	public WebElement amountField;
	
	@FindBy(xpath="//li[@data-name=\"10\"][1]")
	public WebElement amountOption;

	@FindBy(xpath="//button[text()=\"Siguiente\"][1]")
	public WebElement submit;
	
	@FindBy(xpath="//p[text()=\\\"Monedero\\\"]")
	public WebElement Monedero;
	    
		
	
	
	public HomeScreen(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
	
	

}
