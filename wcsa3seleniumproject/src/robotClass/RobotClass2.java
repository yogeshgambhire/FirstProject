package robotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClass2 {

	public static void main(String[] args) throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("confirmBtn")).click();

		//mouseHoverAction
		WebElement target = driver.findElement(By.xpath("//a[contains(@title,'Watch Jew')]"));

		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Band']")).click();

		WebElement clickAndHold = driver.findElement(By.xpath("//div[text()='Filter by']"));



		for(int i=0;i<=2;i++)
		{
			act.clickAndHold(clickAndHold).perform();
		}

		//copy to clipboard
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);

			robot.keyPress(KeyEvent.VK_C);
			robot.keyRelease(KeyEvent.VK_C);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(2000);

			WebElement searchBox = driver.findElement(By.xpath("//input[contains(@id,'search')]"));
			searchBox.click();

			//paste from clipboard
			Thread.sleep(2000);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_C);
			robot.keyRelease(KeyEvent.VK_C);
			robot.keyRelease(KeyEvent.VK_CONTROL);

			//search it
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='submit_search']"));

			Thread.sleep(2000);


		}// TODO Auto-generated
		// TODO Auto-generated method stub



}
