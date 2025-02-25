Feature: TC001 Orange HRM Apllication - automating Jobs functionality

Background: Common steps
				Given user lanch browser and maximize the page
				When User opens URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

  Scenario: Create SKills Record
    And Log into Application with below credentials6
    			|USERNAME|PASSWORD|
    			|Admin|admin123|
    Then Created Skills Record6
    			|SKILLNAME|SKILLDESCR|
					|Sales444|Sales444 descr|
					|Sales333|Sales333 descr|
					|Sales222|Sales222 descr|
    When User click logout 
    Then close the Browser 
