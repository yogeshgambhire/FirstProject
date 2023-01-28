package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTextFunction {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.id("email")).sendKeys("8793146363");
        Thread.sleep(2000);
        driver.findElement(By.id("pass")).sendKeys("yogesh@g");
		 Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Log in']")).click();

	}

}
