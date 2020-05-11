$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Admin/Documents/HireXpertUIAutomation/HireXpertUIAutomation/src/main/java/features/loginK.feature");
formatter.feature({
  "line": 1,
  "name": "UserAccount Feature",
  "description": "",
  "id": "useraccount-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 37069088000,
  "status": "passed"
});
formatter.scenario({
  "line": 49,
  "name": "To verify whether the employer is able to add team",
  "description": "",
  "id": "useraccount-feature;to-verify-whether-the-employer-is-able-to-add-team",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 48,
      "name": "@TC48_52"
    }
  ]
});
formatter.step({
  "line": 51,
  "name": "User must be registered as employer profile",
  "keyword": "Given "
});
formatter.step({
  "line": 53,
  "name": "title of login page is Home",
  "keyword": "When "
});
formatter.step({
  "line": 54,
  "name": "user enters valid credentials",
  "keyword": "And "
});
formatter.step({
  "line": 55,
  "name": "Click on team tab",
  "keyword": "And "
});
formatter.step({
  "line": 56,
  "name": "Click on add Button to add the team member",
  "keyword": "And "
});
formatter.step({
  "line": 57,
  "name": "Fill all the mandatory details",
  "rows": [
    {
      "cells": [
        "Name",
        "Email",
        "contact"
      ],
      "line": 58
    },
    {
      "cells": [
        "pe1",
        "pe1@gmail.com",
        "1234564"
      ],
      "line": 59
    },
    {
      "cells": [
        "pe2",
        "pe2@gmail.com",
        "1234564"
      ],
      "line": 60
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 61,
  "name": "Click on Submit button",
  "keyword": "And "
});
formatter.step({
  "line": 62,
  "name": "Employer should be able to add team member",
  "keyword": "Then "
});
formatter.step({
  "line": 63,
  "name": "Newly added team member should be displayed in team page",
  "keyword": "Then "
});
formatter.step({
  "line": 64,
  "name": "the employer with which you have logged in should display in team tab by default",
  "keyword": "Then "
});
formatter.step({
  "line": 65,
  "name": "delete the added agency",
  "keyword": "And "
});
formatter.match({
  "location": "TC48.user_must_be_registered_as_employer_profile()"
});
formatter.result({
  "duration": 111467800,
  "status": "passed"
});
formatter.match({
  "location": "TC48.title_of_login_page_is_Home()"
});
formatter.result({
  "duration": 6996100,
  "status": "passed"
});
formatter.match({
  "location": "TC48.user_enters_valid_credentials()"
});
formatter.result({
  "duration": 251005600,
  "status": "passed"
});
formatter.match({
  "location": "TC48.click_on_team_tab()"
});
formatter.result({
  "duration": 2093924200,
  "status": "passed"
});
formatter.match({
  "location": "TC48.click_on_add_Button_to_add_the_team_member()"
});
formatter.result({
  "duration": 24900,
  "status": "passed"
});
formatter.match({
  "location": "TC48.fill_all_the_mandatory_details(DataTable)"
});
formatter.result({
  "duration": 12191043500,
  "status": "passed"
});
formatter.match({
  "location": "TC48.click_on_Submit_button()"
});
formatter.result({
  "duration": 999820900,
  "status": "passed"
});
formatter.match({
  "location": "TC48.employer_should_be_able_to_add_team_member()"
});
formatter.result({
  "duration": 39000,
  "status": "passed"
});
formatter.match({
  "location": "TC48.newly_added_team_member_should_be_displayed_in_team_page()"
});
formatter.result({
  "duration": 29802900,
  "status": "passed"
});
formatter.match({
  "location": "TC48.the_employer_with_which_you_have_logged_in_should_display_in_team_tab_by_default()"
});
formatter.result({
  "duration": 36813600,
  "status": "passed"
});
formatter.match({
  "location": "TC48.delete_the_added_agency()"
});
formatter.result({
  "duration": 143345800,
  "status": "passed"
});
});