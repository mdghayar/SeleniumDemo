@Phase2
Feature: Tasks Functionality
User should be able to create, edit, view or delete tasks details

Scenario: Create a task
Given User must be logged in
When User create a task

@RegressionTest
Scenario: Edit a task
Given User must be logged in
When User edit a task

@SmokeTest
Scenario: View a task
Given User must be logged in
When User view a task

Scenario: Delete a task
Given User must be logged in
When User delete a task