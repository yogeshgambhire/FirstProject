package scrollOperation;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDisableElement {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///E:/html/Login.html");
		Thread.sleep(2000);

		//scroll by 500 pixels
		 JavascriptExecutor jse = driver;
		 jse.executeScript("document.getElementById('i1').value='admin'");
		// TODO Auto-generated method stub

	}

}
