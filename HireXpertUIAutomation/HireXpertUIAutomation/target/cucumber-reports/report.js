$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TaskK.feature");
formatter.feature({
  "line": 1,
  "name": "Task Feature",
  "description": "",
  "id": "task-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 635500,
  "status": "passed"
});
formatter.before({
  "duration": 422500,
  "status": "passed"
});
formatter.before({
  "duration": 465200,
  "status": "passed"
});
formatter.before({
  "duration": 395000,
  "status": "passed"
});
formatter.before({
  "duration": 488400,
  "status": "passed"
});
formatter.before({
  "duration": 323900,
  "status": "passed"
});
formatter.before({
  "duration": 434900,
  "status": "passed"
});
formatter.before({
  "duration": 388800,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Verify functionality of adding general task and particular task from Employer login",
  "description": "",
  "id": "task-feature;verify-functionality-of-adding-general-task-and-particular-task-from-employer-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@TC264_266"
    },
    {
      "line": 3,
      "name": "@BVT"
    },
    {
      "line": 3,
      "name": "@task"
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
  "name": "Employer enters valid credentials",
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
  "name": "Select a job",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Share job with team member",
  "rows": [
    {
      "cells": [
        "EmpTeam",
        "Agyteam"
      ],
      "line": 18
    },
    {
      "cells": [
        "pe1",
        "pa1"
      ],
      "line": 19
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Go to dashboard",
  "keyword": "And "
});
formatter.step({
  "line": 21,
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
      "line": 22
    },
    {
      "cells": [
        "genral task",
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
      "line": 23
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "the task should display for employer",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Logout from App",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Click on Employer-Agency Signin link",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "Login with employer team",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "Task should also display for employer team member",
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
  "name": "Employer enters valid credentials",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "Go to workbench",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "Select a job",
  "keyword": "And "
});
formatter.step({
  "line": 34,
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
      "line": 35
    },
    {
      "cells": [
        "particular task",
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
      "line": 36
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "Go to dashboard",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "the task should display for employer",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "Logout from App",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "Click on Employer-Agency Signin link",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "Login with employer team",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "Task should also display for employer team member",
  "keyword": "Then "
});
formatter.match({
  "location": "TheEmployerIsAbleToAddAgency.user_must_be_registered()"
});
formatter.result({
  "duration": 15702281100,
  "status": "passed"
});
formatter.match({
  "location": "TheEmployerIsAbleToAddAgency.title_of_login_page_is_Home()"
});
formatter.result({
  "duration": 19159800,
  "status": "passed"
});
formatter.match({
  "location": "TheEmployerIsAbleToAddAgency.click_on_Employer_Agency_Signin_link()"
});
formatter.result({
  "duration": 3173863700,
  "status": "passed"
});
formatter.match({
  "location": "TheEmployerIsAbleToAddAgency.Employer_enters_valid_credentials()"
});
formatter.result({
  "duration": 6047363000,
  "status": "passed"
});
formatter.match({
  "location": "TC275E.team_member_should_be_added(DataTable)"
});
formatter.result({
  "duration": 9000070900,
  "status": "passed"
});
formatter.match({
  "location": "TC264_266.go_to_workbench()"
});
formatter.result({
  "duration": 2138332500,
  "status": "passed"
});
formatter.match({
  "location": "TC264_266.select_a_job_and_click_on_add_task_button()"
});
formatter.result({
  "duration": 2178785300,
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate option with index: 1\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-6IM5GGG\u0027, ip: \u0027192.168.43.55\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002712.0.2\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.support.ui.Select.setSelectedByIndex(Select.java:297)\r\n\tat org.openqa.selenium.support.ui.Select.selectByIndex(Select.java:172)\r\n\tat pages.WorkbenchPage.selectJob(WorkbenchPage.java:127)\r\n\tat BVT_StepDefination.TC264_266.select_a_job_and_click_on_add_task_button(TC264_266.java:72)\r\n\tat ✽.And Select a job(TaskK.feature:16)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "TC275E.share_job_with_team_member(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC264_266.go_to_dashboard()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC264_266.in_add_task_popup_Fill_all_the_mandatory_details(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC264_266.the_task_should_display_for_both_employer()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC264_266.Logout_from_App()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TheEmployerIsAbleToAddAgency.click_on_Employer_Agency_Signin_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC264_266.login_as_employer_team()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC264_266.task_should_also_display_for_team_member()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC264_266.Logout_from_App()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TheEmployerIsAbleToAddAgency.click_on_Employer_Agency_Signin_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TheEmployerIsAbleToAddAgency.Employer_enters_valid_credentials()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC264_266.go_to_workbench()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC264_266.select_a_job_and_click_on_add_task_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC264_266.in_add_task_popup_Fill_all_the_mandatory_details(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC264_266.go_to_dashboard()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC264_266.the_task_should_display_for_both_employer()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC264_266.Logout_from_App()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TheEmployerIsAbleToAddAgency.click_on_Employer_Agency_Signin_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC264_266.login_as_employer_team()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC264_266.task_should_also_display_for_team_member()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 63800,
  "status": "passed"
});
formatter.before({
  "duration": 436300,
  "status": "passed"
});
formatter.before({
  "duration": 357200,
  "status": "passed"
});
formatter.before({
  "duration": 828300,
  "status": "passed"
});
formatter.before({
  "duration": 842200,
  "status": "passed"
});
formatter.before({
  "duration": 672300,
  "status": "passed"
});
formatter.before({
  "duration": 542800,
  "status": "passed"
});
formatter.before({
  "duration": 627500,
  "status": "passed"
});
formatter.before({
  "duration": 751800,
  "status": "passed"
});
formatter.scenario({
  "line": 46,
  "name": "Verify agency can add general task and particular task.",
  "description": "",
  "id": "task-feature;verify-agency-can-add-general-task-and-particular-task.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 45,
      "name": "@TC265_267"
    },
    {
      "line": 45,
      "name": "@BVT"
    },
    {
      "line": 45,
      "name": "@task"
    }
  ]
});
formatter.step({
  "line": 48,
  "name": "User must be registered",
  "keyword": "Given "
});
formatter.step({
  "line": 50,
  "name": "title of login page is Home",
  "keyword": "When "
});
formatter.step({
  "line": 51,
  "name": "Click on Employer-Agency Signin link",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "agency enters valid credentials",
  "keyword": "And "
});
formatter.step({
  "line": 53,
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
      "line": 54
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
      "line": 55
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
      "line": 56
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 57,
  "name": "Go to workbench",
  "keyword": "And "
});
formatter.step({
  "line": 58,
  "name": "Select a job",
  "keyword": "And "
});
formatter.step({
  "line": 59,
  "name": "Share job with team member",
  "rows": [
    {
      "cells": [
        "EmpTeam",
        "Agyteam"
      ],
      "line": 60
    },
    {
      "cells": [
        "pe1",
        "pa1"
      ],
      "line": 61
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 62,
  "name": "Go to dashboard",
  "keyword": "And "
});
formatter.step({
  "line": 63,
  "name": "Click on Add task button and enter all details for agency",
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
      "line": 64
    },
    {
      "cells": [
        "particular task",
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
      "line": 65
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 66,
  "name": "the task should display for agency",
  "keyword": "Then "
});
formatter.step({
  "line": 67,
  "name": "Logout from App",
  "keyword": "And "
});
formatter.step({
  "line": 68,
  "name": "Click on Employer-Agency Signin link",
  "keyword": "And "
});
formatter.step({
  "line": 69,
  "name": "Login with agency team",
  "keyword": "And "
});
formatter.step({
  "line": 70,
  "name": "Task should also display for agency team member",
  "keyword": "Then "
});
formatter.step({
  "line": 71,
  "name": "Logout from App",
  "keyword": "And "
});
formatter.step({
  "line": 72,
  "name": "Click on Employer-Agency Signin link",
  "keyword": "And "
});
formatter.step({
  "line": 73,
  "name": "agency enters valid credentials",
  "keyword": "And "
});
formatter.step({
  "line": 74,
  "name": "Go to workbench",
  "keyword": "And "
});
formatter.step({
  "line": 75,
  "name": "Select a job",
  "keyword": "And "
});
formatter.step({
  "line": 76,
  "name": "Click on Add task button and enter all details for agency",
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
      "line": 77
    },
    {
      "cells": [
        "particular task",
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
      "line": 78
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 79,
  "name": "Go to dashboard",
  "keyword": "And "
});
formatter.step({
  "line": 80,
  "name": "the task should display for agency",
  "keyword": "Then "
});
formatter.step({
  "line": 81,
  "name": "Logout from App",
  "keyword": "And "
});
formatter.step({
  "line": 82,
  "name": "Click on Employer-Agency Signin link",
  "keyword": "And "
});
formatter.step({
  "line": 83,
  "name": "Login with agency team",
  "keyword": "And "
});
formatter.step({
  "line": 84,
  "name": "Task should also display for agency team member",
  "keyword": "Then "
});
formatter.match({
  "location": "TheEmployerIsAbleToAddAgency.user_must_be_registered()"
});
formatter.result({
  "duration": 11719777500,
  "status": "passed"
});
formatter.match({
  "location": "TheEmployerIsAbleToAddAgency.title_of_login_page_is_Home()"
});
formatter.result({
  "duration": 7182500,
  "status": "passed"
});
formatter.match({
  "location": "TheEmployerIsAbleToAddAgency.click_on_Employer_Agency_Signin_link()"
});
formatter.result({
  "duration": 3088318100,
  "status": "passed"
});
formatter.match({
  "location": "TC49_53K.agency_enters_valid_credentials()"
});
formatter.result({
  "duration": 24892237100,
  "status": "passed"
});
formatter.match({
  "location": "TC275E.team_member_should_be_added(DataTable)"
});
formatter.result({
  "duration": 8789793300,
  "status": "passed"
});
formatter.match({
  "location": "TC264_266.go_to_workbench()"
});
formatter.result({
  "duration": 2140079800,
  "status": "passed"
});
formatter.match({
  "location": "TC264_266.select_a_job_and_click_on_add_task_button()"
});
formatter.result({
  "duration": 2250134200,
  "status": "passed"
});
formatter.match({
  "location": "TC275E.share_job_with_team_member(DataTable)"
});
formatter.result({
  "duration": 3144807400,
  "error_message": "org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element \u003cbutton _ngcontent-pbq-c9\u003d\"\" class\u003d\"btn Cbtn-primary optbtn\" title\u003d\"Share With Team\" type\u003d\"button\"\u003e...\u003c/button\u003e is not clickable at point (1378, 112). Other element would receive the click: \u003ca _ngcontent-pbq-c1\u003d\"\" class\u003d\"dropdown-item CustomPointer\"\u003e...\u003c/a\u003e\n  (Session info: chrome\u003d83.0.4103.61)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-6IM5GGG\u0027, ip: \u0027192.168.43.55\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002712.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 83.0.4103.61, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: C:\\Users\\TLP33\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:54189}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 3d778c2120a0a08ae1d4ef4b2fc68636\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:567)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy21.click(Unknown Source)\r\n\tat pages.TaskPage.shareWithTeam(TaskPage.java:588)\r\n\tat BVT_StepDefination.TC275E.share_job_with_team_member(TC275E.java:42)\r\n\tat ✽.And Share job with team member(TaskK.feature:59)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "TC264_266.go_to_dashboard()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC265_267k.in_add_task_popup_Fill_all_the_mandatory_details(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC265_267k.the_task_should_display_for_both_agency()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC264_266.Logout_from_App()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TheEmployerIsAbleToAddAgency.click_on_Employer_Agency_Signin_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC265_267k.login_with_agency_team()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC265_267k.task_should_also_display_for_team_member()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC264_266.Logout_from_App()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TheEmployerIsAbleToAddAgency.click_on_Employer_Agency_Signin_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC49_53K.agency_enters_valid_credentials()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC264_266.go_to_workbench()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC264_266.select_a_job_and_click_on_add_task_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC265_267k.in_add_task_popup_Fill_all_the_mandatory_details(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC264_266.go_to_dashboard()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC265_267k.the_task_should_display_for_both_agency()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC264_266.Logout_from_App()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TheEmployerIsAbleToAddAgency.click_on_Employer_Agency_Signin_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC265_267k.login_with_agency_team()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC265_267k.task_should_also_display_for_team_member()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 35400,
  "status": "passed"
});
formatter.before({
  "duration": 421100,
  "status": "passed"
});
formatter.before({
  "duration": 324900,
  "status": "passed"
});
formatter.before({
  "duration": 377600,
  "status": "passed"
});
formatter.before({
  "duration": 280600,
  "status": "passed"
});
formatter.before({
  "duration": 306100,
  "status": "passed"
});
formatter.before({
  "duration": 281500,
  "status": "passed"
});
formatter.before({
  "duration": 281600,
  "status": "passed"
});
formatter.before({
  "duration": 278900,
  "status": "passed"
});
formatter.scenario({
  "line": 89,
  "name": "Verify only creator of the general task can delete that general task",
  "description": "",
  "id": "task-feature;verify-only-creator-of-the-general-task-can-delete-that-general-task",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 88,
      "name": "@TC275"
    },
    {
      "line": 88,
      "name": "@BVT"
    },
    {
      "line": 88,
      "name": "@task"
    }
  ]
});
formatter.step({
  "line": 91,
  "name": "User must be registered",
  "keyword": "Given "
});
formatter.step({
  "line": 92,
  "name": "title of login page is Home",
  "keyword": "When "
});
formatter.step({
  "line": 93,
  "name": "Click on Employer-Agency Signin link",
  "keyword": "And "
});
formatter.step({
  "line": 94,
  "name": "user enters valid credentials",
  "keyword": "And "
});
formatter.step({
  "line": 95,
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
      "line": 96
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
      "line": 97
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
      "line": 98
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 99,
  "name": "Go to workbench",
  "keyword": "And "
});
formatter.step({
  "line": 100,
  "name": "Select a job",
  "keyword": "And "
});
formatter.step({
  "line": 101,
  "name": "Share job with team member",
  "rows": [
    {
      "cells": [
        "EmpTeam",
        "Agyteam"
      ],
      "line": 102
    },
    {
      "cells": [
        "pe1",
        "pa1"
      ],
      "line": 103
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 104,
  "name": "Go to dashboard",
  "keyword": "And "
});
formatter.step({
  "line": 105,
  "name": "Click on Add task button and enter all details",
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
      "line": 106
    },
    {
      "cells": [
        "Genral task",
        "pemp",
        "pe1",
        "Task should complete before time",
        "pemp",
        "pe1",
        "pe1@gmail.com",
        "Genral task",
        "pagy",
        "pa1",
        "Task should complete before time",
        "pagy",
        "pe1",
        "pe1@gmail.com"
      ],
      "line": 107
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 108,
  "name": "Logout from App",
  "keyword": "And "
});
formatter.step({
  "line": 109,
  "name": "Click on Employer-Agency Signin link",
  "keyword": "And "
});
formatter.step({
  "line": 110,
  "name": "Login with team member",
  "keyword": "And "
});
formatter.step({
  "line": 111,
  "name": "Click on Delete task",
  "keyword": "And "
});
formatter.step({
  "line": 112,
  "name": "observe the message",
  "keyword": "And "
});
formatter.step({
  "line": 113,
  "name": "Logout from App",
  "keyword": "And "
});
formatter.step({
  "line": 114,
  "name": "Click on Employer-Agency Signin link",
  "keyword": "And "
});
formatter.step({
  "line": 115,
  "name": "login as agency/employer",
  "keyword": "And "
});
formatter.step({
  "line": 116,
  "name": "Delete the task",
  "keyword": "Then "
});
formatter.match({
  "location": "TheEmployerIsAbleToAddAgency.user_must_be_registered()"
});
formatter.result({
  "duration": 30761826700,
  "status": "passed"
});
formatter.match({
  "location": "TheEmployerIsAbleToAddAgency.title_of_login_page_is_Home()"
});
formatter.result({
  "duration": 11394000,
  "status": "passed"
});
formatter.match({
  "location": "TheEmployerIsAbleToAddAgency.click_on_Employer_Agency_Signin_link()"
});
formatter.result({
  "duration": 3142183000,
  "status": "passed"
});
formatter.match({
  "location": "TC275E.user_enters_valid_and_credentials()"
});
formatter.result({
  "duration": 5906468900,
  "status": "passed"
});
formatter.match({
  "location": "TC275E.team_member_should_be_added(DataTable)"
});
formatter.result({
  "duration": 8655606400,
  "status": "passed"
});
formatter.match({
  "location": "TC264_266.go_to_workbench()"
});
formatter.result({
  "duration": 2112574500,
  "status": "passed"
});
formatter.match({
  "location": "TC264_266.select_a_job_and_click_on_add_task_button()"
});
formatter.result({
  "duration": 2265914400,
  "status": "passed"
});
formatter.match({
  "location": "TC275E.share_job_with_team_member(DataTable)"
});
formatter.result({
  "duration": 24196934400,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"(//td[text()\u003d\u0027null\u0027]//following::span[@class\u003d\u0027checkmark CheckBoxM\u0027])[1]\"}\n  (Session info: chrome\u003d83.0.4103.61)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-6IM5GGG\u0027, ip: \u0027192.168.43.55\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002712.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 83.0.4103.61, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: C:\\Users\\TLP33\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:54221}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: d3757af369f4f65329582b3c6391e6ac\n*** Element info: {Using\u003dxpath, value\u003d(//td[text()\u003d\u0027null\u0027]//following::span[@class\u003d\u0027checkmark CheckBoxM\u0027])[1]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat pages.TaskPage.shareWithTeam(TaskPage.java:606)\r\n\tat BVT_StepDefination.TC275E.share_job_with_team_member(TC275E.java:42)\r\n\tat ✽.And Share job with team member(TaskK.feature:101)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "TC264_266.go_to_dashboard()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC275E.Click_on_Add_task_button_and_enter_all_details(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC264_266.Logout_from_App()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TheEmployerIsAbleToAddAgency.click_on_Employer_Agency_Signin_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC275E.login_with_emp_team_member()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC275E.click_on_Delete_task()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC275E.observe_the_message()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC264_266.Logout_from_App()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TheEmployerIsAbleToAddAgency.click_on_Employer_Agency_Signin_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC275E.login_as_agency_employer()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC275E.delete_the_task()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 43500,
  "status": "passed"
});
formatter.before({
  "duration": 607400,
  "status": "passed"
});
formatter.before({
  "duration": 615800,
  "status": "passed"
});
formatter.before({
  "duration": 323400,
  "status": "passed"
});
formatter.before({
  "duration": 282800,
  "status": "passed"
});
formatter.before({
  "duration": 241800,
  "status": "passed"
});
formatter.before({
  "duration": 288600,
  "status": "passed"
});
formatter.before({
  "duration": 288100,
  "status": "passed"
});
formatter.before({
  "duration": 282200,
  "status": "passed"
});
formatter.scenario({
  "line": 119,
  "name": "Verify only creator of the particular task can delete the task",
  "description": "",
  "id": "task-feature;verify-only-creator-of-the-particular-task-can-delete-the-task",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 118,
      "name": "@TC282"
    },
    {
      "line": 118,
      "name": "@BVT"
    },
    {
      "line": 118,
      "name": "@task"
    }
  ]
});
formatter.step({
  "line": 121,
  "name": "User must be registered",
  "keyword": "Given "
});
formatter.step({
  "line": 122,
  "name": "title of login page is Home",
  "keyword": "When "
});
formatter.step({
  "line": 123,
  "name": "Click on Employer-Agency Signin link",
  "keyword": "And "
});
formatter.step({
  "line": 124,
  "name": "user enters valid credentials",
  "keyword": "And "
});
formatter.step({
  "line": 125,
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
      "line": 126
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
      "line": 127
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
      "line": 128
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 129,
  "name": "Go to workbench",
  "keyword": "And "
});
formatter.step({
  "line": 130,
  "name": "Select a job",
  "keyword": "And "
});
formatter.step({
  "line": 131,
  "name": "Share job with team member",
  "rows": [
    {
      "cells": [
        "EmpTeam",
        "Agyteam"
      ],
      "line": 132
    },
    {
      "cells": [
        "pe1",
        "pa1"
      ],
      "line": 133
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 134,
  "name": "Go to workbench",
  "keyword": "And "
});
formatter.step({
  "line": 135,
  "name": "Select a job",
  "keyword": "And "
});
formatter.step({
  "line": 136,
  "name": "Click on Add task button and enter all details",
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
      "line": 137
    },
    {
      "cells": [
        "particular task",
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
      "line": 138
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 139,
  "name": "Logout from App",
  "keyword": "And "
});
formatter.step({
  "line": 140,
  "name": "Click on Employer-Agency Signin link",
  "keyword": "And "
});
formatter.step({
  "line": 141,
  "name": "Login with team member",
  "keyword": "And "
});
formatter.step({
  "line": 142,
  "name": "Click on Delete task",
  "keyword": "And "
});
formatter.step({
  "line": 143,
  "name": "Logout from App",
  "keyword": "And "
});
formatter.step({
  "line": 144,
  "name": "Click on Employer-Agency Signin link",
  "keyword": "And "
});
formatter.step({
  "line": 145,
  "name": "user enters valid credentials",
  "keyword": "And "
});
formatter.step({
  "line": 146,
  "name": "Delete the task",
  "keyword": "Then "
});
formatter.match({
  "location": "TheEmployerIsAbleToAddAgency.user_must_be_registered()"
});
formatter.result({
  "duration": 28804037000,
  "status": "passed"
});
formatter.match({
  "location": "TheEmployerIsAbleToAddAgency.title_of_login_page_is_Home()"
});
formatter.result({
  "duration": 7419600,
  "status": "passed"
});
formatter.match({
  "location": "TheEmployerIsAbleToAddAgency.click_on_Employer_Agency_Signin_link()"
});
formatter.result({
  "duration": 8193965400,
  "status": "passed"
});
formatter.match({
  "location": "TC275E.user_enters_valid_and_credentials()"
});
formatter.result({
  "duration": 16311025000,
  "status": "passed"
});
formatter.match({
  "location": "TC275E.team_member_should_be_added(DataTable)"
});
formatter.result({
  "duration": 142807393200,
  "status": "passed"
});
formatter.match({
  "location": "TC264_266.go_to_workbench()"
});
formatter.result({
  "duration": 2187924100,
  "status": "passed"
});
formatter.match({
  "location": "TC264_266.select_a_job_and_click_on_add_task_button()"
});
formatter.result({
  "duration": 2224241400,
  "status": "passed"
});
formatter.match({
  "location": "TC275E.share_job_with_team_member(DataTable)"
});
formatter.result({
  "duration": 3144955400,
  "error_message": "org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element \u003cbutton _ngcontent-eox-c9\u003d\"\" class\u003d\"btn Cbtn-primary optbtn\" title\u003d\"Share With Team\" type\u003d\"button\"\u003e...\u003c/button\u003e is not clickable at point (1228, 112). Other element would receive the click: \u003cdiv _ngcontent-eox-c2\u003d\"\" class\u003d\"ngx-overlay foreground-closing\" style\u003d\"background-color: rgba(40, 40, 40, 0.8); border-radius: 0px;\"\u003e...\u003c/div\u003e\n  (Session info: chrome\u003d83.0.4103.61)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-6IM5GGG\u0027, ip: \u0027192.168.43.55\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002712.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 83.0.4103.61, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: C:\\Users\\TLP33\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:54255}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: e2bf6e804a1fc30dff05b95ffbf346a5\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat jdk.internal.reflect.GeneratedMethodAccessor10.invoke(Unknown Source)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:567)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy21.click(Unknown Source)\r\n\tat pages.TaskPage.shareWithTeam(TaskPage.java:588)\r\n\tat BVT_StepDefination.TC275E.share_job_with_team_member(TC275E.java:42)\r\n\tat ✽.And Share job with team member(TaskK.feature:131)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "TC264_266.go_to_workbench()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC264_266.select_a_job_and_click_on_add_task_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC275E.Click_on_Add_task_button_and_enter_all_details(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC264_266.Logout_from_App()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TheEmployerIsAbleToAddAgency.click_on_Employer_Agency_Signin_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC275E.login_with_emp_team_member()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC275E.click_on_Delete_task()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC264_266.Logout_from_App()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TheEmployerIsAbleToAddAgency.click_on_Employer_Agency_Signin_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC275E.user_enters_valid_and_credentials()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC275E.delete_the_task()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 38600,
  "status": "passed"
});
formatter.before({
  "duration": 925600,
  "status": "passed"
});
formatter.before({
  "duration": 589300,
  "status": "passed"
});
formatter.before({
  "duration": 450600,
  "status": "passed"
});
formatter.before({
  "duration": 470900,
  "status": "passed"
});
formatter.before({
  "duration": 421700,
  "status": "passed"
});
formatter.before({
  "duration": 411400,
  "status": "passed"
});
formatter.before({
  "duration": 424100,
  "status": "passed"
});
formatter.before({
  "duration": 422000,
  "status": "passed"
});
formatter.scenario({
  "line": 152,
  "name": "verify the functionality of edit for general tasks",
  "description": "",
  "id": "task-feature;verify-the-functionality-of-edit-for-general-tasks",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 151,
      "name": "@TC302"
    },
    {
      "line": 151,
      "name": "@BVT"
    },
    {
      "line": 151,
      "name": "@task"
    }
  ]
});
formatter.step({
  "line": 154,
  "name": "User must be registered",
  "keyword": "Given "
});
formatter.step({
  "line": 155,
  "name": "title of login page is Home",
  "keyword": "When "
});
formatter.step({
  "line": 156,
  "name": "Click on Employer-Agency Signin link",
  "keyword": "And "
});
formatter.step({
  "line": 157,
  "name": "user enters valid credentials",
  "keyword": "And "
});
formatter.step({
  "line": 158,
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
      "line": 159
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
      "line": 160
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
      "line": 161
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 162,
  "name": "Go to workbench",
  "keyword": "And "
});
formatter.step({
  "line": 163,
  "name": "Select a job",
  "keyword": "And "
});
formatter.step({
  "line": 164,
  "name": "Share job with team member",
  "rows": [
    {
      "cells": [
        "EmpTeam",
        "Agyteam"
      ],
      "line": 165
    },
    {
      "cells": [
        "pe1",
        "pa1"
      ],
      "line": 166
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 167,
  "name": "Go to dashboard",
  "keyword": "And "
});
formatter.step({
  "line": 168,
  "name": "Click on Add task button and enter all details",
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
      "line": 169
    },
    {
      "cells": [
        "Genral task",
        "pemp",
        "pe1",
        "Task should complete before time",
        "pemp",
        "pe1",
        "pe1@gmail.com",
        "Genral task",
        "pagy",
        "pa1",
        "Task should complete before time",
        "pagy",
        "pe1",
        "pe1@gmail.com"
      ],
      "line": 170
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 172,
  "name": "edit the task",
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
      "line": 173
    },
    {
      "cells": [
        "task1",
        "pemp",
        "pe1",
        "complete before 1 pm",
        "pemp",
        "pe1",
        "pe1@gmail.com",
        "task1",
        "pagy",
        "pa1",
        "complete before 1 pm",
        "pagy",
        "pe1",
        "pe1@gmail.com"
      ],
      "line": 174
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 176,
  "name": "verify all the edited details",
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
      "line": 177
    },
    {
      "cells": [
        "task1",
        "pemp",
        "pe1",
        "complete before 1 pm",
        "pemp",
        "pe1",
        "pe1@gmail.com",
        "task1",
        "pagy",
        "pa1",
        "complete before 1 pm",
        "pagy",
        "pe1",
        "pe1@gmail.com"
      ],
      "line": 178
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "TheEmployerIsAbleToAddAgency.user_must_be_registered()"
});
formatter.result({
  "duration": 16668590900,
  "status": "passed"
});
formatter.match({
  "location": "TheEmployerIsAbleToAddAgency.title_of_login_page_is_Home()"
});
formatter.result({
  "duration": 8657400,
  "status": "passed"
});
formatter.match({
  "location": "TheEmployerIsAbleToAddAgency.click_on_Employer_Agency_Signin_link()"
});
formatter.result({
  "duration": 8191704700,
  "status": "passed"
});
formatter.match({
  "location": "TC275E.user_enters_valid_and_credentials()"
});
formatter.result({
  "duration": 26355276300,
  "status": "passed"
});
formatter.match({
  "location": "TC275E.team_member_should_be_added(DataTable)"
});
formatter.result({
  "duration": 77507115000,
  "status": "passed"
});
formatter.match({
  "location": "TC264_266.go_to_workbench()"
});
formatter.result({
  "duration": 2121401900,
  "status": "passed"
});
formatter.match({
  "location": "TC264_266.select_a_job_and_click_on_add_task_button()"
});
formatter.result({
  "duration": 2279637600,
  "status": "passed"
});
formatter.match({
  "location": "TC275E.share_job_with_team_member(DataTable)"
});
formatter.result({
  "duration": 24217154700,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"(//td[text()\u003d\u0027null\u0027]//following::span[@class\u003d\u0027checkmark CheckBoxM\u0027])[1]\"}\n  (Session info: chrome\u003d83.0.4103.61)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-6IM5GGG\u0027, ip: \u0027192.168.43.55\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002712.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 83.0.4103.61, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: C:\\Users\\TLP33\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:54344}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 5e8a402b72d271778bbd4d8441a1c897\n*** Element info: {Using\u003dxpath, value\u003d(//td[text()\u003d\u0027null\u0027]//following::span[@class\u003d\u0027checkmark CheckBoxM\u0027])[1]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat pages.TaskPage.shareWithTeam(TaskPage.java:606)\r\n\tat BVT_StepDefination.TC275E.share_job_with_team_member(TC275E.java:42)\r\n\tat ✽.And Share job with team member(TaskK.feature:164)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "TC264_266.go_to_dashboard()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC275E.Click_on_Add_task_button_and_enter_all_details(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC302.edit_the_task(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC302.verify_all_the_edited_details(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 41200,
  "status": "passed"
});
formatter.before({
  "duration": 616900,
  "status": "passed"
});
formatter.before({
  "duration": 830900,
  "status": "passed"
});
formatter.before({
  "duration": 659500,
  "status": "passed"
});
formatter.before({
  "duration": 612500,
  "status": "passed"
});
formatter.before({
  "duration": 589600,
  "status": "passed"
});
formatter.before({
  "duration": 592000,
  "status": "passed"
});
formatter.before({
  "duration": 588400,
  "status": "passed"
});
formatter.before({
  "duration": 509200,
  "status": "passed"
});
formatter.scenario({
  "line": 185,
  "name": "verify the functionality of edit for particular tasks",
  "description": "",
  "id": "task-feature;verify-the-functionality-of-edit-for-particular-tasks",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 184,
      "name": "@TC305"
    },
    {
      "line": 184,
      "name": "@BVT"
    },
    {
      "line": 184,
      "name": "@task"
    }
  ]
});
formatter.step({
  "line": 187,
  "name": "User must be registered",
  "keyword": "Given "
});
formatter.step({
  "line": 188,
  "name": "title of login page is Home",
  "keyword": "When "
});
formatter.step({
  "line": 189,
  "name": "Click on Employer-Agency Signin link",
  "keyword": "And "
});
formatter.step({
  "line": 190,
  "name": "user enters valid credentials",
  "keyword": "And "
});
formatter.step({
  "line": 191,
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
      "line": 192
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
      "line": 193
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
      "line": 194
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 195,
  "name": "Go to workbench",
  "keyword": "And "
});
formatter.step({
  "line": 196,
  "name": "Select a job",
  "keyword": "And "
});
formatter.step({
  "line": 197,
  "name": "Share job with team member",
  "rows": [
    {
      "cells": [
        "EmpTeam",
        "Agyteam"
      ],
      "line": 198
    },
    {
      "cells": [
        "pe1",
        "pa1"
      ],
      "line": 199
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 200,
  "name": "Go to workbench",
  "keyword": "And "
});
formatter.step({
  "line": 201,
  "name": "Select a job",
  "keyword": "And "
});
formatter.step({
  "line": 202,
  "name": "Click on Add task button and enter all details",
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
      "line": 203
    },
    {
      "cells": [
        "particular task",
        "pemp",
        "pe1",
        "Task should complete before time",
        "pemp",
        "pe1",
        "pe1@gmail.com",
        "Genral task",
        "pagy",
        "pa1",
        "Task should complete before time",
        "pagy",
        "pe1",
        "pe1@gmail.com"
      ],
      "line": 204
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 205,
  "name": "Go to dashboard",
  "keyword": "And "
});
formatter.step({
  "line": 206,
  "name": "edit the task",
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
      "line": 207
    },
    {
      "cells": [
        "task2",
        "pemp",
        "pe1",
        "complete before 1 pm",
        "pemp",
        "pe1",
        "pe1@gmail.com",
        "task1",
        "pagy",
        "pa1",
        "complete before 1 pm",
        "pagy",
        "pe1",
        "pe1@gmail.com"
      ],
      "line": 208
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 210,
  "name": "verify all the edited details",
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
      "line": 211
    },
    {
      "cells": [
        "task2",
        "pemp",
        "pe1",
        "complete before 1 pm",
        "pemp",
        "pe1",
        "pe1@gmail.com",
        "task1",
        "pagy",
        "pa1",
        "complete before 1 pm",
        "pagy",
        "pe1",
        "pe1@gmail.com"
      ],
      "line": 212
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 213,
  "name": "verify all the edited details",
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
      "line": 214
    },
    {
      "cells": [
        "task2",
        "pemp",
        "pe1",
        "complete before 1 pm",
        "pemp",
        "pe1",
        "pe1@gmail.com",
        "task1",
        "pagy",
        "pa1",
        "complete before 1 pm",
        "pagy",
        "pe1",
        "pe1@gmail.com"
      ],
      "line": 215
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "TheEmployerIsAbleToAddAgency.user_must_be_registered()"
});
formatter.result({
  "duration": 27886263400,
  "status": "passed"
});
formatter.match({
  "location": "TheEmployerIsAbleToAddAgency.title_of_login_page_is_Home()"
});
formatter.result({
  "duration": 11052300,
  "status": "passed"
});
formatter.match({
  "location": "TheEmployerIsAbleToAddAgency.click_on_Employer_Agency_Signin_link()"
});
formatter.result({
  "duration": 3248412300,
  "status": "passed"
});
formatter.match({
  "location": "TC275E.user_enters_valid_and_credentials()"
});
formatter.result({
  "duration": 6105408500,
  "status": "passed"
});
formatter.match({
  "location": "TC275E.team_member_should_be_added(DataTable)"
});
formatter.result({
  "duration": 8792622500,
  "status": "passed"
});
formatter.match({
  "location": "TC264_266.go_to_workbench()"
});
formatter.result({
  "duration": 2172271900,
  "status": "passed"
});
formatter.match({
  "location": "TC264_266.select_a_job_and_click_on_add_task_button()"
});
formatter.result({
  "duration": 2341544700,
  "status": "passed"
});
formatter.match({
  "location": "TC275E.share_job_with_team_member(DataTable)"
});
formatter.result({
  "duration": 24270271400,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"(//td[text()\u003d\u0027null\u0027]//following::span[@class\u003d\u0027checkmark CheckBoxM\u0027])[1]\"}\n  (Session info: chrome\u003d83.0.4103.61)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-6IM5GGG\u0027, ip: \u0027192.168.43.55\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002712.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 83.0.4103.61, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: C:\\Users\\TLP33\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:54401}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: e9bb9f58add7def729b02e63651c040b\n*** Element info: {Using\u003dxpath, value\u003d(//td[text()\u003d\u0027null\u0027]//following::span[@class\u003d\u0027checkmark CheckBoxM\u0027])[1]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat pages.TaskPage.shareWithTeam(TaskPage.java:606)\r\n\tat BVT_StepDefination.TC275E.share_job_with_team_member(TC275E.java:42)\r\n\tat ✽.And Share job with team member(TaskK.feature:197)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "TC264_266.go_to_workbench()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC264_266.select_a_job_and_click_on_add_task_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC275E.Click_on_Add_task_button_and_enter_all_details(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC264_266.go_to_dashboard()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC302.edit_the_task(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC302.verify_all_the_edited_details(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC302.verify_all_the_edited_details(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 28100,
  "status": "passed"
});
formatter.before({
  "duration": 351100,
  "status": "passed"
});
formatter.before({
  "duration": 256700,
  "status": "passed"
});
formatter.before({
  "duration": 230700,
  "status": "passed"
});
formatter.before({
  "duration": 211400,
  "status": "passed"
});
formatter.before({
  "duration": 230700,
  "status": "passed"
});
formatter.before({
  "duration": 257100,
  "status": "passed"
});
formatter.before({
  "duration": 192500,
  "status": "passed"
});
formatter.before({
  "duration": 176600,
  "status": "passed"
});
formatter.scenario({
  "line": 219,
  "name": "to verify refresh button functionality",
  "description": "",
  "id": "task-feature;to-verify-refresh-button-functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 218,
      "name": "@TC294"
    },
    {
      "line": 218,
      "name": "@BVT"
    },
    {
      "line": 218,
      "name": "@task"
    }
  ]
});
formatter.step({
  "line": 220,
  "name": "User must be registered",
  "keyword": "Given "
});
formatter.step({
  "line": 221,
  "name": "title of login page is Home",
  "keyword": "When "
});
formatter.step({
  "line": 222,
  "name": "Click on Employer-Agency Signin link",
  "keyword": "And "
});
formatter.step({
  "line": 223,
  "name": "user enters valid credentials",
  "keyword": "And "
});
formatter.step({
  "line": 224,
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
      "line": 225
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
      "line": 226
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
      "line": 227
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 228,
  "name": "Go to workbench",
  "keyword": "And "
});
formatter.step({
  "line": 229,
  "name": "Select a job",
  "keyword": "And "
});
formatter.step({
  "line": 230,
  "name": "Share job with team member",
  "rows": [
    {
      "cells": [
        "EmpTeam",
        "Agyteam"
      ],
      "line": 231
    },
    {
      "cells": [
        "pe1",
        "pa1"
      ],
      "line": 232
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 233,
  "name": "Go to dashboard",
  "keyword": "And "
});
formatter.step({
  "line": 234,
  "name": "Click on Add task button and enter all details",
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
      "line": 236
    },
    {
      "cells": [
        "Genral task",
        "pemp",
        "pe1",
        "Task should complete before time",
        "pemp",
        "pe1",
        "pe1@gmail.com",
        "Genral task",
        "pagy",
        "pa1",
        "Task should complete before time",
        "pagy",
        "pe1",
        "pe1@gmail.com"
      ],
      "line": 237
    },
    {
      "cells": [
        "task1",
        "pemp",
        "pemp",
        "note1",
        "pemp",
        "pe1",
        "pe1@gmail.com",
        "task",
        "pagy",
        "pagy",
        "Task",
        "pagy",
        "pe1",
        "pe1@gmail.com"
      ],
      "line": 238
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 240,
  "name": "Click on My Task",
  "keyword": "And "
});
formatter.step({
  "line": 241,
  "name": "Click on Reload Task button",
  "keyword": "Then "
});
formatter.step({
  "line": 242,
  "name": "Click on Team Task",
  "keyword": "And "
});
formatter.step({
  "line": 243,
  "name": "Click on Reload Task button",
  "keyword": "Then "
});
formatter.match({
  "location": "TheEmployerIsAbleToAddAgency.user_must_be_registered()"
});
formatter.result({
  "duration": 28929603200,
  "status": "passed"
});
formatter.match({
  "location": "TheEmployerIsAbleToAddAgency.title_of_login_page_is_Home()"
});
formatter.result({
  "duration": 8949000,
  "status": "passed"
});
formatter.match({
  "location": "TheEmployerIsAbleToAddAgency.click_on_Employer_Agency_Signin_link()"
});
formatter.result({
  "duration": 3151510900,
  "status": "passed"
});
formatter.match({
  "location": "TC275E.user_enters_valid_and_credentials()"
});
formatter.result({
  "duration": 6097831500,
  "status": "passed"
});
formatter.match({
  "location": "TC275E.team_member_should_be_added(DataTable)"
});
formatter.result({
  "duration": 8698427400,
  "status": "passed"
});
formatter.match({
  "location": "TC264_266.go_to_workbench()"
});
formatter.result({
  "duration": 2171573200,
  "status": "passed"
});
formatter.match({
  "location": "TC264_266.select_a_job_and_click_on_add_task_button()"
});
formatter.result({
  "duration": 2363793600,
  "status": "passed"
});
formatter.match({
  "location": "TC275E.share_job_with_team_member(DataTable)"
});
formatter.result({
  "duration": 24244268000,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"(//td[text()\u003d\u0027null\u0027]//following::span[@class\u003d\u0027checkmark CheckBoxM\u0027])[1]\"}\n  (Session info: chrome\u003d83.0.4103.61)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-6IM5GGG\u0027, ip: \u0027192.168.43.55\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002712.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 83.0.4103.61, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: C:\\Users\\TLP33\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:54458}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: c53edf39b902158583c1cbf3e18dac11\n*** Element info: {Using\u003dxpath, value\u003d(//td[text()\u003d\u0027null\u0027]//following::span[@class\u003d\u0027checkmark CheckBoxM\u0027])[1]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat pages.TaskPage.shareWithTeam(TaskPage.java:606)\r\n\tat BVT_StepDefination.TC275E.share_job_with_team_member(TC275E.java:42)\r\n\tat ✽.And Share job with team member(TaskK.feature:230)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "TC264_266.go_to_dashboard()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC275E.Click_on_Add_task_button_and_enter_all_details(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC294.click_on_My_Task()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC294.click_on_Reload_Task_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC294.click_on_Team_Task()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC294.click_on_Reload_Task_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 32500,
  "status": "passed"
});
});