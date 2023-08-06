Feature: Making Payment
  Scenario Outline: Payment Making
    Given User is Shown the HomePage
    And Click on the Payment making
    And Giving '<PhoneNumber>' And '<name>'
    And Giving '<amount>' and '<Country>'
    Then Click Send payment
    Examples:
    | PhoneNumber |name|amount|Country|
    | 1234        |Kanon|1    |USA    |