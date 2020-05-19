$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/features/addAndEditJob.feature");
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
      "line": 33,
      "value": "#TC ID - 15,21,22,46,74,76,94"
    }
  ],
  "line": 37,
  "name": "To verify user is able to update skills and No. of Interviews for the job with Employer login",
  "description": "",
  "id": "job-management;to-verify-user-is-able-to-update-skills-and-no.-of-interviews-for-the-job-with-employer-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 36,
      "name": "@regression1_01"
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
  "name": "enter valid user email address and password for employer and click on Sign in button",
  "rows": [
    {
      "cells": [
        "sayali7@gmail.com",
        "12345"
      ],
      "line": 43
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "click on Workbench tab",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "click on Add Job button and fill all mandatory details on Add Job popup window",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "click on submit button",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "Job should get successfully added and Job should be visible in Job drop down",
  "keyword": "Then "
});
formatter.step({
  "line": 48,
  "name": "click on Job drop down and select recently added job",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "click on Add Candidate button",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "click on Add Candidate button and add one new candidate for the job and click on Find button",
  "rows": [
    {
      "cells": [
        "c01@gmail.com"
      ],
      "line": 51
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "Fill mandatory details",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "click on Save button",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "new candidate should get added in New column",
  "keyword": "Then "
});
formatter.step({
  "line": 55,
  "name": "click on Edit Job button to update skills and number of interview",
  "keyword": "And "
});
formatter.step({
  "line": 56,
  "name": "select number of interview except previously selected number",
  "keyword": "And "
});
formatter.step({
  "line": 57,
  "name": "click on submit button",
  "keyword": "And "
});
formatter.step({
  "line": 58,
  "name": "again click on Edit Job button and observe the number of interviews",
  "keyword": "And "
});
formatter.step({
  "line": 59,
  "name": "click on Add Skill button to add one new skill",
  "keyword": "And "
});
formatter.step({
  "line": 60,
  "name": "enter skill details and click on submit button",
  "rows": [
    {
      "cells": [
        "s01",
        "Expert",
        "Mandatory"
      ],
      "line": 61
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 62,
  "name": "Workbench page should display",
  "keyword": "Then "
});
formatter.step({
  "line": 63,
  "name": "click on Edit Candidate icon from candidate card",
  "keyword": "And "
});
formatter.step({
  "line": 64,
  "name": "observe Skills section for newly added skill",
  "keyword": "And "
});
formatter.step({
  "line": 65,
  "name": "Newly Added skills should be reflect in candidate profile which are already added for that job",
  "keyword": "Then "
});
formatter.step({
  "line": 66,
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "invaliddatasteps.user_is_on_Home_page_of_application()"
});
formatter.result({
  "duration": 57495468200,
  "status": "passed"
});
formatter.match({
  "location": "invaliddatasteps.title_of_page_is_HireXpert()"
});
formatter.result({
  "duration": 13079800,
  "status": "passed"
});
formatter.match({
  "location": "candidateProfile.enter_valid_user_email_address_and_password_for_employer_and_click_on_Sign_in_button(DataTable)"
});
formatter.result({
  "duration": 5484649500,
  "status": "passed"
});
formatter.match({
  "location": "addjobsteps.click_on_Workbench_tab()"
});
formatter.result({
  "duration": 7128123800,
  "status": "passed"
});
formatter.match({
  "location": "addjobsteps.click_on_Add_Job_button_and_fill_all_mandatory_details_on_Add_Job_popup_window()"
});
formatter.result({
  "duration": 9092399600,
  "status": "passed"
});
formatter.match({
  "location": "addjobsteps.click_on_submit_button()"
});
formatter.result({
  "duration": 3108819300,
  "status": "passed"
});
formatter.match({
  "location": "addjobsteps.job_should_get_successfully_added_and_Job_should_be_visible_in_Job_drop_down()"
});
formatter.result({
  "duration": 245400,
  "status": "passed"
});
formatter.match({
  "location": "addjobsteps.click_on_Job_drop_down_and_select_recently_added_job()"
});
formatter.result({
  "duration": 3184349200,
  "status": "passed"
});
formatter.match({
  "location": "candidateProfile.click_on_Add_Candidate_button()"
});
formatter.result({
  "duration": 3210310000,
  "status": "passed"
});
formatter.match({
  "location": "addjobsteps.click_on_Add_Candidate_button_and_add_one_new_candidate_for_the_job_and_click_on_Find_button(DataTable)"
});
formatter.result({
  "duration": 3479981500,
  "status": "passed"
});
formatter.match({
  "location": "addjobsteps.fill_mandatory_details()"
});
formatter.result({
  "duration": 1173970600,
  "status": "passed"
});
formatter.match({
  "location": "candidateProfile.click_on_Save_button()"
});
formatter.result({
  "duration": 5231454000,
  "status": "passed"
});
formatter.match({
  "location": "addjobsteps.new_candidate_should_get_added_in_New_column()"
});
formatter.result({
  "duration": 229300,
  "status": "passed"
});
formatter.match({
  "location": "addjobsteps.click_on_Edit_Job_button_to_update_skills_and_number_of_interview()"
});
formatter.result({
  "duration": 3168845600,
  "status": "passed"
});
formatter.match({
  "location": "addjobsteps.select_number_of_interview_except_previously_selected_number()"
});
formatter.result({
  "duration": 342667100,
  "status": "passed"
});
formatter.match({
  "location": "addjobsteps.click_on_submit_button()"
});
formatter.result({
  "duration": 3131035300,
  "status": "passed"
});
formatter.match({
  "location": "addjobsteps.again_click_on_Edit_Job_button_and_observe_the_number_of_interviews()"
});
formatter.result({
  "duration": 4350602200,
  "status": "passed"
});
formatter.match({
  "location": "addjobsteps.click_on_Add_Skill_button_to_add_one_new_skill()"
});
formatter.result({
  "duration": 173455300,
  "status": "passed"
});
formatter.match({
  "location": "addjobsteps.enter_skill_details_and_click_on_submit_button(DataTable)"
});
formatter.result({
  "duration": 3598843100,
  "status": "passed"
});
formatter.match({
  "location": "candidateProfile.Workbench_page_should_display()"
});
formatter.result({
  "duration": 268100,
  "status": "passed"
});
formatter.match({
  "location": "candidateProfile.click_on_Edit_Candidate_icon_from_candidate_card()"
});
formatter.result({
  "duration": 3132300200,
  "status": "passed"
});
formatter.match({
  "location": "addjobsteps.observe_Skills_section_for_newly_added_skill()"
});
formatter.result({
  "duration": 41651900,
  "status": "passed"
});
formatter.match({
  "location": "addjobsteps.newly_Added_skills_should_be_reflect_in_candidate_profile_which_are_already_added_for_that_job()"
});
formatter.result({
  "duration": 160000,
  "status": "passed"
});
formatter.match({
  "location": "invaliddatasteps.close_the_browser()"
});
formatter.result({
  "duration": 5686256700,
  "status": "passed"
});
});