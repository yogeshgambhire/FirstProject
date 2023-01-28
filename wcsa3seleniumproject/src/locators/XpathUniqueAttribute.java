package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class XpathUniqueAttribute
{

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.instagram.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.name("username")).sendKeys("8793146363");
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys("yogesh@g");
		 Thread.sleep(2000);
        driver.findElement(By.cssSelector("button[class*='L3NKy']     ")).click();
        Thread.sleep(10000);
        driver.close();



	}

}

