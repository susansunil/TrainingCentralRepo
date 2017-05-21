Feature: Task Management
Description: As an admin, I want to manage the tasks created for the project

@ForUnitTest
Scenario: Data should be valid
Given admin has entered task name as "name", start date as "date1", end date as "date2", efforts as 10
When click on button "Save"
Then system displays success message as "Saved successfully"

@ReadyToTest
Scenario: Failure message on invalid data
Given admin has entered task name as "name", start date as "date1", end date as "date2", efforts as 10
When click on button "Save"
Then system validate date range against efforts
And system validates start date and end date and shows failure message as "Mismatch in duration and efforts"

@ReadyToTest
Scenario: Cancel data entry
Given admin has entered task name as "name", start date as "date1", end date as "date2", efforts as 10
When click on button "Cancel"
Then system clear all the data shows message as "Form reset"

@tag1
@tag2
Scenario: to validate the date range
Given user enters start date as "date1" and end date as "date2"
When click on "Compare" button
Then system checks start date is earlier than end date and displays success message

@TestUI
Scenario: Google Search
Given webuser enters "CSM Certification" in "Google"
When opens "Firefix" and click on "Search"
Then system displays websearch results