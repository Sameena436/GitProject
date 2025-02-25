Feature: TC001 Orange HRM Apllication - automating Nationality functionality

Background: Common steps
				Given user lanch browser and maximize the page
				When User opens URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
				
Scenario: TC001 Add Nationality record - I am creating Nationality record
        And User enters username as "Admin" and password as "admin123"
        Then Go to the admin page
        Then Go to Nationality page
        Then Add Nationality as "Peru13" 
        When User click logout 
        Then close the Browser 
        
       