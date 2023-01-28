package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeInvalidData
{
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://yo/login.do");
		Thread.sleep(2000);
		flib flib = new flib();
		int rc = flib.getRowCountMathod("./data/testdat.xlsx","invalidData");
		for (int i = 1; i <=rc; i++)
		{
			String invalidUsername = flib.readExcelData("./data/testdata.xlsx","InvalidData",i, 0);
			driver.findElement(By.name("username")).sendKeys(invalidUsername);
			String invalidPassword = flib.readExcelData("./data/testdata.xlsx", "InvalidData", i,1);
			driver.findElement(By.name("pwd")).sendKeys(invalidPassword);
			driver.findElement(By.id("LoginButton")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.name("username")).clear();
		}

	}

}
