Feature: Registration and Login

  @Test1
  Scenario: Registration and Login
    Given Navigate to sharelane.com
    When You've been navigated to it, click Sign-up
    And Enter ZIP code
    Then Click Continue
    And Enter first name
    And Enter last name
    And Enter email
    And Enter password
    And Enter confirmation password
    Then Click Register
    When You've been registered, click underlined here
    Then Enter email
    And Enter password login
    And Click Login
    Then You've been signed in

    @Test2
    Scenario: Registration and Login
      Given Navigate to sharelane.com
      When You've been navigated to it, click Sign-up
      And Enter ZIP code
      Then Click Continue
      And Enter first name
      And Enter last name
      And Enter email
      And Enter password
      And Enter confirmation password
      Then Click Register
      When You've been registered, click underlined here
      Then Enter email
      And Enter password login
      And Click Login
      Then You've been signed in