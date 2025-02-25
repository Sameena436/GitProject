package PAGES;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login {
	
	WebDriver driver;
	
	public void login(WebDriver driver1)
	
	{
	
	this.driver = driver1;
	
	}
	
	public void user_opens_url(String TESTURL) {
		
		driver.get(TESTURL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
	}
	
	public void login_validation(String username, String password) {
		
		  driver.findElement(By.name("username")).sendKeys(username);
		  driver.findElement(By.name("password")).sendKeys(password);
		  driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	}
	

}
