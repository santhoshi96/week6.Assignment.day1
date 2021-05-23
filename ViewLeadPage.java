package stepDef2;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ViewLeadPage extends BaseLead {

	@And ("click Edit Button")
	public void clickEditButton() {
		String Title = driver.findElement(By.xpath("//div[text()='View Lead']")).getText();
		System.out.println(Title);

		String OldName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		String Old = OldName.replaceAll("[^a-zA-Z]", " ");
		System.out.println("Old name is -" + Old);
		

		driver.findElement(By.xpath("(//a[@class='subMenuButton'])[3]")).click();
		
	
	}

	
	
}
