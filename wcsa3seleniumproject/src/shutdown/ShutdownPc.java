package shutdown;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import excelData.Flib;

public class ShutdownPc 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		Flib flib = new Flib();
		//read excel data
		 String ValidDate = flib.ReadExcelData("./data/days.xlsx","Sheet1", 1, 9);
		 String ValidTime = flib.ReadExcelData("./data/days.xlsx","Sheet1", 1, 9);
		 
		 

	}

}
