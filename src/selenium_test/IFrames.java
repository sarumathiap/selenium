package selenium_test;



import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class IFrames {
public static void main(String []args) {
WebDriver driver;
System.setProperty("webdriver.gecko.driver","/home/sarumathi/Downloads/geckodriver");
driver = new FirefoxDriver();
driver.get("https://ebay.in/");
List<WebElement> frames = driver.findElements(By.tagName("iframe"));
System.out.println(frames.size());
//for (int iframe=0;iframe<frames.size();iframe++) {
driver.switchTo().frame(1);
//System.out.println(frames.get(iframe).getText());

}
}
//}