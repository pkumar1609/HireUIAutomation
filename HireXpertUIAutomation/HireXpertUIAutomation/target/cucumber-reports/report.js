$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TaskK.feature");
formatter.feature({
  "line": 1,
  "name": "Task Feature",
  "description": "",
  "id": "task-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Verify functionality of adding general task and particular task from Employer login",
  "description": "",
  "id": "task-feature;verify-functionality-of-adding-general-task-and-particular-task-from-employer-login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@TC264_266"
    },
    {
      "line": 3,
      "name": "@TaskBVT"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User must be registered",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "title of login page is Home",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Click on Employer-Agency Signin link",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Employer enters valid credentials \"\u003cUsername\u003e\",\"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "team member should be added",
  "rows": [
    {
      "cells": [
        "Name",
        "Email",
        "contact",
        "Nameagy",
        "Emailagy",
        "contactagy",
        "team",
        "agyteam"
      ],
      "line": 12
    },
    {
      "cells": [
        "pe1",
        "pe1@gmail.com",
        "1234564",
        "pa1",
        "pa1@gmail.com",
        "1234556",
        "pe1",
        "pa1"
      ],
      "line": 13
    },
    {
      "cells": [
        "pe2",
        "pe2@gmail.com",
        "1234564",
        "pa2",
        "pa2@gmail.com",
        "1234566",
        "pe1",
        "pa1"
      ],
      "line": 14
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "Go to workbench",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Add job",
  "rows": [
    {
      "cells": [
        "title",
        "designation",
        "industry",
        "jobrole",
        "location",
        "budget",
        "minexp",
        "maxexp",
        "minsal",
        "maxsal",
        "totalinterviews",
        "organization"
      ],
      "line": 17
    },
    {
      "cells": [
        "abc",
        "developer",
        "IT software",
        "java developer",
        "pune",
        "400000",
        "1",
        "2",
        "400000",
        "500000",
        "4",
        "talentxpert"
      ],
      "line": 18
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Select a added job",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Share job with team member",
  "rows": [
    {
      "cells": [
        "EmpTeam",
        "Agyteam"
      ],
      "line": 21
    },
    {
      "cells": [
        "pe1",
        "pa1"
      ],
      "line": 22
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Click on close button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Go to dashboard",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Click on Add task button and enter all details employer",
  "rows": [
    {
      "cells": [
        "Title for emp",
        "teamField",
        "AssignTo",
        "note",
        "employer",
        "team",
        "teamid",
        "Title for agy",
        "agyteamField",
        "agyAssignTo",
        "agynote",
        "agency",
        "agyteam",
        "agyteamid"
      ],
      "line": 26
    },
    {
      "cells": [
        "task1",
        "pemp",
        "pe1",
        "Task should complete before time",
        "pemp",
        "pe1",
        "pe1@gmail.com",
        "particular task",
        "pagy",
        "pa1",
        "Task should complete before time",
        "pagy",
        "pa1",
        "pe1@gmail.com"
      ],
      "line": 27
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "the task should display for employer",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "Logout from App",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "Click on Employer-Agency Signin link",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "Login with team member",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "Task should also display for employer team member",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "Logout from App",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "Click on Employer-Agency Signin link",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "Employer enters valid credentials \"\u003cUsername\u003e\",\"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "Go to workbench",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "Select a added job",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "Click on hamburger menu",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "Click on Add task button and enter all details employer",
  "rows": [
    {
      "cells": [
        "Title for emp",
        "teamField",
        "AssignTo",
        "note",
        "employer",
        "team",
        "teamid",
        "Title for agy",
        "agyteamField",
        "agyAssignTo",
        "agynote",
        "agency",
        "agyteam",
        "agyteamid"
      ],
      "line": 40
    },
    {
      "cells": [
        "task2",
        "pemp",
        "pe1",
        "Task should complete before time",
        "pemp",
        "pe1",
        "pe1@gmail.com",
        "particular task",
        "pagy",
        "pa1",
        "Task should complete before time",
        "pagy",
        "pa1",
        "pe1@gmail.com"
      ],
      "line": 41
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "Go to dashboard",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "the task should display for employer",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "Logout from App",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "Click on Employer-Agency Signin link",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "Login with team member",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "Task should also display for employer team member",
  "keyword": "Then "
});
formatter.examples({
  "line": 48,
  "name": "",
  "description": "",
  "id": "task-feature;verify-functionality-of-adding-general-task-and-particular-task-from-employer-login;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 49,
      "id": "task-feature;verify-functionality-of-adding-general-task-and-particular-task-from-employer-login;;1"
    },
    {
      "cells": [
        "pemp@gmail.com",
        "12345"
      ],
      "line": 50,
      "id": "task-feature;verify-functionality-of-adding-general-task-and-particular-task-from-employer-login;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1201800,
  "status": "passed"
});
formatter.before({
  "duration": 1282100,
  "status": "passed"
});
formatter.scenario({
  "line": 50,
  "name": "Verify functionality of adding general task and particular task from Employer login",
  "description": "",
  "id": "task-feature;verify-functionality-of-adding-general-task-and-particular-task-from-employer-login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@TC264_266"
    },
    {
      "line": 3,
      "name": "@TaskBVT"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User must be registered",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "title of login page is Home",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Click on Employer-Agency Signin link",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Employer enters valid credentials \"pemp@gmail.com\",\"12345\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "team member should be added",
  "rows": [
    {
      "cells": [
        "Name",
        "Email",
        "contact",
        "Nameagy",
        "Emailagy",
        "contactagy",
        "team",
        "agyteam"
      ],
      "line": 12
    },
    {
      "cells": [
        "pe1",
        "pe1@gmail.com",
        "1234564",
        "pa1",
        "pa1@gmail.com",
        "1234556",
        "pe1",
        "pa1"
      ],
      "line": 13
    },
    {
      "cells": [
        "pe2",
        "pe2@gmail.com",
        "1234564",
        "pa2",
        "pa2@gmail.com",
        "1234566",
        "pe1",
        "pa1"
      ],
      "line": 14
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "Go to workbench",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Add job",
  "rows": [
    {
      "cells": [
        "title",
        "designation",
        "industry",
        "jobrole",
        "location",
        "budget",
        "minexp",
        "maxexp",
        "minsal",
        "maxsal",
        "totalinterviews",
        "organization"
      ],
      "line": 17
    },
    {
      "cells": [
        "abc",
        "developer",
        "IT software",
        "java developer",
        "pune",
        "400000",
        "1",
        "2",
        "400000",
        "500000",
        "4",
        "talentxpert"
      ],
      "line": 18
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Select a added job",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Share job with team member",
  "rows": [
    {
      "cells": [
        "EmpTeam",
        "Agyteam"
      ],
      "line": 21
    },
    {
      "cells": [
        "pe1",
        "pa1"
      ],
      "line": 22
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Click on close button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Go to dashboard",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Click on Add task button and enter all details employer",
  "rows": [
    {
      "cells": [
        "Title for emp",
        "teamField",
        "AssignTo",
        "note",
        "employer",
        "team",
        "teamid",
        "Title for agy",
        "agyteamField",
        "agyAssignTo",
        "agynote",
        "agency",
        "agyteam",
        "agyteamid"
      ],
      "line": 26
    },
    {
      "cells": [
        "task1",
        "pemp",
        "pe1",
        "Task should complete before time",
        "pemp",
        "pe1",
        "pe1@gmail.com",
        "particular task",
        "pagy",
        "pa1",
        "Task should complete before time",
        "pagy",
        "pa1",
        "pe1@gmail.com"
      ],
      "line": 27
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "the task should display for employer",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "Logout from App",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "Click on Employer-Agency Signin link",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "Login with team member",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "Task should also display for employer team member",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "Logout from App",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "Click on Employer-Agency Signin link",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "Employer enters valid credentials \"pemp@gmail.com\",\"12345\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "Go to workbench",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "Select a added job",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "Click on hamburger menu",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "Click on Add task button and enter all details employer",
  "rows": [
    {
      "cells": [
        "Title for emp",
        "teamField",
        "AssignTo",
        "note",
        "employer",
        "team",
        "teamid",
        "Title for agy",
        "agyteamField",
        "agyAssignTo",
        "agynote",
        "agency",
        "agyteam",
        "agyteamid"
      ],
      "line": 40
    },
    {
      "cells": [
        "task2",
        "pemp",
        "pe1",
        "Task should complete before time",
        "pemp",
        "pe1",
        "pe1@gmail.com",
        "particular task",
        "pagy",
        "pa1",
        "Task should complete before time",
        "pagy",
        "pa1",
        "pe1@gmail.com"
      ],
      "line": 41
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "Go to dashboard",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "the task should display for employer",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "Logout from App",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "Click on Employer-Agency Signin link",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "Login with team member",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "Task should also display for employer team member",
  "keyword": "Then "
});
formatter.match({
  "location": "loginstepdefination.user_must_be_registered()"
});
formatter.result({
  "duration": 21984376500,
  "status": "passed"
});
formatter.match({
  "location": "loginstepdefination.title_of_login_page_is_Home()"
});
formatter.result({
  "duration": 17304800,
  "status": "passed"
});
formatter.match({
  "location": "loginstepdefination.click_on_Employer_Agency_Signin_link()"
});
formatter.result({
  "duration": 6229180800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pemp@gmail.com",
      "offset": 35
    },
    {
      "val": "12345",
      "offset": 52
    }
  ],
  "location": "taskBWT.employer_enters_valid_credentials(String,String)"
});
formatter.result({
  "duration": 16145411300,
  "status": "passed"
});
formatter.match({
  "location": "taskBWT.team_member_should_be_added(DataTable)"
});
formatter.result({
  "duration": 53797081200,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"/html/body/ngb-modal-window/div/div/app-list-jobprovider/div[3]/button\"}\n  (Session info: chrome\u003d85.0.4183.83)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-6IM5GGG\u0027, ip: \u0027192.168.43.55\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002712.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 85.0.4183.83, chrome: {chromedriverVersion: 85.0.4183.87 (cd6713ebf92fa..., userDataDir: C:\\Users\\TLP33\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:52923}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 647cb68441b66b15dc0d870b6f7a0bd0\n*** Element info: {Using\u003dxpath, value\u003d/html/body/ngb-modal-window/div/div/app-list-jobprovider/div[3]/button}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy21.getWrappedElement(Unknown Source)\r\n\tat org.openqa.selenium.remote.internal.WebElementToJsonConverter.apply(WebElementToJsonConverter.java:50)\r\n\tat java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:195)\r\n\tat java.base/java.util.Spliterators$ArraySpliterator.forEachRemaining(Spliterators.java:948)\r\n\tat java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:484)\r\n\tat java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)\r\n\tat java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:913)\r\n\tat java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)\r\n\tat java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:578)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.executeScript(RemoteWebDriver.java:484)\r\n\tat pages.TeamPage.closeTeamPage(TeamPage.java:180)\r\n\tat pages.TeamPage.isTeamPresentForEmp(TeamPage.java:190)\r\n\tat pages.TeamPage.verifyTeamAdded(TeamPage.java:223)\r\n\tat BVT_StepDefination.taskBWT.team_member_should_be_added(taskBWT.java:173)\r\n\tat ✽.Given team member should be added(TaskK.feature:11)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "taskBWT.go_to_workbench()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "taskBWT.add_job(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MarketplaceBvt.select_a_added_job()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "taskBWT.share_job_with_team_member(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.click_on_close_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "taskBWT.go_to_dashboard()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "taskBWT.in_add_task_popup_Fill_all_the_mandatory_details(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "taskBWT.the_task_should_display_for_both_employer()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "taskBWT.Logout_from_App()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "loginstepdefination.click_on_Employer_Agency_Signin_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "taskBWT.login_with_emp_team_member()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "taskBWT.task_should_also_display_for_team_member()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "taskBWT.Logout_from_App()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "loginstepdefination.click_on_Employer_Agency_Signin_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "pemp@gmail.com",
      "offset": 35
    },
    {
      "val": "12345",
      "offset": 52
    }
  ],
  "location": "taskBWT.employer_enters_valid_credentials(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "taskBWT.go_to_workbench()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MarketplaceBvt.select_a_added_job()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "taskBWT.click_on_hamburger_menu()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "taskBWT.in_add_task_popup_Fill_all_the_mandatory_details(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "taskBWT.go_to_dashboard()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "taskBWT.the_task_should_display_for_both_employer()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "taskBWT.Logout_from_App()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "loginstepdefination.click_on_Employer_Agency_Signin_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "taskBWT.login_with_emp_team_member()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "taskBWT.task_should_also_display_for_team_member()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 46525226800,
  "status": "passed"
});
});