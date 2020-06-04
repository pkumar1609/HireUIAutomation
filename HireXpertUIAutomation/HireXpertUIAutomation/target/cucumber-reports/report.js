$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("MarketplaceK.feature");
formatter.feature({
  "line": 1,
  "name": "Marketplace Feature",
  "description": "",
  "id": "marketplace-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "To verify the functionality to share job with market place.",
  "description": "",
  "id": "marketplace-feature;to-verify-the-functionality-to-share-job-with-market-place.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@TC351"
    },
    {
      "line": 3,
      "name": "@BVT"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User must be registered",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page is Home",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Click on Employer-Agency Signin link",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Employer enters valid credentials",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Go to workbench",
  "keyword": "And "
});
formatter.step({
  "line": 10,
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
        "maxexp"
      ],
      "line": 11
    },
    {
      "cells": [
        "marketjob2",
        "developer",
        "IT software",
        "java developer",
        "pune",
        "400000",
        "1",
        "2"
      ],
      "line": 12
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Select a added job",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Click on share job with market place",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "change information and click on submit",
  "rows": [
    {
      "cells": [
        "Commission Percentage",
        "Invoice Period",
        "Payment Cycle",
        "Replacement Period"
      ],
      "line": 16
    },
    {
      "cells": [
        "8.33",
        "30 Days",
        "60 Days",
        "90 Days"
      ],
      "line": 17
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Click on Employer marketplace tab",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Job should be list out in market place page on employer side.",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Logout from App",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Click on Employer-Agency Signin link",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "login as a support user",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "verify shared job is displaying on support login",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Click on approve",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Logout from App",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "agency enters valid credentials",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "Go to agency marketplace tab",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "All shared job by any employer should be show for all register agencies",
  "keyword": "Then "
});
formatter.match({
  "location": "TheEmployerIsAbleToAddAgency.user_must_be_registered()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TheEmployerIsAbleToAddAgency.title_of_login_page_is_Home()"
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
  "location": "TC264_266.add_job(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC351.select_a_added_job()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC351.click_on_share_job_with_market_place()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC351.change_information_and_click_on_submit(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC351.Click_on_Employer_marketplace_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC351.job_should_be_list_out_in_market_place_page_on_employer_side()"
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
  "location": "TC264_266.Logout_from_App()"
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
  "location": "TC351.go_to_marketplace_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC351.all_shared_job_by_any_employer_should_be_show_for_all_register_agencies()"
});
formatter.result({
  "status": "skipped"
});
});