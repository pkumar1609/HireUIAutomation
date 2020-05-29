$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/TLP33/Documents/GitHub/HireUIAutomation/HireXpertUIAutomation/HireXpertUIAutomation/src/main/java/features/TaskK.feature");
formatter.feature({
  "line": 1,
  "name": "Task Feature",
  "description": "",
  "id": "task-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 26990748200,
  "status": "passed"
});
formatter.scenario({
  "line": 606,
  "name": "Verify task added for agency owner by team member display in teamtask when owner mark in progres",
  "description": "",
  "id": "task-feature;verify-task-added-for-agency-owner-by-team-member-display-in-teamtask-when-owner-mark-in-progres",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 605,
      "name": "@TC_300"
    }
  ]
});
formatter.step({
  "line": 607,
  "name": "User should be registered",
  "keyword": "Given "
});
formatter.step({
  "line": 608,
  "name": "title of login page is Home",
  "keyword": "When "
});
formatter.step({
  "line": 609,
  "name": "Click on Employer-Agency Signin link",
  "keyword": "And "
});
formatter.step({
  "line": 610,
  "name": "Employer enters valid credentials",
  "keyword": "And "
});
formatter.step({
  "line": 611,
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
      "line": 612
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
      "line": 613
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
      "line": 614
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 615,
  "name": "Go to workbench",
  "keyword": "And "
});
formatter.step({
  "line": 616,
  "name": "Select a job",
  "keyword": "And "
});
formatter.step({
  "line": 617,
  "name": "Share job with team member",
  "rows": [
    {
      "cells": [
        "Team",
        "Agyteam"
      ],
      "line": 618
    },
    {
      "cells": [
        "pe1",
        "pa1"
      ],
      "line": 619
    }
  ],
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 620,
      "value": "#|pe2 |pa2   |"
    }
  ],
  "line": 621,
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
      "line": 622
    },
    {
      "cells": [
        "task9",
        "pemp",
        "pemp",
        "Task should complete before time",
        "pemp",
        "pe1",
        "pe1@gmail.com",
        "task9",
        "pagy",
        "pagy",
        "Task should complete before time",
        "pagy",
        "pa1",
        "pe1@gmail.com"
      ],
      "line": 623
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "TC275E.user_should_be_registered()"
});
formatter.result({
  "duration": 109579200,
  "status": "passed"
});
formatter.match({
  "location": "TC264_266.title_of_login_page_is_Home()"
});
formatter.result({
  "duration": 7647300,
  "status": "passed"
});
formatter.match({
  "location": "TC264_266.click_on_Employer_Agency_Signin_link()"
});
formatter.result({
  "duration": 3112767900,
  "status": "passed"
});
formatter.match({
  "location": "TC264_266.employer_enters_valid_credentials()"
});
formatter.result({
  "duration": 6542095700,
  "status": "passed"
});
formatter.match({
  "location": "TC275E.team_member_should_be_added(DataTable)"
});
formatter.result({
  "duration": 81391887400,
  "status": "passed"
});
formatter.match({
  "location": "TC264_266.go_to_workbench()"
});
formatter.result({
  "duration": 2091308700,
  "status": "passed"
});
formatter.match({
  "location": "TC264_266.select_a_job_and_click_on_add_task_button()"
});
formatter.result({
  "duration": 2109819400,
  "status": "passed"
});
formatter.match({
  "location": "TC275E.share_job_with_team_member(DataTable)"
});
formatter.result({
  "duration": 8224485800,
  "status": "passed"
});
formatter.match({
  "location": "TC264_266.in_add_task_popup_Fill_all_the_mandatory_details(DataTable)"
});
formatter.result({
  "duration": 5668156000,
  "status": "passed"
});
});