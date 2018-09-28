package selenium_test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcels {


public static void main(String []args) throws InvalidFormatException,EncryptedDocumentException, IOException {
	FileInputStream file = new FileInputStream(new File("/home/sarumathi/test.xlsx"));
Workbook workbook = WorkbookFactory.create(file);
 Sheet sheet0= workbook.getSheetAt(0);
	//Sheet sheet = workbook.getSheetAt(0);

Iterator<Row> row1 = sheet0.iterator();
while(row1.hasNext()) {
	Row ro=row1.next();
	Iterator<Cell> cell = ro.iterator();
	while(cell.hasNext())
	{
		switch(cell.next().getCellTypeEnum())
		{
			case NUMERIC:
				System.out.print(cell.next().getNumericCellValue()+"\t");
				break;
			case STRING:
				System.out.print(cell.next().getStringCellValue()+"\t");
				break;
			
				case BLANK:
				System.out.print("Blank cell"+"\t");
				break;
			
			default:
				break;
			
		}
	}
	System.out.println();
}


//	for ( Row row:sheet0) {
//		for( Cell cell:row) {
//		
//			switch (cell.getCellTypeEnum())
//			{
//				case STRING:
//				System.out.print(cell.getStringCellValue()+ "\t");
//				break;
//				case NUMERIC:
//				System.out.print(cell.getNumericCellValue()+ "\t");
//				break;
//				case BLANK:
//				System.out.print("Blank cell"+ "\t");
//				break;
//				default:
//				break;
//					
//			}
//		
//		}
//		System.out.println();
	}

}

