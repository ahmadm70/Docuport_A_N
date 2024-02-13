Selenium-JUnit-Cucumber Test Automation Framework
This is a test automation framework implemented using Selenium, JUnit, and Cucumber in Java. It follows the Page Object
Model design pattern and is managed with Maven.

**Prerequisites**
Java 11 (or later)

**Maven**
Browsers (e.g., Chrome, Firefox)
Ensure that all the prerequisites are installed and properly configured.

Framework Structure
src/main/java/pages: This directory contains all the page objects.
src/main/java/utilities: This directory contains utility classes.
src/test/java/step_definitions: This directory contains step definition classes for the Cucumber scenarios.
src/test/resources/features: This directory contains all the Cucumber feature files.
pom.xml: The Project Object Model file for the Maven project. It includes all the dependencies needed for the project.
Setup and Running Tests

To clean the project, run: mvn clean
To compile the project, run: mvn compile
To execute the tests, run: mvn test
The tests will run, and the report will be generated in the target directory.

Reports
Test report can be found in the following directory after running the tests: target/cucumber-reports/report.html

Contributing
Please read CONTRIBUTING.md for details on our code of conduct, and the process for submitting pull requests to us.

Authors
[Ahmad, Nihad] - Initial work
See also the list of contributors who participated in this project.

License
This project is licensed under the MIT License - see the LICENSE.md file for details


This is a very basic README template. Depending on your project, you might need to add or remove sections. For instance,
you might want to add sections for Code Style, Technologies used, Acknowledgments, etc.

Remember, the goal of the README is to provide all the necessary information for anyone (new team member, open-source
contributor, etc.) to understand what your project is about, how to set it up, and how to use it.