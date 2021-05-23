package stepDef2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage extends BaseLead{

	@Given ("Launch Chrome browser")
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		}
	
	@When ("Load URL {string}")
	public void loadUrl(String URL) {
		driver.get(URL);
	}
	
	@And ("Type username as {string}")
	public void typeUserName(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}
	
	@And ("Type password as {string}")
	public void typePassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}
	
	@And ("click Login Button")
	public void clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
}
