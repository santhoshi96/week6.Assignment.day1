package stepDef2;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;

public class WelcomePage extends BaseLead{
	@And ("click CRM SFA")
	public void clicklink() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}

}
