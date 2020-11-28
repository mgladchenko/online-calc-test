Basic Math operations
Meta: @basic-math-operations

Narrative:
  In order to verify online Calc app
  As a regular Web user
  I want to be able execute basic math operations

Lifecycle: Before: Scope: SCENARIO
Given I open online Calc app
When I select C operation
Then I should see 0 value on screen

Scenario: Addition operation
Meta: @addition
When I enter <value1> value
Then I should see <value1> value on screen
When I select <operation> operation
Then I should see <value1> value on screen
When I enter <value2> value
Then I should see <value2> value on screen
When I select = operation
Then I should see <result> value on screen

Examples:
| value1    | value2     | operation| result     |
| 1         | 1          | +        | 2          |
| 1         | -1         | +        | 0          |
| 1         | 0          | +        | 1          |
| 1         | 0.5        | +        | 1.5        |
| 1         | 0.99999999 | +        | 1.99999999 |
| 1         | 999999999  | +        | 1e+9       |

Scenario: Subtraction operation
Meta: @substraction
When I enter <value1> value
Then I should see <value1> value on screen
When I select <operation> operation
Then I should see <value1> value on screen
When I enter <value2> value
Then I should see <value2> value on screen
When I select = operation
Then I should see <result> value on screen

Examples:
| value1    | value2     | operation| result     |
| 1         | 1          | -        | 0          |
| 1         | -1         | -        | 2          |
| 1         | 0          | -        | 1          |
| 1         | 0.5        | -        | 0.5        |
| 1         | 0.11111111 | -        | 0.88888889 |
| 1         | -999999999 | -        | 1e+9       |

Scenario: Multiplication operation
Meta: @multiplication
When I enter <value1> value
Then I should see <value1> value on screen
When I select <operation> operation
Then I should see <value1> value on screen
When I enter <value2> value
Then I should see <value2> value on screen
When I select = operation
Then I should see <result> value on screen

Examples:
| value1    | value2     | operation| result     |
| 1         | 1          | *        | 1          |
| 1         | -1         | *        | -1         |
| 1         | 0          | *        | 0          |
| 1         | 0.5        | *        | 0.5        |
| 1         | 0.12345678 | *        | 0.12345678 |
| 10        | 100000000  | *        | 1e+9       |

Scenario: Division operation
Meta: @division
When I enter <value1> value
Then I should see <value1> value on screen
When I select <operation> operation
Then I should see <value1> value on screen
When I enter <value2> value
Then I should see <value2> value on screen
When I select = operation
Then I should see <result> value on screen

Examples:
| value1    | value2     | operation| result     |
| 1         | 1          | /        | 1          |
| 1         | -1         | /        | -1         |
| 1         | 0          | /        | Error      |
| 1         | 0.5        | /        | 2          |
| 1         | 0.11111111 | /        | 9.00000009 |
| 1         | 100000000  | /        | 1e-8       |

