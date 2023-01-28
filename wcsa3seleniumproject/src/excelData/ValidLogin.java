package excelData;

import java.io.IOException;
import java.security.SecureRandom;
import java.time.Duration;

import org.apache.commons.codec.binary.Base32;
import org.apache.commons.codec.binary.Hex;
import org.apache.poi.EncryptedDocumentException;
import org.jboss.aerogear.security.otp.Totp;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.maven1.TOTPGenerator;



public class ValidLogin 
{
	 

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://kite.zerodha.com/?next=%2Fpositions");
		Thread.sleep(2000);
		//object create file library
		Flib flib = new Flib();
		//read excel data
		 String ValidUserName = flib.ReadExcelData("./data/Zerodha.xlsx","ValidData", 1, 0);
		 String Validpassword = flib.ReadExcelData("./data/Zerodha.xlsx","ValidData", 1, 1);

		 driver.findElement(By.id("userid")).sendKeys(ValidUserName);
		 driver.findElement(By.id("password")).sendKeys(Validpassword);
		 driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
		 Thread.sleep(5000);
		 
		 ChromeOptions option = new ChromeOptions();
		 option.addArguments("Disable-Notification");
		 driver=new ChromeDriver(option);
		// Alert alart = driver.switchTo().alert();
		 //alart.accept();
		 
		 driver.findElement(By.xpath("//input[@label='External TOTP']")).click();
		 driver.findElement(By.id("totpPin")).sendKeys(TOTPGenerator.getTwoFactorCode());
	        
		 driver.findElement(By.id("totpNext")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("https://kite.zerodha.com/marketwatch")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div/div[1]/a[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[text()='IDEA']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[text()=' Buy']")).click();
		 Thread.sleep(2000);

		// TODO Auto-generated method stub

	}
	

}
