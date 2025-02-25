Feature: TC001 Orange HRM Apllication - automating skills functionality

Background: Common steps
				Given user lanch browser and maximize the page
				When User opens URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
				
Scenario Outline: TC001 Add Skills record - I am creating skills record
        And User enters username as "Admin" and password as "admin123"
        Then Go to the admin page
        Then Go to skills page
        Then Add skills with skillname as <SKILLNAME> and skilldescription as <SKILLDESCR>
        When User click logout 
        Then close the Browser 
        
        Examples: 
        |SKILLNAME|SKILLDESCR|
        |"Selenium1"|"Software course1"|
        |"Java1"|"Developer course1"|
        |"Service now1"|"learning course1"|
        
Scenario Outline: TC001 Add Jobs record - I am creating jobs record
        And User enters username as "Admin" and password as "admin123"
        Then Go to the admin page
        Then Go to Jobs page
        Then Add Jobtitle as <Jobtitle> jobdescr as <jobdescr> JobNote as <JobNote>
        When User click logout 
        Then close the Browser 
        
        Examples: 
        |Jobtitle|jobdescr|JobNote|
        |"Clerk1"|"adding data1"|"Associate1"|
        |"IT engineer1"|"working1"|"consultant1"|
        
Scenario Outline: TC001 Add Nationality record - I am creating Nationality record
        And User enters username as "Admin" and password as "admin123"
        Then Go to the admin page
        Then Go to Nationality page
        Then Add Nationality as <NationalityText>
        When User click logout 
        Then close the Browser 
        
        Examples:
        |NationalityText|
        |"Sam1231"|
        |"Sam2341"|
        