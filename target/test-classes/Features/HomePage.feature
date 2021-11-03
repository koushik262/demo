Feature: Login into Application

Scenario Outline: positive test validating
Given Initialize browser with chrome
And Navigate to "https://www.elocalshops.com/" site
And click on login link in home page to land on secure sign in page
When User enters <username> and <password> and logs in
And close the driver


Examples: 
|username		|password		|
|koushik		|12345			|
|saikrishna		|67897			|

