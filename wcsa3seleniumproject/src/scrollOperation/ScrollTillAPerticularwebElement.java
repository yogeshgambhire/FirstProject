package scrollOperation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTillAPerticularwebElement {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		WebElement newsTarget = driver.findElement(By.xpath("//h2[.='News']"));
	      Point loc = newsTarget.getLocation();
		int xaxis = loc.getX();
		int yaxis = loc.getY();
		//scroll by 500 pixels
		 JavascriptExecutor jse = driver;
		 jse.executeScript("window.scrollBy("+xaxis+""+(yaxis-100)+")");
		 Thread.sleep(2000);
		// TODO Auto-generated method stub

	}

}
