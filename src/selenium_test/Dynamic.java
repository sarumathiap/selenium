package selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dynamic {
	public static void main(String []args) {
	WebDriver driver;
	System.setProperty("webdriver.gecko.driver","/home/sarumathi/Downloads/geckodriver");
	driver = new FirefoxDriver();
	driver.get("https://github.com/");
	
	driver.findElement(By.className("mx-auto col-sm-8 col-md-5 hide-sm")).sendKeys(Keys.TAB);
}
}