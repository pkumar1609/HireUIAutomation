$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("JobCandidateWorkflow.feature");
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
      "line": 15,
      "value": "#|pagy@gmail.com|12345   |"
    }
  ],
  "line": 19,
  "name": "Verify the functionality of Add, Edit \u0026 Delete Candidate with Employer login",
  "description": "",
  "id": "hirexpert-job-candidate-workflow-feature;verify-the-functionality-of-add,-edit-\u0026-delete-candidate-with-employer-login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 18,
      "name": "@BVT"
    },
    {
      "line": 18,
      "name": "@JCWF"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "User must be registered",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "title of login page is Home",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "Click on Employer-Agency Signin link",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Employer enters valid credentials \"\u003cUsername\u003e\",\"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Go to Workbench",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Add job",
  "rows": [
    {
      "cells": [
        "title",
        "agytitle",
        "designation",
        "industry",
        "jobrole",
        "location",
        "budget",
        "minexp",
        "maxexp",
        "minsal",
        "maxsal",
        "totalinterviews",
        "organization",
        "functionalArea"
      ],
      "line": 27
    },
    {
      "cells": [
        "Jcwf 1",
        "Jcwfagy 1",
        "developer",
        "IT software",
        "java developer",
        "pune",
        "400000",
        "1",
        "2",
        "400000",
        "500000",
        "4",
        "talentxpert",
        "java"
      ],
      "line": 28
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "Select a added job",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "Click on add candidate",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "Enter All details of \"\u003cCandidateEmail\u003e\",\"\u003cName\u003e\",\"\u003cContactNumber\u003e\",\"\u003cprofiletitle\u003e\",\"\u003cDesignation\u003e\",\"\u003cDate\u003e\",\"\u003cGender\u003e\",\"\u003cOnNoticePeriod\u003e\",\"\u003cNoticePeriod\u003e\",\"\u003cLastWorkingDay\u003e\",\"\u003cexperience\u003e\",\"\u003cCTC\u003e\",\"\u003cexpectedCTC\u003e\",\"\u003cCountry\u003e\",\"\u003cCity\u003e\",\"\u003cCityArea\u003e\",\"\u003cZipCode\u003e\",\"\u003cCommunicationmode\u003e\",\"\u003cSalaryoffered\u003e\",\"\u003cdistance\u003e\",\"\u003cpermanentAddress\u003e\",\"\u003crelocate\u003e\",\"\u003cSkill1\u003e\",\"\u003cSkill2\u003e\",\"\u003cSkill3\u003e\",\"\u003clevel1\u003e\",\"\u003clevel2\u003e\",\"\u003clevel3\u003e\",\"\u003cWeightage1\u003e\",\"\u003cWeightage2\u003e\",\"\u003cWeightage3\u003e\",\"\u003ccertificate1\u003e\",\"\u003ccertificate2\u003e\",\"\u003ccertificate3\u003e\",\"\u003cremark1\u003e\",\"\u003cremark2\u003e\",\"\u003cremark3\u003e\",\"\u003ccertificateforskill1\u003e\"and\"\u003ccertificateforskill2\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "observe candidate is getting added in New column",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "Click on Edit Candidate icon on candidate card \"\u003cName\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "Make the changes in \"\u003ccontactnumber1\u003e\" field",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "Click on save button to save the update details",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "click on Delete Candidate icon on Candidate card \"\u003cName\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "Verify candidate is displayed on workbench after deleting",
  "keyword": "And "
});
formatter.examples({
  "line": 40,
  "name": "",
  "description": "",
  "id": "hirexpert-job-candidate-workflow-feature;verify-the-functionality-of-add,-edit-\u0026-delete-candidate-with-employer-login;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password",
        "CandidateEmail",
        "Name",
        "ContactNumber",
        "Designation",
        "Date",
        "Gender",
        "OnNoticePeriod",
        "NoticePeriod",
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
        "OrganizationName",
        "contactnumber1"
      ],
      "line": 41,
      "id": "hirexpert-job-candidate-workflow-feature;verify-the-functionality-of-add,-edit-\u0026-delete-candidate-with-employer-login;;1"
    },
    {
      "cells": [
        "pemp@gmail.com",
        "12345",
        "candidate14@gmail.com",
        "Can14",
        "9125671966",
        "Software Tester",
        "04/08/1999",
        "Male",
        "No",
        "30",
        "2.5",
        "450000",
        "600000",
        "India",
        "Pune",
        "Viman Nagar",
        "411014",
        "SMS",
        "700000",
        "4",
        "No",
        "No",
        "EmpOrg",
        "123456789"
      ],
      "line": 42,
      "id": "hirexpert-job-candidate-workflow-feature;verify-the-functionality-of-add,-edit-\u0026-delete-candidate-with-employer-login;;2"
    },
    {
      "cells": [
        "pagy@gmail.com",
        "12345",
        "candidate14@gmail.com",
        "Can14",
        "9125671966",
        "Software Tester",
        "04/08/1999",
        "Male",
        "No",
        "30",
        "2.5",
        "450000",
        "600000",
        "India",
        "Pune",
        "Viman Nagar",
        "411014",
        "SMS",
        "700000",
        "4",
        "No",
        "No",
        "EmpOrg",
        "123456789"
      ],
      "line": 43,
      "id": "hirexpert-job-candidate-workflow-feature;verify-the-functionality-of-add,-edit-\u0026-delete-candidate-with-employer-login;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 937300,
  "status": "passed"
});
formatter.before({
  "duration": 740100,
  "status": "passed"
});
formatter.scenario({
  "line": 42,
  "name": "Verify the functionality of Add, Edit \u0026 Delete Candidate with Employer login",
  "description": "",
  "id": "hirexpert-job-candidate-workflow-feature;verify-the-functionality-of-add,-edit-\u0026-delete-candidate-with-employer-login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 18,
      "name": "@JCWF"
    },
    {
      "line": 18,
      "name": "@BVT"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "User must be registered",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "title of login page is Home",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "Click on Employer-Agency Signin link",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Employer enters valid credentials \"pemp@gmail.com\",\"12345\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Go to Workbench",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Add job",
  "rows": [
    {
      "cells": [
        "title",
        "agytitle",
        "designation",
        "industry",
        "jobrole",
        "location",
        "budget",
        "minexp",
        "maxexp",
        "minsal",
        "maxsal",
        "totalinterviews",
        "organization",
        "functionalArea"
      ],
      "line": 27
    },
    {
      "cells": [
        "Jcwf 1",
        "Jcwfagy 1",
        "developer",
        "IT software",
        "java developer",
        "pune",
        "400000",
        "1",
        "2",
        "400000",
        "500000",
        "4",
        "talentxpert",
        "java"
      ],
      "line": 28
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "Select a added job",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "Click on add candidate",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "Enter All details of \"candidate14@gmail.com\",\"Can14\",\"9125671966\",\"\u003cprofiletitle\u003e\",\"Software Tester\",\"04/08/1999\",\"Male\",\"No\",\"30\",\"\u003cLastWorkingDay\u003e\",\"2.5\",\"450000\",\"600000\",\"India\",\"Pune\",\"Viman Nagar\",\"411014\",\"SMS\",\"700000\",\"4\",\"No\",\"No\",\"\u003cSkill1\u003e\",\"\u003cSkill2\u003e\",\"\u003cSkill3\u003e\",\"\u003clevel1\u003e\",\"\u003clevel2\u003e\",\"\u003clevel3\u003e\",\"\u003cWeightage1\u003e\",\"\u003cWeightage2\u003e\",\"\u003cWeightage3\u003e\",\"\u003ccertificate1\u003e\",\"\u003ccertificate2\u003e\",\"\u003ccertificate3\u003e\",\"\u003cremark1\u003e\",\"\u003cremark2\u003e\",\"\u003cremark3\u003e\",\"\u003ccertificateforskill1\u003e\"and\"\u003ccertificateforskill2\u003e\"",
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
    21
  ],
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "observe candidate is getting added in New column",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "Click on Edit Candidate icon on candidate card \"Can14\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "Make the changes in \"123456789\" field",
  "matchedColumns": [
    23
  ],
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "Click on save button to save the update details",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "click on Delete Candidate icon on Candidate card \"Can14\"",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "Verify candidate is displayed on workbench after deleting",
  "keyword": "And "
});
formatter.match({
  "location": "loginstepdefination.user_must_be_registered()"
});
formatter.result({
  "duration": 8779762200,
  "status": "passed"
});
formatter.match({
  "location": "loginstepdefination.title_of_login_page_is_Home()"
});
formatter.result({
  "duration": 6442400,
  "status": "passed"
});
formatter.match({
  "location": "loginstepdefination.click_on_Employer_Agency_Signin_link()"
});
formatter.result({
  "duration": 3271619100,
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
  "location": "taskBWT.employer_enters_valid_credentials(String,String)"
});
formatter.result({
  "duration": 8248458900,
  "status": "passed"
});
formatter.match({
  "location": "JobCandidateWorkflowBVTStepDefination.go_to_Workbench()"
});
formatter.result({
  "duration": 2249216300,
  "status": "passed"
});
formatter.match({
  "location": "taskBWT.add_job(DataTable)"
});
formatter.result({
  "duration": 23347699100,
  "status": "passed"
});
formatter.match({
  "location": "MarketplaceBvt.select_a_added_job()"
});
formatter.result({
  "duration": 4213185100,
  "status": "passed"
});
formatter.match({
  "location": "MarketplaceBvt.click_on_add_candidate()"
});
formatter.result({
  "duration": 3118585700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "candidate14@gmail.com",
      "offset": 22
    },
    {
      "val": "Can14",
      "offset": 46
    },
    {
      "val": "9125671966",
      "offset": 54
    },
    {
      "val": "\u003cprofiletitle\u003e",
      "offset": 67
    },
    {
      "val": "Software Tester",
      "offset": 84
    },
    {
      "val": "04/08/1999",
      "offset": 102
    },
    {
      "val": "Male",
      "offset": 115
    },
    {
      "val": "No",
      "offset": 122
    },
    {
      "val": "30",
      "offset": 127
    },
    {
      "val": "\u003cLastWorkingDay\u003e",
      "offset": 132
    },
    {
      "val": "2.5",
      "offset": 151
    },
    {
      "val": "450000",
      "offset": 157
    },
    {
      "val": "600000",
      "offset": 166
    },
    {
      "val": "India",
      "offset": 175
    },
    {
      "val": "Pune",
      "offset": 183
    },
    {
      "val": "Viman Nagar",
      "offset": 190
    },
    {
      "val": "411014",
      "offset": 204
    },
    {
      "val": "SMS",
      "offset": 213
    },
    {
      "val": "700000",
      "offset": 219
    },
    {
      "val": "4",
      "offset": 228
    },
    {
      "val": "No",
      "offset": 232
    },
    {
      "val": "No",
      "offset": 237
    },
    {
      "val": "\u003cSkill1\u003e",
      "offset": 242
    },
    {
      "val": "\u003cSkill2\u003e",
      "offset": 253
    },
    {
      "val": "\u003cSkill3\u003e",
      "offset": 264
    },
    {
      "val": "\u003clevel1\u003e",
      "offset": 275
    },
    {
      "val": "\u003clevel2\u003e",
      "offset": 286
    },
    {
      "val": "\u003clevel3\u003e",
      "offset": 297
    },
    {
      "val": "\u003cWeightage1\u003e",
      "offset": 308
    },
    {
      "val": "\u003cWeightage2\u003e",
      "offset": 323
    },
    {
      "val": "\u003cWeightage3\u003e",
      "offset": 338
    },
    {
      "val": "\u003ccertificate1\u003e",
      "offset": 353
    },
    {
      "val": "\u003ccertificate2\u003e",
      "offset": 370
    },
    {
      "val": "\u003ccertificate3\u003e",
      "offset": 387
    },
    {
      "val": "\u003cremark1\u003e",
      "offset": 404
    },
    {
      "val": "\u003cremark2\u003e",
      "offset": 416
    },
    {
      "val": "\u003cremark3\u003e",
      "offset": 428
    },
    {
      "val": "\u003ccertificateforskill1\u003e",
      "offset": 440
    },
    {
      "val": "\u003ccertificateforskill2\u003e",
      "offset": 467
    }
  ],
  "location": "cvStrorestepDefination.enter_All_details_of_and(String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 99424535500,
  "status": "passed"
});
formatter.match({
  "location": "InterviewManagementBVTStepDefination.observe_candidate_is_getting_added_in_New_column()"
});
formatter.result({
  "duration": 272900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Can14",
      "offset": 48
    }
  ],
  "location": "JobCandidateWorkflowBVTStepDefination.click_on_Edit_Candidate_icon_on_candidate_card(String)"
});
formatter.result({
  "duration": 3174072500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123456789",
      "offset": 21
    }
  ],
  "location": "JobCandidateWorkflowBVTStepDefination.make_the_changes_in_field(String)"
});
formatter.result({
  "duration": 6206095200,
  "status": "passed"
});
formatter.match({
  "location": "JobCandidateWorkflowBVTStepDefination.click_on_save_button_to_save_the_update_details()"
});
formatter.result({
  "duration": 3098779100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Can14",
      "offset": 50
    }
  ],
  "location": "JobCandidateWorkflowBVTStepDefination.click_on_Delete_Candidate_icon_on_Candidate_card(String)"
});
formatter.result({
  "duration": 12204172300,
  "status": "passed"
});
formatter.match({
  "location": "JobCandidateWorkflowBVTStepDefination.verify_candidate_is_displayed_on_workbench_after_deleting()"
});
formatter.result({
  "duration": 43076838200,
  "status": "passed"
});
formatter.before({
  "duration": 226800,
  "status": "passed"
});
formatter.before({
  "duration": 199800,
  "status": "passed"
});
formatter.scenario({
  "line": 43,
  "name": "Verify the functionality of Add, Edit \u0026 Delete Candidate with Employer login",
  "description": "",
  "id": "hirexpert-job-candidate-workflow-feature;verify-the-functionality-of-add,-edit-\u0026-delete-candidate-with-employer-login;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 18,
      "name": "@JCWF"
    },
    {
      "line": 18,
      "name": "@BVT"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "User must be registered",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "title of login page is Home",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "Click on Employer-Agency Signin link",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Employer enters valid credentials \"pagy@gmail.com\",\"12345\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Go to Workbench",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Add job",
  "rows": [
    {
      "cells": [
        "title",
        "agytitle",
        "designation",
        "industry",
        "jobrole",
        "location",
        "budget",
        "minexp",
        "maxexp",
        "minsal",
        "maxsal",
        "totalinterviews",
        "organization",
        "functionalArea"
      ],
      "line": 27
    },
    {
      "cells": [
        "Jcwf 1",
        "Jcwfagy 1",
        "developer",
        "IT software",
        "java developer",
        "pune",
        "400000",
        "1",
        "2",
        "400000",
        "500000",
        "4",
        "talentxpert",
        "java"
      ],
      "line": 28
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "Select a added job",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "Click on add candidate",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "Enter All details of \"candidate14@gmail.com\",\"Can14\",\"9125671966\",\"\u003cprofiletitle\u003e\",\"Software Tester\",\"04/08/1999\",\"Male\",\"No\",\"30\",\"\u003cLastWorkingDay\u003e\",\"2.5\",\"450000\",\"600000\",\"India\",\"Pune\",\"Viman Nagar\",\"411014\",\"SMS\",\"700000\",\"4\",\"No\",\"No\",\"\u003cSkill1\u003e\",\"\u003cSkill2\u003e\",\"\u003cSkill3\u003e\",\"\u003clevel1\u003e\",\"\u003clevel2\u003e\",\"\u003clevel3\u003e\",\"\u003cWeightage1\u003e\",\"\u003cWeightage2\u003e\",\"\u003cWeightage3\u003e\",\"\u003ccertificate1\u003e\",\"\u003ccertificate2\u003e\",\"\u003ccertificate3\u003e\",\"\u003cremark1\u003e\",\"\u003cremark2\u003e\",\"\u003cremark3\u003e\",\"\u003ccertificateforskill1\u003e\"and\"\u003ccertificateforskill2\u003e\"",
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
    21
  ],
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "observe candidate is getting added in New column",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "Click on Edit Candidate icon on candidate card \"Can14\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "Make the changes in \"123456789\" field",
  "matchedColumns": [
    23
  ],
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "Click on save button to save the update details",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "click on Delete Candidate icon on Candidate card \"Can14\"",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "Verify candidate is displayed on workbench after deleting",
  "keyword": "And "
});
formatter.match({
  "location": "loginstepdefination.user_must_be_registered()"
});
formatter.result({
  "duration": 7708068900,
  "status": "passed"
});
formatter.match({
  "location": "loginstepdefination.title_of_login_page_is_Home()"
});
formatter.result({
  "duration": 5035000,
  "status": "passed"
});
formatter.match({
  "location": "loginstepdefination.click_on_Employer_Agency_Signin_link()"
});
formatter.result({
  "duration": 3290995200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pagy@gmail.com",
      "offset": 35
    },
    {
      "val": "12345",
      "offset": 52
    }
  ],
  "location": "taskBWT.employer_enters_valid_credentials(String,String)"
});
formatter.result({
  "duration": 47838933800,
  "status": "passed"
});
formatter.match({
  "location": "JobCandidateWorkflowBVTStepDefination.go_to_Workbench()"
});
formatter.result({
  "duration": 2274944300,
  "status": "passed"
});
formatter.match({
  "location": "taskBWT.add_job(DataTable)"
});
formatter.result({
  "duration": 63294503700,
  "status": "passed"
});
formatter.match({
  "location": "MarketplaceBvt.select_a_added_job()"
});
formatter.result({
  "duration": 4212679100,
  "status": "passed"
});
formatter.match({
  "location": "MarketplaceBvt.click_on_add_candidate()"
});
formatter.result({
  "duration": 3114119900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "candidate14@gmail.com",
      "offset": 22
    },
    {
      "val": "Can14",
      "offset": 46
    },
    {
      "val": "9125671966",
      "offset": 54
    },
    {
      "val": "\u003cprofiletitle\u003e",
      "offset": 67
    },
    {
      "val": "Software Tester",
      "offset": 84
    },
    {
      "val": "04/08/1999",
      "offset": 102
    },
    {
      "val": "Male",
      "offset": 115
    },
    {
      "val": "No",
      "offset": 122
    },
    {
      "val": "30",
      "offset": 127
    },
    {
      "val": "\u003cLastWorkingDay\u003e",
      "offset": 132
    },
    {
      "val": "2.5",
      "offset": 151
    },
    {
      "val": "450000",
      "offset": 157
    },
    {
      "val": "600000",
      "offset": 166
    },
    {
      "val": "India",
      "offset": 175
    },
    {
      "val": "Pune",
      "offset": 183
    },
    {
      "val": "Viman Nagar",
      "offset": 190
    },
    {
      "val": "411014",
      "offset": 204
    },
    {
      "val": "SMS",
      "offset": 213
    },
    {
      "val": "700000",
      "offset": 219
    },
    {
      "val": "4",
      "offset": 228
    },
    {
      "val": "No",
      "offset": 232
    },
    {
      "val": "No",
      "offset": 237
    },
    {
      "val": "\u003cSkill1\u003e",
      "offset": 242
    },
    {
      "val": "\u003cSkill2\u003e",
      "offset": 253
    },
    {
      "val": "\u003cSkill3\u003e",
      "offset": 264
    },
    {
      "val": "\u003clevel1\u003e",
      "offset": 275
    },
    {
      "val": "\u003clevel2\u003e",
      "offset": 286
    },
    {
      "val": "\u003clevel3\u003e",
      "offset": 297
    },
    {
      "val": "\u003cWeightage1\u003e",
      "offset": 308
    },
    {
      "val": "\u003cWeightage2\u003e",
      "offset": 323
    },
    {
      "val": "\u003cWeightage3\u003e",
      "offset": 338
    },
    {
      "val": "\u003ccertificate1\u003e",
      "offset": 353
    },
    {
      "val": "\u003ccertificate2\u003e",
      "offset": 370
    },
    {
      "val": "\u003ccertificate3\u003e",
      "offset": 387
    },
    {
      "val": "\u003cremark1\u003e",
      "offset": 404
    },
    {
      "val": "\u003cremark2\u003e",
      "offset": 416
    },
    {
      "val": "\u003cremark3\u003e",
      "offset": 428
    },
    {
      "val": "\u003ccertificateforskill1\u003e",
      "offset": 440
    },
    {
      "val": "\u003ccertificateforskill2\u003e",
      "offset": 467
    }
  ],
  "location": "cvStrorestepDefination.enter_All_details_of_and(String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 99381092900,
  "status": "passed"
});
formatter.match({
  "location": "InterviewManagementBVTStepDefination.observe_candidate_is_getting_added_in_New_column()"
});
formatter.result({
  "duration": 552400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Can14",
      "offset": 48
    }
  ],
  "location": "JobCandidateWorkflowBVTStepDefination.click_on_Edit_Candidate_icon_on_candidate_card(String)"
});
formatter.result({
  "duration": 3144941000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123456789",
      "offset": 21
    }
  ],
  "location": "JobCandidateWorkflowBVTStepDefination.make_the_changes_in_field(String)"
});
formatter.result({
  "duration": 6198850000,
  "status": "passed"
});
formatter.match({
  "location": "JobCandidateWorkflowBVTStepDefination.click_on_save_button_to_save_the_update_details()"
});
formatter.result({
  "duration": 3080940300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Can14",
      "offset": 50
    }
  ],
  "location": "JobCandidateWorkflowBVTStepDefination.click_on_Delete_Candidate_icon_on_Candidate_card(String)"
});
formatter.result({
  "duration": 12214526700,
  "status": "passed"
});
formatter.match({
  "location": "JobCandidateWorkflowBVTStepDefination.verify_candidate_is_displayed_on_workbench_after_deleting()"
});
formatter.result({
  "duration": 43093608800,
  "status": "passed"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 46,
      "value": "# TC ID 55, 28, 233 [Job Candidate Workflow BVT TC]"
    },
    {
      "line": 48,
      "value": "# If DB clear, register the employer first \u003d employermain01@gmail.com and agency \u003d agencymain01@gmail.com ."
    },
    {
      "line": 49,
      "value": "#otherwise no change required"
    }
  ],
  "line": 53,
  "name": "Verify the functionality of Add Questionary, Edit question on questionary page and delete Questionary by Delete Questionnaire button and Delete icon.",
  "description": "",
  "id": "hirexpert-job-candidate-workflow-feature;verify-the-functionality-of-add-questionary,-edit-question-on-questionary-page-and-delete-questionary-by-delete-questionnaire-button-and-delete-icon.",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 52,
      "name": "@BVT"
    },
    {
      "line": 52,
      "name": "@JCWF"
    },
    {
      "line": 52,
      "name": "@Questionary"
    }
  ]
});
formatter.step({
  "line": 55,
  "name": "User must be registered",
  "keyword": "Given "
});
formatter.step({
  "line": 57,
  "name": "title of login page is Home",
  "keyword": "When "
});
formatter.step({
  "line": 58,
  "name": "Click on Employer-Agency Signin link",
  "keyword": "And "
});
formatter.step({
  "line": 59,
  "name": "Employer enters valid credentials \"\u003cUsername\u003e\",\"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 60,
  "name": "Go to Workbench",
  "keyword": "And "
});
formatter.step({
  "line": 61,
  "name": "Add job",
  "rows": [
    {
      "cells": [
        "title",
        "agytitle",
        "designation",
        "industry",
        "jobrole",
        "location",
        "budget",
        "minexp",
        "maxexp",
        "minsal",
        "maxsal",
        "totalinterviews",
        "organization",
        "functionalArea"
      ],
      "line": 62
    },
    {
      "cells": [
        "Jcwf Questionary",
        "Jcwfagy Questionary",
        "developer",
        "IT software",
        "java developer",
        "pune",
        "400000",
        "1",
        "2",
        "400000",
        "500000",
        "4",
        "talentxpert",
        "java"
      ],
      "line": 63
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 64,
  "name": "Select a added job",
  "keyword": "And "
});
formatter.step({
  "line": 65,
  "name": "Click on add candidate",
  "keyword": "And "
});
formatter.step({
  "line": 66,
  "name": "Enter All details of \"\u003cCandidateEmail\u003e\",\"\u003cName\u003e\",\"\u003cContactNumber\u003e\",\"\u003cprofiletitle\u003e\",\"\u003cDesignation\u003e\",\"\u003cDate\u003e\",\"\u003cGender\u003e\",\"\u003cOnNoticePeriod\u003e\",\"\u003cNoticePeriod\u003e\",\"\u003cLastWorkingDay\u003e\",\"\u003cexperience\u003e\",\"\u003cCTC\u003e\",\"\u003cexpectedCTC\u003e\",\"\u003cCountry\u003e\",\"\u003cCity\u003e\",\"\u003cCityArea\u003e\",\"\u003cZipCode\u003e\",\"\u003cCommunicationmode\u003e\",\"\u003cSalaryoffered\u003e\",\"\u003cdistance\u003e\",\"\u003cpermanentAddress\u003e\",\"\u003crelocate\u003e\",\"\u003cSkill1\u003e\",\"\u003cSkill2\u003e\",\"\u003cSkill3\u003e\",\"\u003clevel1\u003e\",\"\u003clevel2\u003e\",\"\u003clevel3\u003e\",\"\u003cWeightage1\u003e\",\"\u003cWeightage2\u003e\",\"\u003cWeightage3\u003e\",\"\u003ccertificate1\u003e\",\"\u003ccertificate2\u003e\",\"\u003ccertificate3\u003e\",\"\u003cremark1\u003e\",\"\u003cremark2\u003e\",\"\u003cremark3\u003e\",\"\u003ccertificateforskill1\u003e\"and\"\u003ccertificateforskill2\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 67,
  "name": "observe candidate is getting added in New column",
  "keyword": "And "
});
formatter.step({
  "line": 68,
  "name": "Verify Collect Answer icon when no questionary is added for that job",
  "keyword": "And "
});
formatter.step({
  "line": 69,
  "name": "Click on Questionnaire tab",
  "keyword": "And "
});
formatter.step({
  "line": 70,
  "name": "Enter first question \"\u003cQUESTION1\u003e\" and marks \"\u003cQMARKS1\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 71,
  "name": "Enter the answer \"\u003cANSWER1\u003e\" \"\u003cANSWER2\u003e\"  and enter Marks \"\u003cMARKS1\u003e\" \"\u003cMARKS2\u003e\" for first question",
  "keyword": "And "
});
formatter.step({
  "line": 72,
  "name": "click on Save Changes button",
  "keyword": "And "
});
formatter.step({
  "line": 73,
  "name": "Enter second question \"\u003cQUESTION2\u003e\" and marks \"\u003cQMARKS2\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 74,
  "name": "Enter the answer \"\u003cANSWER3\u003e\" \"\u003cANSWER4\u003e\"  and enter Marks \"\u003cMARKS3\u003e\" \"\u003cMARKS4\u003e\" for second question",
  "keyword": "And "
});
formatter.step({
  "line": 75,
  "name": "click on Save Changes button",
  "keyword": "And "
});
formatter.step({
  "line": 76,
  "name": "Enter thrid question \"\u003cQUESTION3\u003e\" and marks \"\u003cQMARKS3\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 77,
  "name": "Enter the answer \"\u003cANSWER5\u003e\" \"\u003cANSWER6\u003e\" and enter Marks \"\u003cMARKS5\u003e\" \"\u003cMARKS6\u003e\"  for thrid question",
  "keyword": "And "
});
formatter.step({
  "line": 78,
  "name": "click on Save Changes button",
  "keyword": "And "
});
formatter.step({
  "line": 79,
  "name": "Enter the cutoff \u0026 rejection percentage \"\u003ccuttoffpercentage\u003e\" \"\u003crejectionpercentage\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 80,
  "name": "click on submit",
  "keyword": "And "
});
formatter.step({
  "line": 81,
  "name": "Click on Questionnaire tab",
  "keyword": "And "
});
formatter.step({
  "line": 82,
  "name": "Click on edit button of question to edit the following question \"\u003cquestion\u003e\" and save the changes by clicking on Save Changes button",
  "keyword": "And "
});
formatter.step({
  "line": 83,
  "name": "click on submit",
  "keyword": "And "
});
formatter.step({
  "line": 84,
  "name": "Click on Questionnaire tab",
  "keyword": "And "
});
formatter.step({
  "line": 85,
  "name": "Click on edit button of question to edit the following question \"\u003cquestion\u003e\" and save the changes by clicking on Save Changes button",
  "keyword": "And "
});
formatter.step({
  "line": 86,
  "name": "click on submit",
  "keyword": "And "
});
formatter.step({
  "line": 87,
  "name": "Collect Answer icon should reflect on candidates card for giving answers",
  "keyword": "Then "
});
formatter.step({
  "line": 88,
  "name": "Click on Questionnaire tab",
  "keyword": "And "
});
formatter.step({
  "line": 89,
  "name": "click on delete icon to delete any one of question",
  "keyword": "And "
});
formatter.step({
  "line": 90,
  "name": "click on submit",
  "keyword": "And "
});
formatter.step({
  "line": 91,
  "name": "Collect Answer icon should reflect on candidates card for giving answers",
  "keyword": "Then "
});
formatter.step({
  "line": 92,
  "name": "Click on Questionnaire tab",
  "keyword": "And "
});
formatter.step({
  "line": 93,
  "name": "Click on Delete Questionnarie button",
  "keyword": "And "
});
formatter.step({
  "line": 94,
  "name": "click on ReloadCandidate button",
  "keyword": "And "
});
formatter.step({
  "line": 95,
  "name": "Collect Answer icon should not reflect on candidates card for giving answers",
  "keyword": "Then "
});
formatter.step({
  "line": 96,
  "name": "click on close button",
  "keyword": "And "
});
formatter.examples({
  "line": 98,
  "name": "",
  "description": "",
  "id": "hirexpert-job-candidate-workflow-feature;verify-the-functionality-of-add-questionary,-edit-question-on-questionary-page-and-delete-questionary-by-delete-questionnaire-button-and-delete-icon.;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password",
        "CandidateEmail",
        "Name",
        "ContactNumber",
        "Designation",
        "Date",
        "Gender",
        "OnNoticePeriod",
        "NoticePeriod",
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
        "OrganizationName",
        "contactnumber1",
        "QUESTION1",
        "QMARKS1",
        "ANSWER1",
        "ANSWER2",
        "MARKS1",
        "MARKS2",
        "QUESTION2",
        "QMARKS2",
        "ANSWER3",
        "ANSWER4",
        "MARKS3",
        "MARKS4",
        "QUESTION3",
        "QMARKS3",
        "ANSWER5",
        "ANSWER6",
        "MARKS5",
        "MARKS6",
        "cuttoffpercentage",
        "rejectionpercentage",
        "question",
        "OrganizationName"
      ],
      "line": 99,
      "id": "hirexpert-job-candidate-workflow-feature;verify-the-functionality-of-add-questionary,-edit-question-on-questionary-page-and-delete-questionary-by-delete-questionnaire-button-and-delete-icon.;;1"
    },
    {
      "cells": [
        "pemp@gmail.com",
        "12345",
        "hirecan15@gmail.com",
        "hirecan14",
        "9125671966",
        "Software Tester",
        "04/08/1999",
        "Male",
        "No",
        "30",
        "2.5",
        "450000",
        "600000",
        "India",
        "Pune",
        "Viman Nagar",
        "411014",
        "SMS",
        "700000",
        "4",
        "No",
        "No",
        "EmpOrg",
        "123456789",
        "NP Negotiable",
        "50",
        "Yes",
        "No",
        "30",
        "20",
        "Can Relocate?",
        "50",
        "Yes",
        "No",
        "50",
        "0",
        "Work Exp",
        "100",
        "Fresher",
        "Experienced",
        "50",
        "50",
        "80",
        "20",
        "NP Negotiable",
        "EmpOrg"
      ],
      "line": 100,
      "id": "hirexpert-job-candidate-workflow-feature;verify-the-functionality-of-add-questionary,-edit-question-on-questionary-page-and-delete-questionary-by-delete-questionnaire-button-and-delete-icon.;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 312400,
  "status": "passed"
});
formatter.before({
  "duration": 238300,
  "status": "passed"
});
formatter.scenario({
  "line": 100,
  "name": "Verify the functionality of Add Questionary, Edit question on questionary page and delete Questionary by Delete Questionnaire button and Delete icon.",
  "description": "",
  "id": "hirexpert-job-candidate-workflow-feature;verify-the-functionality-of-add-questionary,-edit-question-on-questionary-page-and-delete-questionary-by-delete-questionnaire-button-and-delete-icon.;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 52,
      "name": "@JCWF"
    },
    {
      "line": 52,
      "name": "@BVT"
    },
    {
      "line": 52,
      "name": "@Questionary"
    }
  ]
});
formatter.step({
  "line": 55,
  "name": "User must be registered",
  "keyword": "Given "
});
formatter.step({
  "line": 57,
  "name": "title of login page is Home",
  "keyword": "When "
});
formatter.step({
  "line": 58,
  "name": "Click on Employer-Agency Signin link",
  "keyword": "And "
});
formatter.step({
  "line": 59,
  "name": "Employer enters valid credentials \"pemp@gmail.com\",\"12345\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 60,
  "name": "Go to Workbench",
  "keyword": "And "
});
formatter.step({
  "line": 61,
  "name": "Add job",
  "rows": [
    {
      "cells": [
        "title",
        "agytitle",
        "designation",
        "industry",
        "jobrole",
        "location",
        "budget",
        "minexp",
        "maxexp",
        "minsal",
        "maxsal",
        "totalinterviews",
        "organization",
        "functionalArea"
      ],
      "line": 62
    },
    {
      "cells": [
        "Jcwf Questionary",
        "Jcwfagy Questionary",
        "developer",
        "IT software",
        "java developer",
        "pune",
        "400000",
        "1",
        "2",
        "400000",
        "500000",
        "4",
        "talentxpert",
        "java"
      ],
      "line": 63
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 64,
  "name": "Select a added job",
  "keyword": "And "
});
formatter.step({
  "line": 65,
  "name": "Click on add candidate",
  "keyword": "And "
});
formatter.step({
  "line": 66,
  "name": "Enter All details of \"hirecan15@gmail.com\",\"hirecan14\",\"9125671966\",\"\u003cprofiletitle\u003e\",\"Software Tester\",\"04/08/1999\",\"Male\",\"No\",\"30\",\"\u003cLastWorkingDay\u003e\",\"2.5\",\"450000\",\"600000\",\"India\",\"Pune\",\"Viman Nagar\",\"411014\",\"SMS\",\"700000\",\"4\",\"No\",\"No\",\"\u003cSkill1\u003e\",\"\u003cSkill2\u003e\",\"\u003cSkill3\u003e\",\"\u003clevel1\u003e\",\"\u003clevel2\u003e\",\"\u003clevel3\u003e\",\"\u003cWeightage1\u003e\",\"\u003cWeightage2\u003e\",\"\u003cWeightage3\u003e\",\"\u003ccertificate1\u003e\",\"\u003ccertificate2\u003e\",\"\u003ccertificate3\u003e\",\"\u003cremark1\u003e\",\"\u003cremark2\u003e\",\"\u003cremark3\u003e\",\"\u003ccertificateforskill1\u003e\"and\"\u003ccertificateforskill2\u003e\"",
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
    21
  ],
  "keyword": "And "
});
formatter.step({
  "line": 67,
  "name": "observe candidate is getting added in New column",
  "keyword": "And "
});
formatter.step({
  "line": 68,
  "name": "Verify Collect Answer icon when no questionary is added for that job",
  "keyword": "And "
});
formatter.step({
  "line": 69,
  "name": "Click on Questionnaire tab",
  "keyword": "And "
});
formatter.step({
  "line": 70,
  "name": "Enter first question \"NP Negotiable\" and marks \"50\"",
  "matchedColumns": [
    24,
    25
  ],
  "keyword": "And "
});
formatter.step({
  "line": 71,
  "name": "Enter the answer \"Yes\" \"No\"  and enter Marks \"30\" \"20\" for first question",
  "matchedColumns": [
    26,
    27,
    28,
    29
  ],
  "keyword": "And "
});
formatter.step({
  "line": 72,
  "name": "click on Save Changes button",
  "keyword": "And "
});
formatter.step({
  "line": 73,
  "name": "Enter second question \"Can Relocate?\" and marks \"50\"",
  "matchedColumns": [
    30,
    31
  ],
  "keyword": "And "
});
formatter.step({
  "line": 74,
  "name": "Enter the answer \"Yes\" \"No\"  and enter Marks \"50\" \"0\" for second question",
  "matchedColumns": [
    32,
    33,
    34,
    35
  ],
  "keyword": "And "
});
formatter.step({
  "line": 75,
  "name": "click on Save Changes button",
  "keyword": "And "
});
formatter.step({
  "line": 76,
  "name": "Enter thrid question \"Work Exp\" and marks \"100\"",
  "matchedColumns": [
    36,
    37
  ],
  "keyword": "And "
});
formatter.step({
  "line": 77,
  "name": "Enter the answer \"Fresher\" \"Experienced\" and enter Marks \"50\" \"50\"  for thrid question",
  "matchedColumns": [
    38,
    39,
    40,
    41
  ],
  "keyword": "And "
});
formatter.step({
  "line": 78,
  "name": "click on Save Changes button",
  "keyword": "And "
});
formatter.step({
  "line": 79,
  "name": "Enter the cutoff \u0026 rejection percentage \"80\" \"20\"",
  "matchedColumns": [
    42,
    43
  ],
  "keyword": "And "
});
formatter.step({
  "line": 80,
  "name": "click on submit",
  "keyword": "And "
});
formatter.step({
  "line": 81,
  "name": "Click on Questionnaire tab",
  "keyword": "And "
});
formatter.step({
  "line": 82,
  "name": "Click on edit button of question to edit the following question \"NP Negotiable\" and save the changes by clicking on Save Changes button",
  "matchedColumns": [
    44
  ],
  "keyword": "And "
});
formatter.step({
  "line": 83,
  "name": "click on submit",
  "keyword": "And "
});
formatter.step({
  "line": 84,
  "name": "Click on Questionnaire tab",
  "keyword": "And "
});
formatter.step({
  "line": 85,
  "name": "Click on edit button of question to edit the following question \"NP Negotiable\" and save the changes by clicking on Save Changes button",
  "matchedColumns": [
    44
  ],
  "keyword": "And "
});
formatter.step({
  "line": 86,
  "name": "click on submit",
  "keyword": "And "
});
formatter.step({
  "line": 87,
  "name": "Collect Answer icon should reflect on candidates card for giving answers",
  "keyword": "Then "
});
formatter.step({
  "line": 88,
  "name": "Click on Questionnaire tab",
  "keyword": "And "
});
formatter.step({
  "line": 89,
  "name": "click on delete icon to delete any one of question",
  "keyword": "And "
});
formatter.step({
  "line": 90,
  "name": "click on submit",
  "keyword": "And "
});
formatter.step({
  "line": 91,
  "name": "Collect Answer icon should reflect on candidates card for giving answers",
  "keyword": "Then "
});
formatter.step({
  "line": 92,
  "name": "Click on Questionnaire tab",
  "keyword": "And "
});
formatter.step({
  "line": 93,
  "name": "Click on Delete Questionnarie button",
  "keyword": "And "
});
formatter.step({
  "line": 94,
  "name": "click on ReloadCandidate button",
  "keyword": "And "
});
formatter.step({
  "line": 95,
  "name": "Collect Answer icon should not reflect on candidates card for giving answers",
  "keyword": "Then "
});
formatter.step({
  "line": 96,
  "name": "click on close button",
  "keyword": "And "
});
formatter.match({
  "location": "loginstepdefination.user_must_be_registered()"
});
formatter.result({
  "duration": 7697221300,
  "status": "passed"
});
formatter.match({
  "location": "loginstepdefination.title_of_login_page_is_Home()"
});
formatter.result({
  "duration": 5050200,
  "status": "passed"
});
formatter.match({
  "location": "loginstepdefination.click_on_Employer_Agency_Signin_link()"
});
formatter.result({
  "duration": 3269042900,
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
  "location": "taskBWT.employer_enters_valid_credentials(String,String)"
});
formatter.result({
  "duration": 7876177700,
  "status": "passed"
});
formatter.match({
  "location": "JobCandidateWorkflowBVTStepDefination.go_to_Workbench()"
});
formatter.result({
  "duration": 2267931000,
  "status": "passed"
});
formatter.match({
  "location": "taskBWT.add_job(DataTable)"
});
formatter.result({
  "duration": 23191605700,
  "status": "passed"
});
formatter.match({
  "location": "MarketplaceBvt.select_a_added_job()"
});
formatter.result({
  "duration": 4198045400,
  "status": "passed"
});
formatter.match({
  "location": "MarketplaceBvt.click_on_add_candidate()"
});
formatter.result({
  "duration": 3092359700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "hirecan15@gmail.com",
      "offset": 22
    },
    {
      "val": "hirecan14",
      "offset": 44
    },
    {
      "val": "9125671966",
      "offset": 56
    },
    {
      "val": "\u003cprofiletitle\u003e",
      "offset": 69
    },
    {
      "val": "Software Tester",
      "offset": 86
    },
    {
      "val": "04/08/1999",
      "offset": 104
    },
    {
      "val": "Male",
      "offset": 117
    },
    {
      "val": "No",
      "offset": 124
    },
    {
      "val": "30",
      "offset": 129
    },
    {
      "val": "\u003cLastWorkingDay\u003e",
      "offset": 134
    },
    {
      "val": "2.5",
      "offset": 153
    },
    {
      "val": "450000",
      "offset": 159
    },
    {
      "val": "600000",
      "offset": 168
    },
    {
      "val": "India",
      "offset": 177
    },
    {
      "val": "Pune",
      "offset": 185
    },
    {
      "val": "Viman Nagar",
      "offset": 192
    },
    {
      "val": "411014",
      "offset": 206
    },
    {
      "val": "SMS",
      "offset": 215
    },
    {
      "val": "700000",
      "offset": 221
    },
    {
      "val": "4",
      "offset": 230
    },
    {
      "val": "No",
      "offset": 234
    },
    {
      "val": "No",
      "offset": 239
    },
    {
      "val": "\u003cSkill1\u003e",
      "offset": 244
    },
    {
      "val": "\u003cSkill2\u003e",
      "offset": 255
    },
    {
      "val": "\u003cSkill3\u003e",
      "offset": 266
    },
    {
      "val": "\u003clevel1\u003e",
      "offset": 277
    },
    {
      "val": "\u003clevel2\u003e",
      "offset": 288
    },
    {
      "val": "\u003clevel3\u003e",
      "offset": 299
    },
    {
      "val": "\u003cWeightage1\u003e",
      "offset": 310
    },
    {
      "val": "\u003cWeightage2\u003e",
      "offset": 325
    },
    {
      "val": "\u003cWeightage3\u003e",
      "offset": 340
    },
    {
      "val": "\u003ccertificate1\u003e",
      "offset": 355
    },
    {
      "val": "\u003ccertificate2\u003e",
      "offset": 372
    },
    {
      "val": "\u003ccertificate3\u003e",
      "offset": 389
    },
    {
      "val": "\u003cremark1\u003e",
      "offset": 406
    },
    {
      "val": "\u003cremark2\u003e",
      "offset": 418
    },
    {
      "val": "\u003cremark3\u003e",
      "offset": 430
    },
    {
      "val": "\u003ccertificateforskill1\u003e",
      "offset": 442
    },
    {
      "val": "\u003ccertificateforskill2\u003e",
      "offset": 469
    }
  ],
  "location": "cvStrorestepDefination.enter_All_details_of_and(String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 99337526600,
  "status": "passed"
});
formatter.match({
  "location": "InterviewManagementBVTStepDefination.observe_candidate_is_getting_added_in_New_column()"
});
formatter.result({
  "duration": 210400,
  "status": "passed"
});
formatter.match({
  "location": "JobCandidateWorkflowBVTStepDefination.verify_Collect_Answer_icon_when_no_questionary_is_added_for_that_job()"
});
formatter.result({
  "duration": 40060317900,
  "status": "passed"
});
formatter.match({
  "location": "JobCandidateWorkflowBVTStepDefination.click_on_Questionnaire_tab()"
});
formatter.result({
  "duration": 11444769400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "NP Negotiable",
      "offset": 22
    },
    {
      "val": "50",
      "offset": 48
    }
  ],
  "location": "JobCandidateWorkflowBVTStepDefination.enter_first_question_and_marks(String,String)"
});
formatter.result({
  "duration": 3203707000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Yes",
      "offset": 18
    },
    {
      "val": "No",
      "offset": 24
    },
    {
      "val": "30",
      "offset": 46
    },
    {
      "val": "20",
      "offset": 51
    }
  ],
  "location": "JobCandidateWorkflowBVTStepDefination.enter_the_answer_and_enter_Marks_for_first_question(String,String,String,String)"
});
formatter.result({
  "duration": 3320890000,
  "status": "passed"
});
formatter.match({
  "location": "JobCandidateWorkflowBVTStepDefination.click_on_Save_Changes_button()"
});
formatter.result({
  "duration": 3115100500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Can Relocate?",
      "offset": 23
    },
    {
      "val": "50",
      "offset": 49
    }
  ],
  "location": "JobCandidateWorkflowBVTStepDefination.enter_second_question_and_marks(String,String)"
});
formatter.result({
  "duration": 3210211800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Yes",
      "offset": 18
    },
    {
      "val": "No",
      "offset": 24
    },
    {
      "val": "50",
      "offset": 46
    },
    {
      "val": "0",
      "offset": 51
    }
  ],
  "location": "JobCandidateWorkflowBVTStepDefination.enter_the_answer_and_enter_Marks_for_second_question(String,String,String,String)"
});
formatter.result({
  "duration": 3284667400,
  "status": "passed"
});
formatter.match({
  "location": "JobCandidateWorkflowBVTStepDefination.click_on_Save_Changes_button()"
});
formatter.result({
  "duration": 3139053700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Work Exp",
      "offset": 22
    },
    {
      "val": "100",
      "offset": 43
    }
  ],
  "location": "JobCandidateWorkflowBVTStepDefination.enter_thrid_question_and_marks(String,String)"
});
formatter.result({
  "duration": 3206401500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Fresher",
      "offset": 18
    },
    {
      "val": "Experienced",
      "offset": 28
    },
    {
      "val": "50",
      "offset": 58
    },
    {
      "val": "50",
      "offset": 63
    }
  ],
  "location": "JobCandidateWorkflowBVTStepDefination.enter_the_answer_and_enter_Marks_for_thrid_question(String,String,String,String)"
});
formatter.result({
  "duration": 3367368000,
  "status": "passed"
});
formatter.match({
  "location": "JobCandidateWorkflowBVTStepDefination.click_on_Save_Changes_button()"
});
formatter.result({
  "duration": 3132404800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "80",
      "offset": 41
    },
    {
      "val": "20",
      "offset": 46
    }
  ],
  "location": "JobCandidateWorkflowBVTStepDefination.enter_the_cutoff_rejection_percentage(String,String)"
});
formatter.result({
  "duration": 6282336000,
  "status": "passed"
});
formatter.match({
  "location": "JobCandidateWorkflowBVTStepDefination.click_on_submit()"
});
formatter.result({
  "duration": 3095274000,
  "status": "passed"
});
formatter.match({
  "location": "JobCandidateWorkflowBVTStepDefination.click_on_Questionnaire_tab()"
});
formatter.result({
  "duration": 11342847000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "NP Negotiable",
      "offset": 65
    }
  ],
  "location": "JobCandidateWorkflowBVTStepDefination.click_on_edit_button_of_question_to_edit_the_following_question_and_save_the_changes_by_clicking_on_Save_Changes_button(String)"
});
formatter.result({
  "duration": 3283709400,
  "status": "passed"
});
formatter.match({
  "location": "JobCandidateWorkflowBVTStepDefination.click_on_submit()"
});
formatter.result({
  "duration": 3077437100,
  "status": "passed"
});
formatter.match({
  "location": "JobCandidateWorkflowBVTStepDefination.click_on_Questionnaire_tab()"
});
formatter.result({
  "duration": 11426322200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "NP Negotiable",
      "offset": 65
    }
  ],
  "location": "JobCandidateWorkflowBVTStepDefination.click_on_edit_button_of_question_to_edit_the_following_question_and_save_the_changes_by_clicking_on_Save_Changes_button(String)"
});
formatter.result({
  "duration": 3260425900,
  "status": "passed"
});
formatter.match({
  "location": "JobCandidateWorkflowBVTStepDefination.click_on_submit()"
});
formatter.result({
  "duration": 3118286100,
  "status": "passed"
});
formatter.match({
  "location": "JobCandidateWorkflowBVTStepDefination.collect_Answer_icon_should_reflect_on_candidates_card_for_giving_answers()"
});
formatter.result({
  "duration": 3067573900,
  "status": "passed"
});
formatter.match({
  "location": "JobCandidateWorkflowBVTStepDefination.click_on_Questionnaire_tab()"
});
formatter.result({
  "duration": 11382728100,
  "status": "passed"
});
formatter.match({
  "location": "JobCandidateWorkflowBVTStepDefination.click_on_delete_icon_to_delete_any_one_of_question()"
});
formatter.result({
  "duration": 3105796100,
  "status": "passed"
});
formatter.match({
  "location": "JobCandidateWorkflowBVTStepDefination.click_on_submit()"
});
formatter.result({
  "duration": 3080556500,
  "status": "passed"
});
formatter.match({
  "location": "JobCandidateWorkflowBVTStepDefination.collect_Answer_icon_should_reflect_on_candidates_card_for_giving_answers()"
});
formatter.result({
  "duration": 3062940600,
  "status": "passed"
});
formatter.match({
  "location": "JobCandidateWorkflowBVTStepDefination.click_on_Questionnaire_tab()"
});
formatter.result({
  "duration": 11414562100,
  "status": "passed"
});
formatter.match({
  "location": "JobCandidateWorkflowBVTStepDefination.click_on_Delete_Questionnarie_button()"
});
formatter.result({
  "duration": 7190464100,
  "status": "passed"
});
formatter.match({
  "location": "JobCandidateWorkflowBVTStepDefination.click_on_ReloadCandidate_button()"
});
formatter.result({
  "duration": 3105671600,
  "status": "passed"
});
formatter.match({
  "location": "JobCandidateWorkflowBVTStepDefination.collect_Answer_icon_should_not_reflect_on_candidates_card_for_giving_answers()"
});
formatter.result({
  "duration": 43075491000,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//button[@title\u003d\u0027Collect Answer\u0027]\"}\n  (Session info: chrome\u003d86.0.4240.198)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-6IM5GGG\u0027, ip: \u0027192.168.0.103\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002712.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 86.0.4240.198, chrome: {chromedriverVersion: 85.0.4183.87 (cd6713ebf92fa..., userDataDir: C:\\Users\\TLP33\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:53663}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 19fe7d40f1bd19c3d3279b81845f229e\n*** Element info: {Using\u003dxpath, value\u003d//button[@title\u003d\u0027Collect Answer\u0027]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat BVT_StepDefination.JobCandidateWorkflowBVTStepDefination.collect_Answer_icon_should_not_reflect_on_candidates_card_for_giving_answers(JobCandidateWorkflowBVTStepDefination.java:259)\r\n\tat ✽.Then Collect Answer icon should not reflect on candidates card for giving answers(JobCandidateWorkflow.feature:95)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "JobCandidateWorkflowBVTStepDefination.click_on_close_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 102,
      "value": "#TC :- 120, 122, 138, 234 [Job Candidate Workflow BVT TC]"
    },
    {
      "line": 103,
      "value": "#TC :- 136 [Job Candidate Workflow Regression TC]"
    },
    {
      "line": 105,
      "value": "# If DB clear, register the employer first \u003d employermain01@gmail.com. otherwise no change required"
    }
  ],
  "line": 109,
  "name": "Verify the functionality of Screening tab",
  "description": "",
  "id": "hirexpert-job-candidate-workflow-feature;verify-the-functionality-of-screening-tab",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 108,
      "name": "@BVT"
    },
    {
      "line": 108,
      "name": "@JCWF"
    }
  ]
});
formatter.step({
  "line": 111,
  "name": "User must be registered",
  "keyword": "Given "
});
formatter.step({
  "line": 113,
  "name": "title of login page is Home",
  "keyword": "When "
});
formatter.step({
  "line": 114,
  "name": "Click on Employer-Agency Signin link",
  "keyword": "And "
});
formatter.step({
  "line": 115,
  "name": "Employer enters valid credentials \"\u003cUsername\u003e\",\"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 116,
  "name": "Go to Workbench",
  "keyword": "And "
});
formatter.step({
  "line": 117,
  "name": "Add job",
  "rows": [
    {
      "cells": [
        "title",
        "agytitle",
        "designation",
        "industry",
        "jobrole",
        "location",
        "budget",
        "minexp",
        "maxexp",
        "minsal",
        "maxsal",
        "totalinterviews",
        "organization",
        "functionalArea"
      ],
      "line": 118
    },
    {
      "cells": [
        "Jcwf Screening",
        "Jcwfagy Screening 3",
        "developer",
        "IT software",
        "java developer",
        "pune",
        "400000",
        "1",
        "2",
        "400000",
        "500000",
        "4",
        "talentxpert",
        "java"
      ],
      "line": 119
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 120,
  "name": "Select a added job",
  "keyword": "And "
});
formatter.step({
  "line": 121,
  "name": "Click on add candidate",
  "keyword": "And "
});
formatter.step({
  "line": 122,
  "name": "Enter All details of \"\u003cCandidateEmail\u003e\",\"\u003cName\u003e\",\"\u003cContactNumber\u003e\",\"\u003cprofiletitle\u003e\",\"\u003cDesignation\u003e\",\"\u003cDate\u003e\",\"\u003cGender\u003e\",\"\u003cOnNoticePeriod\u003e\",\"\u003cNoticePeriod\u003e\",\"\u003cLastWorkingDay\u003e\",\"\u003cexperience\u003e\",\"\u003cCTC\u003e\",\"\u003cexpectedCTC\u003e\",\"\u003cCountry\u003e\",\"\u003cCity\u003e\",\"\u003cCityArea\u003e\",\"\u003cZipCode\u003e\",\"\u003cCommunicationmode\u003e\",\"\u003cSalaryoffered\u003e\",\"\u003cdistance\u003e\",\"\u003cpermanentAddress\u003e\",\"\u003crelocate\u003e\",\"\u003cSkill1\u003e\",\"\u003cSkill2\u003e\",\"\u003cSkill3\u003e\",\"\u003clevel1\u003e\",\"\u003clevel2\u003e\",\"\u003clevel3\u003e\",\"\u003cWeightage1\u003e\",\"\u003cWeightage2\u003e\",\"\u003cWeightage3\u003e\",\"\u003ccertificate1\u003e\",\"\u003ccertificate2\u003e\",\"\u003ccertificate3\u003e\",\"\u003cremark1\u003e\",\"\u003cremark2\u003e\",\"\u003cremark3\u003e\",\"\u003ccertificateforskill1\u003e\"and\"\u003ccertificateforskill2\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 123,
  "name": "observe candidate is getting added in New column",
  "keyword": "And "
});
formatter.step({
  "line": 124,
  "name": "Click on Add Questionnaire",
  "keyword": "And "
});
formatter.step({
  "line": 125,
  "name": "Add question and click on save changes button \"\u003cQUESTION1\u003e\" \"\u003cQMARKS1\u003e\" \"\u003cANSWER1\u003e\" \"\u003cANSWER2\u003e\" \"\u003cMARKS1\u003e\" \"\u003cMARKS2\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 126,
  "name": "Enter the cutoff \u0026 rejection percentage \"\u003ccuttoffpercentage\u003e\" \"\u003crejectionpercentage\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 127,
  "name": "click on submit",
  "keyword": "And "
});
formatter.step({
  "line": 128,
  "name": "Click on  Collect Answers icon on candidate card.",
  "keyword": "And "
});
formatter.step({
  "line": 129,
  "name": "Fill all the Questions answers",
  "keyword": "And "
});
formatter.step({
  "line": 130,
  "name": "click on submit",
  "keyword": "And "
});
formatter.step({
  "line": 131,
  "name": "Click on screening tab",
  "keyword": "And "
});
formatter.step({
  "line": 132,
  "name": "verify the status of candidate",
  "keyword": "Then "
});
formatter.step({
  "line": 133,
  "name": "click on close button",
  "keyword": "And "
});
formatter.examples({
  "line": 136,
  "name": "",
  "description": "",
  "id": "hirexpert-job-candidate-workflow-feature;verify-the-functionality-of-screening-tab;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password",
        "CandidateEmail",
        "Name",
        "ContactNumber",
        "Designation",
        "Date",
        "Gender",
        "OnNoticePeriod",
        "NoticePeriod",
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
        "OrganizationName",
        "contactnumber1",
        "QUESTION1",
        "QMARKS1",
        "ANSWER1",
        "ANSWER2",
        "MARKS1",
        "MARKS2",
        "QUESTION2",
        "QMARKS2",
        "ANSWER3",
        "ANSWER4",
        "MARKS3",
        "MARKS4",
        "QUESTION3",
        "QMARKS3",
        "ANSWER5",
        "ANSWER6",
        "MARKS5",
        "MARKS6",
        "cuttoffpercentage",
        "rejectionpercentage",
        "question",
        "OrganizationName"
      ],
      "line": 137,
      "id": "hirexpert-job-candidate-workflow-feature;verify-the-functionality-of-screening-tab;;1"
    },
    {
      "cells": [
        "pemp@gmail.com",
        "12345",
        "candidate14@gmail.com",
        "Can14",
        "9125671966",
        "Software Tester",
        "04/08/1999",
        "Male",
        "No",
        "30",
        "2.5",
        "450000",
        "600000",
        "India",
        "Pune",
        "Viman Nagar",
        "411014",
        "SMS",
        "700000",
        "4",
        "No",
        "No",
        "EmpOrg",
        "123456789",
        "NP Negotiable",
        "50",
        "Yes",
        "No",
        "30",
        "20",
        "Can Relocate?",
        "50",
        "Yes",
        "No",
        "50",
        "0",
        "Work Exp",
        "100",
        "Fresher",
        "Experienced",
        "50",
        "50",
        "80",
        "20",
        "NP Negotiable",
        "EmpOrg"
      ],
      "line": 138,
      "id": "hirexpert-job-candidate-workflow-feature;verify-the-functionality-of-screening-tab;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 229100,
  "status": "passed"
});
formatter.before({
  "duration": 196200,
  "status": "passed"
});
formatter.scenario({
  "line": 138,
  "name": "Verify the functionality of Screening tab",
  "description": "",
  "id": "hirexpert-job-candidate-workflow-feature;verify-the-functionality-of-screening-tab;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 108,
      "name": "@JCWF"
    },
    {
      "line": 108,
      "name": "@BVT"
    }
  ]
});
formatter.step({
  "line": 111,
  "name": "User must be registered",
  "keyword": "Given "
});
formatter.step({
  "line": 113,
  "name": "title of login page is Home",
  "keyword": "When "
});
formatter.step({
  "line": 114,
  "name": "Click on Employer-Agency Signin link",
  "keyword": "And "
});
formatter.step({
  "line": 115,
  "name": "Employer enters valid credentials \"pemp@gmail.com\",\"12345\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 116,
  "name": "Go to Workbench",
  "keyword": "And "
});
formatter.step({
  "line": 117,
  "name": "Add job",
  "rows": [
    {
      "cells": [
        "title",
        "agytitle",
        "designation",
        "industry",
        "jobrole",
        "location",
        "budget",
        "minexp",
        "maxexp",
        "minsal",
        "maxsal",
        "totalinterviews",
        "organization",
        "functionalArea"
      ],
      "line": 118
    },
    {
      "cells": [
        "Jcwf Screening",
        "Jcwfagy Screening 3",
        "developer",
        "IT software",
        "java developer",
        "pune",
        "400000",
        "1",
        "2",
        "400000",
        "500000",
        "4",
        "talentxpert",
        "java"
      ],
      "line": 119
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 120,
  "name": "Select a added job",
  "keyword": "And "
});
formatter.step({
  "line": 121,
  "name": "Click on add candidate",
  "keyword": "And "
});
formatter.step({
  "line": 122,
  "name": "Enter All details of \"candidate14@gmail.com\",\"Can14\",\"9125671966\",\"\u003cprofiletitle\u003e\",\"Software Tester\",\"04/08/1999\",\"Male\",\"No\",\"30\",\"\u003cLastWorkingDay\u003e\",\"2.5\",\"450000\",\"600000\",\"India\",\"Pune\",\"Viman Nagar\",\"411014\",\"SMS\",\"700000\",\"4\",\"No\",\"No\",\"\u003cSkill1\u003e\",\"\u003cSkill2\u003e\",\"\u003cSkill3\u003e\",\"\u003clevel1\u003e\",\"\u003clevel2\u003e\",\"\u003clevel3\u003e\",\"\u003cWeightage1\u003e\",\"\u003cWeightage2\u003e\",\"\u003cWeightage3\u003e\",\"\u003ccertificate1\u003e\",\"\u003ccertificate2\u003e\",\"\u003ccertificate3\u003e\",\"\u003cremark1\u003e\",\"\u003cremark2\u003e\",\"\u003cremark3\u003e\",\"\u003ccertificateforskill1\u003e\"and\"\u003ccertificateforskill2\u003e\"",
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
    21
  ],
  "keyword": "And "
});
formatter.step({
  "line": 123,
  "name": "observe candidate is getting added in New column",
  "keyword": "And "
});
formatter.step({
  "line": 124,
  "name": "Click on Add Questionnaire",
  "keyword": "And "
});
formatter.step({
  "line": 125,
  "name": "Add question and click on save changes button \"NP Negotiable\" \"50\" \"Yes\" \"No\" \"30\" \"20\"",
  "matchedColumns": [
    24,
    25,
    26,
    27,
    28,
    29
  ],
  "keyword": "And "
});
formatter.step({
  "line": 126,
  "name": "Enter the cutoff \u0026 rejection percentage \"80\" \"20\"",
  "matchedColumns": [
    42,
    43
  ],
  "keyword": "And "
});
formatter.step({
  "line": 127,
  "name": "click on submit",
  "keyword": "And "
});
formatter.step({
  "line": 128,
  "name": "Click on  Collect Answers icon on candidate card.",
  "keyword": "And "
});
formatter.step({
  "line": 129,
  "name": "Fill all the Questions answers",
  "keyword": "And "
});
formatter.step({
  "line": 130,
  "name": "click on submit",
  "keyword": "And "
});
formatter.step({
  "line": 131,
  "name": "Click on screening tab",
  "keyword": "And "
});
formatter.step({
  "line": 132,
  "name": "verify the status of candidate",
  "keyword": "Then "
});
formatter.step({
  "line": 133,
  "name": "click on close button",
  "keyword": "And "
});
formatter.match({
  "location": "loginstepdefination.user_must_be_registered()"
});
formatter.result({
  "duration": 7985451500,
  "status": "passed"
});
formatter.match({
  "location": "loginstepdefination.title_of_login_page_is_Home()"
});
formatter.result({
  "duration": 8480100,
  "status": "passed"
});
formatter.match({
  "location": "loginstepdefination.click_on_Employer_Agency_Signin_link()"
});
formatter.result({
  "duration": 3278921700,
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
  "location": "taskBWT.employer_enters_valid_credentials(String,String)"
});
formatter.result({
  "duration": 11066040600,
  "status": "passed"
});
formatter.match({
  "location": "JobCandidateWorkflowBVTStepDefination.go_to_Workbench()"
});
formatter.result({
  "duration": 2363103400,
  "status": "passed"
});
formatter.match({
  "location": "taskBWT.add_job(DataTable)"
});
formatter.result({
  "duration": 23270936800,
  "status": "passed"
});
formatter.match({
  "location": "MarketplaceBvt.select_a_added_job()"
});
formatter.result({
  "duration": 4164187000,
  "status": "passed"
});
formatter.match({
  "location": "MarketplaceBvt.click_on_add_candidate()"
});
formatter.result({
  "duration": 3064635500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "candidate14@gmail.com",
      "offset": 22
    },
    {
      "val": "Can14",
      "offset": 46
    },
    {
      "val": "9125671966",
      "offset": 54
    },
    {
      "val": "\u003cprofiletitle\u003e",
      "offset": 67
    },
    {
      "val": "Software Tester",
      "offset": 84
    },
    {
      "val": "04/08/1999",
      "offset": 102
    },
    {
      "val": "Male",
      "offset": 115
    },
    {
      "val": "No",
      "offset": 122
    },
    {
      "val": "30",
      "offset": 127
    },
    {
      "val": "\u003cLastWorkingDay\u003e",
      "offset": 132
    },
    {
      "val": "2.5",
      "offset": 151
    },
    {
      "val": "450000",
      "offset": 157
    },
    {
      "val": "600000",
      "offset": 166
    },
    {
      "val": "India",
      "offset": 175
    },
    {
      "val": "Pune",
      "offset": 183
    },
    {
      "val": "Viman Nagar",
      "offset": 190
    },
    {
      "val": "411014",
      "offset": 204
    },
    {
      "val": "SMS",
      "offset": 213
    },
    {
      "val": "700000",
      "offset": 219
    },
    {
      "val": "4",
      "offset": 228
    },
    {
      "val": "No",
      "offset": 232
    },
    {
      "val": "No",
      "offset": 237
    },
    {
      "val": "\u003cSkill1\u003e",
      "offset": 242
    },
    {
      "val": "\u003cSkill2\u003e",
      "offset": 253
    },
    {
      "val": "\u003cSkill3\u003e",
      "offset": 264
    },
    {
      "val": "\u003clevel1\u003e",
      "offset": 275
    },
    {
      "val": "\u003clevel2\u003e",
      "offset": 286
    },
    {
      "val": "\u003clevel3\u003e",
      "offset": 297
    },
    {
      "val": "\u003cWeightage1\u003e",
      "offset": 308
    },
    {
      "val": "\u003cWeightage2\u003e",
      "offset": 323
    },
    {
      "val": "\u003cWeightage3\u003e",
      "offset": 338
    },
    {
      "val": "\u003ccertificate1\u003e",
      "offset": 353
    },
    {
      "val": "\u003ccertificate2\u003e",
      "offset": 370
    },
    {
      "val": "\u003ccertificate3\u003e",
      "offset": 387
    },
    {
      "val": "\u003cremark1\u003e",
      "offset": 404
    },
    {
      "val": "\u003cremark2\u003e",
      "offset": 416
    },
    {
      "val": "\u003cremark3\u003e",
      "offset": 428
    },
    {
      "val": "\u003ccertificateforskill1\u003e",
      "offset": 440
    },
    {
      "val": "\u003ccertificateforskill2\u003e",
      "offset": 467
    }
  ],
  "location": "cvStrorestepDefination.enter_All_details_of_and(String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 99254767900,
  "status": "passed"
});
formatter.match({
  "location": "InterviewManagementBVTStepDefination.observe_candidate_is_getting_added_in_New_column()"
});
formatter.result({
  "duration": 192900,
  "status": "passed"
});
formatter.match({
  "location": "JobCandidateWorkflowBVTStepDefination.click_on_Add_Questionnaire()"
});
