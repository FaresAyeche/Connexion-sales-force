package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class connexion {
	WebDriver driver=null;
	
	public connexion(WebDriver driver) {
		this.driver = driver;
		}
	public void navigate() throws InterruptedException {
		driver.navigate().to("https://empathetic-koala-mavzxl-dev-ed.trailblaze.my.salesforce.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	

	
	
	public void enterEmail(String email) {
		
		driver.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys(email);
	}
public void enterMdp(String mdp) {
		
		driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys(mdp);
	}
public void click_cx() {
	driver.findElement(By.xpath("//input[contains(@id,'Login')]")).click();
	
	
}
public void cliqueRappelU() {
	driver.findElement(By.xpath("//a[contains(text(),'Me le rappeler ultérieurement')]")).click(); 
	
}	

}


////button[contains(@class,'action submit primary')] 