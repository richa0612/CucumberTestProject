Feature: Acceptance testing to verify Search Cars page is working
  In order to validate that
  the search cars page is working fine
  we will perform acceptance testing

  Scenario: Validate used cars search page
    Given I am on the home page "https://www.carsguide.com.au/" cars guide website
    When I move to menu
      | Menu       | 
      | buy + sell |
      | reviews    |
      | news       |
    And click on submenu "Used" link
        And select carbrand as "Audi" from Any Make dropdown on Used Car Search page
    And select car model on Used Car Search page
      | CarModel   |
      | A4         |
      | A3         |
    And select location as "NT - All" from Any Location dropdown on Used Car Search page
    And select the price as "$3,000" from Price dropdown on Used Car Search page
    And click on Find_My_Next_Car button on Used Car Search page
    Then I validate the title of the page as "Used Audi A4 Under 3000 for Sale NT | carsguide"
    And I should see list of used searched cars