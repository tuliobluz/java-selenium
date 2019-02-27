# Test e2e

## Technologies used

I used the technologies below:

* [Selenium](https://www.seleniumhq.org/): It is for automating web applications for testing purposes, but is certainly not limited to just that;
* [Java](https://www.oracle.com/technetwork/java/javase/downloads/index.html): Java Platform, Standard Edition (Java SE) lets you develop and deploy Java applications on desktops and servers. Java offers the rich user interface, performance, versatility, portability, and security that today's applications require;
* [Page Objects](https://github.com/SeleniumHQ/selenium/wiki/PageObjects): Page Objects help you write cleaner tests by encapsulating information about the elements on your application page. A Page Object can be reused across multiple tests, and if the template of your application changes, you only need to update the Page Object;
* [Cucumber](https://cucumber.io/): Cucumber is a tool that supports Behaviour-Driven Development (BDD) - a software development process that aims to enhance software quality and reduce maintenance costs.

## Folders Structures

* ```test/java ```
    * ```features ``` Where feature files should be created
        * ```Search.feature ```
    * ```Pages ``` Where the page object of tests should be created
        * ```SearchPage ```
    * ```StepDefinition ``` Where the specification of tests should be created
        * ```SearchStep ```
    * ```Utils ``` Where the helpers can be created and classes methods to reuse.
        * ```Helpers``` This class is responsible to create methods to reuse, waits and etc.
        * ```SingletonBrowserClass``` This class is responsible to create the unique instance of the browser
        * ```TestRunner.data```
* ```test/resources ``` It is responsible to keep the drivers.

## Requirement

- Install [Java Development Kit (JDK)](https://www.oracle.com/technetwork/java/javase/downloads/index.html);
- [Set up](https://www.baeldung.com/java-home-on-windows-7-8-10-mac-os-x-linux) the variable JAVA to MAC, Windows, and Linux;
- Install [Maven](https://maven.apache.org/install.html)

## To set up

- Run ```mvn clean``` clean the project
- Run ```mvn compile``` compile the source code of the project

## Running tests

- Run ```mvn test``` test the compiled source code using a suitable unit testing framework. These tests should not require the code be packaged or deployed