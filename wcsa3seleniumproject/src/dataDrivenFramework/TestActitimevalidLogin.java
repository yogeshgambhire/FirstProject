package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestActitimevalidLogin {

	public static  void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
	{

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://yo/login.do");
		Thread.sleep(2000);
		flib flib = new flib();
		String validUsername = flib.readExcelData("./data/testdata.xlsx","Data",1,0);
		driver.findElement(By.className("username")).sendKeys(validUsername);

	}

}
