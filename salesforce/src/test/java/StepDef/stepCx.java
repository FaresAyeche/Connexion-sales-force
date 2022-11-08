package StepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Pages.connexion;

public class stepCx {
	WebDriver driver=null;
	connexion log;
	
	@Given("Browser is open")
	public void browser_is_open() {
		System.out.println("Inside Step - browser is open");

		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is : "+projectPath);

		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/driver/chromedriver.exe");

		driver = new ChromeDriver();
	}

	@When("I navigate to salesforce page login")
	public void i_navigate_to_salesforce_page_login() throws InterruptedException {
		log = new connexion(driver);
		log.navigate();
		//log.click_cx();
		Thread.sleep(4000);
	}

	@When("I enter lOGIN")
	public void i_enter_l_ogin() {
	    log.enterEmail("fares.ayeche@empathetic-koala-mavzxl.com");
	}

	@When("I enter PASSWORD")
	public void i_enter_password() {
	    log.enterMdp("AzertyUI#2024!");
	}

	@When("I Click on LOGIN")
	public void i_click_on_login() {
	   log.click_cx();
	   log.cliqueRappelU();
	   
	}

	@Then("Home page should be open")
	public void home_page_should_be_open() {
	   
	}

	
}
