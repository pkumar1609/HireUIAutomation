$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Admin/eclipse-workspace/HireXpert/HireXpert/src/main/java/features/addjob.feature");
formatter.feature({
  "line": 1,
  "name": "Job Management",
  "description": "",
  "id": "job-management",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "To verify user is able to add or delete skills",
  "description": "",
  "id": "job-management;to-verify-user-is-able-to-add-or-delete-skills",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User is on Home page of application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "title of page is \"HireXpert\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "enter valid user \"\u003cemail address\u003e\" and \"\u003cpassword\u003e\" for registered employer and agency and click on Sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "click on Workbench tab",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "click on Add Job button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "fill all mandatory details on Add Job popup window",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Click on submit button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Job should get successfully added and Job should be visible in Job drop down",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "click on Job drop down and select recently added job",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "click on Edit Job button to make changes in job",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "make any changes in the job",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "click on submit button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User should be able to update the job",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "again click on click on Edit Job button and observe the changes",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "all updated information should be saved in the job",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "click on Add Skill button and add some skills",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "one job skill row should get added after clicking on Add Skill button and user should able to add only ten skills",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "click on Delete Skill button in front of any skill",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "after clicking on Delete Skill button present in front of skill then that skill row should get deleted",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "close the browser",
  "keyword": "And "
});
formatter.examples({
  "line": 27,
  "name": "",
  "description": "",
  "id": "job-management;to-verify-user-is-able-to-add-or-delete-skills;",
  "rows": [
    {
      "cells": [
        "email address",
        "password"
      ],
      "line": 28,
      "id": "job-management;to-verify-user-is-able-to-add-or-delete-skills;;1"
    },
    {
      "cells": [
        "sayali@gmail.com",
        "12345"
      ],
      "line": 29,
      "id": "job-management;to-verify-user-is-able-to-add-or-delete-skills;;2"
    },
    {
      "cells": [
        "sayagency@gmail.com",
        "12345"
      ],
      "line": 30,
      "id": "job-management;to-verify-user-is-able-to-add-or-delete-skills;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 29,
  "name": "To verify user is able to add or delete skills",
  "description": "",
  "id": "job-management;to-verify-user-is-able-to-add-or-delete-skills;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User is on Home page of application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "title of page is \"HireXpert\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "enter valid user \"sayali@gmail.com\" and \"12345\" for registered employer and agency and click on Sign in button",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "click on Workbench tab",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "click on Add Job button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "fill all mandatory details on Add Job popup window",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Click on submit button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Job should get successfully added and Job should be visible in Job drop down",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "click on Job drop down and select recently added job",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "click on Edit Job button to make changes in job",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "make any changes in the job",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "click on submit button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User should be able to update the job",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "again click on click on Edit Job button and observe the changes",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "all updated information should be saved in the job",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "click on Add Skill button and add some skills",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "one job skill row should get added after clicking on Add Skill button and user should able to add only ten skills",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "click on Delete Skill button in front of any skill",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "after clicking on Delete Skill button present in front of skill then that skill row should get deleted",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "addjobsteps.user_is_on_Home_page_of_application()"
});
formatter.result({
  "duration": 34837199900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "HireXpert",
      "offset": 18
    }
  ],
  "location": "addjobsteps.title_of_page_is(String)"
});
formatter.result({
  "duration": 7642900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sayali@gmail.com",
      "offset": 18
    },
    {
      "val": "12345",
      "offset": 41
    }
  ],
  "location": "addjobsteps.enter_valid_user_and_for_registered_employer_and_agency_and_click_on_Sign_in_button(String,String)"
});
formatter.result({
  "duration": 6252843100,
  "status": "passed"
});
formatter.match({
  "location": "addjobsteps.click_on_Workbench_tab()"
});
formatter.result({
  "duration": 5108092300,
  "status": "passed"
});
formatter.match({
  "location": "addjobsteps.click_on_Add_Job_button()"
});
formatter.result({
  "duration": 2221833700,
  "status": "passed"
});
formatter.match({
  "location": "addjobsteps.fill_all_mandatory_details_on_Add_Job_popup_window()"
});
formatter.result({
  "duration": 4650614200,
  "status": "passed"
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
  "location": "addjobsteps.click_on_Add_Skill_button_and_add_some_skills()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "addjobsteps.one_job_skill_row_should_get_added_after_clicking_on_Add_Skill_button_and_user_should_able_to_add_only_ten_skills()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "addjobsteps.click_on_Delete_Skill_button_in_front_of_any_skill()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "addjobsteps.after_clicking_on_Delete_Skill_button_present_in_front_of_skill_then_that_skill_row_should_get_deleted()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "addjobsteps.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 30,
  "name": "To verify user is able to add or delete skills",
  "description": "",
  "id": "job-management;to-verify-user-is-able-to-add-or-delete-skills;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User is on Home page of application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "title of page is \"HireXpert\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "enter valid user \"sayagency@gmail.com\" and \"12345\" for registered employer and agency and click on Sign in button",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "click on Workbench tab",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "click on Add Job button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "fill all mandatory details on Add Job popup window",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Click on submit button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Job should get successfully added and Job should be visible in Job drop down",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "click on Job drop down and select recently added job",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "click on Edit Job button to make changes in job",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "make any changes in the job",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "click on submit button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User should be able to update the job",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "again click on click on Edit Job button and observe the changes",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "all updated information should be saved in the job",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "click on Add Skill button and add some skills",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "one job skill row should get added after clicking on Add Skill button and user should able to add only ten skills",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "click on Delete Skill button in front of any skill",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "after clicking on Delete Skill button present in front of skill then that skill row should get deleted",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "addjobsteps.user_is_on_Home_page_of_application()"
});
formatter.result({
  "duration": 46366956600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "HireXpert",
      "offset": 18
    }
  ],
  "location": "addjobsteps.title_of_page_is(String)"
});
formatter.result({
  "duration": 8806800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sayagency@gmail.com",
      "offset": 18
    },
    {
      "val": "12345",
      "offset": 44
    }
  ],
  "location": "addjobsteps.enter_valid_user_and_for_registered_employer_and_agency_and_click_on_Sign_in_button(String,String)"
});
formatter.result({
  "duration": 6251594800,
  "status": "passed"
});
formatter.match({
  "location": "addjobsteps.click_on_Workbench_tab()"
});
formatter.result({
  "duration": 5110883300,
  "status": "passed"
});
formatter.match({
  "location": "addjobsteps.click_on_Add_Job_button()"
});
formatter.result({
  "duration": 2209322900,
  "status": "passed"
});
formatter.match({
  "location": "addjobsteps.fill_all_mandatory_details_on_Add_Job_popup_window()"
});
formatter.result({
  "duration": 4478775500,
  "status": "passed"
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
  "location": "addjobsteps.click_on_Add_Skill_button_and_add_some_skills()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "addjobsteps.one_job_skill_row_should_get_added_after_clicking_on_Add_Skill_button_and_user_should_able_to_add_only_ten_skills()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "addjobsteps.click_on_Delete_Skill_button_in_front_of_any_skill()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "addjobsteps.after_clicking_on_Delete_Skill_button_present_in_front_of_skill_then_that_skill_row_should_get_deleted()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "addjobsteps.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});