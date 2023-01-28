package assignments;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[.='✕']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Nothing Phone 1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(2000);
		String parentHandle = driver.getWindowHandle();
		driver.findElement(By.xpath("//div[text()='Nothing Phone (1) (White, 256 GB)']")).click();
		Thread.sleep(2000);
		Set<String> bothhandle = driver.getWindowHandles();
		for(String handle:bothhandle)
		{
			if (!parentHandle.equals(handle))
			{
				driver.switchTo().window(handle);
			}
			else
			{
             driver.close();
			}
		}

		driver.findElement(By.xpath("//*[@id=\"swatch-0-color\"]/a/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='_1fGeJ5']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='_36yFo0']")).sendKeys("422306");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div[6]/div/div/div[1]/div[2]/div/div[2]/div/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Remove']")).click();

	}

}
