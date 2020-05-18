$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/TLP33/Documents/GitHub/HireUIAutomation/HireXpertUIAutomation/HireXpertUIAutomation/src/main/java/features/loginK.feature");
formatter.feature({
  "line": 1,
  "name": "UserAccount Feature",
  "description": "",
  "id": "useraccount-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "#Scenario: Verify that employer is able to update profile."
    },
    {
      "line": 4,
      "value": "#"
    },
    {
      "line": 5,
      "value": "#Given User must is registered"
    },
    {
      "line": 6,
      "value": "#When title of login page is Home"
    },
    {
      "line": 7,
      "value": "#And user enters valid credentials"
    },
    {
      "line": 8,
      "value": "#And user clicks on Sign in button"
    },
    {
      "line": 9,
      "value": "#And user is on update profile page"
    },
    {
      "line": 10,
      "value": "#And enter all neccessory detalis"
    },
    {
      "line": 11,
      "value": "#And Click on submit button"
    },
    {
      "line": 12,
      "value": "#Then User is on Home page"
    },
    {
      "line": 13,
      "value": "#Then user close the browser"
    }
  ],
  "line": 17,
  "name": "To verify whether the employer is able to add agency.",
  "description": "",
  "id": "useraccount-feature;to-verify-whether-the-employer-is-able-to-add-agency.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@TC47_51"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "User must be registered",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "title of login page is Home",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "Employer enters valid credentials",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Click on Agencies tab",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Click on add Button to add the agency",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Fill all the mandatory details",
  "rows": [
    {
      "cells": [
        "Name",
        "Email",
        "contact"
      ],
      "line": 26
    },
    {
      "cells": [
        "dagy",
        "dagy@gmail.com",
        "1234564"
      ],
      "line": 27
    }
  ],
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 28,
      "value": "#|pemp| pemp@gmail.com  | 1234564  |"
    }
  ],
  "line": 29,
  "name": "Click on Submit button",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "Employer should be able to add Agency",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "Newly added agency should be displayed in Agencies page",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "delete the added agency",
  "keyword": "And "
});
formatter.match({
  "location": "TheEmployerIsAbleToAddAgency.user_must_be_registered()"
});
formatter.result({
  "duration": 35867589500,
  "status": "passed"
});
formatter.match({
  "location": "TheEmployerIsAbleToAddAgency.title_of_login_page_is_Home()"
});
formatter.result({
  "duration": 19487500,
  "status": "passed"
});
formatter.match({
  "location": "TheEmployerIsAbleToAddAgency.Employer_enters_valid_credentials()"
});
formatter.result({
  "duration": 3512876300,
  "status": "passed"
});
formatter.match({
  "location": "TheEmployerIsAbleToAddAgency.click_on_Agencies_tab()"
});
formatter.result({
  "duration": 4375417800,
  "status": "passed"
});
formatter.match({
  "location": "TheEmployerIsAbleToAddAgency.click_on_Add_Button_to_add_the_agency()"
});
formatter.result({
  "duration": 2197565100,
  "status": "passed"
});
formatter.match({
  "location": "TheEmployerIsAbleToAddAgency.fill_all_the_mandatory_detail(DataTable)"
});
formatter.result({
  "duration": 1632443600,
  "status": "passed"
});
formatter.match({
  "location": "TheEmployerIsAbleToAddAgency.click_on_Submit_button()"
});
formatter.result({
  "duration": 1138071800,
  "status": "passed"
});
formatter.match({
  "location": "TheEmployerIsAbleToAddAgency.employer_should_be_able_to_add_Agency()"
});
formatter.result({
  "duration": 66279600,
  "status": "passed"
});
formatter.match({
  "location": "TheEmployerIsAbleToAddAgency.newly_added_agency_should_be_displayed_in_Agencies_page()"
});
formatter.result({
  "duration": 56357500,
  "status": "passed"
});
formatter.match({
  "location": "TheEmployerIsAbleToAddAgency.delete_the_added_agency()"
});
formatter.result({
  "duration": 2241879500,
  "status": "passed"
});
formatter.scenario({
  "line": 35,
  "name": "To verify whether the employer is able to add team",
  "description": "",
  "id": "useraccount-feature;to-verify-whether-the-employer-is-able-to-add-team",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 34,
      "name": "@TC48_52"
    }
  ]
});
formatter.step({
  "line": 37,
  "name": "User must be registered",
  "keyword": "Given "
});
formatter.step({
  "line": 39,
  "name": "title of login page is Home",
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "Employer enters valid credentials",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "Click on team tab",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "Click on add Button and Fill all the mandatory details for Employer team",
  "rows": [
    {
      "cells": [
        "Name",
        "Email",
        "contact"
      ],
      "line": 43
    },
    {
      "cells": [
        "pe1",
        "pe1@gmail.com",
        "1234564"
      ],
      "line": 44
    },
    {
      "cells": [
        "pe2",
        "pe2@gmail.com",
        "1234564"
      ],
      "line": 45
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "Employer should be able to add team member",
  "keyword": "Then "
});
formatter.step({
  "line": 47,
  "name": "Newly added team member should be displayed in team page",
  "keyword": "Then "
});
formatter.step({
  "line": 48,
  "name": "the employer with which you have logged in should display in team tab by default",
  "keyword": "Then "
});
formatter.step({
  "line": 49,
  "name": "delete the added team",
  "keyword": "And "
});
formatter.match({
  "location": "TheEmployerIsAbleToAddAgency.user_must_be_registered()"
});
formatter.result({
  "duration": 55873508400,
  "status": "passed"
});
formatter.match({
  "location": "TheEmployerIsAbleToAddAgency.title_of_login_page_is_Home()"
});
formatter.result({
  "duration": 10781100,
  "status": "passed"
});
formatter.match({
  "location": "TheEmployerIsAbleToAddAgency.Employer_enters_valid_credentials()"
});
formatter.result({
  "duration": 3519263300,
  "status": "passed"
});
formatter.match({
  "location": "TC48.click_on_team_tab()"
});
formatter.result({
  "duration": 4185325600,
  "status": "passed"
});
formatter.match({
  "location": "TC48.fill_all_the_mandatory_details(DataTable)"
});
formatter.result({
  "duration": 34211380200,
  "status": "passed"
});
formatter.match({
  "location": "TC48.employer_should_be_able_to_add_team_member()"
});
formatter.result({
  "duration": 49900,
  "status": "passed"
});
formatter.match({
  "location": "TC48.newly_added_team_member_should_be_displayed_in_team_page()"
});
formatter.result({
  "duration": 56006800,
  "status": "passed"
});
formatter.match({
  "location": "TC48.the_employer_with_which_you_have_logged_in_should_display_in_team_tab_by_default()"
});
formatter.result({
  "duration": 55062100,
  "status": "passed"
});
formatter.match({
  "location": "TC48.delete_the_added_agency()"
});
formatter.result({
  "duration": 261777400,
  "status": "passed"
});
formatter.scenario({
  "line": 52,
  "name": "To verify whether the Agency is able to add and delete employer",
  "description": "",
  "id": "useraccount-feature;to-verify-whether-the-agency-is-able-to-add-and-delete-employer",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 51,
      "name": "@TC49_53"
    }
  ]
});
formatter.step({
  "line": 54,
  "name": "User must be registered",
  "keyword": "Given "
});
formatter.step({
  "line": 56,
  "name": "title of login page is Home",
  "keyword": "When "
});
formatter.step({
  "line": 57,
  "name": "agency enters valid credentials",
  "keyword": "And "
});
formatter.step({
  "line": 58,
  "name": "Click on Employer tab",
  "keyword": "And "
});
formatter.step({
  "line": 59,
  "name": "Click on add Button and Fill all the mandatory details for Agency",
  "rows": [
    {
      "cells": [
        "Name",
        "Email",
        "contact"
      ],
      "line": 60
    },
    {
      "cells": [
        "pe1",
        "pe1@gmail.com",
        "1234564"
      ],
      "line": 61
    },
    {
      "cells": [
        "pe2",
        "pe2@gmail.com",
        "1234564"
      ],
      "line": 62
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 63,
  "name": "Agency should be able to add Employer",
  "keyword": "Then "
});
formatter.step({
  "line": 64,
  "name": "Newly added employer should be displayed in employer page",
  "keyword": "Then "
});
formatter.step({
  "line": 65,
  "name": "delete the added employer",
  "keyword": "And "
});
formatter.step({
  "line": 66,
  "name": "deleted employer should not be display in employer page",
  "keyword": "Then "
});
formatter.match({
  "location": "TheEmployerIsAbleToAddAgency.user_must_be_registered()"
});
formatter.result({
  "duration": 71668853900,
  "status": "passed"
});
formatter.match({
  "location": "TheEmployerIsAbleToAddAgency.title_of_login_page_is_Home()"
});
formatter.result({
  "duration": 9016200,
  "status": "passed"
});
formatter.match({
  "location": "TC49_53K.agency_enters_valid_credentials()"
});
formatter.result({
  "duration": 2408654400,
  "status": "passed"
});
formatter.match({
  "location": "TC49_53K.click_on_Employer_tab()"
});
formatter.result({
  "duration": 3213593700,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "TC49_53K.Agency_should_be_able_to_add_Employer()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC49_53K.newly_added_employer_should_be_displayed_in_Employer_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC49_53K.delete_the_added_employer()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC49_53K.deleted_employer_should_not_be_display_in_team_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 70,
  "name": "To verify whether the Agency is able to add and delete team",
  "description": "",
  "id": "useraccount-feature;to-verify-whether-the-agency-is-able-to-add-and-delete-team",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 69,
      "name": "@TC50_54"
    }
  ]
});
formatter.step({
  "line": 72,
  "name": "User must be registered",
  "keyword": "Given "
});
formatter.step({
  "line": 74,
  "name": "title of login page is Home",
  "keyword": "When "
});
formatter.step({
  "line": 75,
  "name": "agency enters valid credentials",
  "keyword": "And "
});
formatter.step({
  "line": 76,
  "name": "Click on team tab",
  "keyword": "And "
});
formatter.step({
  "line": 77,
  "name": "Click on add Button and Fill all the mandatory details for agency team",
  "rows": [
    {
      "cells": [
        "Nameagy",
        "Emailagy",
        "contactagy"
      ],
      "line": 78
    },
    {
      "cells": [
        "pa1",
        "pa1@gmail.com",
        "1234564"
      ],
      "line": 79
    },
    {
      "cells": [
        "pa2",
        "pa2@gmail.com",
        "1234564"
      ],
      "line": 80
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 81,
  "name": "Agency should be able to add team",
  "keyword": "Then "
});
formatter.step({
  "line": 82,
  "name": "Newly added team should be displayed in team page",
  "keyword": "Then "
});
formatter.step({
  "line": 83,
  "name": "delete the added team",
  "keyword": "And "
});
formatter.step({
  "line": 84,
  "name": "deleted employer should not be display in team page",
  "keyword": "Then "
});
formatter.match({
  "location": "TheEmployerIsAbleToAddAgency.user_must_be_registered()"
});
formatter.result({
  "duration": 77241360200,
  "status": "passed"
});
formatter.match({
  "location": "TheEmployerIsAbleToAddAgency.title_of_login_page_is_Home()"
});
formatter.result({
  "duration": 8067100,
  "status": "passed"
});
formatter.match({
  "location": "TC49_53K.agency_enters_valid_credentials()"
});
formatter.result({
  "duration": 2363247900,
  "status": "passed"
});
formatter.match({
  "location": "TC48.click_on_team_tab()"
});
formatter.result({
  "duration": 4193314300,
  "status": "passed"
});
formatter.match({
  "location": "TC50_54K.fill_all_the_mandatory_details(DataTable)"
});
formatter.result({
  "duration": 32362551400,
  "status": "passed"
});
formatter.match({
  "location": "TC50_54K.agency_should_be_able_to_add_team()"
});
formatter.result({
  "duration": 114600,
  "status": "passed"
});
formatter.match({
  "location": "TC50_54K.newly_added_team_should_be_displayed_in_team_page()"
});
formatter.result({
  "duration": 49627600,
  "status": "passed"
});
formatter.match({
  "location": "TC48.delete_the_added_agency()"
});
formatter.result({
  "duration": 306866900,
  "status": "passed"
});
formatter.match({
  "location": "TC50_54K.deleted_employer_should_not_be_display_in_team_page()"
});
formatter.result({
  "duration": 46700,
  "status": "passed"
});
});