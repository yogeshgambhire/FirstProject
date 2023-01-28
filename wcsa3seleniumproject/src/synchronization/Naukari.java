package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukari {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(1000);
		driver.findElement(By.id("login_Layer")).click();
		driver.findElement(By.cssSelector("input[placeholder='Enter your active Email ID / Username']")).sendKeys("gambhireyogesh3@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Enter your password']")).sendKeys("yogesh@6969");
		Thread.sleep(1000);
		driver.findElement(By.xpath(" //button[text()='Login']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Jobs']")).click();
		 

		
	}

}
