$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/TLP33/Documents/GitHub/HireUIAutomation/HireXpertUIAutomation/HireXpertUIAutomation/src/main/java/features/JobCandidateWorkflow.feature");
formatter.feature({
  "line": 1,
  "name": "Hirexpert Job Candidate Workflow feature",
  "description": "",
  "id": "hirexpert-job-candidate-workflow-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 534,
      "value": "#Reg TC ID: 112,324 [Job candidate workfloww Regression TC]"
    },
    {
      "line": 535,
      "value": "# If DB clear, register the employer \u0026 agency first, employermain01@gmail.com \u0026 agencymain01@gmail.com . otherwise no change required"
    }
  ],
  "line": 539,
  "name": "To verify deleted skill on Candidate Details page and when employer is adding new candidate for the job",
  "description": "",
  "id": "hirexpert-job-candidate-workflow-feature;to-verify-deleted-skill-on-candidate-details-page-and-when-employer-is-adding-new-candidate-for-the-job",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 538,
      "name": "@Regression"
    },
    {
      "line": 538,
      "name": "@reg9"
    },
    {
      "line": 538,
      "name": "@run"
    }
  ]
});
formatter.step({
  "line": 541,
  "name": "Open browser",
  "keyword": "Given "
});
formatter.step({
  "line": 542,
  "name": "title of login page is Home",
  "keyword": "When "
});
formatter.step({
  "line": 543,
  "name": "Click on Employer-Agency Signin link",
  "keyword": "And "
});
formatter.step({
  "line": 544,
  "name": "Employer enters valid credentials \"\u003cUsername\u003e\",\"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 545,
  "name": "Go to Workbench",
  "keyword": "And "
});
formatter.step({
  "line": 546,
  "name": "Add job \"\u003cSkill1\u003e\",\"\u003cSkill2\u003e\",\"\u003cSkill3\u003e\",\"\u003clevel1\u003e\",\"\u003clevel2\u003e\",\"\u003clevel3\u003e\",\"\u003cWeightage1\u003e\",\"\u003cWeightage2\u003e\",\"\u003cWeightage3\u003e\",\"\u003ccertificate1\u003e\",\"\u003ccertificate2\u003e\",\"\u003ccertificate3\u003e\",\"\u003cremark1\u003e\",\"\u003cremark2\u003e\" and \"\u003cremark3\u003e\"",
  "rows": [
    {
      "cells": [
        "title",
        "agytitle",
        "designation",
        "industry",
        "location",
        "budget",
        "minexp",
        "maxexp",
        "minsal",
        "maxsal",
        "Name",
        "Email",
        "contact",
        "totalinterviews",
        "organization",
        "agyorganization",
        "functionalArea"
      ],
      "line": 547
    },
    {
      "cells": [
        "JCFW 9B",
        "JCFW Agy 13",
        "developer",
        "IT software",
        "pune",
        "400000",
        "1",
        "2",
        "450000",
        "800000",
        "pe1",
        "pe1@gmail.com",
        "1234564",
        "2",
        "Hirexpert",
        "rahitech",
        "java"
      ],
      "line": 548
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 549,
  "name": "Select a added job",
  "keyword": "And "
});
formatter.step({
  "line": 550,
  "name": "Click on add candidate",
  "keyword": "And "
});
formatter.step({
  "line": 551,
  "name": "Enter All details of \"\u003cCandidateEmail\u003e\",\"\u003cprofiletitle\u003e\",\"\u003cName\u003e\",\"\u003cContactNumber\u003e\",\"\u003cDesignation\u003e\",\"\u003cDate\u003e\",\"\u003cGender\u003e\",\"\u003cOnNoticePeriod\u003e\",\"\u003cNoticePeriod\u003e\",\"\u003cLastWorkingDay\u003e\",\"\u003cexperience\u003e\",\"\u003cCTC\u003e\",\"\u003cexpectedCTC\u003e\",\"\u003cCountry\u003e\",\"\u003cCity\u003e\",\"\u003cCityArea\u003e\",\"\u003cZipCode\u003e\",\"\u003cCommunicationmode\u003e\",\"\u003cSalaryoffered\u003e\",\"\u003cdistance\u003e\",\"\u003cpermanentAddress\u003e\",\"\u003crelocate\u003e\",\"\u003cSkill1\u003e\",\"\u003cSkill2\u003e\",\"\u003cSkill3\u003e\",\"\u003clevel1\u003e\",\"\u003clevel2\u003e\",\"\u003clevel3\u003e\",\"\u003cWeightage1\u003e\",\"\u003cWeightage2\u003e\",\"\u003cWeightage3\u003e\",\"\u003ccertificate1\u003e\",\"\u003ccertificate2\u003e\",\"\u003ccertificate3\u003e\",\"\u003cremark1\u003e\",\"\u003cremark2\u003e\",\"\u003cremark3\u003e\",\"\u003ccertificateforskill1\u003e\"and\"\u003ccertificateforskill2\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 552,
  "name": "verify candidate card is displaying or not in New column \"\u003cName\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 553,
  "name": "Click on Candidate name from candidate card and observe the skills",
  "keyword": "And "
});
formatter.step({
  "line": 554,
  "name": "click on Close button from candidate Details page",
  "keyword": "And "
});
formatter.step({
  "line": 555,
  "name": "click on Edit Job button to make changes in job",
  "keyword": "And "
});
formatter.step({
  "line": 556,
  "name": "Delete one skill from Skills section",
  "keyword": "And "
});
formatter.step({
  "line": 557,
  "name": "click on submit button",
  "keyword": "And "
});
formatter.step({
  "line": 558,
  "name": "Click on Edit Candidate icon on candidate card \"\u003cName\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 559,
  "name": "observe deleted skill not displayed \"\u003cSkill3\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 560,
  "name": "click on Close button from Edit Candidate page",
  "keyword": "And "
});
formatter.step({
  "line": 561,
  "name": "Click on Candidate name from candidate card and observe the skills",
  "keyword": "And "
});
formatter.step({
  "line": 562,
  "name": "deleted skills should display on Candidate Details page \"\u003cSkill3\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 563,
  "name": "click on Close button from candidate Details page",
  "keyword": "And "
});
formatter.step({
  "line": 564,
  "name": "click on Edit Job button to make changes in job",
  "keyword": "And "
});
formatter.step({
  "line": 565,
  "name": "delete all added skills",
  "keyword": "And "
});
formatter.step({
  "line": 566,
  "name": "click on submit button",
  "keyword": "And "
});
formatter.step({
  "line": 567,
  "name": "Click on add candidate",
  "keyword": "And "
});
formatter.step({
  "line": 568,
  "name": "Enter valid \"\u003cCandidateEmail1\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 569,
  "name": "click on find button",
  "keyword": "And "
});
formatter.step({
  "line": 570,
  "name": "click on ok button",
  "keyword": "And "
});
formatter.step({
  "line": 571,
  "name": "observe deleted job skill should not show when employer is going to add new candidate \"\u003cSkill1\u003e\" \"\u003cSkill2\u003e\" \"\u003cSkill3\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 572,
  "name": "close the browser",
  "keyword": "And "
});
formatter.examples({
  "line": 574,
  "name": "",
  "description": "",
  "id": "hirexpert-job-candidate-workflow-feature;to-verify-deleted-skill-on-candidate-details-page-and-when-employer-is-adding-new-candidate-for-the-job;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password",
        "CandidateEmail",
        "profiletitle",
        "Name",
        "ContactNumber",
        "Designation",
        "Date",
        "Gender",
        "OnNoticePeriod",
        "NoticePeriod",
        "LastWorkingDay",
        "experience",
        "CTC",
        "expectedCTC",
        "Country",
        "City",
        "CityArea",
        "ZipCode",
        "Communicationmode",
        "Salaryoffered",
        "distance",
        "permanentAddress",
        "relocate",
        "Skill1",
        "Skill2",
        "Skill3",
        "level1",
        "level2",
        "level3",
        "Weightage1",
        "Weightage2",
        "Weightage3",
        "certificate1",
        "certificate2",
        "certificate3",
        "remark1",
        "remark2",
        "remark3",
        "certificateforskill1",
        "certificateforskill2",
        "CandidateEmail1"
      ],
      "line": 575,
      "id": "hirexpert-job-candidate-workflow-feature;to-verify-deleted-skill-on-candidate-details-page-and-when-employer-is-adding-new-candidate-for-the-job;;1"
    },
    {
      "cells": [
        "pemp@gmail.com",
        "12345",
        "hirecan27@gmail.com",
        "jr software developer",
        "hirecan27",
        "9875866385",
        "Sr.developer",
        "19/04/1995",
        "Female",
        "No",
        "25",
        "1/9/2021",
        "1.5",
        "800000",
        "800000",
        "India",
        "wardha",
        "Arvi naka",
        "455966",
        "Call",
        "800000",
        "4",
        "No",
        "No",
        "JAVA",
        "advanced java",
        "JavaScript",
        "Basic Knowledge",
        "Intermediate",
        "Expert",
        "Mandatory",
        "Preferred",
        "Optional",
        "Yes",
        "No",
        "No",
        "provide certificate",
        "spring,hybernet",
        "advanced version",
        "sun microsoft",
        "advanced version",
        "hirecan26@gmail.com"
      ],
      "line": 576,
      "id": "hirexpert-job-candidate-workflow-feature;to-verify-deleted-skill-on-candidate-details-page-and-when-employer-is-adding-new-candidate-for-the-job;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 576,
  "name": "To verify deleted skill on Candidate Details page and when employer is adding new candidate for the job",
  "description": "",
  "id": "hirexpert-job-candidate-workflow-feature;to-verify-deleted-skill-on-candidate-details-page-and-when-employer-is-adding-new-candidate-for-the-job;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 538,
      "name": "@run"
    },
    {
      "line": 538,
      "name": "@Regression"
    },
    {
      "line": 538,
      "name": "@reg9"
    }
  ]
});
formatter.step({
  "line": 541,
  "name": "Open browser",
  "keyword": "Given "
});
formatter.step({
  "line": 542,
  "name": "title of login page is Home",
  "keyword": "When "
});
formatter.step({
  "line": 543,
  "name": "Click on Employer-Agency Signin link",
  "keyword": "And "
});
formatter.step({
  "line": 544,
  "name": "Employer enters valid credentials \"pemp@gmail.com\",\"12345\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 545,
  "name": "Go to Workbench",
  "keyword": "And "
});
formatter.step({
  "line": 546,
  "name": "Add job \"JAVA\",\"advanced java\",\"JavaScript\",\"Basic Knowledge\",\"Intermediate\",\"Expert\",\"Mandatory\",\"Preferred\",\"Optional\",\"Yes\",\"No\",\"No\",\"provide certificate\",\"spring,hybernet\" and \"advanced version\"",
  "matchedColumns": [
    32,
    33,
    34,
    35,
    36,
    37,
    38,
    24,
    25,
    26,
    27,
    28,
    29,
    30,
    31
  ],
  "rows": [
    {
      "cells": [
        "title",
        "agytitle",
        "designation",
        "industry",
        "location",
        "budget",
        "minexp",
        "maxexp",
        "minsal",
        "maxsal",
        "Name",
        "Email",
        "contact",
        "totalinterviews",
        "organization",
        "agyorganization",
        "functionalArea"
      ],
      "line": 547
    },
    {
      "cells": [
        "JCFW 9B",
        "JCFW Agy 13",
        "developer",
        "IT software",
        "pune",
        "400000",
        "1",
        "2",
        "450000",
        "800000",
        "pe1",
        "pe1@gmail.com",
        "1234564",
        "2",
        "Hirexpert",
        "rahitech",
        "java"
      ],
      "line": 548
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 549,
  "name": "Select a added job",
  "keyword": "And "
});
formatter.step({
  "line": 550,
  "name": "Click on add candidate",
  "keyword": "And "
});
formatter.step({
  "line": 551,
  "name": "Enter All details of \"hirecan27@gmail.com\",\"jr software developer\",\"hirecan27\",\"9875866385\",\"Sr.developer\",\"19/04/1995\",\"Female\",\"No\",\"25\",\"1/9/2021\",\"1.5\",\"800000\",\"800000\",\"India\",\"wardha\",\"Arvi naka\",\"455966\",\"Call\",\"800000\",\"4\",\"No\",\"No\",\"JAVA\",\"advanced java\",\"JavaScript\",\"Basic Knowledge\",\"Intermediate\",\"Expert\",\"Mandatory\",\"Preferred\",\"Optional\",\"Yes\",\"No\",\"No\",\"provide certificate\",\"spring,hybernet\",\"advanced version\",\"sun microsoft\"and\"advanced version\"",
  "matchedColumns": [
    2,
    3,
    4,
    5,
    6,
    7,
    8,
    9,
    10,
    11,
    12,
    13,
    14,
    15,
    16,
    17,
    18,
    19,
    20,
    21,
    22,
    23,
    24,
    25,
    26,
    27,
    28,
    29,
    30,
    31,
    32,
    33,
    34,
    35,
    36,
    37,
    38,
    39,
    40
  ],
  "keyword": "And "
});
formatter.step({
  "line": 552,
  "name": "verify candidate card is displaying or not in New column \"hirecan27\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 553,
  "name": "Click on Candidate name from candidate card and observe the skills",
  "keyword": "And "
});
formatter.step({
  "line": 554,
  "name": "click on Close button from candidate Details page",
  "keyword": "And "
});
formatter.step({
  "line": 555,
  "name": "click on Edit Job button to make changes in job",
  "keyword": "And "
});
formatter.step({
  "line": 556,
  "name": "Delete one skill from Skills section",
  "keyword": "And "
});
formatter.step({
  "line": 557,
  "name": "click on submit button",
  "keyword": "And "
});
formatter.step({
  "line": 558,
  "name": "Click on Edit Candidate icon on candidate card \"hirecan27\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 559,
  "name": "observe deleted skill not displayed \"JavaScript\"",
  "matchedColumns": [
    26
  ],
  "keyword": "And "
});
formatter.step({
  "line": 560,
  "name": "click on Close button from Edit Candidate page",
  "keyword": "And "
});
formatter.step({
  "line": 561,
  "name": "Click on Candidate name from candidate card and observe the skills",
  "keyword": "And "
});
formatter.step({
  "line": 562,
  "name": "deleted skills should display on Candidate Details page \"JavaScript\"",
  "matchedColumns": [
    26
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 563,
  "name": "click on Close button from candidate Details page",
  "keyword": "And "
});
formatter.step({
  "line": 564,
  "name": "click on Edit Job button to make changes in job",
  "keyword": "And "
});
formatter.step({
  "line": 565,
  "name": "delete all added skills",
  "keyword": "And "
});
formatter.step({
  "line": 566,
  "name": "click on submit button",
  "keyword": "And "
});
formatter.step({
  "line": 567,
  "name": "Click on add candidate",
  "keyword": "And "
});
formatter.step({
  "line": 568,
  "name": "Enter valid \"hirecan26@gmail.com\"",
  "matchedColumns": [
    41
  ],
  "keyword": "And "
});
formatter.step({
  "line": 569,
  "name": "click on find button",
  "keyword": "And "
});
formatter.step({
  "line": 570,
  "name": "click on ok button",
  "keyword": "And "
});
formatter.step({
  "line": 571,
  "name": "observe deleted job skill should not show when employer is going to add new candidate \"JAVA\" \"advanced java\" \"JavaScript\"",
  "matchedColumns": [
    24,
    25,
    26
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 572,
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "JobCandidateWorkflowRegressionStepDefination.open_browser()"
});
formatter.result({
  "duration": 12025491900,
  "status": "passed"
});
formatter.match({
  "location": "TC77_79_95.title_of_login_page_is_Home()"
});
formatter.result({
  "duration": 8111700,
  "status": "passed"
});
formatter.match({
  "location": "TC77_79_95.click_on_Employer_Agency_Signin_link()"
});
formatter.result({
  "duration": 3273108000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pemp@gmail.com",
      "offset": 35
    },
    {
      "val": "12345",
      "offset": 52
    }
  ],
  "location": "taskRegression.employer_enters_valid_credentials(String,String)"
});
formatter.result({
  "duration": 7741558200,
  "status": "passed"
});
formatter.match({
  "location": "JobCandidateWorkflowRegressionStepDefination.go_to_Workbench()"
});
formatter.result({
  "duration": 5314288700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "JAVA",
      "offset": 9
    },
    {
      "val": "advanced java",
      "offset": 16
    },
    {
      "val": "JavaScript",
      "offset": 32
    },
    {
      "val": "Basic Knowledge",
      "offset": 45
    },
    {
      "val": "Intermediate",
      "offset": 63
    },
    {
      "val": "Expert",
      "offset": 78
    },
    {
      "val": "Mandatory",
      "offset": 87
    },
    {
      "val": "Preferred",
      "offset": 99
    },
    {
      "val": "Optional",
      "offset": 111
    },
    {
      "val": "Yes",
      "offset": 122
    },
    {
      "val": "No",
      "offset": 128
    },
    {
      "val": "No",
      "offset": 133
    },
    {
      "val": "provide certificate",
      "offset": 138
    },
    {
      "val": "spring,hybernet",
      "offset": 160
    },
    {
      "val": "advanced version",
      "offset": 182
    }
  ],
  "location": "JobCandidateWorkflowRegressionStepDefination.add_jobskill_and(String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,DataTable)"
});
formatter.result({
  "duration": 47585542300,
  "status": "passed"
});
formatter.match({
  "location": "taskRegression.select_a_added_job()"
});
formatter.result({
  "duration": 4237915400,
  "status": "passed"
});
formatter.match({
  "location": "taskRegression.click_on_add_candidate()"
});
formatter.result({
  "duration": 3099777300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "hirecan27@gmail.com",
      "offset": 22
    },
    {
      "val": "jr software developer",
      "offset": 44
    },
    {
      "val": "hirecan27",
      "offset": 68
    },
    {
      "val": "9875866385",
      "offset": 80
    },
    {
      "val": "Sr.developer",
      "offset": 93
    },
    {
      "val": "19/04/1995",
      "offset": 108
    },
    {
      "val": "Female",
      "offset": 121
    },
    {
      "val": "No",
      "offset": 130
    },
    {
      "val": "25",
      "offset": 135
    },
    {
      "val": "1/9/2021",
      "offset": 140
    },
    {
      "val": "1.5",
      "offset": 151
    },
    {
      "val": "800000",
      "offset": 157
    },
    {
      "val": "800000",
      "offset": 166
    },
    {
      "val": "India",
      "offset": 175
    },
    {
      "val": "wardha",
      "offset": 183
    },
    {
      "val": "Arvi naka",
      "offset": 192
    },
    {
      "val": "455966",
      "offset": 204
    },
    {
      "val": "Call",
      "offset": 213
    },
    {
      "val": "800000",
      "offset": 220
    },
    {
      "val": "4",
      "offset": 229
    },
    {
      "val": "No",
      "offset": 233
    },
    {
      "val": "No",
      "offset": 238
    },
    {
      "val": "JAVA",
      "offset": 243
    },
    {
      "val": "advanced java",
      "offset": 250
    },
    {
      "val": "JavaScript",
      "offset": 266
    },
    {
      "val": "Basic Knowledge",
      "offset": 279
    },
    {
      "val": "Intermediate",
      "offset": 297
    },
    {
      "val": "Expert",
      "offset": 312
    },
    {
      "val": "Mandatory",
      "offset": 321
    },
    {
      "val": "Preferred",
      "offset": 333
    },
    {
      "val": "Optional",
      "offset": 345
    },
    {
      "val": "Yes",
      "offset": 356
    },
    {
      "val": "No",
      "offset": 362
    },
    {
      "val": "No",
      "offset": 367
    },
    {
      "val": "provide certificate",
      "offset": 372
    },
    {
      "val": "spring,hybernet",
      "offset": 394
    },
    {
      "val": "advanced version",
      "offset": 412
    },
    {
      "val": "sun microsoft",
      "offset": 431
    },
    {
      "val": "advanced version",
      "offset": 449
    }
  ],
  "location": "JobCandidateWorkflowRegressionStepDefination.enter_All_details_of_and(String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 68867587100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "hirecan27",
      "offset": 58
    }
  ],
  "location": "taskRegression.verify_candidate_card_is_displaying_or_not_in_New_column(String)"
});
formatter.result({
  "duration": 102039200,
  "status": "passed"
});
formatter.match({
  "location": "JobCandidateWorkflowRegressionStepDefination.click_on_Candidate_name_from_candidate_card_and_observe_the_skills()"
});
formatter.result({
  "duration": 4310273600,
  "status": "passed"
});
formatter.match({
  "location": "JobCandidateWorkflowRegressionStepDefination.click_on_Close_button_from_candidate_Details_page()"
});
formatter.result({
  "duration": 4118980300,
  "status": "passed"
});
formatter.match({
  "location": "JobCandidateWorkflowRegressionStepDefination.click_on_Edit_Job_button_to_make_changes_in_job()"
});
formatter.result({
  "duration": 13310254300,
  "status": "passed"
});
formatter.match({
  "location": "JobCandidateWorkflowRegressionStepDefination.delete_one_skill_from_Skills_section()"
});
formatter.result({
  "duration": 2098402600,
  "status": "passed"
});
formatter.match({
  "location": "JobCandidateWorkflowRegressionStepDefination.click_on_submit_button()"
});
formatter.result({
  "duration": 3092046700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "hirecan27",
      "offset": 48
    }
  ],
  "location": "JobCandidateWorkflowRegressionStepDefination.click_on_Edit_Candidate_icon_on_candidate_card(String)"
});
formatter.result({
  "duration": 8099567400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "JavaScript",
      "offset": 37
    }
  ],
  "location": "JobCandidateWorkflowRegressionStepDefination.observe_deleted_skill_not_displayed(String)"
});
formatter.result({
  "duration": 131013800,
  "status": "passed"
});
formatter.match({
  "location": "JobCandidateWorkflowRegressionStepDefination.click_on_Close_button_from_Edit_Candidate_page()"
});
formatter.result({
  "duration": 3097538800,
  "status": "passed"
});
formatter.match({
  "location": "JobCandidateWorkflowRegressionStepDefination.click_on_Candidate_name_from_candidate_card_and_observe_the_skills()"
});
formatter.result({
  "duration": 4265957800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "JavaScript",
      "offset": 57
    }
  ],
  "location": "JobCandidateWorkflowRegressionStepDefination.deleted_skills_should_display_on_Candidate_Details_page(String)"
});
formatter.result({
  "duration": 62900,
  "status": "passed"
});
formatter.match({
  "location": "JobCandidateWorkflowRegressionStepDefination.click_on_Close_button_from_candidate_Details_page()"
});
formatter.result({
  "duration": 4066877500,
  "status": "passed"
});
formatter.match({
  "location": "JobCandidateWorkflowRegressionStepDefination.click_on_Edit_Job_button_to_make_changes_in_job()"
});
formatter.result({
  "duration": 13298797200,
  "status": "passed"
});
formatter.match({
  "location": "JobCandidateWorkflowRegressionStepDefination.delete_all_added_skills()"
});
formatter.result({
  "duration": 1134215500,
  "error_message": "java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1\r\n\tat java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)\r\n\tat java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)\r\n\tat java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)\r\n\tat java.base/java.util.Objects.checkIndex(Objects.java:372)\r\n\tat java.base/java.util.ArrayList.get(ArrayList.java:458)\r\n\tat java.base/jdk.internal.reflect.GeneratedMethodAccessor8.invoke(Unknown Source)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:567)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementListHandler.invoke(LocatingElementListHandler.java:39)\r\n\tat com.sun.proxy.$Proxy21.get(Unknown Source)\r\n\tat RegressionTc.JobCandidateWorkflowRegressionStepDefination.delete_all_added_skills(JobCandidateWorkflowRegressionStepDefination.java:1129)\r\n\tat ✽.And delete all added skills(C:/Users/TLP33/Documents/GitHub/HireUIAutomation/HireXpertUIAutomation/HireXpertUIAutomation/src/main/java/features/JobCandidateWorkflow.feature:565)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "JobCandidateWorkflowRegressionStepDefination.click_on_submit_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "taskRegression.click_on_add_candidate()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "hirecan26@gmail.com",
      "offset": 13
    }
  ],
  "location": "JobCandidateWorkflowRegressionStepDefination.enter_valid(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "JobCandidateWorkflowRegressionStepDefination.click_on_find_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "JobCandidateWorkflowRegressionStepDefination.click_on_ok_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "JAVA",
      "offset": 87
    },
    {
      "val": "advanced java",
      "offset": 94
    },
    {
      "val": "JavaScript",
      "offset": 110
    }
  ],
  "location": "JobCandidateWorkflowRegressionStepDefination.observe_deleted_job_skill_should_not_show_when_employer_is_going_to_add_new_candidate(String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "JobCandidateWorkflowRegressionStepDefination.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});