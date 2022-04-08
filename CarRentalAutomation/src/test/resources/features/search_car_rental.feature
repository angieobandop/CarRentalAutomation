## Author: natalia-09@outlook.com
#Scenario car rental

@SearchCarRental
Feature: Search the availability of cars to rent on the given date

  As a web user
  I want search the availability of cars and rental value
  To rent on the given date

  @Case1 @Critical
  Scenario: enter the destination page qalab
    Given "User" enters the website
    When  select country, city, model and date to search
    And   user must select car to rent, confirm and send personal data
    Then  user validate confirm rent


  @Case2 @Alternative
  Scenario: enter the destination page qalab
    Given "User" enters the website
    When  select country, city, model and date to search
    Then  user validate car rental list



