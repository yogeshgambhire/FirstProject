package excelData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ReadDataFromExcel
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		//file location
		FileInputStream fis = new FileInputStream("./data/Zerodha.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet("ValidData");//sheet name
	Row row = sh.getRow(1);
	Cell cell = row.getCell(2);
	String data = cell.getStringCellValue();//get string value
	System.out.println(data);
	
	 

	}


}
