Feature: Create radication agreement on principal page
		I Want to create a radication agreement for users with profile Aux.Administrativo
	
	Scenario: Radication Successful
		Given On principal page login with user with profile Aux.Administrativo	
		When I select the option of convenios
		Then I should execute all process for create a radication of agreement and get a number of radicate 