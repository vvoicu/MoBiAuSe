Feature: I just want to access the CMS site
To see if I can login and have my full name displayed on site after login

Scenario: User successfull login and fullname displayed on site

Given I am on CMS login page
When I insert my username "lucrup"
And I type my password "Lord-Gr33n"
And I click on login button
Then I see my full name "Lucian Rupa" displayed on central banner of My User Dashboard page