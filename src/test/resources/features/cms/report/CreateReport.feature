Feature: As a CMS analyst I want to login into Alfresco and create a brand new report

Background: User Login

Given I am on CMS login page
When I insert my username "lucrup"
And I type my password "Lord-Gr33n"
And I click on login button
Then I see my full name "Lucian Rupa" displayed in right corner of My User Dashboard page

Scenario: User access My Site section to create a new report

Given I go to My Sites section and click on site "Autos Content" to create new content
When I click on create new report link to create a new report
And I select publication title "United Kingdom Autos Report" from the list
#And I see displayed report frequency "Quarterly" in the grayed out inputfield
And I select year "2016" and quarter value "Q4" from the dropdown
Then I click on next button to create a new report
And I click on the provided link to open the report details page
Then I should see new report loaded successfully in the same page and in report metadata the following report name "United Kingdom Autos Report" and issue "Q4 2016"