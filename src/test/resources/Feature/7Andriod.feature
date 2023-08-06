Feature: Mortgage Request
  Scenario Outline: Mortgage Request
    Given User can apply for Mortgage
    And Click on Mortgage Request
    And Input User '<FirstName>' and '<LastName>'
    And input '<Age>'
    And Input Users '<AddressOne>' and '<AddressTwo>'
    And Choice '<Country>'
    And Select Users info
    Then Save These
    Examples:
    |FirstName|LastName|Age|AddressOne|AddressTwo|Country|
    |Tasnim   |Hasan   |30 |Banani    |Dhaka     |BD     |