#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.

Feature: Login Feature
  Scenario: Login functionality
    Given Launch the browser
    When User opens the url "https://admin-demo.nopcommerce.com/login"
    And User enters the username "admin@yourstore.com" and password as "admin"
    And clicks on Login button
    Then Home page should be displayed
    And title should be "Dashboard / nopCommerce administration"
    When User clicks on Logout button
    Then title should be "Your store. Login"
    And close the browser

 # @tag2
 # Scenario Outline: Title of your scenario outline
 #   Given I want to write a step with <name>
   # When I check for the <value> in step
  #  Then I verify the <status> in step

  #  Examples: 
  #    | name  | value | status  |
   #   | name1 |     5 | success |
   #   | name2 |     7 | Fail    |
