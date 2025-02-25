package STEPS1;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import PAGES.*;

public class stepdefination {
	
	WebDriver driver;
	
	login lp;
	Jobs jb;
	Homepage hp;
	Skills sp;
	Nationality np;
	Education ep;
	
	
	@Given("user lanch browser and maximize the page")
	public void user_lanch_browser_and_maximize_the_page() {
		
		driver = new ChromeDriver();  
		driver.manage().window().maximize();


	}
	
	
	@When("User opens URL {string}")
	public void user_opens_url(String TESTURL) {
		
		lp=new login();
		lp.login(driver);
		lp.user_opens_url(TESTURL);
		
		

	}
	
	
	@When("User enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String username, String password) {
		
      lp.login_validation(username, password);

	}
	
	
	/*
	
    @Then("Go to the admin page")
	public void go_to_the_admin_page() {
		
		 //Admin
		  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")).click();	


	} */
	
	
	
	@Then("Go to skills page")
	public void go_to_skills_page() {
		
		 sp=new Skills();
		 sp.Skills(driver);
		 sp.Navigating_Skills_Page();
		  

	}
	
	
	@Then("Add skills with skillname as {string} and skilldescription as {string}")
	public void add_skills_with_skillname_as_and_skilldescription_as(String SkillName, String SkillDescr) {
		
		sp.Entering_Skills_details(SkillName, SkillDescr);


	}
	
	
	@When("User click logout")
	public void user_click_logout() {
		
	hp=new Homepage();
	hp.Homepage(driver);
	hp.user_click_logout();

	}
	
	
	@Then("close the Browser")
	public void close_the_browser() {
		
		hp.close_the_browser();
		
		//driver.quit();

	}


	@Then("Go to Jobs page")
	public void go_to_jobs_page() {
					
      jb=new Jobs();
      jb.Jobs(driver);
      jb.go_to_jobs_page();
	
	}
	
	
	@Then("Add Jobtitle as {string} jobdescr as {string} JobNote as {string}")
	public void add_jobtitle_as_jobdescr_as_job_note_as(String jobtitle, String jobdescr, String jobnote) {
		
     jb.Enter_Job_details(jobtitle, jobdescr, jobnote);
	
	}

	@Then("Go to Nationality page")
	public void go_to_nationality_page() {
		
           np=new Nationality();
           np.Natonality(driver);
           np.Navigating_nationality();
	
	}
	
	
	@Then("Add Nationality as {string}")
	public void add_nationality_as(String Nation) {
		
		np.add_nationality_as(Nation);
		
	}
	
   // skills data table with header	
	
	
	@When("Log into Application with below credentials6")
	public void log_into_application_with_below_credentials2(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {

		
		
		sp=new Skills();
		sp.Skills(driver);
		sp.login_DTWH(dataTable);

	
		
	}
	
	
	@Then("Created Skills Record6")
	public void created_skills_record2(io.cucumber.datatable.DataTable dataTable) throws InterruptedException 
	
	{
		
		sp.Created_Skills_DTWH(dataTable);
		
		
	}
		
	
	
	
	//Skills data table without header

	
	@When("Log into Application with below credentials7")
	public void log_into_application_with_below_credentials7(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
          
		
		sp=new Skills();
		sp.Skills(driver);
		sp.login_DTWOH(dataTable);
		
	}
	
	
	@Then("Created Skills Record7")
	public void created_skills_record7(io.cucumber.datatable.DataTable dataTable) throws InterruptedException 
	
	{

		sp.Created_Skills_DTWOH(dataTable);
		
	}

	
	//Jobs data table with header
	
	@Then("created Jobs Record")
	public void created_jobs_record(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {

	
		
		jb=new Jobs();
		jb.Jobs(driver);
		jb.Created_Jobs_DTWH(dataTable);
			
		}
		
		
		
		

	
	//Jobs data table without header
	
	@Then("created Jobs Record7")
	public void created_jobs_record7(io.cucumber.datatable.DataTable dataTable) throws InterruptedException 
	
	{
				
		jb=new Jobs();
		jb.Jobs(driver);
		jb.Created_Jobs_DTWOH(dataTable);
		
	}

	
	
	//Education
	
	/*
	@Then("Go to the admin page")
	public void go_to_the_admin_page() 
	
	{

		 //Admin
		  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")).click();	
		  
		
	
	} */
	
	
	@Then("Go to Education page")
	public void go_to_education_page() 
	
	
	{

           ep=new Education();
           ep.Education(driver);
           ep.go_to_education_page();
		
	}
	
	
	@Then("Add Education with level as {string}")
	public void add_education_with_level_as(String level) {

		
           ep.add_education_with_level_as(level);
	}
	
	

	
	// Pay Grades
	
	@Then("Go to the admin page")
	public void go_to_the_admin_page() 
	
	{

		  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")).click();	

		
	}
	
	
	@Then("Go to Pay Grades page")
	public void go_to_pay_grades_page() 
	
	{

		  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span")).click();	
		  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[2]/a")).click();
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
		  
		  
	}
	
	
	@Then("Add Pay Grade as {string}")
	public void add_pay_grade_as(String Paygrade) {
		
				
			driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/input")).sendKeys(Paygrade);
			

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	





	

	




