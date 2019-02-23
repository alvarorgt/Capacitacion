Feature: Login in training site
	I as a user with privileges
	want can login in my application
	for access to my main page
	
	Scenario: Login Successful
		Given That i am in the login page
		When I type the data
			|user|pass|
			|test|secret|
		Then I enter the application