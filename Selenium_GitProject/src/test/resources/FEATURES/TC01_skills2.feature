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
        |"Selenium"|"Software course"|
        |"Java"|"Developer course"|
        |"Service now"|"learning course"|
        