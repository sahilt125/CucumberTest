Feature: login feature

  Scenario Outline: login with username and password
    And User enters Username "<UserName>"
    And User enters Password "<Password>"
    And User clicks on Login button
    Then User is successfully logged in
    
    Examples:
    | UserName      | Password    |
    | test_username | test_Password |
 