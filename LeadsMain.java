package stepDef2;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;

public class LeadsMain extends BaseLead{

	@And ("click Find Leads link")
	public void clickFindLeadsLink() {
		driver.findElement(By.linkText("Find Leads")).click();
	}
	
	@And ("click Email Tab")
	public void clickEmailTab() {
		driver.findElement(By.linkText("Email")).click();
	}
}
