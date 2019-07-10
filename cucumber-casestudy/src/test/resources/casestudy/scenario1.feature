Feature: Testme App
Scenario: Registration
Given url of testmeapp "http://10.232.237.143:443/TestMeApp/fetchcat.htm"
When user click on signup
And user enters "ramprasathm" as username
And user enters "ram" as firstname
And user enters "prasathm" as lastname
And user enters "ram12345" as password
And user enters "ram12345" as confirmpassword
And click gender as male
And user enters "ramp@gmail.com" as email
And user enters "9944583945" as mobileno
And user enters "12/12/1999" as dob
And user enters "cbe" as address
And user select birth place as securityques
And user enters answer as "ooty"
And click on register
Then check user in sign-in page