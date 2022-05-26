
@GooglePage

Feature: Search Languages
  I want to use this template for my feature file

#adding this line to test git push

  @tag1
  Scenario: Java Tutorial
    Given User is on Google Page
    When User search Java tutorial
    Then Should display Java Search Result Page
    
    
  @tag2
  Scenario: Selenium Tutorial
    Given User is on Google Page
    When User search Selenium tutorial
    Then Should display Selenium Search Result Page



 # @tag2
  #Scenario Outline: Title of your scenario outline
  #  Given I want to write a step with <name>
   # When I check for the <value> in step
   # Then I verify the <status> in step

  #  Examples: 
  #    | name  | value | status  |
   #   | name1 |     5 | success |
    #  | name2 |     7 | Fail    |
