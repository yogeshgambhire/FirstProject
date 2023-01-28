package stale;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{//declaration

	@FindBy(xpath = "//a[text()='Create new tasks']") private WebElement createNewTaskLink;
	@FindBy(xpath = "//a[text()='Logout']") private WebElement logout;
	@FindBy(xpath = "//a[text()='Insert existing tasks']") private WebElement insertExistingTask;



	//initialization

	public HomePage(WebDriver driver) {
		 PageFactory.initElements(driver, this);
	}

	//utilization

	public WebElement getCreateNewTaskLink() {
		return createNewTaskLink;
	}

	public WebElement getLogout() {
		return logout;
	}
	public WebElement getInsertExistingTask() {
		return insertExistingTask;
	}

	//Logout

	public void logOutMethod()
	{
		logout.click();
	}
}
