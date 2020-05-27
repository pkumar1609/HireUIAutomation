$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/TLP33/Documents/GitHub/HireUIAutomation/HireXpertUIAutomation/HireXpertUIAutomation/src/main/java/features/TaskK.feature");
formatter.feature({
  "line": 1,
  "name": "Task Feature",
  "description": "",
  "id": "task-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 19987655800,
  "status": "passed"
});
formatter.scenario({
  "line": 503,
  "name": "To verify third team member can make task in progress or in completed status",
  "description": "",
  "id": "task-feature;to-verify-third-team-member-can-make-task-in-progress-or-in-completed-status",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 502,
      "name": "@TC330A"
    }
  ]
});
formatter.step({
  "line": 504,
  "name": "User should be registered",
  "keyword": "Given "
});
formatter.step({
  "line": 505,
  "name": "title of login page is Home",
  "keyword": "When "
});
formatter.step({
  "line": 506,
  "name": "Click on Employer-Agency Signin link",
  "keyword": "And "
});
formatter.step({
  "line": 507,
  "name": "agency enters valid credentials",
  "keyword": "And "
});
formatter.step({
  "line": 508,
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
      "line": 509
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
      "line": 510
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
      "line": 511
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 512,
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
      "line": 513
    },
    {
      "cells": [
        "task11",
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
      "line": 514
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 515,
  "name": "the task should display for agency",
  "keyword": "And "
});
formatter.step({
  "line": 516,
  "name": "Logout from App",
  "keyword": "And "
});
formatter.step({
  "line": 517,
  "name": "Click on Employer-Agency Signin link",
  "keyword": "And "
});
formatter.step({
  "line": 518,
  "name": "Login with agency team",
  "keyword": "And "
});
formatter.step({
  "line": 519,
  "name": "Task should also display for agency team member",
  "keyword": "And "
});
formatter.step({
  "line": 520,
  "name": "Logout from App",
  "keyword": "And "
});
formatter.step({
  "line": 521,
  "name": "Click on Employer-Agency Signin link",
  "keyword": "And "
});
formatter.step({
  "line": 522,
  "name": "login as third agency team",
  "keyword": "And "
});
formatter.step({
  "line": 523,
  "name": "Task should also display for agency team member",
  "keyword": "And "
});
formatter.step({
  "line": 524,
  "name": "Click on mark in progress",
  "keyword": "And "
});
formatter.step({
  "line": 525,
  "name": "third user should not able to put task in progress",
  "keyword": "Then "
});
formatter.match({
  "location": "TC275E.user_should_be_registered()"
});
formatter.result({
  "duration": 15141728800,
  "status": "passed"
});
formatter.match({
  "location": "TC264_266.title_of_login_page_is_Home()"
});
formatter.result({
  "duration": 8838900,
  "status": "passed"
});
formatter.match({
  "location": "TC264_266.click_on_Employer_Agency_Signin_link()"
});
formatter.result({
  "duration": 3097634700,
  "status": "passed"
});
formatter.match({
  "location": "TC265_267k.agency_enters_valid_credentials()"
});
formatter.result({
  "duration": 25133366000,
  "status": "passed"
});
formatter.match({
  "location": "TC275E.team_member_should_be_added(DataTable)"
});
formatter.result({
  "duration": 8735880400,
  "status": "passed"
});
formatter.match({
  "location": "TC265_267k.in_add_task_popup_Fill_all_the_mandatory_details(DataTable)"
});
formatter.result({
  "duration": 7777150200,
  "status": "passed"
});
formatter.match({
  "location": "TC265_267k.the_task_should_display_for_both_agency()"
});
formatter.result({
  "duration": 3212570300,
  "status": "passed"
});
formatter.match({
  "location": "TC275E.Logout_from_App()"
});
formatter.result({
  "duration": 4314902800,
  "status": "passed"
});
formatter.match({
  "location": "TC264_266.click_on_Employer_Agency_Signin_link()"
});
formatter.result({
  "duration": 3127620800,
  "status": "passed"
});
formatter.match({
  "location": "TC265_267k.login_with_agency_team()"
});
formatter.result({
  "duration": 24223139700,
  "status": "passed"
});
formatter.match({
  "location": "TC265_267k.task_should_also_display_for_team_member()"
});
formatter.result({
  "duration": 23305386200,
  "status": "passed"
});
formatter.match({
  "location": "TC275E.Logout_from_App()"
});
formatter.result({
  "duration": 4341595800,
  "status": "passed"
});
formatter.match({
  "location": "TC264_266.click_on_Employer_Agency_Signin_link()"
});
formatter.result({
  "duration": 3082114800,
  "status": "passed"
});
formatter.match({
  "location": "TC330.login_as_third_agency_team()"
});
formatter.result({
  "duration": 24808008500,
  "status": "passed"
});
formatter.match({
  "location": "TC265_267k.task_should_also_display_for_team_member()"
});
formatter.result({
  "duration": 3250229400,
  "status": "passed"
});
formatter.match({
  "location": "TC269_271_273.click_on_mark_in_progress()"
});
formatter.result({
  "duration": 2116674400,
  "status": "passed"
});
formatter.match({
  "location": "TC330.third_user_should_not_able_to_put_task_in_progress()"
});
formatter.result({
  "duration": 2275950900,
  "status": "passed"
});
});