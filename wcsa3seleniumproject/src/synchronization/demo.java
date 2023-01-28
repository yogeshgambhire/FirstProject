package synchronization;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.naukri.com/");

		// Opening all the child window
		driver.findElement(By.xpath("//a[@title='Remote']")).click();
		driver.findElement(By.xpath("//a[@title='Marketing']")).click();
		driver.findElement(By.xpath("//a[@title='Software & IT']")).click();
		driver.findElement(By.xpath("//a[@title='Data Science']")).click();
		driver.findElement(By.xpath("//a[@title='Fresher']")).click();

		String mainwindow=driver.getWindowHandle();//handle parent(current) window
		Thread.sleep(1000);
		for(String parent:driver.getWindowHandles()) //iterating on child windows
		{
			driver.switchTo().window(parent);// Perform any operations on child window
		}
		driver.switchTo().window(mainwindow); //switch back to main window & continue further execution
		Thread.sleep(1000);
		driver.findElement(By.id("login_Layer")).click();
		driver.findElement(By.cssSelector("input[placeholder='Enter your active Email ID / Username']")).sendKeys("gambhireyogesh3@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Enter your password']")).sendKeys("yogesh@6969");
		Thread.sleep(1000);
		driver.findElement(By.xpath(" //button[text()='Login']")).click();

	}

}


