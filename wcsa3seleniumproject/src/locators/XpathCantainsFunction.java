package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class XpathCantainsFunction
{

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.jio.com/selfcare/login/mobile");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[name='jioNrInputName']")).sendKeys("9130936969");

		 Thread.sleep(2000);
        driver.findElement(By.xpath("//button[contains(@class,'css-2')]")).click();
        Thread.sleep(10000);
        driver.close();



	}

}

