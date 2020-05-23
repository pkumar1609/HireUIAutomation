$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/features/assignToAndAddedBy.feature");
formatter.feature({
  "line": 1,
  "name": "Job Management",
  "description": "",
  "id": "job-management",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 65,
      "value": "#Reg TC ID - 151"
    }
  ],
  "line": 69,
  "name": "Verify the Assign To field from candidate card",
  "description": "",
  "id": "job-management;verify-the-assign-to-field-from-candidate-card",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 68,
      "name": "@regression1_03"
    }
  ]
});
formatter.step({
  "line": 71,
  "name": "User is on Home page of application",
  "keyword": "Given "
});
formatter.step({
  "line": 73,
  "name": "title of page is HireXpert",
  "keyword": "When "
});
formatter.step({
  "line": 74,
  "name": "enter valid user email address and password for employer and click on Sign in button",
  "rows": [
    {
      "cells": [
        "sayali8@gmail.com",
        "12345"
      ],
      "line": 75
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 76,
  "name": "click on Workbench tab and select job from Jobs drop down",
  "keyword": "And "
});
formatter.step({
  "line": 77,
  "name": "click on Share With Agency button and share job with agency owner",
  "keyword": "And "
});
formatter.step({
  "line": 78,
  "name": "logout with employer and login with agency with whom job is shared",
  "rows": [
    {
      "cells": [
        "sayagency1@gmail.com",
        "12345"
      ],
      "line": 79
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 80,
  "name": "click on Workbench tab and select job from Jobs drop down",
  "keyword": "And "
});
formatter.step({
  "line": 81,
  "name": "click on Add Candidate button and one new candidate for the job and click on Find button",
  "rows": [
    {
      "cells": [
        "c01@gmail.com"
      ],
      "line": 82
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 83,
  "name": "Fill mandatory details",
  "keyword": "And "
});
formatter.step({
  "line": 84,
  "name": "click on Save button",
  "keyword": "And "
});
formatter.step({
  "line": 85,
  "name": "new candidate should get added in New column",
  "keyword": "Then "
});
formatter.step({
  "line": 86,
  "name": "observe Change Assign To icon in front of Assign To name",
  "keyword": "And "
});
formatter.step({
  "line": 87,
  "name": "now move the candidate from New column to another column and and check the name for Assign To field on candidate card",
  "keyword": "And "
});
formatter.step({
  "line": 88,
  "name": "observe Change Assign To icon in front of Assign To name",
  "keyword": "And "
});
formatter.step({
  "line": 89,
  "name": "click on Change Assign To icon in front of Assign To name to verify it is clickable or not and user able to change the name",
  "keyword": "And "
});
formatter.step({
  "line": 90,
  "name": "click on Share With Team button and share that job with agency team member",
  "keyword": "And "
});
formatter.step({
  "line": 91,
  "name": "Login with agency team member",
  "rows": [
    {
      "cells": [
        "sayagency1team1@gmail.com",
        "12345"
      ],
      "line": 92
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 93,
  "name": "click on Workbench tab and select job from Jobs drop down",
  "keyword": "And "
});
formatter.step({
  "line": 94,
  "name": "click on Add Candidate button and one new candidate for the job and click on Find button",
  "rows": [
    {
      "cells": [
        "c02@gmail.com"
      ],
      "line": 95
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 96,
  "name": "Fill mandatory details",
  "keyword": "And "
});
formatter.step({
  "line": 97,
  "name": "click on Save button",
  "keyword": "And "
});
formatter.step({
  "line": 98,
  "name": "new candidate should get added in New column",
  "keyword": "Then "
});
formatter.step({
  "line": 99,
  "name": "Click on Reject Candidate icon from candidate card and reject that candidate",
  "keyword": "And "
});
formatter.step({
  "line": 100,
  "name": "Now login with Employer",
  "rows": [
    {
      "cells": [
        "sayali8@gmail.com",
        "12345"
      ],
      "line": 101
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 102,
  "name": "click on Workbench tab and select job from Jobs drop down",
  "keyword": "And "
});
formatter.step({
  "line": 103,
  "name": "Observe rejected candidate in Rejected column and observe name for Assign To on candidate card",
  "keyword": "And "
});
formatter.step({
  "line": 104,
  "name": "Rejected column card should be assigned to employer",
  "keyword": "Then "
});
formatter.step({
  "line": 105,
  "name": "Click on Filter icon from right upper corner",
  "keyword": "And "
});
formatter.step({
  "line": 106,
  "name": "Observe Assign To filter list",
  "keyword": "And "
});
formatter.step({
  "line": 107,
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "invaliddatasteps.user_is_on_Home_page_of_application()"
});
formatter.result({
  "duration": 15807755900,
  "error_message": "org.openqa.selenium.SessionNotCreatedException: session not created\nfrom chrome not reachable\n  (Session info: chrome\u003d81.0.4044.138)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-VSLC9PE\u0027, ip: \u0027192.168.43.46\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002713.0.2\u0027\nDriver info: driver.version: ChromeDriver\nremote stacktrace: Backtrace:\n\tOrdinal0 [0x00F40C83+1707139]\n\tOrdinal0 [0x00EA68F1+1075441]\n\tOrdinal0 [0x00E1DE72+515698]\n\tOrdinal0 [0x00E17CA8+490664]\n\tOrdinal0 [0x00E1839B+492443]\n\tOrdinal0 [0x00E192F5+496373]\n\tOrdinal0 [0x00E14F05+478981]\n\tOrdinal0 [0x00E1ECA0+519328]\n\tOrdinal0 [0x00DCCA67+182887]\n\tOrdinal0 [0x00DCBDDD+179677]\n\tOrdinal0 [0x00DC9D4B+171339]\n\tOrdinal0 [0x00DB1D4A+73034]\n\tOrdinal0 [0x00DB2DC0+77248]\n\tOrdinal0 [0x00DB2D59+77145]\n\tOrdinal0 [0x00EBBB67+1162087]\n\tGetHandleVerifier [0x00FDA966+508998]\n\tGetHandleVerifier [0x00FDA6A4+508292]\n\tGetHandleVerifier [0x00FEF7B7+594583]\n\tGetHandleVerifier [0x00FDB1D6+511158]\n\tOrdinal0 [0x00EB402C+1130540]\n\tOrdinal0 [0x00EBD4CB+1168587]\n\tOrdinal0 [0x00EBD633+1168947]\n\tOrdinal0 [0x00ED5B35+1268533]\n\tBaseThreadInitThunk [0x759D6359+25]\n\tRtlGetAppContainerNamedObjectPath [0x773D7C24+228]\n\tRtlGetAppContainerNamedObjectPath [0x773D7BF4+180]\n\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.W3CHandshakeResponse.lambda$errorHandler$0(W3CHandshakeResponse.java:62)\r\n\tat org.openqa.selenium.remote.HandshakeResponse.lambda$getResponseFunction$0(HandshakeResponse.java:30)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.lambda$createSession$0(ProtocolHandshake.java:126)\r\n\tat java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:195)\r\n\tat java.base/java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:958)\r\n\tat java.base/java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:127)\r\n\tat java.base/java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:502)\r\n\tat java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:488)\r\n\tat java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)\r\n\tat java.base/java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)\r\n\tat java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)\r\n\tat java.base/java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:543)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:128)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:74)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:136)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:213)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:131)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:181)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:168)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:123)\r\n\tat utilPackage.baseclass.initialization(baseclass.java:94)\r\n\tat jobFunctionality.invaliddatasteps.user_is_on_Home_page_of_application(invaliddatasteps.java:20)\r\n\tat ✽.Given User is on Home page of application(src/main/java/features/assignToAndAddedBy.feature:71)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "invaliddatasteps.title_of_page_is_HireXpert()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "candidateProfile.enter_valid_user_email_address_and_password_for_employer_and_click_on_Sign_in_button(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "candidateProfile.click_on_Workbench_tab_and_select_job_from_Jobs_drop_down()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "candidateProfile.click_on_Workbench_tab_and_select_job_from_Jobs_drop_down()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "candidateProfile.click_on_Add_Candidate_button_and_one_new_candidate_for_the_job_and_click_on_Find_button(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "addjobsteps.fill_mandatory_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "candidateProfile.click_on_Save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "addjobsteps.new_candidate_should_get_added_in_New_column()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "candidateProfile.click_on_Workbench_tab_and_select_job_from_Jobs_drop_down()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "candidateProfile.click_on_Add_Candidate_button_and_one_new_candidate_for_the_job_and_click_on_Find_button(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "addjobsteps.fill_mandatory_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "candidateProfile.click_on_Save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "addjobsteps.new_candidate_should_get_added_in_New_column()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "candidateProfile.click_on_Workbench_tab_and_select_job_from_Jobs_drop_down()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "invaliddatasteps.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});