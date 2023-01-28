package stale;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage
{
	//declaration

	@FindBy(linkText = "Users") private WebElement usr;
	@FindBy(xpath  = "//input[@value='Create New User']") private WebElement createNewuser;


	//initialization

public UserPage(WebElement driver) {
	 PageFactory.initElements(driver, this);
}
	//utilization


public WebElement getUsr() 
{
	return usr;
}
public WebElement getCreateNewuser()
{
	return createNewuser;
}
}