Feature: To validate the Flipkart Application

  Background:
    Given Launch the Flipkart Application
    When Close the popup
    Then It should navigate to the Home page

  Scenario: To validate the search functionality
    Given User enters the text in the search field
    When User clicks the search button
    Then It should navigate to the search results page and display the relevant results