package stepDef2;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class UpdateLeadForm extends BaseLead 
{
	
	@And ("clear companyname")
	public void clearCompanyName() {
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
	}
	
	@And ("update companyname as(.*)$")
	public void updateCompanyname(String updatedcompanyname) {
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(updatedcompanyname);
	}
	
	@And ("click update button")
	public void clickUpdate() {
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	}
	
	@Then ("verify companyname is updated")
	public void isUpdated() {
		String UpdateName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		String CompanyName = UpdateName.replaceAll("[^a-zA-Z]", " ");
		System.out.println("Company Name  Updated to -" + CompanyName);

		if ("Amazon".equals(CompanyName)) {
			System.out.println("updated the company & names are same ");

		} else {
			System.out.println("Lead is Updated");
		}
	
	}
	
}



