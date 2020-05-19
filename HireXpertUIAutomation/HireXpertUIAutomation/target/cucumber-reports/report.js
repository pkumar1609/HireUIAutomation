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
      "line": 71,
      "value": "#Regression Test Cases"
    }
  ],
  "line": 74,
  "name": "To verify search funtionality of Agency and team tab",
  "description": "",
  "id": "useraccount-feature;to-verify-search-funtionality-of-agency-and-team-tab",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 73,
      "name": "@TC77_79_95"
    }
  ]
});
formatter.step({
  "line": 76,
  "name": "User must be registered",
  "keyword": "Given "
});
formatter.step({
  "line": 78,
  "name": "title of login page is Home",
  "keyword": "When "
});
formatter.step({
  "line": 79,
  "name": "Employer enters valid credentials",
  "keyword": "And "
});
formatter.step({
  "line": 80,
  "name": "Click on Agencies tab",
  "keyword": "And "
});
formatter.step({
  "line": 81,
  "name": "Click on add Button Fill all the mandatory details for agency",
  "rows": [
    {
      "cells": [
        "Name",
        "Email",
        "contact"
      ],
      "line": 82
    },
    {
      "cells": [
        "pagy",
        "pagy@gmail.com",
        "1234564"
      ],
      "line": 83
    },
    {
      "cells": [
        "pagy1",
        "pagy1@gmail.com",
        "1234564"
      ],
      "line": 84
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 85,
  "name": "Click on Search section and enter already existing agency",
  "rows": [
    {
      "cells": [
        "Name"
      ],
      "line": 86
    },
    {
      "cells": [
        "pagy"
      ],
      "line": 87
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 88,
  "name": "User should able to search agency",
  "keyword": "And "
});
formatter.step({
  "line": 89,
  "name": "Click on team tab",
  "keyword": "And "
});
formatter.step({
  "line": 90,
  "name": "Click on add Button and Fill all the mandatory details for employer team",
  "rows": [
    {
      "cells": [
        "Name",
        "Email",
        "contact"
      ],
      "line": 91
    },
    {
      "cells": [
        "pe1",
        "pe1@gmail.com",
        "1234564"
      ],
      "line": 92
    },
    {
      "cells": [
        "pe2",
        "pe2@gmail.com",
        "1234564"
      ],
      "line": 93
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 94,
  "name": "Click on Search section and enter already existing employer team",
  "rows": [
    {
      "cells": [
        "Name"
      ],
      "line": 95
    },
    {
      "cells": [
        "pe1"
      ],
      "line": 96
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 97,
  "name": "User should able to search employer team",
  "keyword": "And "
});
formatter.match({
  "location": "TheEmployerIsAbleToAddAgency.user_must_be_registered()"
});
formatter.result({
  "duration": 19117109700,
  "status": "passed"
});
formatter.match({
  "location": "TheEmployerIsAbleToAddAgency.title_of_login_page_is_Home()"
});
formatter.result({
  "duration": 7502400,
  "status": "passed"
});
formatter.match({
  "location": "TheEmployerIsAbleToAddAgency.Employer_enters_valid_credentials()"
});
formatter.result({
  "duration": 3308883000,
  "status": "passed"
});
formatter.match({
  "location": "TheEmployerIsAbleToAddAgency.click_on_Agencies_tab()"
});
formatter.result({
  "duration": 4153026500,
  "status": "passed"
});
formatter.match({
  "location": "TheEmployerIsAbleToAddAgency.fill_all_the_mandatory_detail(DataTable)"
});
formatter.result({
  "duration": 19286306600,
  "status": "passed"
});
formatter.match({
  "location": "TC77_79_95.click_on_Search_section_and_enter_already_existing_agency(DataTable)"
});
formatter.result({
  "duration": 137476300,
  "status": "passed"
});
formatter.match({
  "location": "TC77_79_95.user_should_able_to_search_agency()"
});
formatter.result({
  "duration": 2086003200,
  "status": "passed"
});
formatter.match({
  "location": "TC48.click_on_team_tab()"
});
formatter.result({
  "duration": 4034230000,
  "status": "passed"
});
formatter.match({
  "location": "TC48.fill_all_the_mandatory_details(DataTable)"
});
formatter.result({
  "duration": 17254553200,
  "status": "passed"
});
formatter.match({
  "location": "TC77_79_95.click_on_Search_section_and_enter_already_existing_employer_team(DataTable)"
});
formatter.result({
  "duration": 118808800,
  "status": "passed"
});
formatter.match({
  "location": "TC77_79_95.user_should_able_to_search_employer_team()"
});
formatter.result({
  "duration": 37505100,
  "status": "passed"
});
});