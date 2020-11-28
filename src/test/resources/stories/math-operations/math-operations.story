Basic Math operations

Meta:
@math-operations

Narrative:
  In order to verify online Calc app
  As a regular Web user
  I want to be able execute basic math operations

Lifecycle:
Before:
Scope: SCENARIO
Given I open online Calc app
When I select C operation
Then I should see 0 value on screen

Scenario: Addition operation
When I enter <value1> value
Then I should see <value1> value on screen
When I select <operation> operation
Then I should see <value1> value on screen
When I enter <value2> value
Then I should see <value2> value on screen
When I select = operation
Then I should see <result> value on screen

Examples:
| value1 | value2 | operation| result|
| 2      | 2      | +        | 4     |
| -1     | 1      | +        | 0     |

