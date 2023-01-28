package synchronization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.collections4.Get;
import org.apache.pdfbox.jbig2.TestImage;
import org.apache.pdfbox.tools.ImageToPDF;
import org.dataloader.Try;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class ReadCaptcha {

	public static void main(String[] args) throws IOException, InterruptedException, TesseractException 
	{

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("//a[text()=' LOGIN ']")).click();
		driver.findElement(By.id("disha-banner-close")).click();
		WebElement img = driver.findElement(By.xpath("//img[@class='captcha-img']"));
		
		File src = img.getScreenshotAs(OutputType.FILE);
		String path="C:\\Users\\W10\\OneDrive\\Desktop\\wcsa3workspace\\wcsa3seleniumproject\\ScreenShots\\captcha.png";
		FileHandler.copy(src,new File(path));
		Thread.sleep(2000);
		Tesseract image=new Tesseract();
		String str=image.doOCR(new File(path));
		System.out.println("image done");
		//String testdata=TestImage.crackImage("C:\\\\Users\\\\W10\\\\OneDrive\\\\Desktop\\\\wcsa3workspace\\\\wcsa3seleniumproject\\\\ScreenShots\\\\captcha.png");
		System.out.println(str);
		driver.get("C:\\Users\\W10\\OneDrive\\Desktop\\wcsa3workspace\\wcsa3seleniumproject\\ScreenShots\\captcha.png");
		String title = driver.getTitle();
		System.out.println(title);
		



	}

}
