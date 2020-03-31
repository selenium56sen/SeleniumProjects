Feature: DemoWebShop 

Background: 
Given user launches DemoWebShop website

#Scenario Outline: Registration
#When user enters gender as '<gender>' and firstname as '<firstname>' and lastname as '<lastname>' and email as '<email>' and password as '<password>' and confirmpassword as '<confirmpassword>'
#Then account must be registered successfully
#Then user logout
#Then user close the browser
#
#Examples:
#|gender|firstname|lastname|email|password|confirmpassword|
#|Male|Pushba|Vel|pus01@gmail.com|Pus@123|Pus@123|


Scenario: Login

When user enter login details from excel 'src/test/resources/excel/Login.xlsx' from sheetname 'LoginDetails' and click on login button
Then user should be taken to home page

