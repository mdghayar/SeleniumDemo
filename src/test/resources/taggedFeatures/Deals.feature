@Phase1
Feature: Deals Functionality
User should be able to create, edit, view or delete deals details

Background: login before each scenario
Given User must be logged in

Scenario: Create a deal
#Given User must be logged in
When User create a deal

@RegressionTest
Scenario: Edit a deal
#Given User must be logged in
When User edit a deal

@SmokeTest
Scenario: View a deal
#Given User must be logged in
When User view a deal

Scenario: Delete a deal
#Given User must be logged in
When User delete a deal
