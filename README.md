# Mirabeau

# WebApplication:
http://automationpractice.com  

# Framework:
Framework is build in IntelliJ using Maven, Java, Selenium webdriver, Junit.

# TestConfiguration: 
You can select a browser type from src -> main -> TestConfiguration class.
Note: For now, I have only added chrome driver for POC but we can add as many browsers as we want and configure in this class.

# PageObjects: 
General classes used in tests are defined here.

# TestExecution: 
Tests are scheduled under src -> test -> tests

# TestReport: 
Created via IntelliJ. Can be found in the project root folder.

# VersionControl:
Version contol is done on GIT via GITHUB.

# Manual Tests:
For this POC, I tested with below test conditions:

Positive tests:
-> SUMMER (in caps)
-> Faded (normal)
-> girly (normal)
-> gir (partial text searches)
-> evening (normal)

Negative tests:
-> Empty
-> Spaces
-> Special chars
-> Wild card
