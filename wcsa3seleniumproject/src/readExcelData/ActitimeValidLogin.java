package readExcelData;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeValidLogin {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://yo/login.do");
		Thread.sleep(2000);
		Flib flib = new Flib();
		String validUserName = flib.readExcelData("./data/testdata.xlsx", "Data", 1, 0);
		String validPassword = flib.readExcelData("./data/testdata.xlsx", "Data", 1, 1);
		driver.findElement(By.name("username")).sendKeys(validUserName);
		driver.findElement(By.name("pwd")).sendKeys(validPassword);
		driver.findElement(By.id("LoginButton")).click();
		// TODO Auto-generated method stub

	}

}
