$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TaskK.feature");
formatter.feature({
  "line": 1,
  "name": "Task Feature",
  "description": "",
  "id": "task-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 455400,
  "status": "passed"
});
formatter.before({
  "duration": 341700,
  "status": "passed"
});
formatter.before({
  "duration": 350600,
  "status": "passed"
});
formatter.before({
  "duration": 344600,
  "status": "passed"
});
formatter.before({
  "duration": 299600,
  "status": "passed"
});
formatter.before({
  "duration": 292200,
  "status": "passed"
});
formatter.before({
  "duration": 338600,
  "status": "passed"
});
formatter.before({
  "duration": 404800,
  "status": "passed"
});
formatter.scenario({
  "line": 158,
  "name": "verify the functionality of edit for general tasks",
  "description": "",
  "id": "task-feature;verify-the-functionality-of-edit-for-general-tasks",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 157,
      "name": "@TC302"
    },
    {
      "line": 157,
      "name": "@BVT"
    },
    {
      "line": 157,
      "name": "@task"
    }
  ]
});
formatter.step({
  "line": 160,
  "name": "User must be registered",
  "keyword": "Given "
});
formatter.step({
  "line": 161,
  "name": "title of login page is Home",
  "keyword": "When "
});
formatter.step({
  "line": 162,
  "name": "Click on Employer-Agency Signin link",
  "keyword": "And "
});
formatter.step({
  "line": 163,
  "name": "user enters valid credentials",
  "keyword": "And "
});
formatter.step({
  "line": 164,
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
      "line": 165
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
      "line": 166
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
      "line": 167
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 168,
  "name": "Go to workbench",
  "keyword": "And "
});
formatter.step({
  "line": 169,
  "name": "Select a job",
  "keyword": "And "
});
formatter.step({
  "line": 170,
  "name": "Share job with team member",
  "rows": [
    {
      "cells": [
        "EmpTeam",
        "Agyteam"
      ],
      "line": 171
    },
    {
      "cells": [
        "pe1",
        "pa1"
      ],
      "line": 172
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 173,
  "name": "Go to dashboard",
  "keyword": "And "
});
formatter.step({
  "line": 174,
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
      "line": 175
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
      "line": 176
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 178,
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
      "line": 179
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
      "line": 180
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 182,
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
      "line": 183
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
      "line": 184
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "TheEmployerIsAbleToAddAgency.user_must_be_registered()"
});
formatter.result({
  "duration": 29035021900,
  "status": "passed"
});
formatter.match({
  "location": "TheEmployerIsAbleToAddAgency.title_of_login_page_is_Home()"
});
formatter.result({
  "duration": 8251000,
  "status": "passed"
});
formatter.match({
  "location": "TheEmployerIsAbleToAddAgency.click_on_Employer_Agency_Signin_link()"
});
formatter.result({
  "duration": 3090361200,
  "status": "passed"
});
formatter.match({
  "location": "TC275E.user_enters_valid_and_credentials()"
});
formatter.result({
  "duration": 12505715100,
  "status": "passed"
});
formatter.match({
  "location": "TC275E.team_member_should_be_added(DataTable)"
});
formatter.result({
  "duration": 9647728000,
  "status": "passed"
});
formatter.match({
  "location": "TC264_266.go_to_workbench()"
});
formatter.result({
  "duration": 2074351400,
  "status": "passed"
});
formatter.match({
  "location": "TC264_266.select_a_job_and_click_on_add_task_button()"
});
formatter.result({
  "duration": 2135161500,
  "status": "passed"
});
formatter.match({
  "location": "TC275E.share_job_with_team_member(DataTable)"
});
formatter.result({
  "duration": 28887804900,
  "status": "passed"
});
formatter.match({
  "location": "TC264_266.go_to_dashboard()"
});
formatter.result({
  "duration": 97957600,
  "status": "passed"
});
formatter.match({
  "location": "TC275E.Click_on_Add_task_button_and_enter_all_details(DataTable)"
});
formatter.result({
  "duration": 5703306400,
  "status": "passed"
});
formatter.match({
  "location": "TC302.edit_the_task(DataTable)"
});
formatter.result({
  "duration": 4157788600,
  "error_message": "org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element \u003clabel _ngcontent-qsu-c7\u003d\"\" class\u003d\"radio-label CustomPointer\" for\u003d\"test2\"\u003e...\u003c/label\u003e is not clickable at point (1279, 206). Other element would receive the click: \u003cdiv _ngcontent-qsu-c2\u003d\"\" class\u003d\"ngx-overlay loading-foreground\" style\u003d\"background-color: rgba(40, 40, 40, 0.8); border-radius: 0px;\"\u003e...\u003c/div\u003e\n  (Session info: chrome\u003d83.0.4103.61)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-6IM5GGG\u0027, ip: \u0027192.168.43.55\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002712.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 83.0.4103.61, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: C:\\Users\\TLP33\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:52439}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: e7e56b80056fa9ba262aa98a71a26aba\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:567)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy21.click(Unknown Source)\r\n\tat pages.TaskPage.ClickOnEditTask(TaskPage.java:257)\r\n\tat BVT_StepDefination.TC302.edit_the_task(TC302.java:42)\r\n\tat ✽.And edit the task(TaskK.feature:178)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "TC302.verify_all_the_edited_details(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 44200,
  "status": "passed"
});
});