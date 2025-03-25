package testUtility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;
import testBase.TB1;

public class Helper extends TB1 {
	
	public void click(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.visibilityOf(element));
	     wait.until(ExpectedConditions.elementToBeClickable(element));
	     element.click();
		}
	
	public void enterData(WebElement element , String data) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.visibilityOf(element));
	     wait.until(ExpectedConditions.elementToBeClickable(element));
   	    element.sendKeys(data);
	}
	
	public  void checkIfElementIsDisplayed(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.visibilityOf(element));
	    Assert.assertTrue(element.isDisplayed());
		
	}

}
