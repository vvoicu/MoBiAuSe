Feature: This is a scenario for testing the creation of a new module in a site content


Background: I am already login into CMS site

Given I am on CMS login page
When I insert my username "lucrup"
And I type my password "Lord-Gr33n"
And I click on login button
Then I see my full name "Lucian Rupa" displayed in right corner of My User Dashboard page

Scenario: Select a site then create a new module

Given I go to My Sites section and click on site "Autos Content" to create new content
When I click on create new content module link to create a new module
When I select a category "BMI View" from the list
And I select geography name "Romania" from the list
And I select service "Dealerships" from the list
And I click on Next-Create Module button to create a new module
And I click on the link to open the module details page
Then I should see new module loaded successfully in the same page and in module metadata with the following category "BMI View" , geography "Romania" and service "Dealerships"