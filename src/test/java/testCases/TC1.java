package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObjects.HomeScreen;
import pageObjects.PaymentScreen;
import testBase.TB1;
import testUtility.Helper;
public class TC1 extends TB1{
	
	WebDriver driver = new ChromeDriver();
	public static void main(String[] args) {
	}
		@Test(priority = 1)
		public void HomeScreen() throws InterruptedException {
		Helper helper = new Helper();
		HomeScreen homescreen = new HomeScreen(driver);
			driver.get("https://undostres.com.mx/index.php");
	        helper.click(homescreen.operator);
	        helper.click(homescreen.TelcelOption);
	        helper.enterData(homescreen.number, "8465433546");
	        helper.click(homescreen.amountField);
	        helper.click(homescreen.amountOption);
	        helper.click(homescreen.submit);
			
			
		}
		@Test(priority = 2)
		public void PaymentScreen() {

	        Helper helper = new Helper();
			PaymentScreen paymentscreen = new PaymentScreen(driver);
		
	        helper.click(paymentscreen.Tarjeda);
	        helper.click(paymentscreen.paymentType);
	        
	        if(paymentscreen.cardnumber.isDisplayed()) {
	        }else {
	        helper.click(paymentscreen.paymentType);
	        }

	        helper.enterData(paymentscreen.cardnumber, "4111111111111111");
	        helper.enterData(paymentscreen.month, "11");
	        helper.enterData(paymentscreen.date, "25");
	        helper.enterData(paymentscreen.cvv, "111");
	        helper.enterData(paymentscreen.email, "test@test.com");
	        helper.click(paymentscreen.submitDetails);
	        helper.click(paymentscreen.selectByEmail);
	        helper.enterData(paymentscreen.username, "automationexcersise@test.com");
	        helper.enterData(paymentscreen.password, "123456");
	        
	        driver.switchTo().frame(paymentscreen.iframe);

	        helper.click(paymentscreen.checkbox);

	        driver.switchTo().defaultContent();
	        
	        helper.click(paymentscreen.loginbutton);


driver.quit();
	        

		
		}
		
}