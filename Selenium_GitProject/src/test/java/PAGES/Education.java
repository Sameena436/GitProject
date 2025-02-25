package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;

public class Education {
	
	WebDriver driver;
	
	
		
		public void Education(WebDriver driver1)
		
		{
		
		this.driver=driver1;
		
		}
		
		//Education
		
		
		
		@Then("Go to Education page")
		public void go_to_education_page() 
		
		
		{

			//Admin
			
			  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")).click();	

			  //Qualifications
			  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[4]/span")).click();

			
			  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[4]/ul/li[2]/a")).click();
				
			  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();

			
		}
		
		
		@Then("Add Education with level as {string}")
		public void add_education_with_level_as(String level) {

			
			driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys(level);
			driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
		}
		
		

		
		
		
		


}
