@MeruryWebsiteTest
Feature: Mercury website validations.

  @MercuryLogin @Regression
  Scenario: Validate Login functionality
    Given I launch the mercury URL.
    When I enter "UserName" as "admin"
    And I enter "Password" as "admin"
    And I click on "Login" button
    Then I should see "Login Successfully" text

  @MercuryLogin2 @Smoke
  Scenario Outline: Validate Login functionality

    Given I launch the mercury URL.
    When I enter "UserName" as "<UserName>"
    And I enter "Password" as "<Password>"
    Then I click on "Login" button
    And I should see "<LoginText>" text

    @DemoTag
    Examples:
      | UserName | Password | LoginText          |
      | admin    | admin    | Login Successfully |
      | text     | text     | Login Successfully |
      | demo     | demo     | Login Successfully |


    @LoginwithTest
    Examples:
      | UserName | Password | LoginText          |
      | test     | test     | Login Successfully |