package scrollOperation;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUp {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);

		//scroll by 500 pixels
		 JavascriptExecutor jse = driver;
		 jse.executeScript("window.scrollBy(0,500)");

		 Thread.sleep(2000);
		 //scroll up by 500 pixel
		 jse.executeScript("window.scrollBy(0,-500)");
		// TODO Auto-generated method stub

	}

}
