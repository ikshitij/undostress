package testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TB1 {

	public static WebDriver driver;

	public static void main(String[] args) {
	
		
		String Browser = "Chrome";
	
		switch (Browser) {
	case "Chrome":
	{		
WebDriver driver = new ChromeDriver();
	}
	break;
	case "firefox":
	{
WebDriver driver = new FirefoxDriver();
	}
	break;
	
	case "Edge":
	{	
WebDriver driver  = new EdgeDriver();
	}
   break;
}


	}

}


