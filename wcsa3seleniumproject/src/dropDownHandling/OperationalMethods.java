package dropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OperationalMethods {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("file:///E:/html/multiselectdropdown.html");
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.id("menu"));
		Select sal=new Select(element);
		WebElement ops = sal.getWrappedElement();
		String allops = ops.getText();
		System.out.println(allops);
		// TODO Auto-generated method stub

	}

}
