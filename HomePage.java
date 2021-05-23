package stepDef2;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;

public class HomePage extends BaseLead {

	@And ("click Leads")
	public void clickLeadButton() {
		driver.findElement(By.linkText("Leads")).click();
	}
}
