package actionMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAction {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.guru99.com/test/drag_drop.html");

		Thread.sleep(2000);
		WebElement src = driver.findElement(By.xpath("//a[(text()=' BANK ')]"));
		WebElement target = driver.findElement(By.xpath("//ol[@id='bank']//li"));

		Actions act=new Actions(driver);
		act.dragAndDrop(src, target).perform();
		// TODO Auto-generated method stub

	}

}
