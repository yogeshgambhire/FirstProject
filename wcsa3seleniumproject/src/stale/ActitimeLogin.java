package stale;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLogin {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(" http://yo/login.do");

		WebElement UsernameTextBox = driver.findElement(By.name("username"));
		Thread.sleep(2000);
		UsernameTextBox.sendKeys("admin");
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).clear();
	     driver.findElement(By.name("username")).sendKeys("yogesh");

		WebElement PasswordTextBox = driver.findElement(By.name("pwd"));
		PasswordTextBox.sendKeys("manager");
		driver.findElement(By.id("LoginButton")).click();

		// TODO Auto-generated method stub

	}

}
