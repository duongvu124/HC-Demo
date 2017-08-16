Narrative:
In order verify deposit function
As a new account
I want to deposit money

Scenario: User create new customer successfully
Meta:
@tag component:UI
@tag tool:jbehave

Scenario: New account deposit successfully
Given User login with "<userId>" and "<password>" successfully
And New account want to deposit
When New account input "<accountNo>" and "<amount>" and "<description>" and submit
Then New account has deposited
Examples:
|userId|password|accountNo|amount|description
|mngr91821|udaneqE|31552|3000000|thang 4


Scenario: Reset all fields of Deposit page
Given User login with "<userId>" and "<password>" successfully
And New account want to deposit
When New account input "<accountNo>" and "<amount>" and "<description>" and reset
Then All fields of deposit page blank
Examples:
|userId|password|accountNo|amount|description
|mngr91821|udaneqE|31552|3000000|thang 4


Scenario: New account enter blank info when deposit
Given User login with "<userId>" and "<password>" successfully
And New account want to deposit
When New account input "<accountNo>" and "<amount>" and "<description>" and submit
Then Alert "<alertText>" is displayed
Examples:
|userId|password|accountNo|amount|description|alertText
|mngr91821|udaneqE||3000000|thang 4|please fill all fields
|mngr91821|udaneqE|31552||thang 4|please fill all fields
|mngr91821|udaneqE|31552|3000000||please fill all fields


Scenario: New account deposit with wrong accountNo
Given User login with "<userId>" and "<password>" successfully
And New account want to deposit
When New account input "<accountNo>" and "<amount>" and "<description>" and submit
Then Alert "<alertText>" is displayed
Examples:
|userId|password|accountNo|amount|description|alertText
|mngr91821|udaneqE|31|3000000|thang 4|Account does not exist