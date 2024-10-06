Feature: Create Car Quote for used car

  Scenario: Create Car Quote for used car and continue until quote screen

    Given User should able to launch ON province car quoter screen
    When User should select all mandatory selections at all screen
    And User should able to select Used and Owned car at Vehicle Details Screen
    And User should able to select 0 to 5000 km at vehicle use screen
    And User should able to select No to all fields at savings and discount screen
    And User should able to add "TDI" at discount screen
    And User should able select required fields and Fname "Smith" Lname "Boss" at The Driver screen
    And User able to add address successfully "3529 Queen ST"


#    Then User should successfully see quote at quote screen

