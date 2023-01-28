package keywardDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ActitimeInvalidLogin extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException
	{

		BaseTest bt = new BaseTest();
		bt.setUp();
		Flib flib = new Flib();
		int rc = flib.getRowCount( EXCEL_PATH,"InvalidData");


		for (int i = 1; i <=rc; i++)
		{
			String invalidUsername = flib.readExcelData( EXCEL_PATH,"InvalidData",i, 0);
			driver.findElement(By.name("username")).sendKeys(invalidUsername);
			String invalidPassword = flib.readExcelData(EXCEL_PATH, "InvalidData", i,1);
			driver.findElement(By.name("pwd")).sendKeys(invalidPassword);
			driver.findElement(By.id("LoginButton")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.name("username")).clear();
		}
		bt.tearDown();
	}

}
