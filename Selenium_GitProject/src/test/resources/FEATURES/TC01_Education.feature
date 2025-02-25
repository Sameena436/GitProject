Feature: TC001 Orange HRM Apllication - automating skills functionality

Background: Common steps
				Given user lanch browser and maximize the page
				When User opens URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
				
Scenario: TC001 Add Education record - I am creating Education record
        And User enters username as "Admin" and password as "admin123"
        Then Go to Education page
        Then Add Education with level as "MBA"
        When User click logout 
        Then close the Browser 
             