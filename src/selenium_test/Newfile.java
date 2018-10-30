package selenium_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Newfile {
	 WebDriver driver;
		public void openbrowser() {
			 System.setProperty("webdriver.gecko.driver","/home/sarumathi/Downloads/geckodriver");
			driver = new FirefoxDriver();
}
}