package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("admin123");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		// TODO Auto-generated method stub

	}

}
