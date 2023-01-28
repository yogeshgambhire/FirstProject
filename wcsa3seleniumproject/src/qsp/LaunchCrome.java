package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchCrome {

	public static void main(String[] args) throws InterruptedException
	{
	  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe ");	// TODO Auto-generated method stub
      ChromeDriver driver = new ChromeDriver();
	  Thread.sleep(10000);

	  driver.get("https://kite.zerodha.com/marketwatch");

		 driver.findElement(By.xpath("https://kite.zerodha.com/marketwatch")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div/div[1]/a[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[text()='IDEA']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[text()=' Buy']")).click();
		 Thread.sleep(2000);
	  driver.close();
	}
}