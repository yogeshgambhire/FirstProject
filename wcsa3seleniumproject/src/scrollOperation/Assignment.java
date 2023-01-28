package scrollOperation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

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
		 WebElement username = driver.findElement(By.name("username"));
		 WebElement password = driver.findElement(By.name("password"));
		 if (username.isEnabled())
		 {
			username.sendKeys("admin");
			System.out.println("if blocked exicuted");
		}
		 if (password.isEnabled())
		 {
			password.sendKeys("manager");
			System.out.println("if blocked exicuted");
		}
		 else
		 {
			 jse.executeScript("document.getElementById('password').value='manager'");
			 System.out.println("else blocked exicuted");

		}


	}

}
