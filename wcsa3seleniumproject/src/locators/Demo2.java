package locators;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Demo2 {

	public static void main(String[] args)
	{

		 System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			      WebDriver driver=new FirefoxDriver();

			      //URL launch
			      driver.get("https://accounts.google.com/signin");
			      //identify email
			      WebElement l = driver.findElement(By.name("identifier"));
			      l.sendKeys("yogeshgambhire4@gmail.com");
			      WebElement b = driver.findElement(By.xpath("//span[text()='Next']"));
			      b.click();
			      //identify password
			      WebElement p = driver.findElement(By.name("password"));
			      p.sendKeys("yogesh@6969");
			      b.click();
			      //close browser
			      driver.close();

	}

}
