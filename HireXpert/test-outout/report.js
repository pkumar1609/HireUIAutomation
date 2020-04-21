$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/TLP33/eclipse-workspace/HireXpert/HireXpert/src/main/java/Features/login.feature");
formatter.feature({
  "line": 1,
  "name": "UserAccount Feature",
  "description": "",
  "id": "useraccount-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 33406944100,
  "status": "passed"
});
formatter.scenario({
  "line": 68,
  "name": "To verify whether the Agency is able to add and delete employer",
  "description": "",
  "id": "useraccount-feature;to-verify-whether-the-agency-is-able-to-add-and-delete-employer",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 67,
      "name": "@TC49_53"
    }
  ]
});
formatter.step({
  "line": 70,
  "name": "User must be registered as agency profile",
  "keyword": "Given "
});
formatter.step({
  "line": 72,
  "name": "title of login page is Home",
  "keyword": "When "
});
formatter.step({
  "line": 73,
  "name": "agency enters valid credentials",
  "keyword": "And "
});
formatter.step({
  "line": 74,
  "name": "Click on Employer tab",
  "keyword": "And "
});
formatter.step({
  "line": 75,
  "name": "Click on add Button to add the employer",
  "keyword": "And "
});
formatter.step({
  "line": 76,
  "name": "Fill all the mandatory details",
  "rows": [
    {
      "cells": [
        "Name",
        "Email",
        "contact"
      ],
      "line": 77
    },
    {
      "cells": [
        "pe1",
        "pe1@gmail.com",
        "1234564"
      ],
      "line": 78
    },
    {
      "cells": [
        "pe2",
        "pe2@gmail.com",
        "1234564"
      ],
      "line": 79
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 80,
  "name": "Agency should be able to add Employer",
  "keyword": "Then "
});
formatter.step({
  "line": 81,
  "name": "Newly added employer should be displayed in employer page",
  "keyword": "Then "
});
formatter.step({
  "line": 82,
  "name": "delete the added employer",
  "keyword": "And "
});
formatter.step({
  "line": 83,
  "name": "deleted employer should not be display in employer page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinationTC49_53.user_must_be_registered_as_agency_profile()"
});
formatter.result({
  "duration": 214465300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinationTC49_53.title_of_login_page_is_Home()"
});
formatter.result({
  "duration": 17694600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinationTC49_53.agency_enters_valid_credentials()"
});
formatter.result({
  "duration": 391943700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinationTC49_53.click_on_Employer_tab()"
});
formatter.result({
  "duration": 2110974000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinationTC49_53.click_on_add_Button_to_add_the_employer()"
});
formatter.result({
  "duration": 1556836500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinationTC49_53.fill_all_the_mandatory_details(DataTable)"
});
formatter.result({
  "duration": 9050942200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinationTC49_53.Agency_should_be_able_to_add_Employer()"
});
formatter.result({
  "duration": 44000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinationTC49_53.newly_added_employer_should_be_displayed_in_Employer_page()"
});
formatter.result({
  "duration": 57677800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinationTC49_53.delete_the_added_employer()"
});
formatter.result({
  "duration": 19366029300,
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate an element using xpath\u003d//button[@title\u003d\u0027Delete\u0027]\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-6IM5GGG\u0027, ip: \u0027192.168.43.55\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002712.0.2\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:327)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy19.click(Unknown Source)\r\n\tat com.Hirexpert.pages.EmployerPage.deleteemp(EmployerPage.java:106)\r\n\tat TC49_53.StepDefinationTC49_53.delete_the_added_employer(StepDefinationTC49_53.java:104)\r\n\tat ✽.And delete the added employer(C:/Users/TLP33/eclipse-workspace/HireXpert/HireXpert/src/main/java/Features/login.feature:82)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinationTC49_53.deleted_employer_should_not_be_display_in_team_page()"
});
formatter.result({
  "status": "skipped"
});
});