# ExpediaAutomation

Problem: Automate an end to end expedia search flow (Flight Search, Package Search and Hotel Search) using any open source tool for http://www.expedia.com with an existing customer on firefox browser.

I have used selenium webdriver to automate the flow. I have used Page Object Model to design the automation for the Flight Search, Package Search and Hotel Search.

Please run the code using cmd

mvn clean install

Test case is located in file - src/test/java/TestCases/FlightSearchModel.java

Page Classes is located @ - src/test/java/PageClasses/

Technical Debts in the code

Flight Search Page has elements for flight search items like Origin, Destination location, Start & End date.
Package Search Page has elements for package search items like Origin, Destination location, Start & End date and Hotel + car by default selection.
Hotel Search Page has elements for hotel search items like Destination location, Start & End date.

Thanks<br/>
Sonal Soni
