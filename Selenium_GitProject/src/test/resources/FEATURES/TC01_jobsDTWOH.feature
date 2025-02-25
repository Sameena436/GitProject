Feature: TC001 Orange HRM Apllication - automating Jobs functionality

Background: Common steps
				Given user lanch browser and maximize the page
				When User opens URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
				
Scenario: Create Jobs Record
    And Log into Application with below credentials7
    			|Admin|admin123|
        Then created Jobs Record7
       		|Sales45|Sales45 descr|Sales45 Note|
					|Sales67|Sales67 descr|Sales67 Note|
					|Sales78|Sales78 descr|Sales78 Note|
        When User click logout 
        Then close the Browser 
        