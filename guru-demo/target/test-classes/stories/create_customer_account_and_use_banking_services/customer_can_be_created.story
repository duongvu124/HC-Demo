Narrative:
In order verify customer creation function
As a new user
I want to create new customer

Scenario: User create new customer successfully
Meta:
@tag component:UI
@tag tool:jbehave

Given User login with "<userId>" and "<password>" successfully
And User want to create new customer
When User input "<name>" and "<gender>" and "<dob>" and "<address>" and "<citi>" and "<state>" and "<pin>" and "<mobile>" and "<email>" and "<pass>" and submit
Then New customer is created
Examples:
|userId|password|name|gender|dob|address|citi|state|pin|mobile|email|pass
|mngr91821|udaneqE|Duong|male|12/04/1988|2 Ngo Duc Ke|HCM|VN|123456|0902646433|duong_vu161@yahoo.com|123456


Scenario: All fields of new customer page blank
Given User login with "<userId>" and "<password>" successfully
And User want to create new customer
When User input "<name>" and "<gender>" and "<dob>" and "<address>" and "<citi>" and "<state>" and "<pin>" and "<mobile>" and "<email>" and "<pass>" and reset
Then All fields of new customer page blank
Examples:
|userId|password|name|gender|dob|address|citi|state|pin|mobile|email|pass
|mngr91821|udaneqE|Duong|male|12/04/1988|2 Ngo Duc Ke|HCM|VN|123456|0902646433|duong_vu153@yahoo.com|123456

Scenario: User create new customer with email address already exist
Given User login with "<userId>" and "<password>" successfully
And User want to create new customer
When User input "<name>" and "<gender>" and "<dob>" and "<address>" and "<citi>" and "<state>" and "<pin>" and "<mobile>" and "<email>" and "<pass>" and submit
Then Alert "<alertText>" is displayed
Examples:
|userId|password|name|gender|dob|address|citi|state|pin|mobile|email|pass|alertText
|mngr91821|udaneqE|Duong|male|12/04/1988|2 Ngo Duc Ke|HCM|VN|123456|0902646433|duong_vu146@yahoo.com|123456|Email Address Already Exist !!


Scenario: User create new customer with customer name blank
Given User login with "<userId>" and "<password>" successfully
And User want to create new customer
When User input "<name>" and "<gender>" and "<dob>" and "<address>" and "<citi>" and "<state>" and "<pin>" and "<mobile>" and "<email>" and "<pass>" and submit
Then Alert "<alertText>" is displayed
Examples:
|userId|password|name|gender|dob|address|citi|state|pin|mobile|email|pass|alertText
|mngr91821|udaneqE||male|12/04/1988|2 Ngo Duc Ke|HCM|VN|123456|0902646433|duong_vu140@yahoo.com|123456|please fill all fields


Scenario: User create new customer with customer DOB blank
Given User login with "<userId>" and "<password>" successfully
And User want to create new customer
When User input "<name>" and "<gender>" and "<dob>" and "<address>" and "<citi>" and "<state>" and "<pin>" and "<mobile>" and "<email>" and "<pass>" and submit
Then Alert "<alertText>" is displayed
Examples:
|userId|password|name|gender|dob|address|citi|state|pin|mobile|email|pass|alertText
|mngr91821|udaneqE|Duong|male||2 Ngo Duc Ke|HCM|VN|123456|0902646433|duong_vu140@yahoo.com|123456|please fill all fields


Scenario: User create new customer with customer address blank
Given User login with "<userId>" and "<password>" successfully
And User want to create new customer
When User input "<name>" and "<gender>" and "<dob>" and "<address>" and "<citi>" and "<state>" and "<pin>" and "<mobile>" and "<email>" and "<pass>" and submit
Then Alert "<alertText>" is displayed
Examples:
|userId|password|name|gender|dob|address|citi|state|pin|mobile|email|pass|alertText
|mngr91821|udaneqE|Duong|male|12/04/1988||HCM|VN|123456|0902646433|duong_vu140@yahoo.com|123456|please fill all fields


Scenario: User create new customer with customer citi blank
Given User login with "<userId>" and "<password>" successfully
And User want to create new customer
When User input "<name>" and "<gender>" and "<dob>" and "<address>" and "<citi>" and "<state>" and "<pin>" and "<mobile>" and "<email>" and "<pass>" and submit
Then Alert "<alertText>" is displayed
Examples:
|userId|password|name|gender|dob|address|citi|state|pin|mobile|email|pass|alertText
|mngr91821|udaneqE|Duong|male|12/04/1988|2 Ngo Duc Ke||VN|123456|0902646433|duong_vu140@yahoo.com|123456|please fill all fields


Scenario: User create new customer with customer state blank
Given User login with "<userId>" and "<password>" successfully
And User want to create new customer
When User input "<name>" and "<gender>" and "<dob>" and "<address>" and "<citi>" and "<state>" and "<pin>" and "<mobile>" and "<email>" and "<pass>" and submit
Then Alert "<alertText>" is displayed
Examples:
|userId|password|name|gender|dob|address|citi|state|pin|mobile|email|pass|alertText
|mngr91821|udaneqE|Duong|male|12/04/1988|2 Ngo Duc Ke|HCM||123456|0902646433|duong_vu140@yahoo.com|123456|please fill all fields


Scenario: User create new customer with customer PIN blank
Given User login with "<userId>" and "<password>" successfully
And User want to create new customer
When User input "<name>" and "<gender>" and "<dob>" and "<address>" and "<citi>" and "<state>" and "<pin>" and "<mobile>" and "<email>" and "<pass>" and submit
Then Alert "<alertText>" is displayed
Examples:
|userId|password|name|gender|dob|address|citi|state|pin|mobile|email|pass|alertText
|mngr91821|udaneqE|Duong|male|12/04/1988|2 Ngo Duc Ke|HCM|VN||0902646433|duong_vu140@yahoo.com|123456|please fill all fields


Scenario: User create new customer with customer mobile blank
Given User login with "<userId>" and "<password>" successfully
And User want to create new customer
When User input "<name>" and "<gender>" and "<dob>" and "<address>" and "<citi>" and "<state>" and "<pin>" and "<mobile>" and "<email>" and "<pass>" and submit
Then Alert "<alertText>" is displayed
Examples:
|userId|password|name|gender|dob|address|citi|state|pin|mobile|email|pass|alertText
|mngr91821|udaneqE|Duong|male|12/04/1988|2 Ngo Duc Ke|HCM|VN|123456||duong_vu140@yahoo.com|123456|please fill all fields


Scenario: User create new customer with customer email address blank
Given User login with "<userId>" and "<password>" successfully
And User want to create new customer
When User input "<name>" and "<gender>" and "<dob>" and "<address>" and "<citi>" and "<state>" and "<pin>" and "<mobile>" and "<email>" and "<pass>" and submit
Then Alert "<alertText>" is displayed
Examples:
|userId|password|name|gender|dob|address|citi|state|pin|mobile|email|pass|alertText
|mngr91821|udaneqE|Duong|male|12/04/1988|2 Ngo Duc Ke|HCM|VN|123456|0902646433||123456|please fill all fields


Scenario: User create new customer with customer pass blank
Given User login with "<userId>" and "<password>" successfully
And User want to create new customer
When User input "<name>" and "<gender>" and "<dob>" and "<address>" and "<citi>" and "<state>" and "<pin>" and "<mobile>" and "<email>" and "<pass>" and submit
Then Alert "<alertText>" is displayed
Examples:
|userId|password|name|gender|dob|address|citi|state|pin|mobile|email|pass|alertText
|mngr91821|udaneqE|Duong|male|12/04/1988|2 Ngo Duc Ke|HCM|VN|123456|0902646433|duong_vu140@yahoo.com||please fill all fields
