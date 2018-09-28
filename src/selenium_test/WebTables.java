package selenium_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTables {
	  static WebDriver driver;
	public static void main(String[] args) {
		
		 System.setProperty("webdriver.gecko.driver","/home/sarumathi/Downloads/geckodriver");
		  driver = new FirefoxDriver();
	}
	  
}
