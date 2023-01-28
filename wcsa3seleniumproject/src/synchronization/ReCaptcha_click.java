package synchronization;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class ReCaptcha_click 
{

public static void main(String[] args) throws IOException, InterruptedException, TesseractException 
{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	
		
			
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.irctc.co.in/nget/train-search");
	
	
	WebElement img = driver.findElement(By.xpath("//img[@alt='Indian railway LOGO']"));
	if (img.isDisplayed()) 
	{
		System.out.println("Image is Display");
		System.out.println("Image Text is:" +img.getAttribute("alt"));
	}
	else
	{
		System.out.println("Image is not Display");
		
	}
	
}

}



