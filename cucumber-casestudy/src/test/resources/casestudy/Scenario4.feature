Feature: test me app
Scenario Outline: add cart me
Given url to bee as "http://10.232.237.143:443/TestMeApp/login.htm"
When that userr enter name as "<USERNAME>"
And that userr enter password as "<PASSWORD>" 
And searches "<item>" in search
Then cart icon not to show

Examples:
|USERNAME|PASSWORD|item|
|lalitha|password123|headp|