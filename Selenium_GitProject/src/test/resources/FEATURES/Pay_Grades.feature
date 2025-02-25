Feature: TC001 Orange HRM Apllication - automating skills functionality

Background: Common steps
				Given user lanch browser and maximize the page
				When User opens URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
				
Scenario: TC001 Add Pay Grades Record - I am Pay Grade record
        And User enters username as "Admin" and password as "admin123"
        Then Go to the admin page
        Then Go to Pay Grades page
        Then Add Pay Grade as "A1"
        When User click logout 
        Then close the Browser 
             