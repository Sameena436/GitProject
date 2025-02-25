package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Nationality {
	
	WebDriver driver;
	
	public void Natonality(WebDriver driver1)
	
	{
		
		this.driver=(driver1);
		
	}

	public void Navigating_nationality() {
		
		  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")).click();	
		  driver.findElement(By.xpath("//a[text()='Nationalities']")).click();
		  driver.findElement(By.xpath("//button[text()=' Add ']")).click();

	
	}

	public void add_nationality_as(String Nation) {
		
		  driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys(Nation);
		  driver.findElement(By.xpath("//button[text()=' Save ']")).click();

	}
	
	
}
