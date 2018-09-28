package selenium_test;


//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.io.FileInputStream;

public class Excels {
	public static void main(String []args)throws IOException{
		
Properties pro = new Properties();
FileInputStream file = new FileInputStream(System.getProperty("user.dir")+ "/src/PropertiesFile/objects.properties");
pro.load(file);
System.out.println(pro.getProperty("age"));
}
}