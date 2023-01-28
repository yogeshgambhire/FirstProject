package stale;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;



public class LoginPage
{
	//declaration

	@FindBy(name="username") private WebElement usn;
	@FindBy(name="pwd") private WebElement pass;
	@FindBy(id="LoginButton") private WebElement Loginbtn;
   @FindBy(id="keepLoggedInCheckBox")private WebElement keepLoggedInCheckBox;
   @FindBy(id="licenseLink") private WebElement licenceLink;



//initialization
   public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
   //utilization

   public WebElement getUsn() {
		return usn;
	}

	public WebElement getPass() {
		return pass;
	}
	public WebElement getLoginbtn() {
		return Loginbtn;
	}
	public WebElement getKeepLoggedInCheckBox() {
		return keepLoggedInCheckBox;
	}
	public WebElement getLicenceLink() {
		return licenceLink;
	}


	//reusable validLogin

	public void validLoginToActitime(String validUsername,String validPassword)
	{
		usn.sendKeys(validUsername);
		pass.sendKeys(validPassword);
		Loginbtn.click();
	}

//invalidlogin

	public void invalidLoginToActitime(String validUsername,String validPassword) throws InterruptedException
	{
		usn.sendKeys(validUsername);
		pass.sendKeys(validPassword);
		Loginbtn.click();
		Thread.sleep(2000);
		usn.clear();
	}

}
