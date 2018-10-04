package selenium_test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Updatecell {
	public static void main(String []args) throws IOException{
		FileInputStream file = new FileInputStream(new File("/home/sarumathi/test.xlsx"));
		XSSFWorkbook book = new XSSFWorkbook(file);
		XSSFSheet sheet = book.getSheet("FirstSheet");
			
		Row row= sheet.getRow(9);
		Cell cell = row.getCell(9);
		cell.setCellValue(880);
		file.close();
		FileOutputStream file1 = new FileOutputStream(new File("/home/sarumathi/test.xlsx"));
		book.write(file1);
	
		
		file1.close();
//		Iterator<Row> row1 = sheet.iterator();
//		while(row1.hasNext()) {
//			Row ro=row1.next();
//			Iterator<Cell> cell1= ro.iterator();
//			while(cell1.hasNext())
//			{
//				switch(cell1.next().getCellTypeEnum())
//				{
//					case NUMERIC:
//						System.out.print(cell1.next().getNumericCellValue()+"\t");
//						break;
//					case STRING:
//						System.out.print(cell1.next().getStringCellValue()+"\t");
//						break;
//					
//						case BLANK:
//						System.out.print("Blank cell"+"\t");
//						break;
//					
//					default:
//						break;
//					
//				}
//			}
			
			System.out.println("saved");
		}	
	}


