Feature: To validate the Flipkart Application

  Background:
    Given Launch the Flipkart Application
    When Close the popup
    Then It should navigate to the Home page

  @tc001 @Regression
  Scenario: To validate the search functionality
    Given User enters the text in the search field
    When User clicks the search button
    Then It should navigate to the search results page and display the relevant results
    Then extract the result and print in console
    Then print the third result and keep it in the console
    And Select min and max amount
    And Select the brand
    And Select the RAM
    And Select the battery capacity
    Then It should display the relevant result

  @tc002 @Regression
  Scenario: To validate the fashion functionality
    Given User moves to the fashion link
    When The cursor moves to the kids link
    And Move to girls' dresses and click
    And Click the price low-to-high link
    Then It should display the relevant results and get the title

  @tc003
  Scenario Outline: To validate the search functionality with different values
    Given User enters "<searchtext>" in the search field
    When Clicking on the search button
    Then It should navigate to the next page and display the corresponding pages

    Examples:
      | searchtext |
      | Mobile     |
      | TV         |
      | Speaker    |
      | Shirts     |

  @tc004
  Scenario: To validate add-to-cart functionality
    Given User moves to the login
    When User clicks the Flipkart Plus Zone
    And Mouse moves to the Home & Furniture link
    And Clicks on the wall lamp
    And Scrolls down the page and clicks on a particular result
    And Enters the delivery pincode and clicks on the check link
    Then Pincode should be checked and displayed, and verify the title
