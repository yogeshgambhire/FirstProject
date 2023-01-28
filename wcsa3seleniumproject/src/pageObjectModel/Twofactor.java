package pageObjectModel;

import org.jboss.aerogear.security.otp.Totp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.maven1.TOTPGenerator;

public class Twofactor 
{
	 /**
     * Method is used to get the TOTP based on the security token
     * @return
     */
    public static String getTwoFactorCode(){
//Replace with your security key copied from step 12
        Totp totp = new Totp("nlyyriaxspwdomi7buvo32cuas6tz7aa"); // 2FA secret key
        String twoFactorCode = totp.now(); //Generated 2FA code here
        return twoFactorCode;
    }

public static void gmailSignIn(){
 
 System.setProperty("webdriver.chrome.driver", "path of the exe file\\chromedriver.exe");
        
 WebDriver driver = new ChromeDriver();
        
 driver.manage().window().maximize();
 
 driver.get("your application url which embeds gmail sign-in");
 
driver.findElement(By.id("identifierId")).sendKeys("letzdotesting@gmail.com");
 
 driver.findElement(By.id("identifierNext")).click();
      
 driver.findElement(By.name("password")).sendKeys("password");
      
 driver.findElement(By.id("passwordNext")).click();
  
// OTP value is returned from getTwoFactor method
 driver.findElement(By.id("totpPin")).sendKeys(TOTPGenerator.getTwoFactorCode());
        
 driver.findElement(By.id("totpNext")).click();
    }

}
