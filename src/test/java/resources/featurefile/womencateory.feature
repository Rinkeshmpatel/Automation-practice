Feature: Women category page
  As a user i should navigate to women category page and check products

  Scenario: verify user should navigate to women page successfully
    Given I am on home page
    When I click on women tab
    Then I can see women category page

  Scenario Outline: verify user should add product to the cart successfully
    Given I am on home page
    When I click on women tab
    And I select one "<product>"
    And I enter quantity "<qty>"
    And I select size "<size>"
    And I select color "<color>"
    And I click on add to cart
    Then I close popup

    Examples:
      | product                                | qty | size | color  |
      | Blouse                                 | 2   | M    | White  |
      | Printed Dress                          | 3   | L    | Orange |
      | Printed Chiffon Dress                  | 4   | S    | Green  |
      | Printed Summer Dress with Price $28.98 | 2   | M    | Blue   |y