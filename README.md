# CS2800

This repository is designed to show:

>How TDD works
>How gitlab works
>javadoc
>checkstyle
>mavin


Added Cousework 1 items (8/11/2022)


Created simple GUI and all stacks (10/11/2022)

pom.xml - updated
NumStack.java - completed implenetation
StrStack.java - completed implenetation
OpStack.java - completed implenetation
Driver.java - partial implenetation 
MyView.java - file creation

Fixing errors (17/11/2022)

pom.xml - fixes 
MyView.java - updated.
MyView.fxml - added button usage feature. -controller changed to 
calculator.MyView as MyView is in package calculator.

Error found:
__________________________________________________________________
at java.base/java.lang.Thread.run(Thread.java:833)
Caused by: java.lang.NullPointerException: Location is required.

within driver cannot find fxml resources in correct location 
__________________________________________________________________

fixing errors and logic implementation (22/11/2022)

resolved issue with not getting the GUI to run, Added button logic
Button returns string input from inputBox in the terminal and updates
answerBox to answer removing anything already in answerBox.

pom.xml
MyView.java
MyView.fxml
Driver.java


Adding more functionality (22/11/2022)

added more implementation with the GUI and added terminal GUI implentation
radiobuttons now select and deselect, added name for button and expression 
and answers variables and logic for combining implementation for the functionality
of the calculator.

MyView.java - updated
MyView.fxml - updated
AsciiView - implemented
ViewInterface - implented


Added CalcController Without Observer (24/11/2022)

Added CalcController and updated MyView have yet added observer using CalcController as test
and so far working, Added logic for radio Buttons and Calccontroller can identify between 
infix and reverse polish, and know if an expression has been typed.

MyView.java - updated
CalcController.java - implemented


Added combined MyView updated CalcController (30/11/2022)

Updated CalcController to add observers with myView and combined the old driver with myView 
as for the implementation for the GUI and made a new driver to use the GUI view and terminal view.
implemted CalcModel as a test for getting the later * / () etc. And updated pom file to make mainDriver
the new main class. AsciiView updated.


MyView.java - updated
driver.java - deleted (combined with Myview.java)
CalcController - updated
Observer - implented
pom.xml - updated (change from driver to myview main class)

updated AsciiView for viewInterface changes and main driver (30/11/2022)

updated viewInterface as AsciiView missing changes implemented for GUI view.
Main class change implentation to MainDriver (implemented MainDriver) as old 
MyView main class did not use AsciiView and MainDriver does. both file also updated
for main class changes. calculator interface implented does not yet do anything to the
project but will be used to implement rev polish and infix.


AsciiView - updated (added more features)
pom.xml - updated (main class change again for both view implentations)
MainDriver.java - implemted (new main class using terminal and gui view)
calculator.java -implented (does not do anything for the project yet)*


added all operations (06/12/2022)

Added all operations and respected test

Plus.java
Divide.java
Minus.java
Times.java
Testplus.java
TestDivide.java
TestMinus.java
TestTimes.java