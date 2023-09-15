Feature: EaseMyTrip Application

  Scenario: Open EasyMyTrip application and search for flights
    Given EaseMyTrip application is opened
    When User clicks on flights
    And User clicks on Round Trip
    And User clicks on From
    And User enters origin city
    And User clicks on To
    And User clicks on destination city
    And User clicks on Departure date
    And User selects Departure date
    And User clicks on Return date
    And User selects on Return date
    And User clicks on Travellers
    And User selects no of travellers
    And User clicks on Done
    And User clicks on Class
    And User selects on Economy
    And User clicks on search
    Then User is displayed the search results page
