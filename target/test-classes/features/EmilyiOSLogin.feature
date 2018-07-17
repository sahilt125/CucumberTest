Feature: Emily login

  Scenario Outline: login with username and password
    Given User is on Emily Website on device "<Device>" with OS version "<OSVersion>"
    When User clicks on Sign in button
    And User enters Username "<UserName>"
    And User enters Password "<Password>"
    And User clicks on Login button
    Then User is successfully logged in
    
    Examples:
    | UserName              | Password    |Device  |OSVersion|
    | Kanchan@weareloup.com | Kanpassword |iPhone 8|11.0     |
 