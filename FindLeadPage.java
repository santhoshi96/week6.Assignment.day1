package stepDef2;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class FindLeadPage extends BaseLead {

	@When ("type firstname as (.*)$")
	public void typefirstname(String firstname) {
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys(firstname);
	}
	
	@When ("type Email ID as (.*)$")
	public void typeEmailID(String emailID) {
		driver.findElement(By.name("emailAddress")).sendKeys(emailID);
	}
	
	@And ("click Find Lead Button")
	public void clickfindbutton() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}
	
}
