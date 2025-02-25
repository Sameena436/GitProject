package PAGES;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;

public class Jobs {
	
	WebDriver driver;
	
	public void Jobs(WebDriver driver1)
	
	{
		
		this.driver=driver1;
	}
	
	public void go_to_jobs_page() {
		
		
		//admin
		
		  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[2]")).click();	
			 
		  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[1]/a")).click();
		  
		  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();	

		  
	}
			public void Enter_Job_details(String jobtitle, String jobdescr, String jobnote) {
				
					 
				  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys(jobtitle);	
					
				  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).sendKeys(jobdescr);	
					
				  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div[2]/textarea")).sendKeys(jobnote);	
					
				  driver.findElement(By.xpath("	//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[5]/button[2]")).click();

			}


			
			//Jobs data table with header
			
			public void Created_Jobs_DTWH(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {

			
				List<Map<String, String>> jobsData=dataTable.asMaps(String.class,String.class);
				
				for(int i=0;i<jobsData.size();i++) 
				
				{
				
					
					String JobName=jobsData.get(i).get("JobTitle");
					String JobDescr=jobsData.get(i).get("Job Descr");
					String JobNote=jobsData.get(i).get("Job Note");



					  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")).click();	
					  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[2]")).click();	
					  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[1]/a")).click();	
					  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();	
					  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys(JobName);	
					  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).sendKeys(JobDescr);	
					  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div[2]/textarea")).sendKeys(JobNote);	
					  driver.findElement(By.xpath("	//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[5]/button[2]")).click();

					
					Thread.sleep(5000);
					
				}
				
				
				}
				

			
			//Jobs data table without header
			
			public void Created_Jobs_DTWOH(io.cucumber.datatable.DataTable dataTable) throws InterruptedException 
			
			{

				 List<List<String>> JobsData=dataTable.cells();
					
					for(int i=0;i<JobsData.size();i++) 
					
					{  //0<3,1<3,2<3,3<3
										
						String JobName=JobsData.get(i).get(0); 
						String JobDescr=JobsData.get(i).get(1);
						String JobNote=JobsData.get(i).get(2);

						  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")).click();	
						  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[2]")).click();	
						  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[1]/a")).click();	
						  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();	
						  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys(JobName);	
						  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).sendKeys(JobDescr);	
						  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div[2]/textarea")).sendKeys(JobNote);	
						  driver.findElement(By.xpath("	//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[5]/button[2]")).click();

						
						Thread.sleep(5000);

				
				
			}

			
			}

			
			
}
