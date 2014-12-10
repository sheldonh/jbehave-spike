Scenario: Add two different positive integers
Given I have a calculator
When I make the calculator add two different positive integers
Then I get the sum of the two positive integers

Scenario: Add positive integer to itself
Given I have a calculator
When I make the calculator add a positive integer to itself
Then I get double the positive integer

Scenario: Add zero to a positive integer
Given I have a calculator
When I make the calculator add zero to a positive integer
Then I get the positive integer

Scenario: Add a positive integer to zero
Given I have a calculator
When I make the calculator add a positive integer to zero
Then I get the positive integer

Scenario: Add zero to itself
Given I have a calculator
When I make the calculator add zero to itself
Then I get zero
