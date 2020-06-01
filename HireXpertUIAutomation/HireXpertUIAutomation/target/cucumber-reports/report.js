$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/TLP33/Documents/GitHub/HireUIAutomation/HireXpertUIAutomation/HireXpertUIAutomation/src/main/java/features/MarketplaceK.feature");
formatter.feature({
  "line": 1,
  "name": "Marketplace Feature",
  "description": "",
  "id": "marketplace-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 513200,
  "status": "passed"
});
formatter.before({
  "duration": 393499,
  "status": "passed"
});
formatter.before({
  "duration": 468000,
  "status": "passed"
});
formatter.before({
  "duration": 259199,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "To check the functionality of Reject proposal and view button on Agency profile",
  "description": "",
  "id": "marketplace-feature;to-check-the-functionality-of-reject-proposal-and-view-button-on-agency-profile",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 22,
      "name": "@TC359_357"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "user is registered",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "Click on Employer-Agency Signin link",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Job must be share to market place",
  "rows": [
    {
      "cells": [
        "Commission Percentage",
        "Invoice Period",
        "Payment Cycle",
        "Replacement Period"
      ],
      "line": 27
    },
    {
      "cells": [
        "8.33",
        "30 Days",
        "60 Days",
        "90 Days"
      ],
      "line": 28
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "logout with employer and Login with agency",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "Go to agency marketplace tab",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "Click on Apply button of job",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "logout with agency and Login with employer",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "click on Employer marketplace tab",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "Select that job in filter on job proposal section",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "Click on reject button of that proposal",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "Job proposal area should show rejected status",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "logout with employer and Login with agency",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "Go to agency marketplace tab",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "status of that request should show as rejected",
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "Click on Review button",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "Agreement popup should show request information in read only mode",
  "rows": [
    {
      "cells": [
        "Commission Percentage",
        "Invoice Period",
        "Payment Cycle",
        "Replacement Period"
      ],
      "line": 42
    },
    {
      "cells": [
        "8.33",
        "30 Days",
        "60 Days",
        "90 Days"
      ],
      "line": 43
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "TC351.user_is_registered()"
});
formatter.result({
  "duration": 32059412400,
  "status": "passed"
});
formatter.match({
  "location": "TC351.click_on_Employer_Agency_Signin_link()"
});
formatter.result({
  "duration": 3095873100,
  "status": "passed"
});
formatter.match({
  "location": "TC359.job_must_be_share_to_market_place(DataTable)"
});
formatter.result({
  "duration": 10232671001,
  "status": "passed"
});
formatter.match({
  "location": "TC351.logout_with_employer_and_Login_with_agency()"
});
formatter.result({
  "duration": 30145802401,
  "status": "passed"
});
formatter.match({
  "location": "TC351.go_to_marketplace_tab()"
});
formatter.result({
  "duration": 1104892100,
  "status": "passed"
});
formatter.match({
  "location": "TC359.click_on_Apply_button_of_job()"
});
formatter.result({
  "duration": 20018309900,
  "status": "passed"
});
formatter.match({
  "location": "TC359.login_with_employer_to_whom_job_proposal_is_send()"
});
formatter.result({
  "duration": 11233062700,
  "status": "passed"
});
formatter.match({
  "location": "TC359.go_to_market_place_tab()"
});
formatter.result({
  "duration": 4057132599,
  "status": "passed"
});
formatter.match({
  "location": "TC359.select_that_job_in_filter_on_job_proposal_section()"
});
formatter.result({
  "duration": 4149825401,
  "status": "passed"
});
formatter.match({
  "location": "TC359.click_on_reject_button_of_that_proposal()"
});
formatter.result({
  "duration": 20050728601,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//p[contains(text(),\u0027komaljob15\u0027)]//following::button[text()\u003d\u0027Reject\u0027]\"}\n  (Session info: chrome\u003d83.0.4103.61)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-6IM5GGG\u0027, ip: \u0027192.168.43.55\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002712.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 83.0.4103.61, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: C:\\Users\\TLP33\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:64736}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 0415c3ff57da115a7b49e101274eb09b\n*** Element info: {Using\u003dxpath, value\u003d//p[contains(text(),\u0027komaljob15\u0027)]//following::button[text()\u003d\u0027Reject\u0027]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat pages.MarketPlacePage.ClickOnRejectBtn(MarketPlacePage.java:226)\r\n\tat MarketplaceStepdefination.TC359.click_on_reject_button_of_that_proposal(TC359.java:75)\r\n\tat ✽.And Click on reject button of that proposal(C:/Users/TLP33/Documents/GitHub/HireUIAutomation/HireXpertUIAutomation/HireXpertUIAutomation/src/main/java/features/MarketplaceK.feature:35)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "TC359.job_proposal_area_should_show_rejected_status()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC351.logout_with_employer_and_Login_with_agency()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC351.go_to_marketplace_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC359.status_of_that_request_should_show_as_rejected()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC359.click_on_Review_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC359.agreement_popup_should_show_request_information_in_read_only_mode(DataTable)"
});
formatter.result({
  "status": "skipped"
});
});