package PAGES;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Skills {
	
	WebDriver driver;
	
	public void Skills(WebDriver driver1)
	
	{
		
		this.driver=(driver1);
	}

	
	public void Navigating_Skills_Page() {
		
		 //Admin
		  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")).click();	
		  
		  //Qualifications
		  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[4]/span")).click();
		  
		  //Skills
		  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[4]/ul/li[1]/a")).click();
			
		  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();


	}
	
	public void Entering_Skills_details(String SkillName, String SkillDescr) {
		
		  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys(SkillName);
		  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).sendKeys(SkillDescr);
		  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
		  
	
	}
	
	
	// skills data table with header
	
	public void login_DTWH(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {

		List<Map<String, String>> login=dataTable.asMaps(String.class,String.class);
		
		String username1=login.get(0).get("USERNAME");
		String password1=login.get(0).get("PASSWORD");
		
		 driver.findElement(By.name("username")).sendKeys(username1);
		 driver.findElement(By.name("password")).sendKeys(password1);
		 driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		  Thread.sleep(5000);

	}
	
	public void Created_Skills_DTWH(io.cucumber.datatable.DataTable dataTable) throws InterruptedException 
	
	{

		List<Map<String, String>> SkillsData=dataTable.asMaps(String.class,String.class);
		
		for(int i=0;i<SkillsData.size();i++) 
		
		{
		
			
			String SkillName=SkillsData.get(i).get("SKILLNAME");
			String SkillDescr=SkillsData.get(i).get("SKILLDESCR");
			
			driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")).click();
			  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[4]")).click();
			  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[4]/ul/li[1]/a")).click();
			  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();

			  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys(SkillName);
			  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).sendKeys(SkillDescr);
			  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
		
			  
			  
			  Thread.sleep(5000);		
			  
		
		}
		}

	
	
	//Skills data table without header

	
	public void login_DTWOH(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {

		String username1=dataTable.cell(0, 0);
		String password1=dataTable.cell(0, 1);
		
		 driver.findElement(By.name("username")).sendKeys(username1);
		 driver.findElement(By.name("password")).sendKeys(password1);
		 driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		  Thread.sleep(5000);
		
	}

	
	public void Created_Skills_DTWOH(io.cucumber.datatable.DataTable dataTable) throws InterruptedException 
	
	{

		 List<List<String>> SkillsData=dataTable.cells();
			
			for(int i=0;i<SkillsData.size();i++) 
			
			{  //0<3,1<3,2<3,3<3
				
				String SkillName=SkillsData.get(i).get(0);  //0,0
				String SkillDescr=SkillsData.get(i).get(1); //0,1
				

				 driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")).click();
				  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[4]")).click();
				  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[4]/ul/li[1]/a")).click();
				  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();

				  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys(SkillName);
				  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).sendKeys(SkillDescr);
				  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
		
				  Thread.sleep(5000);
				  
			}

	}
}

