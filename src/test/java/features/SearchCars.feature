Feature: Acceptance testing to verify Search Cars page is working
  In order to validate that
  the search cars page is working fine
  we will perform acceptance testing

  Scenario: Validate search cars page
    Given I am on the home page "https://www.carsguide.com.au/" cars guide website
    When I move to menu
      | Menu       | 
      | buy + sell |
      | reviews    |
      | news       |
    And click on "New" link
    And select carbrand as "BMW" from Any Make dropdown
    And select carmodel as "1 Series" from Any Model dropdown
    And select location as "NSW - All" from Any Location dropdown
    And select the price as "$5,000" from Price dropdown
    And click on Find_My_Next_Car button
    Then I validate the title of the page as "New Bmw 1 Series Under 5000 for Sale NSW | carsguide"
    And I should see list of searched cars


