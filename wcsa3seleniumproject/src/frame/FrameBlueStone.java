package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FrameBlueStone {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 ChromeOptions fo = new ChromeOptions();
		 ChromeDriver driver = new ChromeDriver(fo);
		 fo.addArguments("--disable-notification");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bluestone.com/");
		WebElement frameElement = driver.findElement(By.xpath("//*[@id=\"fc_widget\"]"));
		driver.switchTo().frame(frameElement);
		Thread.sleep(3000);
		driver.findElement(By.id("chat-icon")).click();

		driver.switchTo().defaultContent();

		driver.findElement(By.xpath("//input[@id='chat-fc-name']")).sendKeys("yogesh");
		Thread.sleep(3000);
		driver.findElement(By.id("chat-fc-email")).sendKeys("yogeshgambhire4@gmail.com");

		Thread.sleep(3000);
         driver.findElement(By.id("chat-fc-phone")).sendKeys("9130936969");
         Thread.sleep(3000);
         driver.findElement(By.xpath("//a[@class='fc-button']")).click();

		// TODO Auto-generated method stub

	}

}
