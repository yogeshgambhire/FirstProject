package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class flib {

	public String readExcelData(String excelpath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		 Sheet sh = wb.getSheet(sheetName);
		 Row row = sh.getRow(rowCount);
		 Cell cell = row.getCell(cellCount);
		String data = cell.getStringCellValue();
		 return data;
	}


	public void writeExcelData(String excelpath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		 Sheet sh = wb.getSheet(sheetName);
		 Row row = sh.getRow(rowCount);
		 Cell cell = row.createCell(cellCount);
		String data = cell.getStringCellValue();

				cell.setCellValue(data);
		FileOutputStream fos = new FileOutputStream(excelpath);
		wb.write(fos);
	}

	public int getRowCountMathod(String excelpath,String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		 Sheet sh = wb.getSheet(sheetName);
		 int rc = sh.getLastRowNum();
		 return rc;
	}
}
