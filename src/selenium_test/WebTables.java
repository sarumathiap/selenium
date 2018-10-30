package selenium_test;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTables {
	  static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.gecko.driver","/home/sarumathi/Downloads/geckodriver");
		  driver = new FirefoxDriver();
		  //driver.get("http://google.com");
		  //WebElement searchText = driver.findElement(By.name("q")); 
		  //searchText.sendKeys("http://localhost:3000");


	driver.get("http://localhost:3000/moduls/1");
		  WebElement table = driver.findElement(By.xpath("//*[@id='modules_wrapper']"));
		  List<WebElement> rows = table.findElements(By.tagName("tr"));
	
			  List<WebElement> cols = rows.get(0).findElements(By.tagName("th"));
			  System.out.println("Number of cols:" +cols.size());
			  System.out.println(cols.get(0).getText());
			  
			  WebElement tbody = driver.findElement(By.xpath(" /html/body/div/div[2]/table/tbody"));
			  
			  List<WebElement> rows1 = tbody.findElements(By.tagName("tr"));
			 
			  for (int rnum=0;rnum<rows1.size();rnum++) {
				  List<WebElement> cols1 = rows1.get(rnum).findElements(By.tagName("td"));
	
			  for(int datasize=0;datasize<cols1.size();datasize++) {
				 // List<WebElement> column = cols.get(rnum).findElements(By.tagName("td"));
				  System.out.println(cols1.get(datasize).getText()); 
				  
			  }
		  }
		  driver.close();
	}
	  
}
