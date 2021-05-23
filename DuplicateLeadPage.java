package stepDef2;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class DuplicateLeadPage extends BaseLead {
	public String leadName;
	
	@And ("click first displaying option")
	public void clickFirstOption() throws InterruptedException {
		Thread.sleep(2000);
		leadName = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a)[1]")).getText();
		System.out.println("First Name " + leadName);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click();

	}
	
	@And ("click Duplicate Lead Button")
	public void clickDuplicate() {
	driver.findElement(By.linkText("Duplicate Lead")).click();
	
	boolean titleShown = driver.findElement(By.id("sectionHeaderTitle_leads")).getText().equals("Duplicate Lead");
	System.out.println(titleShown);

}
	@And ("click Create Lead button")
	public void clickcreatebutton() {
		driver.findElement(By.name("submitButton")).click();
	}
	
	@Then ("verify Duplicate Lead is created successfully")
	public void isDuplicate() {
		String duplicateName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
	    if (leadName.equals(duplicateName)) {
	    	System.out.println("Duplicate successfull");
	    }else {
	    	System.out.println("Duplicate not successfull");
	    }
	}
}
