package dropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleMethod {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("file:///E:/html/dropdown.html");
		Thread.sleep(2000);
		WebElement sdropdwn = driver.findElement(By.id("menu"));
		Select sal=new Select(sdropdwn);
		 boolean checkDropDown = sal.isMultiple();
		 System.out.println(checkDropDown);
		 Thread.sleep(2000);
		 driver.navigate().to("file:///E:/html/multiselectdropdown.html");
		 WebElement element = driver.findElement(By.id("menu"));
		 sal=new Select(element);
		 boolean checkDropDown1 = sal.isMultiple();
		 Thread.sleep(2000);
		 System.out.println(checkDropDown1);

	}

}
