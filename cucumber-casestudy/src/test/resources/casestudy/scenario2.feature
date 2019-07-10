Feature: Test me App
Scenario Outline:login
Given url of testmeapp login "http://10.232.237.143:443/TestMeApp/login.htm"
When ram enters "<username>" as username
And ram enters "<password>" as password
And click on login
Then ram is to be in his account window

Examples:
|username|password|
|ramprasathn|ram12345|
