Feature: feature to genetare registration

  @TC_L_01
  Scenario: create login page
    Given User opens the Ds Algo portal link
    When The user clicks the Get Started button
    Then The user on  homepage 
    @TC_L_02
    Scenario:  Register page
    Given  User opens the homepage 
    When User clicks Register
    Then User should redirected to register page
    
    @TC_L_03
    Scenario: login
    Given User should redirected to register page
    When User enters username "komala"
    And user enters password "Koms@123"
    And user enters confpassword "Koms@123"
    Then User click the Register button
    

    