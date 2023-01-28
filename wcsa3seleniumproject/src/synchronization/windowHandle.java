package synchronization;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class windowHandle {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe"); 
		 ChromeDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();

		// Load the website
		driver.get("http://www.naukri.com/");
driver.findElement(By.xpath("//a[@title='Remote']")).click();

driver.findElement(By.xpath("//a[@title='MNC']")).click();

		// It will return the parent window name as a String
		String parent=driver.getWindowHandle();

		Set<String>s=driver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> I1= s.iterator();

		while(I1.hasNext())
		{

		String child_window=I1.next();


		if(!parent.equals(child_window))
		{
		driver.switchTo().window(child_window);

		System.out.println(driver.switchTo().window(child_window).getTitle());

		driver.close();
		}

		}
		//switch to the parent window
		driver.switchTo().window(parent);

		}


    }



