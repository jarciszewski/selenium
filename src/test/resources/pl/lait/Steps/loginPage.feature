Feature: Login page test

Scenario: Open main page and click in the top bar links
	Given I open main page
	When I click SIGN-ON link
	Then I should see the login page
	
Scenario: Fill the reservation form
	Given I open main page
	When I click SIGN-ON link
	Then I should see the login page
	When I log in as "jakuba" with password "qwe123" 
	And I fill one passenger flight
	And Dates for tomorrow
	And From flights: "Boston" 
	And To flight: "London" 
	And Close the browser