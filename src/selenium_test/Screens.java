package selenium_test;

import java.io.File;

import org.openqa.selenium.By;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Screens {

	public WebDriver driver;
	@Test
	public void openbrowser() throws Exception{
		 System.setProperty("webdriver.gecko.driver","/home/sarumathi/Downloads/geckodriver");
		driver = new FirefoxDriver();
		driver.get("http://www.google.com/");
		try {
			driver.findElement(By.id("test"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("element not found");
			getscreenshot();
		}}
		public void getscreenshot()throws Exception{
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src,new File("/home/sarumathi/img.png"));
			
			
		}
	}
