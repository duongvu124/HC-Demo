
Narrative:
In order verify account creation function
As a new customer
I want to create new account

Scenario: New customer create new account successfully
Meta:
@tag component:UI
@tag tool:jbehave

Given User login with "<userId>" and "<password>" successfully
And New customer want to create account
When New customer input "<customerId>" and "<accountType>" and "<deposit>" and submit
Then Account is created
Examples:
|userId|password|customerId|accountType|deposit
|mngr91821|udaneqE|7086|Current|120000


Scenario:  Reset all fields of new account page
Given User login with "<userId>" and "<password>" successfully
And New customer want to create account
When New customer input "<customerId>" and "<accountType>" and "<deposit>" and reset
Then All fields of new account page blank
Examples:
|userId|password|customerId|accountType|deposit
|mngr91821|udaneqE|7086|Current|120000


Scenario: New customer enter blank info when creating new account
Given User login with "<userId>" and "<password>" successfully
And New customer want to create account
When New customer input "<customerId>" and "<accountType>" and "<deposit>" and submit
Then Alert "<alertText>" is displayed
Examples:
|userId|password|customerId|accountType|deposit|alertText
|mngr91821|udaneqE||Current|120000|please fill all fields
|mngr91821|udaneqE|7086|Current||please fill all fields


Scenario: Customer create new account with wrong customer id
Given User login with "<userId>" and "<password>" successfully
And New customer want to create account
When New customer input "<customerId>" and "<accountType>" and "<deposit>" and submit
Then Alert "<alertText>" is displayed
Examples:
|userId|password|customerId|accountType|deposit|alertText
|mngr91821|udaneqE|76|Current|120000|Customer does not exist!!