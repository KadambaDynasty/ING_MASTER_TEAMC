@UI
Feature: Capture list of centres in respective location

Scenario: validate the navigation to All Categories link
Given Luncht the browser and hit the url
When Navigate to All Categories Link
And Hover on Stores and playschools 
And  Hover to Playschools tab
And click on location pin Bengaluru
And click the city Bengaluru
And click on the centers and select Bangalore
Then Validate the Navigation from All Categories link




