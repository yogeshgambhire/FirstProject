package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverProgram
{

	public static void main(String[] args) throws InterruptedException
	{
		 WebDriver driver;
		 Scanner sc =new Scanner(System.in);
		 System.out.println("Enter name of the browser");
		 String browserValue = sc.nextLine();
		 System.out.println(browserValue);

		 if(browserValue.equalsIgnoreCase("chrome"))
		 {
			 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			Thread.sleep(4000);
			driver.manage().window().maximize();
			driver.get("https://www.google.com");
		 }
		 else if (browserValue.equalsIgnoreCase("firefox"))
		 {
			 System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			 driver=new FirefoxDriver();
			Thread.sleep(4000);
			driver.manage().window().maximize();
			driver.get("https://www.google.com");
		}
		 else
		 {
			 System.out.println("Enter valid browserchrome");
		 }

     }




}
