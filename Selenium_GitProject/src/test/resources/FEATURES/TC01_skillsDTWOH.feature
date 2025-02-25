Feature: TC001 Orange HRM Apllication - automating Jobs functionality

Background: Common steps
				Given user lanch browser and maximize the page
				When User opens URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

  Scenario: Create SKills Record
    And Log into Application with below credentials7
    			|Admin|admin123|
    Then Created Skills Record7
					|Sales-AB|Sales-AB descr|
					|Sales-BC|Sales-BC descr|
					|Sales-CD|Sales-CD descr|
    When User click logout 
    Then close the Browser 
