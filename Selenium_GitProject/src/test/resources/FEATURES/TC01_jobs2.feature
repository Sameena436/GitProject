Feature: TC001 Orange HRM Apllication - automating Jobs functionality

Background: Common steps
				Given user lanch browser and maximize the page
				When User opens URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
				
Scenario Outline: TC001 Add Jobs record - I am creating jobs record
        And User enters username as "Admin" and password as "admin123"
        Then Go to the admin page
        Then Go to Jobs page
        Then Add Jobtitle as <JobTitle> jobdescr as <Job Descr> JobNote as <Job Note>
        When User click logout 
        Then close the Browser 
        
        Examples:
        |JobTitle|Job Descr|Job Note|
        |"Sales4"|"Sales4 Descr"|"Sales4 Note"|
        |"Sales5"|"Sales5 Descr"|"Sales5 Note"|