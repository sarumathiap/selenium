package selenium_test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Writefiles {
public static void main(String []args) throws IOException {
	File file = new File("/home/sarumathi/new.txt");
	FileWriter writer = new FileWriter(file,false);  
	BufferedWriter bf = new BufferedWriter(writer);
	bf.write("saru");
bf.newLine();
	bf.write("mathi");
	bf.newLine();
	bf.write("ap");
	bf.close();
	System.out.println("file saved...!");
	
	}
}