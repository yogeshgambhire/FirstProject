package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("hp laptop");
		Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Core i5']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Brand']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='HP']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Operating System']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[(text()='Windows 10')]")).click();
		String priceOfFirstSuggestedLaptop = driver.findElement(By.xpath("//div[text()='HP Athlon Dual Core 3050U - (8 GB/512 GB SSD/Windows 11 Home) 15s- eq1559AU Thin and Light Laptop']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']\"")).getText();
		System.out.println(priceOfFirstSuggestedLaptop+ "is the price of first suggested laptop");
 }
}
