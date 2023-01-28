package keywardDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class TestActitimeValidLogin extends BaseTest {
	public static void main(String[] args) throws IOException {
		BaseTest bt = new BaseTest();
		bt.setUp();
		Flib flib = new Flib();
		String validUsername = flib.readPropertyData( PROP_PATH, "username");
		String validpassword = flib.readPropertyData(PROP_PATH, "password");
		driver.findElement(By.name("username")).sendKeys(validUsername);

		driver.findElement(By.name("pwd")).sendKeys(validpassword);
		driver.findElement(By.id("LoginButton")).click();
		bt.tearDown();
	}

}
