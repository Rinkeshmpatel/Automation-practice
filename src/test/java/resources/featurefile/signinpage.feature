Feature: Sign in Page
  As a User I want to sign in on website

  Scenario:User Should Navigate To SignIn Page SuccessFully
    Given I am on Home Page
    When  I Click on SignIn Link
    Then  I verify that "AUTHENTICATION" message is displayed

  Scenario Outline: User verify The Error Message With In Valid Credentials
    Given I am on Home Page
    When I Click on SignIn Link
    And I enter "<Username>"
    And I enter a "<Password>"
    And I Click on SignIn Button
    Then I verify Error message "<Message>"

    Examples:
      | Username       | Password     | Message                    |
      |                | 123456       | An email address required. |
      | abcd@gmail.com |              | Password is required.      |
      | adfdfgfg       | 12345        | Invalid email address.     |
      | abcd@gmail.com | 123456       | Authentication failed.     |


  Scenario: User Should Login Successfully with Valid Credentials
    Given I am on Home Page
    When  I Click on SignIn Link
    And   I enter "ktest@gmail.com"
    And   I enter a "Test123456"
    And   I Click on SignIn Button
    Then  I verify Sign out link is display


  Scenario: User Should Logout Successfully
    Given I am on Home Page
    When  I Click on SignIn Link
    And   I enter "ktest@gmail.com"
    And   I enter a "Test123456"
    And   I Click on SignIn Button
    And   I click on Signout Link
    Then  I verify that Signin Link is didplay