package selenium_test;

import java.io.File;
//import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.IOException;


import org.apache.log4j.xml.DOMConfigurator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcels {

	public static void main (String []args) throws IOException{
		
   XSSFWorkbook workbook = new XSSFWorkbook();
   XSSFSheet sheet = workbook.createSheet("FirstSheet");
   for (int row =0 ; row<10; row++) {
	   Row row1 = sheet.createRow(row);
	   for (int cols=0;cols<10; cols++) {
		   Cell cell = row1.createCell(cols);
		   cell.setCellValue((int) (Math.random()*100));
	   }
   }
   try {
	FileOutputStream file = new FileOutputStream(new File("/home/sarumathi/test11.xlsx"));
	   workbook.write(file);
	   file.close();
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
   System.out.println("Saved....!!");

	}
}
  
//   XSSFRow row1 = sheet.createRow(0);
//   XSSFCell r1cell1 = row1.createCell(0);
//   r1cell1.setCellValue("ID");
//   
//   XSSFCell r1cell2 = row1.createCell(1);
//   r1cell2.setCellValue("Name");
//   XSSFCell r1cell3 = row1.createCell(2);
//   r1cell3.setCellValue("MOb");
//   XSSFRow row2 = sheet.createRow(1);
//   XSSFCell r2cell1 = row2.createCell(0);
//   r2cell1.setCellValue(1);
//   XSSFCell r2cell2 = row2.createCell(1);
//   r2cell2.setCellValue("Saru");
//   XSSFCell r2cell3 = row2.createCell(2);
//   r2cell3.setCellValue("789798769");
//   XSSFRow row3 = sheet.createRow(2);
//
//   XSSFCell r3cell1 = row3.createCell(0);
//   r3cell1.setCellValue(2);
//   XSSFCell r3cell2 = row3.createCell(1);
//   
//   r3cell2.setCellValue("Siva");
//   XSSFCell r3cell3= row3.createCell(2);
//   r3cell3.setCellValue("978766576");
//file.close();
// 
//   FileOutputStream writer = new  FileOutputStream(new File("/home/sarumathi/test.xlsx"));
//   workbook.write(writer);
//   writer.close();
//   System.out.println("Done");
  
	
   
