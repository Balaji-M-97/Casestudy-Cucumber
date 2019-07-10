Feature: test me app
Scenario Outline: add cart
Given url to be as "http://10.232.237.143:443/TestMeApp/login.htm"
When that user enter name as "<USERNAME>"
And that user enter password as "<PASSWORD>" 
And search "<item>" in search
And add it to cart
And Click on display cart
And click on check out
And click on proceed to pay
And select bank 
And click continue
And Givess "<username>"
And give "<password>"
And click login
And give the "<tcpass>"
And click paynow
Then user in orderdetails

Examples:
|USERNAME|PASSWORD|item|username|password|tcpass|
|lalitha|password123|headp|123457|Pass@457|Trans@457|

