$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/features/blockFunctionality.feature");
formatter.feature({
  "line": 1,
  "name": "Job Management",
  "description": "",
  "id": "job-management",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Verify the Block functionality for Agency with Employer login",
  "description": "",
  "id": "job-management;verify-the-block-functionality-for-agency-with-employer-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@agencyblock"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User is on Home page of application",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "title of page is HireXpert",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "enter valid user email address and password for registered employer and click on Sign in button",
  "rows": [
    {
      "cells": [
        "sayali8@gmail.com",
        "12345"
      ],
      "line": 10
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "click on Agencies tab and add one new agency by clicking on Add button if agencies are not present",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "click on Close button from Agencies window",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "click on Workbench tab and select job from Jobs drop down",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "click on Share With Agency button and select the Share checkbox present in front of the agency to share the job",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "click on Yes button from confirmation popup and click on Close button from Share Job window",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "again click on Share With Agency button and select the Block/Unblock checkbox present in front of the agency with whom you shared the job",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "click on Yes button from confirmation popup and click on Close button from Share Job window",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "logout with employer and login with Agency valid credentials which you blocked on Share Job page",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "update profile window get opened if new agency added for job",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "click on Workbench tab and select the job for which agency is blocked",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "click on Add Candidate button",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "enter email id of candidate and click on Find button and observe",
  "rows": [
    {
      "cells": [
        "can03@gmail.com"
      ],
      "line": 23
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Blocked agency should not be able to add candidate for the job and error message message should display and he should be able to see all candidate status which are added for that job",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "click on OK button from error message popup",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "click on Close button from Add Candidate page and click on Yes button from confirmation popup",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "click on Share With Team button and observe team is added and if not then add new team by clicking on Add button on Share Job page",
  "rows": [
    {
      "cells": [
        "Say Agency 13 Team 1",
        "sayagency13team1@gmail.com",
        "2542144154"
      ],
      "line": 28
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "search for team member and select the Share checkbox present in front of the agency team member to share the job with team member",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "click on Yes button from confirmation popup and observe",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "user should able to search team member and blocked agency should not able to share job with any team members and error message should display",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.user_is_on_Home_page_of_application()"
});
formatter.result({
  "duration": 41666148500,
  "status": "passed"
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.title_of_page_is_HireXpert()"
});
formatter.result({
  "duration": 6505000,
  "status": "passed"
});
formatter.match({
  "location": "a_blockFunctionalitySteps.enter_valid_user_email_address_and_password_for_registered_employer_and_click_on_Sign_in_button(DataTable)"
});
formatter.result({
  "duration": 5256881000,
  "status": "passed"
});
formatter.match({
  "location": "a_blockFunctionalitySteps.click_on_Agencies_tab_and_add_one_new_agency_by_clicking_on_Add_button_if_agencies_are_not_present()"
});
formatter.result({
  "duration": 105600,
  "status": "passed"
});
formatter.match({
  "location": "a_blockFunctionalitySteps.click_on_Close_button_from_Agencies_window()"
});
formatter.result({
  "duration": 70600,
  "status": "passed"
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.click_on_Workbench_tab_and_select_job_from_Jobs_drop_down()"
});
formatter.result({
  "duration": 6271512000,
  "status": "passed"
});
formatter.match({
  "location": "a_blockFunctionalitySteps.click_on_Share_With_Agency_button_and_select_the_Share_checkbox_present_in_front_of_the_agency_to_share_the_job()"
});
formatter.result({
  "duration": 5362673800,
  "status": "passed"
});
formatter.match({
  "location": "a_blockFunctionalitySteps.click_on_Yes_button_from_confirmation_popup_and_click_on_Close_button_from_Share_Job_window()"
});
formatter.result({
  "duration": 5116467600,
  "status": "passed"
});
formatter.match({
  "location": "a_blockFunctionalitySteps.again_click_on_Share_With_Agency_button_and_select_the_Block_Unblock_checkbox_present_in_front_of_the_agency_with_whom_you_shared_the_job()"
});
formatter.result({
  "duration": 7333131800,
  "status": "passed"
});
formatter.match({
  "location": "a_blockFunctionalitySteps.click_on_Yes_button_from_confirmation_popup_and_click_on_Close_button_from_Share_Job_window()"
});
formatter.result({
  "duration": 5101138200,
  "status": "passed"
});
formatter.match({
  "location": "a_blockFunctionalitySteps.logout_with_employer_and_login_with_Agency_valid_credentials_which_you_blocked_on_Share_Job_page()"
});
formatter.result({
  "duration": 8521944100,
  "status": "passed"
});
formatter.match({
  "location": "a_blockFunctionalitySteps.update_profile_window_get_opened_if_new_agency_added_for_job()"
});
formatter.result({
  "duration": 30000,
  "status": "passed"
});
formatter.match({
  "location": "a_blockFunctionalitySteps.click_on_Workbench_tab_and_select_the_job_for_which_agency_is_blocked()"
});
formatter.result({
  "duration": 6233061000,
  "status": "passed"
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.click_on_Add_Candidate_button()"
});
formatter.result({
  "duration": 3097740900,
  "status": "passed"
});
formatter.match({
  "location": "a_blockFunctionalitySteps.enter_email_id_of_candidate_and_click_on_Find_button_and_observe(DataTable)"
});
formatter.result({
  "duration": 3268907300,
  "status": "passed"
});
formatter.match({
  "location": "a_blockFunctionalitySteps.blocked_agency_should_not_be_able_to_add_candidate_for_the_job_and_error_message_message_should_display_and_he_should_be_able_to_see_all_candidate_status_which_are_added_for_that_job()"
});
formatter.result({
  "duration": 237000,
  "status": "passed"
});
formatter.match({
  "location": "a_blockFunctionalitySteps.click_on_OK_button_from_error_message_popup()"
});
formatter.result({
  "duration": 1053630400,
  "status": "passed"
});
formatter.match({
  "location": "a_blockFunctionalitySteps.click_on_Close_button_from_Add_Candidate_page_and_click_on_Yes_button_from_confirmation_popup()"
});
formatter.result({
  "duration": 2111086100,
  "status": "passed"
});
formatter.match({
  "location": "a_blockFunctionalitySteps.click_on_Share_With_Team_button_and_observe_team_is_added_and_if_not_then_add_new_team_by_clicking_on_Add_button_on_Share_Job_page(DataTable)"
});
formatter.result({
  "duration": 9668306300,
  "status": "passed"
});
formatter.match({
  "location": "a_blockFunctionalitySteps.search_for_team_member_and_select_the_Share_checkbox_present_in_front_of_the_agency_team_member_to_share_the_job_with_team_member()"
});
formatter.result({
  "duration": 1248907900,
  "status": "passed"
});
formatter.match({
  "location": "a_blockFunctionalitySteps.click_on_Yes_button_from_confirmation_popup_and_observe()"
});
formatter.result({
  "duration": 62784800,
  "status": "passed"
});
formatter.match({
  "location": "a_blockFunctionalitySteps.user_should_able_to_search_team_member_and_blocked_agency_should_not_able_to_share_job_with_any_team_members_and_error_message_should_display()"
});
formatter.result({
  "duration": 83500,
  "status": "passed"
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.close_the_browser()"
});
formatter.result({
  "duration": 5062296000,
  "status": "passed"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 34,
      "value": "#TC ID - 66,384"
    }
  ],
  "line": 37,
  "name": "Verify the Block functionality for team member with Employer and Agency login",
  "description": "",
  "id": "job-management;verify-the-block-functionality-for-team-member-with-employer-and-agency-login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 36,
      "name": "@teamblock"
    }
  ]
});
formatter.step({
  "line": 39,
  "name": "User is on Home page of application",
  "keyword": "Given "
});
formatter.step({
  "line": 41,
  "name": "title of page is HireXpert",
  "keyword": "When "
});
formatter.step({
  "line": 42,
  "name": "enter valid user \"\u003cemail address\u003e\" and \"\u003cpassword\u003e\" for registered employer and agency and click on Sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "click on Team tab and add one new team member by clicking on Add button",
  "rows": [
    {
      "cells": [
        "sayali 8 team 1",
        "sayali8team1@gmail.com",
        "2451565965",
        "say Agency 1 team 1",
        "sayagency1team1@gmail.com",
        "2451565965"
      ],
      "line": 44
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "click on Close button from Team Members window",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "click on Workbench tab and select job from Jobs drop down",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "click on Share With Team button and select the Share checkbox present in front of the team member to share the job",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "click on Yes button from confirmation popup and now select the Block/Unblock checkbox present in front of the team member",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "click on Yes button from confirmation popup and click on Close button from Share Job",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "logout with logged in user and login with team member valid credentials which you blocked on Share Job page",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "click on Workbench tab and select the job for which team member is blocked",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "click on Add Candidate button",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "enter email id of candidate and click on Find button and observe",
  "rows": [
    {
      "cells": [
        "can03@gmail.com"
      ],
      "line": 54
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 55,
  "name": "Blocked team member should not be able to add candidate for the job and error message should display and he should be able to see all candidate status which are added by himself into that job",
  "keyword": "Then "
});
formatter.step({
  "line": 56,
  "name": "close the browser",
  "keyword": "And "
});
formatter.examples({
  "line": 58,
  "name": "",
  "description": "",
  "id": "job-management;verify-the-block-functionality-for-team-member-with-employer-and-agency-login;",
  "rows": [
    {
      "cells": [
        "email address",
        "password"
      ],
      "line": 59,
      "id": "job-management;verify-the-block-functionality-for-team-member-with-employer-and-agency-login;;1"
    },
    {
      "cells": [
        "sayali8@gmail.com",
        "12345"
      ],
      "line": 60,
      "id": "job-management;verify-the-block-functionality-for-team-member-with-employer-and-agency-login;;2"
    },
    {
      "cells": [
        "sayagency1@gmail.com",
        "12345"
      ],
      "line": 61,
      "id": "job-management;verify-the-block-functionality-for-team-member-with-employer-and-agency-login;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 60,
  "name": "Verify the Block functionality for team member with Employer and Agency login",
  "description": "",
  "id": "job-management;verify-the-block-functionality-for-team-member-with-employer-and-agency-login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 36,
      "name": "@teamblock"
    }
  ]
});
formatter.step({
  "line": 39,
  "name": "User is on Home page of application",
  "keyword": "Given "
});
formatter.step({
  "line": 41,
  "name": "title of page is HireXpert",
  "keyword": "When "
});
formatter.step({
  "line": 42,
  "name": "enter valid user \"sayali8@gmail.com\" and \"12345\" for registered employer and agency and click on Sign in button",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "click on Team tab and add one new team member by clicking on Add button",
  "rows": [
    {
      "cells": [
        "sayali 8 team 1",
        "sayali8team1@gmail.com",
        "2451565965",
        "say Agency 1 team 1",
        "sayagency1team1@gmail.com",
        "2451565965"
      ],
      "line": 44
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "click on Close button from Team Members window",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "click on Workbench tab and select job from Jobs drop down",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "click on Share With Team button and select the Share checkbox present in front of the team member to share the job",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "click on Yes button from confirmation popup and now select the Block/Unblock checkbox present in front of the team member",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "click on Yes button from confirmation popup and click on Close button from Share Job",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "logout with logged in user and login with team member valid credentials which you blocked on Share Job page",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "click on Workbench tab and select the job for which team member is blocked",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "click on Add Candidate button",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "enter email id of candidate and click on Find button and observe",
  "rows": [
    {
      "cells": [
        "can03@gmail.com"
      ],
      "line": 54
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 55,
  "name": "Blocked team member should not be able to add candidate for the job and error message should display and he should be able to see all candidate status which are added by himself into that job",
  "keyword": "Then "
});
formatter.step({
  "line": 56,
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.user_is_on_Home_page_of_application()"
});
formatter.result({
  "duration": 38385145700,
  "status": "passed"
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.title_of_page_is_HireXpert()"
});
formatter.result({
  "duration": 8664600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sayali8@gmail.com",
      "offset": 18
    },
    {
      "val": "12345",
      "offset": 42
    }
  ],
  "location": "b_unblockFunctionalitySteps.enter_valid_user_and_for_registered_employer_and_agency_and_click_on_Sign_in_button(String,String)"
});
formatter.result({
  "duration": 5268753300,
  "status": "passed"
});
formatter.match({
  "location": "a_blockFunctionalitySteps.click_on_Team_tab_and_add_one_new_team_member_by_clicking_on_Add_button(DataTable)"
});
formatter.result({
  "duration": 9512409600,
  "status": "passed"
});
formatter.match({
  "location": "a_blockFunctionalitySteps.click_on_Close_button_from_Team_Members_window()"
});
formatter.result({
  "duration": 50346000,
  "status": "passed"
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.click_on_Workbench_tab_and_select_job_from_Jobs_drop_down()"
});
formatter.result({
  "duration": 6241729300,
  "status": "passed"
});
formatter.match({
  "location": "a_blockFunctionalitySteps.click_on_Share_With_Team_button_and_select_the_Share_checkbox_present_in_front_of_the_team_member_to_share_the_job()"
});
formatter.result({
  "duration": 5354412200,
  "status": "passed"
});
formatter.match({
  "location": "a_blockFunctionalitySteps.click_on_Yes_button_from_confirmation_popup_and_now_select_the_Block_Unblock_checkbox_present_in_front_of_the_team_member()"
});
formatter.result({
  "duration": 5109789600,
  "status": "passed"
});
formatter.match({
  "location": "a_blockFunctionalitySteps.click_on_Yes_button_from_confirmation_popup_and_click_on_Close_button_from_Share_Job()"
});
formatter.result({
  "duration": 5112755900,
  "status": "passed"
});
formatter.match({
  "location": "a_blockFunctionalitySteps.logout_with_logged_in_user_and_login_with_team_member_valid_credentials_which_you_blocked_on_Share_Job_page()"
});
formatter.result({
  "duration": 8513393400,
  "status": "passed"
});
formatter.match({
  "location": "a_blockFunctionalitySteps.click_on_Workbench_tab_and_select_the_job_for_which_team_member_is_blocked()"
});
formatter.result({
  "duration": 6184791100,
  "status": "passed"
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.click_on_Add_Candidate_button()"
});
formatter.result({
  "duration": 3093467200,
  "status": "passed"
});
formatter.match({
  "location": "a_blockFunctionalitySteps.enter_email_id_of_candidate_and_click_on_Find_button_and_observe(DataTable)"
});
formatter.result({
  "duration": 3255739000,
  "status": "passed"
});
formatter.match({
  "location": "a_blockFunctionalitySteps.blocked_team_member_should_not_be_able_to_add_candidate_for_the_job_and_error_message_should_display_and_he_should_be_able_to_see_all_candidate_status_which_are_added_by_himself_into_that_job()"
});
formatter.result({
  "duration": 251700,
  "status": "passed"
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.close_the_browser()"
});
formatter.result({
  "duration": 5065876500,
  "status": "passed"
});
formatter.scenario({
  "line": 61,
  "name": "Verify the Block functionality for team member with Employer and Agency login",
  "description": "",
  "id": "job-management;verify-the-block-functionality-for-team-member-with-employer-and-agency-login;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 36,
      "name": "@teamblock"
    }
  ]
});
formatter.step({
  "line": 39,
  "name": "User is on Home page of application",
  "keyword": "Given "
});
formatter.step({
  "line": 41,
  "name": "title of page is HireXpert",
  "keyword": "When "
});
formatter.step({
  "line": 42,
  "name": "enter valid user \"sayagency1@gmail.com\" and \"12345\" for registered employer and agency and click on Sign in button",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "click on Team tab and add one new team member by clicking on Add button",
  "rows": [
    {
      "cells": [
        "sayali 8 team 1",
        "sayali8team1@gmail.com",
        "2451565965",
        "say Agency 1 team 1",
        "sayagency1team1@gmail.com",
        "2451565965"
      ],
      "line": 44
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "click on Close button from Team Members window",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "click on Workbench tab and select job from Jobs drop down",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "click on Share With Team button and select the Share checkbox present in front of the team member to share the job",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "click on Yes button from confirmation popup and now select the Block/Unblock checkbox present in front of the team member",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "click on Yes button from confirmation popup and click on Close button from Share Job",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "logout with logged in user and login with team member valid credentials which you blocked on Share Job page",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "click on Workbench tab and select the job for which team member is blocked",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "click on Add Candidate button",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "enter email id of candidate and click on Find button and observe",
  "rows": [
    {
      "cells": [
        "can03@gmail.com"
      ],
      "line": 54
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 55,
  "name": "Blocked team member should not be able to add candidate for the job and error message should display and he should be able to see all candidate status which are added by himself into that job",
  "keyword": "Then "
});
formatter.step({
  "line": 56,
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.user_is_on_Home_page_of_application()"
});
formatter.result({
  "duration": 35475584700,
  "status": "passed"
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.title_of_page_is_HireXpert()"
});
formatter.result({
  "duration": 6680500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sayagency1@gmail.com",
      "offset": 18
    },
    {
      "val": "12345",
      "offset": 45
    }
  ],
  "location": "b_unblockFunctionalitySteps.enter_valid_user_and_for_registered_employer_and_agency_and_click_on_Sign_in_button(String,String)"
});
formatter.result({
  "duration": 5261705200,
  "status": "passed"
});
formatter.match({
  "location": "a_blockFunctionalitySteps.click_on_Team_tab_and_add_one_new_team_member_by_clicking_on_Add_button(DataTable)"
});
formatter.result({
  "duration": 9541983700,
  "status": "passed"
});
formatter.match({
  "location": "a_blockFunctionalitySteps.click_on_Close_button_from_Team_Members_window()"
});
formatter.result({
  "duration": 53886600,
  "status": "passed"
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.click_on_Workbench_tab_and_select_job_from_Jobs_drop_down()"
});
formatter.result({
  "duration": 6234549300,
  "status": "passed"
});
formatter.match({
  "location": "a_blockFunctionalitySteps.click_on_Share_With_Team_button_and_select_the_Share_checkbox_present_in_front_of_the_team_member_to_share_the_job()"
});
formatter.result({
  "duration": 5349495500,
  "status": "passed"
});
formatter.match({
  "location": "a_blockFunctionalitySteps.click_on_Yes_button_from_confirmation_popup_and_now_select_the_Block_Unblock_checkbox_present_in_front_of_the_team_member()"
});
formatter.result({
  "duration": 5119987600,
  "status": "passed"
});
formatter.match({
  "location": "a_blockFunctionalitySteps.click_on_Yes_button_from_confirmation_popup_and_click_on_Close_button_from_Share_Job()"
});
formatter.result({
  "duration": 5125901400,
  "status": "passed"
});
formatter.match({
  "location": "a_blockFunctionalitySteps.logout_with_logged_in_user_and_login_with_team_member_valid_credentials_which_you_blocked_on_Share_Job_page()"
});
formatter.result({
  "duration": 8502364900,
  "status": "passed"
});
formatter.match({
  "location": "a_blockFunctionalitySteps.click_on_Workbench_tab_and_select_the_job_for_which_team_member_is_blocked()"
});
formatter.result({
  "duration": 6198850700,
  "status": "passed"
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.click_on_Add_Candidate_button()"
});
formatter.result({
  "duration": 3085842300,
  "status": "passed"
});
formatter.match({
  "location": "a_blockFunctionalitySteps.enter_email_id_of_candidate_and_click_on_Find_button_and_observe(DataTable)"
});
formatter.result({
  "duration": 3255273300,
  "status": "passed"
});
formatter.match({
  "location": "a_blockFunctionalitySteps.blocked_team_member_should_not_be_able_to_add_candidate_for_the_job_and_error_message_should_display_and_he_should_be_able_to_see_all_candidate_status_which_are_added_by_himself_into_that_job()"
});
formatter.result({
  "duration": 146900,
  "status": "passed"
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.close_the_browser()"
});
formatter.result({
  "duration": 5057237500,
  "status": "passed"
});
formatter.uri("src/main/java/features/primaryContact.feature");
formatter.feature({
  "line": 1,
  "name": "Job Management",
  "description": "",
  "id": "job-management",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Verify user having only one primary contact with Employer and Agency login",
  "description": "",
  "id": "job-management;verify-user-having-only-one-primary-contact-with-employer-and-agency-login",
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
  "name": "title of page is HireXpert",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "enter valid user \"\u003cemail address\u003e\" and \"\u003cpassword\u003e\" for registered employer and agency and click on Sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "click on Workbench tab and select job from Jobs drop down",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "click on Share With Team button and observe the primary contact then add new team member and try to make that team member as primary contact",
  "rows": [
    {
      "cells": [
        "sayali 8 team 2",
        "sayali8team2@gmail.com",
        "2451565965",
        "say Agency 1 team 2",
        "sayagency1team2@gmail.com",
        "2451565965"
      ],
      "line": 11
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user should not able to make multiple team members as primary contact",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user should able to change the primary contact only when the job is shared with the team member to whom user wants to make primary contact",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "close the browser",
  "keyword": "And "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "job-management;verify-user-having-only-one-primary-contact-with-employer-and-agency-login;",
  "rows": [
    {
      "cells": [
        "email address",
        "password"
      ],
      "line": 17,
      "id": "job-management;verify-user-having-only-one-primary-contact-with-employer-and-agency-login;;1"
    },
    {
      "cells": [
        "sayali8@gmail.com",
        "12345"
      ],
      "line": 18,
      "id": "job-management;verify-user-having-only-one-primary-contact-with-employer-and-agency-login;;2"
    },
    {
      "cells": [
        "sayagency1@gmail.com",
        "12345"
      ],
      "line": 19,
      "id": "job-management;verify-user-having-only-one-primary-contact-with-employer-and-agency-login;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 18,
  "name": "Verify user having only one primary contact with Employer and Agency login",
  "description": "",
  "id": "job-management;verify-user-having-only-one-primary-contact-with-employer-and-agency-login;;2",
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
  "name": "title of page is HireXpert",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "enter valid user \"sayali8@gmail.com\" and \"12345\" for registered employer and agency and click on Sign in button",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "click on Workbench tab and select job from Jobs drop down",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "click on Share With Team button and observe the primary contact then add new team member and try to make that team member as primary contact",
  "rows": [
    {
      "cells": [
        "sayali 8 team 2",
        "sayali8team2@gmail.com",
        "2451565965",
        "say Agency 1 team 2",
        "sayagency1team2@gmail.com",
        "2451565965"
      ],
      "line": 11
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user should not able to make multiple team members as primary contact",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user should able to change the primary contact only when the job is shared with the team member to whom user wants to make primary contact",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.user_is_on_Home_page_of_application()"
});
formatter.result({
  "duration": 20332271500,
  "status": "passed"
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.title_of_page_is_HireXpert()"
});
formatter.result({
  "duration": 5736300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sayali8@gmail.com",
      "offset": 18
    },
    {
      "val": "12345",
      "offset": 42
    }
  ],
  "location": "b_unblockFunctionalitySteps.enter_valid_user_and_for_registered_employer_and_agency_and_click_on_Sign_in_button(String,String)"
});
formatter.result({
  "duration": 5326855600,
  "status": "passed"
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.click_on_Workbench_tab_and_select_job_from_Jobs_drop_down()"
});
formatter.result({
  "duration": 6248372600,
  "status": "passed"
});
formatter.match({
  "location": "c_primaryContact.click_on_Share_With_Team_button_and_observe_the_primary_contact_then_add_new_team_member_and_try_to_make_that_team_member_as_primary_contact(DataTable)"
});
formatter.result({
  "duration": 15896649200,
  "status": "passed"
});
formatter.match({
  "location": "c_primaryContact.user_should_not_able_to_make_multiple_team_members_as_primary_contact()"
});
formatter.result({
  "duration": 2054696300,
  "status": "passed"
});
formatter.match({
  "location": "c_primaryContact.user_should_able_to_change_the_primary_contact_only_when_the_job_is_shared_with_the_team_member_to_whom_user_wants_to_make_primary_contact()"
});
formatter.result({
  "duration": 19498892800,
  "status": "passed"
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.close_the_browser()"
});
formatter.result({
  "duration": 5063670400,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Verify user having only one primary contact with Employer and Agency login",
  "description": "",
  "id": "job-management;verify-user-having-only-one-primary-contact-with-employer-and-agency-login;;3",
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
  "name": "title of page is HireXpert",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "enter valid user \"sayagency1@gmail.com\" and \"12345\" for registered employer and agency and click on Sign in button",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "click on Workbench tab and select job from Jobs drop down",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "click on Share With Team button and observe the primary contact then add new team member and try to make that team member as primary contact",
  "rows": [
    {
      "cells": [
        "sayali 8 team 2",
        "sayali8team2@gmail.com",
        "2451565965",
        "say Agency 1 team 2",
        "sayagency1team2@gmail.com",
        "2451565965"
      ],
      "line": 11
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user should not able to make multiple team members as primary contact",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user should able to change the primary contact only when the job is shared with the team member to whom user wants to make primary contact",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.user_is_on_Home_page_of_application()"
});
formatter.result({
  "duration": 31917505900,
  "status": "passed"
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.title_of_page_is_HireXpert()"
});
formatter.result({
  "duration": 8419400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sayagency1@gmail.com",
      "offset": 18
    },
    {
      "val": "12345",
      "offset": 45
    }
  ],
  "location": "b_unblockFunctionalitySteps.enter_valid_user_and_for_registered_employer_and_agency_and_click_on_Sign_in_button(String,String)"
});
formatter.result({
  "duration": 5286235100,
  "status": "passed"
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.click_on_Workbench_tab_and_select_job_from_Jobs_drop_down()"
});
formatter.result({
  "duration": 6250200000,
  "status": "passed"
});
formatter.match({
  "location": "c_primaryContact.click_on_Share_With_Team_button_and_observe_the_primary_contact_then_add_new_team_member_and_try_to_make_that_team_member_as_primary_contact(DataTable)"
});
formatter.result({
  "duration": 15917874500,
  "status": "passed"
});
formatter.match({
  "location": "c_primaryContact.user_should_not_able_to_make_multiple_team_members_as_primary_contact()"
});
formatter.result({
  "duration": 2054783800,
  "status": "passed"
});
formatter.match({
  "location": "c_primaryContact.user_should_able_to_change_the_primary_contact_only_when_the_job_is_shared_with_the_team_member_to_whom_user_wants_to_make_primary_contact()"
});
formatter.result({
  "duration": 19526749000,
  "status": "passed"
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.close_the_browser()"
});
formatter.result({
  "duration": 5060104600,
  "status": "passed"
});
formatter.uri("src/main/java/features/unblockFunctionality.feature");
formatter.feature({
  "line": 1,
  "name": "Job Management",
  "description": "",
  "id": "job-management",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Verify the Unblock functionality for Agency with Employer login",
  "description": "",
  "id": "job-management;verify-the-unblock-functionality-for-agency-with-employer-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@agencyunblock"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User is on Home page of application",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "title of page is HireXpert",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "enter valid user email address and password for registered employer and click on Sign in button",
  "rows": [
    {
      "cells": [
        "sayali8@gmail.com",
        "12345"
      ],
      "line": 10
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "click on Agencies tab and add one new agency by clicking on Add button if agencies are not present",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "click on Close button from Agencies window",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "click on Workbench tab and select job from Jobs drop down",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "click on Share With Agency button and select the Share checkbox present in front of agency to share the job",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "click on Yes button from confirmation popup and select the Block/Unblock checkbox present in front of the agency with whom you shared the job",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "click on Yes button from confirmation popup",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "now again click on Block/Unblock checkbox present in front of the agency which is blocked previously to unblock that agency",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "click on Yes button from confirmation popup",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Employer should be able to unblock the agency",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "logout with employer and login with Agency valid credentials which you unblocked",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "click on Workbench tab and select job from Jobs drop down for which agency is unblocked",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "click on Add Candidate button",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "enter email id of candidate and click on Find button",
  "rows": [
    {
      "cells": [
        "can03@gmail.com"
      ],
      "line": 24
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "click on OK button from success popup window if you entered email id of registered candidate",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Fill all details and click on Save button",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "click on Yes button if probability related fields are not filled and observe",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "Unblocked agency should be able to add candidate",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.user_is_on_Home_page_of_application()"
});
formatter.result({
  "duration": 34613694900,
  "status": "passed"
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.title_of_page_is_HireXpert()"
});
formatter.result({
  "duration": 7510300,
  "status": "passed"
});
formatter.match({
  "location": "a_blockFunctionalitySteps.enter_valid_user_email_address_and_password_for_registered_employer_and_click_on_Sign_in_button(DataTable)"
});
formatter.result({
  "duration": 5263550100,
  "status": "passed"
});
formatter.match({
  "location": "a_blockFunctionalitySteps.click_on_Agencies_tab_and_add_one_new_agency_by_clicking_on_Add_button_if_agencies_are_not_present()"
});
formatter.result({
  "duration": 54000,
  "status": "passed"
});
formatter.match({
  "location": "a_blockFunctionalitySteps.click_on_Close_button_from_Agencies_window()"
});
formatter.result({
  "duration": 40700,
  "status": "passed"
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.click_on_Workbench_tab_and_select_job_from_Jobs_drop_down()"
});
formatter.result({
  "duration": 6221373400,
  "status": "passed"
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.click_on_Share_With_Agency_button_and_select_the_Share_checkbox_present_in_front_of_agency_to_share_the_job()"
});
formatter.result({
  "duration": 5348426700,
  "status": "passed"
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.click_on_Yes_button_from_confirmation_popup_and_select_the_Block_Unblock_checkbox_present_in_front_of_the_agency_with_whom_you_shared_the_job()"
});
formatter.result({
  "duration": 5112589900,
  "status": "passed"
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.click_on_Yes_button_from_confirmation_popup()"
});
formatter.result({
  "duration": 3056950800,
  "status": "passed"
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.now_again_click_on_Block_Unblock_checkbox_present_in_front_of_the_agency_which_is_blocked_previously_to_unblock_that_agency()"
});
formatter.result({
  "duration": 2051487800,
  "status": "passed"
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.click_on_Yes_button_from_confirmation_popup()"
});
formatter.result({
  "duration": 3061118100,
  "status": "passed"
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.employer_should_be_able_to_unblock_the_agency()"
});
formatter.result({
  "duration": 1052006600,
  "status": "passed"
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.logout_with_employer_and_login_with_Agency_valid_credentials_which_you_unblocked()"
});
formatter.result({
  "duration": 8456901800,
  "status": "passed"
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.click_on_Workbench_tab_and_select_job_from_Jobs_drop_down_for_which_agency_is_unblocked()"
});
formatter.result({
  "duration": 6195982500,
  "status": "passed"
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.click_on_Add_Candidate_button()"
});
formatter.result({
  "duration": 3090730600,
  "status": "passed"
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.enter_email_id_of_candidate_and_click_on_Find_button(DataTable)"
});
formatter.result({
  "duration": 3252470800,
  "status": "passed"
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.click_on_OK_button_from_success_popup_window_if_you_entered_email_id_of_registered_candidate()"
});
formatter.result({
  "duration": 46518300,
  "status": "passed"
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.fill_all_details_and_click_on_Save_button()"
});
formatter.result({
  "duration": 164039700,
  "status": "passed"
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.click_on_Yes_button_if_probability_related_fields_are_not_filled_and_observe()"
});
formatter.result({
  "duration": 2059284100,
  "status": "passed"
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.unblocked_agency_should_be_able_to_add_candidate()"
});
formatter.result({
  "duration": 180800,
  "status": "passed"
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.close_the_browser()"
});
formatter.result({
  "duration": 5053510800,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 33,
  "name": "Verify the Unblock functionality for team member with Employer and Agency login",
  "description": "",
  "id": "job-management;verify-the-unblock-functionality-for-team-member-with-employer-and-agency-login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 32,
      "name": "@teamunblock"
    }
  ]
});
formatter.step({
  "line": 35,
  "name": "User is on Home page of application",
  "keyword": "Given "
});
formatter.step({
  "line": 37,
  "name": "title of page is HireXpert",
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "enter valid user \"\u003cemail address\u003e\" and \"\u003cpassword\u003e\" for registered employer and agency and click on Sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "click on Team tab and add one new team member by clicking on Add button",
  "rows": [
    {
      "cells": [
        "sayali 8 team 3",
        "sayali8team3@gmail.com",
        "2451565965",
        "say Agency 1 team 3",
        "sayagency1team3@gmail.com",
        "2451565965"
      ],
      "line": 40
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "click on Close button from Team Members window",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "click on Workbench tab and select job from Jobs drop down",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "click on Share With Team button and select Share checkbox present in front of the team member to share the job",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "click on Yes button from confirmation popup and select the Block/Unblock checkbox present in front of the team member with whom you shared the job",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "click on Yes button from confirmation popup",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "now again click on Block/Unblock checkbox present in front of the team member which is blocked previously to unblock that team member",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "click on Yes button from confirmation popup and click on Close button from Share Job",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "User should be able to unblock the team member",
  "keyword": "Then "
});
formatter.step({
  "line": 49,
  "name": "logout with logged in user and login with team member valid credentials which you unblocked",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "click on Workbench tab and select job from Jobs drop down for which team member is unblocked",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "click on Add Candidate button and enter email id of candidate and click on the Find button",
  "rows": [
    {
      "cells": [
        "can02@gmail.com",
        "can01@gmail.com"
      ],
      "line": 52
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "click on OK button from success popup window if you entered email id of registered candidate",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "Fill all details and click on Save button",
  "keyword": "And "
});
formatter.step({
  "line": 55,
  "name": "click on Yes button if probability related fields are not filled and observe",
  "keyword": "And "
});
formatter.step({
  "line": 56,
  "name": "Unblocked team member should be able add candidate",
  "keyword": "Then "
});
formatter.step({
  "line": 57,
  "name": "close the browser",
  "keyword": "And "
});
formatter.examples({
  "line": 59,
  "name": "",
  "description": "",
  "id": "job-management;verify-the-unblock-functionality-for-team-member-with-employer-and-agency-login;",
  "rows": [
    {
      "cells": [
        "email address",
        "password"
      ],
      "line": 60,
      "id": "job-management;verify-the-unblock-functionality-for-team-member-with-employer-and-agency-login;;1"
    },
    {
      "cells": [
        "sayali8@gmail.com",
        "12345"
      ],
      "line": 61,
      "id": "job-management;verify-the-unblock-functionality-for-team-member-with-employer-and-agency-login;;2"
    },
    {
      "cells": [
        "sayagency1@gmail.com",
        "12345"
      ],
      "line": 62,
      "id": "job-management;verify-the-unblock-functionality-for-team-member-with-employer-and-agency-login;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 61,
  "name": "Verify the Unblock functionality for team member with Employer and Agency login",
  "description": "",
  "id": "job-management;verify-the-unblock-functionality-for-team-member-with-employer-and-agency-login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 32,
      "name": "@teamunblock"
    }
  ]
});
formatter.step({
  "line": 35,
  "name": "User is on Home page of application",
  "keyword": "Given "
});
formatter.step({
  "line": 37,
  "name": "title of page is HireXpert",
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "enter valid user \"sayali8@gmail.com\" and \"12345\" for registered employer and agency and click on Sign in button",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "click on Team tab and add one new team member by clicking on Add button",
  "rows": [
    {
      "cells": [
        "sayali 8 team 3",
        "sayali8team3@gmail.com",
        "2451565965",
        "say Agency 1 team 3",
        "sayagency1team3@gmail.com",
        "2451565965"
      ],
      "line": 40
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "click on Close button from Team Members window",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "click on Workbench tab and select job from Jobs drop down",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "click on Share With Team button and select Share checkbox present in front of the team member to share the job",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "click on Yes button from confirmation popup and select the Block/Unblock checkbox present in front of the team member with whom you shared the job",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "click on Yes button from confirmation popup",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "now again click on Block/Unblock checkbox present in front of the team member which is blocked previously to unblock that team member",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "click on Yes button from confirmation popup and click on Close button from Share Job",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "User should be able to unblock the team member",
  "keyword": "Then "
});
formatter.step({
  "line": 49,
  "name": "logout with logged in user and login with team member valid credentials which you unblocked",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "click on Workbench tab and select job from Jobs drop down for which team member is unblocked",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "click on Add Candidate button and enter email id of candidate and click on the Find button",
  "rows": [
    {
      "cells": [
        "can02@gmail.com",
        "can01@gmail.com"
      ],
      "line": 52
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "click on OK button from success popup window if you entered email id of registered candidate",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "Fill all details and click on Save button",
  "keyword": "And "
});
formatter.step({
  "line": 55,
  "name": "click on Yes button if probability related fields are not filled and observe",
  "keyword": "And "
});
formatter.step({
  "line": 56,
  "name": "Unblocked team member should be able add candidate",
  "keyword": "Then "
});
formatter.step({
  "line": 57,
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.user_is_on_Home_page_of_application()"
});
formatter.result({
  "duration": 26407427100,
  "status": "passed"
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.title_of_page_is_HireXpert()"
});
formatter.result({
  "duration": 11366800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sayali8@gmail.com",
      "offset": 18
    },
    {
      "val": "12345",
      "offset": 42
    }
  ],
  "location": "b_unblockFunctionalitySteps.enter_valid_user_and_for_registered_employer_and_agency_and_click_on_Sign_in_button(String,String)"
});
formatter.result({
  "duration": 5316191700,
  "status": "passed"
});
formatter.match({
  "location": "a_blockFunctionalitySteps.click_on_Team_tab_and_add_one_new_team_member_by_clicking_on_Add_button(DataTable)"
});
formatter.result({
  "duration": 9544007900,
  "status": "passed"
});
formatter.match({
  "location": "a_blockFunctionalitySteps.click_on_Close_button_from_Team_Members_window()"
});
formatter.result({
  "duration": 57314700,
  "status": "passed"
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.click_on_Workbench_tab_and_select_job_from_Jobs_drop_down()"
});
formatter.result({
  "duration": 6229646300,
  "status": "passed"
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.click_on_Share_With_Team_button_and_select_Share_checkbox_present_in_front_of_the_team_member_to_share_the_job()"
});
formatter.result({
  "duration": 5374824300,
  "status": "passed"
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.click_on_Yes_button_from_confirmation_popup_and_select_the_Block_Unblock_checkbox_present_in_front_of_the_team_member_with_whom_you_shared_the_job()"
});
formatter.result({
  "duration": 5135735100,
  "status": "passed"
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.click_on_Yes_button_from_confirmation_popup()"
});
formatter.result({
  "duration": 3055732100,
  "status": "passed"
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.now_again_click_on_Block_Unblock_checkbox_present_in_front_of_the_team_member_which_is_blocked_previously_to_unblock_that_team_member()"
});
formatter.result({
  "duration": 2046230600,
  "status": "passed"
});
formatter.match({
  "location": "a_blockFunctionalitySteps.click_on_Yes_button_from_confirmation_popup_and_click_on_Close_button_from_Share_Job()"
});
formatter.result({
  "duration": 5116973800,
  "status": "passed"
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.User_should_be_able_to_unblock_the_team_member()"
});
formatter.result({
  "duration": 176800,
  "status": "passed"
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.logout_with_logged_in_user_and_login_with_team_member_valid_credentials_which_you_unblocked()"
});
formatter.result({
  "duration": 8491361500,
  "status": "passed"
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.click_on_Workbench_tab_and_select_job_from_Jobs_drop_down_for_which_team_member_is_unblocked()"
});
formatter.result({
  "duration": 6192293300,
  "status": "passed"
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.click_on_Add_Candidate_button_and_enter_email_id_of_candidate_and_click_on_the_Find_button(DataTable)"
});
formatter.result({
  "duration": 6355077600,
  "status": "passed"
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.click_on_OK_button_from_success_popup_window_if_you_entered_email_id_of_registered_candidate()"
});
formatter.result({
  "duration": 50027400,
  "status": "passed"
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.fill_all_details_and_click_on_Save_button()"
});
formatter.result({
  "duration": 174130100,
  "status": "passed"
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.click_on_Yes_button_if_probability_related_fields_are_not_filled_and_observe()"
});
formatter.result({
  "duration": 2056410900,
  "status": "passed"
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.unblocked_team_member_should_be_able_add_candidate()"
});
formatter.result({
  "duration": 181900,
  "status": "passed"
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.close_the_browser()"
});
formatter.result({
  "duration": 5046124800,
  "status": "passed"
});
formatter.scenario({
  "line": 62,
  "name": "Verify the Unblock functionality for team member with Employer and Agency login",
  "description": "",
  "id": "job-management;verify-the-unblock-functionality-for-team-member-with-employer-and-agency-login;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 32,
      "name": "@teamunblock"
    }
  ]
});
formatter.step({
  "line": 35,
  "name": "User is on Home page of application",
  "keyword": "Given "
});
formatter.step({
  "line": 37,
  "name": "title of page is HireXpert",
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "enter valid user \"sayagency1@gmail.com\" and \"12345\" for registered employer and agency and click on Sign in button",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "click on Team tab and add one new team member by clicking on Add button",
  "rows": [
    {
      "cells": [
        "sayali 8 team 3",
        "sayali8team3@gmail.com",
        "2451565965",
        "say Agency 1 team 3",
        "sayagency1team3@gmail.com",
        "2451565965"
      ],
      "line": 40
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "click on Close button from Team Members window",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "click on Workbench tab and select job from Jobs drop down",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "click on Share With Team button and select Share checkbox present in front of the team member to share the job",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "click on Yes button from confirmation popup and select the Block/Unblock checkbox present in front of the team member with whom you shared the job",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "click on Yes button from confirmation popup",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "now again click on Block/Unblock checkbox present in front of the team member which is blocked previously to unblock that team member",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "click on Yes button from confirmation popup and click on Close button from Share Job",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "User should be able to unblock the team member",
  "keyword": "Then "
});
formatter.step({
  "line": 49,
  "name": "logout with logged in user and login with team member valid credentials which you unblocked",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "click on Workbench tab and select job from Jobs drop down for which team member is unblocked",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "click on Add Candidate button and enter email id of candidate and click on the Find button",
  "rows": [
    {
      "cells": [
        "can02@gmail.com",
        "can01@gmail.com"
      ],
      "line": 52
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "click on OK button from success popup window if you entered email id of registered candidate",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "Fill all details and click on Save button",
  "keyword": "And "
});
formatter.step({
  "line": 55,
  "name": "click on Yes button if probability related fields are not filled and observe",
  "keyword": "And "
});
formatter.step({
  "line": 56,
  "name": "Unblocked team member should be able add candidate",
  "keyword": "Then "
});
formatter.step({
  "line": 57,
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.user_is_on_Home_page_of_application()"
});
formatter.result({
  "duration": 31483419300,
  "status": "passed"
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.title_of_page_is_HireXpert()"
});
formatter.result({
  "duration": 6140200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sayagency1@gmail.com",
      "offset": 18
    },
    {
      "val": "12345",
      "offset": 45
    }
  ],
  "location": "b_unblockFunctionalitySteps.enter_valid_user_and_for_registered_employer_and_agency_and_click_on_Sign_in_button(String,String)"
});
formatter.result({
  "duration": 5267148300,
  "status": "passed"
});
formatter.match({
  "location": "a_blockFunctionalitySteps.click_on_Team_tab_and_add_one_new_team_member_by_clicking_on_Add_button(DataTable)"
});
formatter.result({
  "duration": 9542126700,
  "status": "passed"
});
formatter.match({
  "location": "a_blockFunctionalitySteps.click_on_Close_button_from_Team_Members_window()"
});
formatter.result({
  "duration": 70589200,
  "status": "passed"
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.click_on_Workbench_tab_and_select_job_from_Jobs_drop_down()"
});
formatter.result({
  "duration": 6224082200,
  "status": "passed"
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.click_on_Share_With_Team_button_and_select_Share_checkbox_present_in_front_of_the_team_member_to_share_the_job()"
});
formatter.result({
  "duration": 5354623200,
  "status": "passed"
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.click_on_Yes_button_from_confirmation_popup_and_select_the_Block_Unblock_checkbox_present_in_front_of_the_team_member_with_whom_you_shared_the_job()"
});
formatter.result({
  "duration": 5126503100,
  "status": "passed"
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.click_on_Yes_button_from_confirmation_popup()"
});
formatter.result({
  "duration": 3046129300,
  "status": "passed"
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.now_again_click_on_Block_Unblock_checkbox_present_in_front_of_the_team_member_which_is_blocked_previously_to_unblock_that_team_member()"
});
formatter.result({
  "duration": 2049911900,
  "status": "passed"
});
formatter.match({
  "location": "a_blockFunctionalitySteps.click_on_Yes_button_from_confirmation_popup_and_click_on_Close_button_from_Share_Job()"
});
formatter.result({
  "duration": 5123640900,
  "status": "passed"
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.User_should_be_able_to_unblock_the_team_member()"
});
formatter.result({
  "duration": 122000,
  "status": "passed"
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.logout_with_logged_in_user_and_login_with_team_member_valid_credentials_which_you_unblocked()"
});
formatter.result({
  "duration": 8511740500,
  "status": "passed"
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.click_on_Workbench_tab_and_select_job_from_Jobs_drop_down_for_which_team_member_is_unblocked()"
});
formatter.result({
  "duration": 6193383100,
  "status": "passed"
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.click_on_Add_Candidate_button_and_enter_email_id_of_candidate_and_click_on_the_Find_button(DataTable)"
});
formatter.result({
  "duration": 6365641300,
  "status": "passed"
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.click_on_OK_button_from_success_popup_window_if_you_entered_email_id_of_registered_candidate()"
});
formatter.result({
  "duration": 50315100,
  "status": "passed"
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.fill_all_details_and_click_on_Save_button()"
});
formatter.result({
  "duration": 156654800,
  "status": "passed"
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.click_on_Yes_button_if_probability_related_fields_are_not_filled_and_observe()"
});
formatter.result({
  "duration": 2062221200,
  "status": "passed"
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.unblocked_team_member_should_be_able_add_candidate()"
});
formatter.result({
  "duration": 125900,
  "status": "passed"
});
formatter.match({
  "location": "b_unblockFunctionalitySteps.close_the_browser()"
});
formatter.result({
  "duration": 5060777900,
  "status": "passed"
});
});