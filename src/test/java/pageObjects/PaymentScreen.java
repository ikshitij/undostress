package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testBase.TB1;
import testUtility.Helper;

public class PaymentScreen extends TB1 {
	Helper helper = new Helper();
	

	@FindBy(xpath="//a[@id='new-card-toggle']//div[@class='panel panelStyleDesktop']")
	public
	WebElement Tarjeda;
	
	@FindBy(xpath="//span[text()=\"Usar nueva tarjeta\"]")
	public WebElement paymentType;
	
	@FindBy(id="cardnumberunique")
	public WebElement cardnumber;
	
	@FindBy(id="card_expmonth")
	public WebElement month;
	
	@FindBy(id="card_expyear")
	public WebElement date;
	
	@FindBy(id="card_cvv_no")
	public WebElement cvv;
	
	@FindBy(xpath="//input[@name=\"txtEmail\"][1]")
	public WebElement email;

	@FindBy(xpath="(//span[text()=\"Pagar con Tarjeta\"])[2]")
	public WebElement submitDetails;
	
	@FindBy(xpath="//button[@class=\"UDT-socialBtn UDT-socialBtn__email\"]")
	public WebElement selectByEmail;
	
	@FindBy(id="usrname")
	public WebElement username;
	
	@FindBy(xpath="(//input[@type=\"password\"])[3]")
	public WebElement password;
	
	@FindBy(xpath="//iframe[contains(@title, 'reCAPTCHA')]")
	public WebElement iframe;
	
	@FindBy(xpath="//span[@id='recaptcha-anchor']")
	public WebElement checkbox;
	
	@FindBy(id="loginBtn")
	public WebElement loginbutton;
	
	public PaymentScreen(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
	

}
