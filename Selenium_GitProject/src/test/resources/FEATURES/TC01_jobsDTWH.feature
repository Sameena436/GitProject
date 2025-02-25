Feature: TC001 Orange HRM Apllication - automating Jobs functionality

Background: Common steps
				Given user lanch browser and maximize the page
				When User opens URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
				
Scenario: Create Jobs Record
    And Log into Application with below credentials6
    			|USERNAME|PASSWORD|
    			|Admin|admin123|
        Then created Jobs Record
          |JobTitle|Job Descr|Job Note|
       		|Sales1|Sales1 descr|Sales1 Note|
					|Sales2|Sales2 descr|Sales2 Note|
					|Sales3|Sales3 descr|Sales3 Note|
        When User click logout 
        Then close the Browser 
        