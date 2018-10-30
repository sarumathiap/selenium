package selenium_test;




	import java.awt.Robot;

	import java.awt.event.KeyEvent;  

	   

	import org.openqa.selenium.By;  

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	//import org.openqa.selenium.support.ui.ExpectedConditions;
	//import org.openqa.selenium.support.ui.WebDriverWait;
	import org.junit.After;


	import org.junit.Test;

	import org.junit.Before;

	public class Keys { 
		WebDriver driver; 
		

	@Before
	public void setUp() {  
		System.setProperty("webdriver.gecko.driver","/home/sarumathi/Downloads/geckodriver");

	driver=new FirefoxDriver();  

	driver.get("https://upload.photobox.com/en/");  

	driver.manage().window().maximize();  

	}  

	@Test 
	public void testWindowAlert() throws Exception{  

	// enter a valid email address 
		 // enter a valid password  
		driver.findElement(By.id("mycomputer")).click(); 
		driver.findElement(By.id("button_desktop")).click(); 
		
//		 Thread.sleep(30000);  
//		WebDriverWait wait = new WebDriverWait(driver, 10);
		//WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='Password']")));

	//WebElement name= driver.findElement(By.cssSelector("input[name=password]"));


			//element.findElement(By.id("passwordNext")).click(); 
			
	// click on sign in button 
	//driver.findElement(By.id("signIn")).click();

	// click on compose button 


	// creating instance of Robot class (A java based utility)  

	Robot rb =new Robot(); // pressing keys with the help of keyPress and keyRelease events rb.keyPress(KeyEvent.VK_D);  

	rb.keyRelease(KeyEvent.VK_D); Thread.sleep(2000);  

	rb.keyPress(KeyEvent.VK_SHIFT);  

	rb.keyPress(KeyEvent.VK_SEMICOLON);  

	rb.keyRelease(KeyEvent.VK_SEMICOLON);  

	rb.keyRelease(KeyEvent.VK_SHIFT);  

	rb.keyPress(KeyEvent.VK_BACK_SLASH);  

	rb.keyRelease(KeyEvent.VK_BACK_SLASH);  

	Thread.sleep(2000);  

	rb.keyPress(KeyEvent.VK_P);  

	rb.keyRelease(KeyEvent.VK_P);  

	rb.keyPress(KeyEvent.VK_I);  

	rb.keyRelease(KeyEvent.VK_I);  

	rb.keyPress(KeyEvent.VK_C);  

	rb.keyRelease(KeyEvent.VK_C);  

	Thread.sleep(2000);  

	rb.keyPress(KeyEvent.VK_ENTER);  

	rb.keyRelease(KeyEvent.VK_ENTER);  

	Thread.sleep(2000); 

	}  

	@After
	public void tearDown() {  

	driver.quit(); 
	} }  

