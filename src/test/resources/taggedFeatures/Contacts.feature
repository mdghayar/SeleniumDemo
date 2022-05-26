@Phase1
Feature: Contacts Functionality
User should be able to create, edit, view or delete contact details

Background: login before each scenario
Given User must be logged in

@RegressionTest @SmokeTest
Scenario: Create a contact
#Given User must be logged in
When User create a contact

@RegressionTest
Scenario: Edit a contact
#Given User must be logged in
When User edit a contact

@SmokeTest
Scenario: View a contact
#Given User must be logged in
When User view a contact

Scenario: Delete a contact
#Given User must be logged in
When User delete a contact

