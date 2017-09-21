@registrationPage
Feature: New user registration process
In order to become a customer
As a site visitor
I want to enter first name, last name, user name, password and confirm password

Scenario: Simple positive scenario

Given user is visiting homepage
When user click on registration link
And user enter user name, password, confirm password and click submit
Then user receives a confirmation message
