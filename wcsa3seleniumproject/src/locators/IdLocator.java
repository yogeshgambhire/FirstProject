package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://E://html/Login.html");
		driver.findElement(By.id("username")).sendKeys("admin");

		Thread.sleep(4000);
		driver.findElement(By.id("password")).sendKeys("manager");

		// TODO Auto-generated method stub

	}

}
