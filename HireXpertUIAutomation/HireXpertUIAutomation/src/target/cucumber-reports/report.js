$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("DataValidation.feature");
formatter.feature({
  "line": 1,
  "name": "Data validation",
  "description": "",
  "id": "data-validation",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 258,
      "value": "########Candidate data validation########"
    },
    {
      "line": 259,
      "value": "#below all scenarion of candidate data validation require same candidate email"
    }
  ],
  "line": 262,
  "name": "validate the candidate details when candidate login himself and add profile details",
  "description": "",
  "id": "data-validation;validate-the-candidate-details-when-candidate-login-himself-and-add-profile-details",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 261,
      "name": "@candidatedetails"
    }
  ]
});
formatter.step({
  "line": 264,
  "name": "User must be registered",
  "keyword": "Given "
});
formatter.step({
  "line": 265,
  "name": "title of login page is Home",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 266,
      "value": "#And Click register link"
    },
    {
      "line": 267,
      "value": "#And Enter all details on register page \"\u003cName\u003e\" \"\u003cCandidateEmail\u003e\" \"\u003cContactNumber\u003e\" \"\u003cUserType\u003e\" \"\u003ctimezone\u003e\" \"\u003ccountry\u003e\""
    }
  ],
  "line": 268,
  "name": "Click on Job Seeker(Candidate) Sign In link",
  "keyword": "And "
});
formatter.step({
  "line": 269,
  "name": "candidate enters valid credentials \"\u003cCandidateEmail\u003e\",\"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 270,
  "name": "click on update profile option",
  "keyword": "And "
});
formatter.step({
  "line": 271,
  "name": "Enter all the personal and professional details of candidate \"\u003cprofiletitle\u003e\" \"\u003cCandidateEmail\u003e\" \"\u003cContactNumber\u003e\" \"\u003cDate\u003e\" \"\u003ccountry\u003e\" \"\u003cCityArea\u003e\" \"\u003cName\u003e\" \"\u003calternateemail\u003e\" \"\u003calternateContact\u003e\" \"\u003cGender\u003e\" \"\u003cCity\u003e\" \"\u003cZipCode\u003e\" \"\u003ccurrentorganization\u003e\" \"\u003ccurrentdesignation\u003e\" \"\u003ccurrentduration\u003e\" \"\u003cjobtype\u003e\" \"\u003cshift\u003e\" \"\u003cpreferredcity\u003e\" \"\u003csearchkeyword\u003e\" \"\u003cindustry\u003e\" \"\u003cexperience\u003e\" \"\u003cexpectedCTC\u003e\" \"\u003cresidentialstatus\u003e\" \"\u003cOnNoticePeriod\u003e\" \"\u003cLastWorkingDay\u003e\" \"\u003cNoticePeriod\u003e\" \"\u003cCTC\u003e\" \"\u003cCommunicationmode\u003e\" \"\u003cwillingtotravel\u003e\" \"\u003clookingforjob\u003e\" \"\u003crelocate\u003e\" \"\u003ccv\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 272,
  "name": "Click on save button",
  "keyword": "And "
});
formatter.step({
  "line": 273,
  "name": "click ok on success popup",
  "keyword": "And "
});
formatter.step({
  "line": 274,
  "name": "click on qualification tab",
  "keyword": "And "
});
formatter.step({
  "line": 275,
  "name": "click on update profile option",
  "keyword": "And "
});
formatter.step({
  "line": 276,
  "name": "Assert the personal and professional details of candidate \"\u003cprofiletitle\u003e\" \"\u003cCandidateEmail\u003e\" \"\u003cContactNumber\u003e\" \"\u003cDate\u003e\" \"\u003ccountry\u003e\" \"\u003cCityArea\u003e\" \"\u003cName\u003e\" \"\u003calternateemail\u003e\" \"\u003calternateContact\u003e\" \"\u003cGender\u003e\" \"\u003cCity\u003e\" \"\u003cZipCode\u003e\" \"\u003ccurrentorganization\u003e\" \"\u003ccurrentdesignation\u003e\" \"\u003ccurrentduration\u003e\" \"\u003cjobtype\u003e\" \"\u003cshift\u003e\" \"\u003cpreferredcity\u003e\" \"\u003csearchkeyword\u003e\" \"\u003cindustry\u003e\" \"\u003cexperience\u003e\" \"\u003cexpectedCTC\u003e\" \"\u003cresidentialstatus\u003e\" \"\u003cOnNoticePeriod\u003e\" \"\u003cLastWorkingDay\u003e\" \"\u003cNoticePeriod\u003e\" \"\u003cCTC\u003e\" \"\u003cCommunicationmode\u003e\" \"\u003cwillingtotravel\u003e\" \"\u003clookingforjob\u003e\" \"\u003crelocate\u003e\" \"\u003ccv\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 277,
  "name": "click on qualification tab",
  "keyword": "And "
});
formatter.step({
  "line": 278,
  "name": "Fill all the qualification details",
  "rows": [
    {
      "cells": [
        "Major",
        "year",
        "grade",
        "college",
        "university",
        "country",
        "degree"
      ],
      "line": 279
    },
    {
      "cells": [
        "Research",
        "2021",
        "90",
        "CUJB",
        "cambridge",
        "USA",
        "Ph.D"
      ],
      "line": 280
    },
    {
      "cells": [
        "MBA",
        "2019",
        "95",
        "BD college",
        "Nagpur",
        "India",
        "Master"
      ],
      "line": 281
    },
    {
      "cells": [
        "BE",
        "2017",
        "85",
        "DMIETR college",
        "Nagpur",
        "India",
        "Bachelor"
      ],
      "line": 282
    },
    {
      "cells": [
        "Science",
        "2013",
        "79",
        "New English",
        "Nagpur",
        "India",
        "12"
      ],
      "line": 283
    },
    {
      "cells": [
        "CBSE",
        "2011",
        "80",
        "MVM",
        "Nagpur",
        "India",
        "10"
      ],
      "line": 284
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 285,
  "name": "Click on save button",
  "keyword": "And "
});
formatter.step({
  "line": 286,
  "name": "click ok on success popup",
  "keyword": "And "
});
formatter.step({
  "line": 287,
  "name": "Assert the qualification details",
  "rows": [
    {
      "cells": [
        "Major",
        "year",
        "grade",
        "college",
        "university",
        "country",
        "degree"
      ],
      "line": 288
    },
    {
      "cells": [
        "Research",
        "2021",
        "90",
        "CUJB",
        "cambridge",
        "USA",
        "Ph.D"
      ],
      "line": 289
    },
    {
      "cells": [
        "MBA",
        "2019",
        "95",
        "BD college",
        "Nagpur",
        "India",
        "Master"
      ],
      "line": 290
    },
    {
      "cells": [
        "BE",
        "2017",
        "85",
        "DMIETR college",
        "Nagpur",
        "India",
        "Bachelor"
      ],
      "line": 291
    },
    {
      "cells": [
        "Science",
        "2013",
        "79",
        "New English",
        "Nagpur",
        "India",
        "12"
      ],
      "line": 292
    },
    {
      "cells": [
        "CBSE",
        "2011",
        "80",
        "MVM",
        "Nagpur",
        "India",
        "10"
      ],
      "line": 293
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 294,
  "name": "Click on work experience tab",
  "keyword": "And "
});
formatter.step({
  "line": 295,
  "name": "fill all work experience details",
  "rows": [
    {
      "cells": [
        "organization",
        "fromMonth",
        "fromYear",
        "toMonth",
        "toYear",
        "designation",
        "city",
        "country"
      ],
      "line": 296
    },
    {
      "cells": [
        "wipro",
        "JAN",
        "2020",
        "NOV",
        "2020",
        "Software Engineer",
        "Nagpur",
        "India"
      ],
      "line": 297
    },
    {
      "cells": [
        "persistant",
        "FEB",
        "2019",
        "APR",
        "2019",
        "Software Engineer",
        "Nagpur",
        "India"
      ],
      "line": 298
    },
    {
      "cells": [
        "Dell",
        "MAR",
        "2018",
        "DEC",
        "2018",
        "Software Engineer",
        "Nagpur",
        "India"
      ],
      "line": 299
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 300,
  "name": "Click on save button",
  "keyword": "And "
});
formatter.step({
  "line": 301,
  "name": "click ok on success popup",
  "keyword": "And "
});
formatter.step({
  "line": 302,
  "name": "Assert work experience details",
  "rows": [
    {
      "cells": [
        "organization",
        "fromMonth",
        "fromYear",
        "toMonth",
        "toYear",
        "designation",
        "city",
        "country"
      ],
      "line": 303
    },
    {
      "cells": [
        "wipro",
        "JAN",
        "2020",
        "NOV",
        "2020",
        "Software Engineer",
        "Nagpur",
        "India"
      ],
      "line": 304
    },
    {
      "cells": [
        "persistant",
        "FEB",
        "2019",
        "APR",
        "2019",
        "Software Engineer",
        "Nagpur",
        "India"
      ],
      "line": 305
    },
    {
      "cells": [
        "Dell",
        "MAR",
        "2018",
        "DEC",
        "2018",
        "Software Engineer",
        "Nagpur",
        "India"
      ],
      "line": 306
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 307,
  "name": "Click on skills and designation",
  "keyword": "And "
});
formatter.step({
  "line": 308,
  "name": "fill all skills and designation details \"sr.Test Engineer\"",
  "rows": [
    {
      "cells": [
        "skill",
        "Expertiselevel",
        "certificate",
        "designation"
      ],
      "line": 309
    },
    {
      "cells": [
        "JAVA",
        "Basic Knowledge",
        "sun microsoft",
        "sr.Test Engineer"
      ],
      "line": 310
    },
    {
      "cells": [
        "advanced java",
        "Intermediate",
        "ad. java",
        "Java Developer"
      ],
      "line": 311
    },
    {
      "cells": [
        "JavaScript",
        "Expert",
        "javaScript",
        "Tester"
      ],
      "line": 312
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 313,
  "name": "save the changes",
  "keyword": "And "
});
formatter.step({
  "line": 314,
  "name": "Assert skills and designation \"sr.Test Engineer\"",
  "rows": [
    {
      "cells": [
        "skill",
        "Expertiselevel",
        "certificate",
        "designation"
      ],
      "line": 315
    },
    {
      "cells": [
        "JAVA",
        "Basic Knowledge",
        "sun microsoft",
        "sr.Test Engineer"
      ],
      "line": 316
    },
    {
      "cells": [
        "advanced java",
        "Intermediate",
        "ad. java",
        "Java Developer"
      ],
      "line": 317
    },
    {
      "cells": [
        "JavaScript",
        "Expert",
        "javaScript",
        "Tester"
      ],
      "line": 318
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 319,
  "name": "Click on certificate tab",
  "keyword": "And "
});
formatter.step({
  "line": 320,
  "name": "fill all certificate details",
  "rows": [
    {
      "cells": [
        "certificate",
        "year",
        "grade",
        "issuing Authority",
        "country"
      ],
      "line": 321
    },
    {
      "cells": [
        "best performance",
        "2020",
        "90",
        "Wipro pvt ltd",
        "India"
      ],
      "line": 322
    },
    {
      "cells": [
        "cudos",
        "2019",
        "75",
        "Dell pvt ltd",
        "India"
      ],
      "line": 323
    },
    {
      "cells": [
        "Employee of month",
        "2018",
        "86",
        "Dell pvt ltd",
        "India"
      ],
      "line": 324
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 325,
  "name": "Click on save button",
  "keyword": "And "
});
formatter.step({
  "line": 326,
  "name": "click ok on success popup",
  "keyword": "And "
});
formatter.step({
  "line": 327,
  "name": "Assert the certificate details",
  "rows": [
    {
      "cells": [
        "certificate",
        "year",
        "grade",
        "issuing Authority",
        "country"
      ],
      "line": 328
    },
    {
      "cells": [
        "best performance",
        "2020",
        "90",
        "Wipro pvt ltd",
        "India"
      ],
      "line": 329
    },
    {
      "cells": [
        "cudos",
        "2019",
        "75",
        "Dell pvt ltd",
        "India"
      ],
      "line": 330
    },
    {
      "cells": [
        "Employee of month",
        "2018",
        "86",
        "Dell pvt ltd",
        "India"
      ],
      "line": 331
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 332,
  "name": "Click on languages tab",
  "keyword": "And "
});
formatter.step({
  "line": 333,
  "name": "Fill all language details",
  "rows": [
    {
      "cells": [
        "language",
        "proficiency",
        "certificate"
      ],
      "line": 334
    },
    {
      "cells": [
        "English",
        "Professional working proficiency",
        "Certificate of merit"
      ],
      "line": 335
    },
    {
      "cells": [
        "French",
        "Limited working proficiency",
        "Certificate of merit"
      ],
      "line": 336
    },
    {
      "cells": [
        "spanish",
        "Elementary proficiency",
        "Certificate of persuing"
      ],
      "line": 337
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 338,
  "name": "Click on save button",
  "keyword": "And "
});
formatter.step({
  "line": 339,
  "name": "click ok on success popup",
  "keyword": "And "
});
formatter.step({
  "line": 340,
  "name": "Assert the languages details",
  "rows": [
    {
      "cells": [
        "language",
        "proficiency",
        "certificate"
      ],
      "line": 341
    },
    {
      "cells": [
        "English",
        "Professional working proficiency",
        "Certificate of merit"
      ],
      "line": 342
    },
    {
      "cells": [
        "French",
        "Limited working proficiency",
        "Certificate of merit"
      ],
      "line": 343
    },
    {
      "cells": [
        "Spanish",
        "Elementary proficiency",
        "Certificate of persuing"
      ],
      "line": 344
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 345,
  "name": "Click on Visa Tab",
  "keyword": "And "
});
formatter.step({
  "line": 346,
  "name": "Fill All the deatils of visa",
  "rows": [
    {
      "cells": [
        "country",
        "VisaType",
        "ValidUpto"
      ],
      "line": 347
    },
    {
      "cells": [
        "USA",
        "Work Visa",
        "28-Oct-2030"
      ],
      "line": 348
    },
    {
      "cells": [
        "Singapore",
        "Student Visa",
        "30-Apr-2025"
      ],
      "line": 349
    },
    {
      "cells": [
        "Australia",
        "Tourist Visa",
        "1-Jan-2023"
      ],
      "line": 350
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 351,
  "name": "Click on save button",
  "keyword": "And "
});
formatter.step({
  "line": 352,
  "name": "click ok on success popup",
  "keyword": "And "
});
formatter.step({
  "line": 353,
  "name": "Assert the visa details",
  "rows": [
    {
      "cells": [
        "country",
        "VisaType",
        "ValidUpto"
      ],
      "line": 354
    },
    {
      "cells": [
        "USA",
        "Work Visa",
        "28-Oct-2030"
      ],
      "line": 355
    },
    {
      "cells": [
        "Singapore",
        "Student Visa",
        "30-Apr-2025"
      ],
      "line": 356
    },
    {
      "cells": [
        "Australia",
        "Tourist Visa",
        "1-Jan-2023"
      ],
      "line": 357
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 358,
  "name": "Click on Experience details tab",
  "keyword": "And "
});
formatter.step({
  "line": 359,
  "name": "Fill all experience details",
  "rows": [
    {
      "cells": [
        "title",
        "organization",
        "fromDate",
        "toDate",
        "technologies",
        "client"
      ],
      "line": 360
    },
    {
      "cells": [
        "paypal",
        "talentxpert",
        "20-Jan-2020",
        "21-Sep-2020",
        "Java selenium",
        "Alexu"
      ],
      "line": 361
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 362,
  "name": "Click on save button",
  "keyword": "And "
});
formatter.step({
  "line": 363,
  "name": "click ok on success popup",
  "keyword": "And "
});
formatter.step({
  "line": 364,
  "name": "Asert the experirnce deatils",
  "rows": [
    {
      "cells": [
        "title",
        "organization",
        "fromDate",
        "toDate",
        "technologies",
        "client"
      ],
      "line": 365
    },
    {
      "cells": [
        "paypal",
        "talentxpert",
        "20-Jan-2020",
        "21-Sep-2020",
        "Java selenium",
        "Alexu"
      ],
      "line": 366
    }
  ],
  "keyword": "Then "
});
formatter.examples({
  "line": 370,
  "name": "",
  "description": "",
  "id": "data-validation;validate-the-candidate-details-when-candidate-login-himself-and-add-profile-details;",
  "rows": [
    {
      "cells": [
        "Username",
        "Teamid",
        "Password",
        "CandidateEmail",
        "profiletitle",
        "Name",
        "alternateemail",
        "ContactNumber",
        "alternateContact",
        "UserType",
        "timezone",
        "country",
        "currentorganization",
        "currentdesignation",
        "currentduration",
        "jobtype",
        "shift",
        "preferredcity",
        "Date",
        "Gender",
        "OnNoticePeriod",
        "LastWorkingDay",
        "NoticePeriod",
        "searchkeyword",
        "industry",
        "experience",
        "CTC",
        "expectedCTC",
        "City",
        "CityArea",
        "ZipCode",
        "Communicationmode",
        "residentialstatus",
        "willingtotravel",
        "lookingforjob",
        "relocate",
        "cv"
      ],
      "line": 371,
      "id": "data-validation;validate-the-candidate-details-when-candidate-login-himself-and-add-profile-details;;1"
    },
    {
      "cells": [
        "pemp@gmail.com",
        "pe1@gmail.com",
        "12345",
        "hirecan42@gmail.com",
        "Sr.software engineer",
        "hirecan42",
        "hirecan42@yahoo.com",
        "78996685538",
        "9846355555",
        "Candidate",
        "Indian Standard Time",
        "India",
        "Accenture",
        "Sr.developer",
        "2",
        "Contractual Full Time",
        "Evening Shift",
        "Pune",
        "14/09/2020",
        "Female",
        "Yes",
        "25/12/2020",
        "25",
        "can13",
        "IT software",
        "1.7",
        "700000",
        "800000",
        "Nagpur",
        "sita bardi",
        "248966",
        "Call",
        "Citizen",
        "Yes",
        "No",
        "No",
        "C:\\Users\\TLP33\\Documents\\CV.docx"
      ],
      "line": 372,
      "id": "data-validation;validate-the-candidate-details-when-candidate-login-himself-and-add-profile-details;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 372,
  "name": "validate the candidate details when candidate login himself and add profile details",
  "description": "",
  "id": "data-validation;validate-the-candidate-details-when-candidate-login-himself-and-add-profile-details;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 261,
      "name": "@candidatedetails"
    }
  ]
});
formatter.step({
  "line": 264,
  "name": "User must be registered",
  "keyword": "Given "
});
formatter.step({
  "line": 265,
  "name": "title of login page is Home",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 266,
      "value": "#And Click register link"
    },
    {
      "line": 267,
      "value": "#And Enter all details on register page \"\u003cName\u003e\" \"\u003cCandidateEmail\u003e\" \"\u003cContactNumber\u003e\" \"\u003cUserType\u003e\" \"\u003ctimezone\u003e\" \"\u003ccountry\u003e\""
    }
  ],
  "line": 268,
  "name": "Click on Job Seeker(Candidate) Sign In link",
  "keyword": "And "
});
formatter.step({
  "line": 269,
  "name": "candidate enters valid credentials \"hirecan42@gmail.com\",\"12345\"",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 270,
  "name": "click on update profile option",
  "keyword": "And "
});
formatter.step({
  "line": 271,
  "name": "Enter all the personal and professional details of candidate \"Sr.software engineer\" \"hirecan42@gmail.com\" \"78996685538\" \"14/09/2020\" \"India\" \"sita bardi\" \"hirecan42\" \"hirecan42@yahoo.com\" \"9846355555\" \"Female\" \"Nagpur\" \"248966\" \"Accenture\" \"Sr.developer\" \"2\" \"Contractual Full Time\" \"Evening Shift\" \"Pune\" \"can13\" \"IT software\" \"1.7\" \"800000\" \"Citizen\" \"Yes\" \"25/12/2020\" \"25\" \"700000\" \"Call\" \"Yes\" \"No\" \"No\" \"C:\\Users\\TLP33\\Documents\\CV.docx\"",
  "matchedColumns": [
    3,
    4,
    5,
    6,
    7,
    8,
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
    36
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 272,
  "name": "Click on save button",
  "keyword": "And "
});
formatter.step({
  "line": 273,
  "name": "click ok on success popup",
  "keyword": "And "
});
formatter.step({
  "line": 274,
  "name": "click on qualification tab",
  "keyword": "And "
});
formatter.step({
  "line": 275,
  "name": "click on update profile option",
  "keyword": "And "
});
formatter.step({
  "line": 276,
  "name": "Assert the personal and professional details of candidate \"Sr.software engineer\" \"hirecan42@gmail.com\" \"78996685538\" \"14/09/2020\" \"India\" \"sita bardi\" \"hirecan42\" \"hirecan42@yahoo.com\" \"9846355555\" \"Female\" \"Nagpur\" \"248966\" \"Accenture\" \"Sr.developer\" \"2\" \"Contractual Full Time\" \"Evening Shift\" \"Pune\" \"can13\" \"IT software\" \"1.7\" \"800000\" \"Citizen\" \"Yes\" \"25/12/2020\" \"25\" \"700000\" \"Call\" \"Yes\" \"No\" \"No\" \"C:\\Users\\TLP33\\Documents\\CV.docx\"",
  "matchedColumns": [
    3,
    4,
    5,
    6,
    7,
    8,
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
    36
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 277,
  "name": "click on qualification tab",
  "keyword": "And "
});
formatter.step({
  "line": 278,
  "name": "Fill all the qualification details",
  "rows": [
    {
      "cells": [
        "Major",
        "year",
        "grade",
        "college",
        "university",
        "country",
        "degree"
      ],
      "line": 279
    },
    {
      "cells": [
        "Research",
        "2021",
        "90",
        "CUJB",
        "cambridge",
        "USA",
        "Ph.D"
      ],
      "line": 280
    },
    {
      "cells": [
        "MBA",
        "2019",
        "95",
        "BD college",
        "Nagpur",
        "India",
        "Master"
      ],
      "line": 281
    },
    {
      "cells": [
        "BE",
        "2017",
        "85",
        "DMIETR college",
        "Nagpur",
        "India",
        "Bachelor"
      ],
      "line": 282
    },
    {
      "cells": [
        "Science",
        "2013",
        "79",
        "New English",
        "Nagpur",
        "India",
        "12"
      ],
      "line": 283
    },
    {
      "cells": [
        "CBSE",
        "2011",
        "80",
        "MVM",
        "Nagpur",
        "India",
        "10"
      ],
      "line": 284
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 285,
  "name": "Click on save button",
  "keyword": "And "
});
formatter.step({
  "line": 286,
  "name": "click ok on success popup",
  "keyword": "And "
});
formatter.step({
  "line": 287,
  "name": "Assert the qualification details",
  "rows": [
    {
      "cells": [
        "Major",
        "year",
        "grade",
        "college",
        "university",
        "country",
        "degree"
      ],
      "line": 288
    },
    {
      "cells": [
        "Research",
        "2021",
        "90",
        "CUJB",
        "cambridge",
        "USA",
        "Ph.D"
      ],
      "line": 289
    },
    {
      "cells": [
        "MBA",
        "2019",
        "95",
        "BD college",
        "Nagpur",
        "India",
        "Master"
      ],
      "line": 290
    },
    {
      "cells": [
        "BE",
        "2017",
        "85",
        "DMIETR college",
        "Nagpur",
        "India",
        "Bachelor"
      ],
      "line": 291
    },
    {
      "cells": [
        "Science",
        "2013",
        "79",
        "New English",
        "Nagpur",
        "India",
        "12"
      ],
      "line": 292
    },
    {
      "cells": [
        "CBSE",
        "2011",
        "80",
        "MVM",
        "Nagpur",
        "India",
        "10"
      ],
      "line": 293
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 294,
  "name": "Click on work experience tab",
  "keyword": "And "
});
formatter.step({
  "line": 295,
  "name": "fill all work experience details",
  "rows": [
    {
      "cells": [
        "organization",
        "fromMonth",
        "fromYear",
        "toMonth",
        "toYear",
        "designation",
        "city",
        "country"
      ],
      "line": 296
    },
    {
      "cells": [
        "wipro",
        "JAN",
        "2020",
        "NOV",
        "2020",
        "Software Engineer",
        "Nagpur",
        "India"
      ],
      "line": 297
    },
    {
      "cells": [
        "persistant",
        "FEB",
        "2019",
        "APR",
        "2019",
        "Software Engineer",
        "Nagpur",
        "India"
      ],
      "line": 298
    },
    {
      "cells": [
        "Dell",
        "MAR",
        "2018",
        "DEC",
        "2018",
        "Software Engineer",
        "Nagpur",
        "India"
      ],
      "line": 299
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 300,
  "name": "Click on save button",
  "keyword": "And "
});
formatter.step({
  "line": 301,
  "name": "click ok on success popup",
  "keyword": "And "
});
formatter.step({
  "line": 302,
  "name": "Assert work experience details",
  "rows": [
    {
      "cells": [
        "organization",
        "fromMonth",
        "fromYear",
        "toMonth",
        "toYear",
        "designation",
        "city",
        "country"
      ],
      "line": 303
    },
    {
      "cells": [
        "wipro",
        "JAN",
        "2020",
        "NOV",
        "2020",
        "Software Engineer",
        "Nagpur",
        "India"
      ],
      "line": 304
    },
    {
      "cells": [
        "persistant",
        "FEB",
        "2019",
        "APR",
        "2019",
        "Software Engineer",
        "Nagpur",
        "India"
      ],
      "line": 305
    },
    {
      "cells": [
        "Dell",
        "MAR",
        "2018",
        "DEC",
        "2018",
        "Software Engineer",
        "Nagpur",
        "India"
      ],
      "line": 306
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 307,
  "name": "Click on skills and designation",
  "keyword": "And "
});
formatter.step({
  "line": 308,
  "name": "fill all skills and designation details \"sr.Test Engineer\"",
  "rows": [
    {
      "cells": [
        "skill",
        "Expertiselevel",
        "certificate",
        "designation"
      ],
      "line": 309
    },
    {
      "cells": [
        "JAVA",
        "Basic Knowledge",
        "sun microsoft",
        "sr.Test Engineer"
      ],
      "line": 310
    },
    {
      "cells": [
        "advanced java",
        "Intermediate",
        "ad. java",
        "Java Developer"
      ],
      "line": 311
    },
    {
      "cells": [
        "JavaScript",
        "Expert",
        "javaScript",
        "Tester"
      ],
      "line": 312
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 313,
  "name": "save the changes",
  "keyword": "And "
});
formatter.step({
  "line": 314,
  "name": "Assert skills and designation \"sr.Test Engineer\"",
  "rows": [
    {
      "cells": [
        "skill",
        "Expertiselevel",
        "certificate",
        "designation"
      ],
      "line": 315
    },
    {
      "cells": [
        "JAVA",
        "Basic Knowledge",
        "sun microsoft",
        "sr.Test Engineer"
      ],
      "line": 316
    },
    {
      "cells": [
        "advanced java",
        "Intermediate",
        "ad. java",
        "Java Developer"
      ],
      "line": 317
    },
    {
      "cells": [
        "JavaScript",
        "Expert",
        "javaScript",
        "Tester"
      ],
      "line": 318
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 319,
  "name": "Click on certificate tab",
  "keyword": "And "
});
formatter.step({
  "line": 320,
  "name": "fill all certificate details",
  "rows": [
    {
      "cells": [
        "certificate",
        "year",
        "grade",
        "issuing Authority",
        "country"
      ],
      "line": 321
    },
    {
      "cells": [
        "best performance",
        "2020",
        "90",
        "Wipro pvt ltd",
        "India"
      ],
      "line": 322
    },
    {
      "cells": [
        "cudos",
        "2019",
        "75",
        "Dell pvt ltd",
        "India"
      ],
      "line": 323
    },
    {
      "cells": [
        "Employee of month",
        "2018",
        "86",
        "Dell pvt ltd",
        "India"
      ],
      "line": 324
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 325,
  "name": "Click on save button",
  "keyword": "And "
});
formatter.step({
  "line": 326,
  "name": "click ok on success popup",
  "keyword": "And "
});
formatter.step({
  "line": 327,
  "name": "Assert the certificate details",
  "rows": [
    {
      "cells": [
        "certificate",
        "year",
        "grade",
        "issuing Authority",
        "country"
      ],
      "line": 328
    },
    {
      "cells": [
        "best performance",
        "2020",
        "90",
        "Wipro pvt ltd",
        "India"
      ],
      "line": 329
    },
    {
      "cells": [
        "cudos",
        "2019",
        "75",
        "Dell pvt ltd",
        "India"
      ],
      "line": 330
    },
    {
      "cells": [
        "Employee of month",
        "2018",
        "86",
        "Dell pvt ltd",
        "India"
      ],
      "line": 331
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 332,
  "name": "Click on languages tab",
  "keyword": "And "
});
formatter.step({
  "line": 333,
  "name": "Fill all language details",
  "rows": [
    {
      "cells": [
        "language",
        "proficiency",
        "certificate"
      ],
      "line": 334
    },
    {
      "cells": [
        "English",
        "Professional working proficiency",
        "Certificate of merit"
      ],
      "line": 335
    },
    {
      "cells": [
        "French",
        "Limited working proficiency",
        "Certificate of merit"
      ],
      "line": 336
    },
    {
      "cells": [
        "spanish",
        "Elementary proficiency",
        "Certificate of persuing"
      ],
      "line": 337
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 338,
  "name": "Click on save button",
  "keyword": "And "
});
formatter.step({
  "line": 339,
  "name": "click ok on success popup",
  "keyword": "And "
});
formatter.step({
  "line": 340,
  "name": "Assert the languages details",
  "rows": [
    {
      "cells": [
        "language",
        "proficiency",
        "certificate"
      ],
      "line": 341
    },
    {
      "cells": [
        "English",
        "Professional working proficiency",
        "Certificate of merit"
      ],
      "line": 342
    },
    {
      "cells": [
        "French",
        "Limited working proficiency",
        "Certificate of merit"
      ],
      "line": 343
    },
    {
      "cells": [
        "Spanish",
        "Elementary proficiency",
        "Certificate of persuing"
      ],
      "line": 344
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 345,
  "name": "Click on Visa Tab",
  "keyword": "And "
});
formatter.step({
  "line": 346,
  "name": "Fill All the deatils of visa",
  "rows": [
    {
      "cells": [
        "country",
        "VisaType",
        "ValidUpto"
      ],
      "line": 347
    },
    {
      "cells": [
        "USA",
        "Work Visa",
        "28-Oct-2030"
      ],
      "line": 348
    },
    {
      "cells": [
        "Singapore",
        "Student Visa",
        "30-Apr-2025"
      ],
      "line": 349
    },
    {
      "cells": [
        "Australia",
        "Tourist Visa",
        "1-Jan-2023"
      ],
      "line": 350
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 351,
  "name": "Click on save button",
  "keyword": "And "
});
formatter.step({
  "line": 352,
  "name": "click ok on success popup",
  "keyword": "And "
});
formatter.step({
  "line": 353,
  "name": "Assert the visa details",
  "rows": [
    {
      "cells": [
        "country",
        "VisaType",
        "ValidUpto"
      ],
      "line": 354
    },
    {
      "cells": [
        "USA",
        "Work Visa",
        "28-Oct-2030"
      ],
      "line": 355
    },
    {
      "cells": [
        "Singapore",
        "Student Visa",
        "30-Apr-2025"
      ],
      "line": 356
    },
    {
      "cells": [
        "Australia",
        "Tourist Visa",
        "1-Jan-2023"
      ],
      "line": 357
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 358,
  "name": "Click on Experience details tab",
  "keyword": "And "
});
formatter.step({
  "line": 359,
  "name": "Fill all experience details",
  "rows": [
    {
      "cells": [
        "title",
        "organization",
        "fromDate",
        "toDate",
        "technologies",
        "client"
      ],
      "line": 360
    },
    {
      "cells": [
        "paypal",
        "talentxpert",
        "20-Jan-2020",
        "21-Sep-2020",
        "Java selenium",
        "Alexu"
      ],
      "line": 361
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 362,
  "name": "Click on save button",
  "keyword": "And "
});
formatter.step({
  "line": 363,
  "name": "click ok on success popup",
  "keyword": "And "
});
formatter.step({
  "line": 364,
  "name": "Asert the experirnce deatils",
  "rows": [
    {
      "cells": [
        "title",
        "organization",
        "fromDate",
        "toDate",
        "technologies",
        "client"
      ],
      "line": 365
    },
    {
      "cells": [
        "paypal",
        "talentxpert",
        "20-Jan-2020",
        "21-Sep-2020",
        "Java selenium",
        "Alexu"
      ],
      "line": 366
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "AddingCandidate.user_must_be_registered()"
});
formatter.result({
  "duration": 10254929800,
  "status": "passed"
});
formatter.match({
  "location": "AddingCandidate.title_of_login_page_is_Home()"
});
formatter.result({
  "duration": 8423400,
  "status": "passed"
});
formatter.match({
  "location": "AddingCandidate.click_on_Job_Seeker_Candidate_Sign_In_link()"
});
formatter.result({
  "duration": 5226424000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "hirecan42@gmail.com",
      "offset": 36
    },
    {
      "val": "12345",
      "offset": 58
    }
  ],
  "location": "AddingCandidate.candidate_enters_valid_credentials(String,String)"
});
formatter.result({
  "duration": 7344173000,
  "status": "passed"
});
formatter.match({
  "location": "AddingCandidate.click_on_update_profile_option()"
});
formatter.result({
  "duration": 4292713500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sr.software engineer",
      "offset": 62
    },
    {
      "val": "hirecan42@gmail.com",
      "offset": 85
    },
    {
      "val": "78996685538",
      "offset": 107
    },
    {
      "val": "14/09/2020",
      "offset": 121
    },
    {
      "val": "India",
      "offset": 134
    },
    {
      "val": "sita bardi",
      "offset": 142
    },
    {
      "val": "hirecan42",
      "offset": 155
    },
    {
      "val": "hirecan42@yahoo.com",
      "offset": 167
    },
    {
      "val": "9846355555",
      "offset": 189
    },
    {
      "val": "Female",
      "offset": 202
    },
    {
      "val": "Nagpur",
      "offset": 211
    },
    {
      "val": "248966",
      "offset": 220
    },
    {
      "val": "Accenture",
      "offset": 229
    },
    {
      "val": "Sr.developer",
      "offset": 241
    },
    {
      "val": "2",
      "offset": 256
    },
    {
      "val": "Contractual Full Time",
      "offset": 260
    },
    {
      "val": "Evening Shift",
      "offset": 284
    },
    {
      "val": "Pune",
      "offset": 300
    },
    {
      "val": "can13",
      "offset": 307
    },
    {
      "val": "IT software",
      "offset": 315
    },
    {
      "val": "1.7",
      "offset": 329
    },
    {
      "val": "800000",
      "offset": 335
    },
    {
      "val": "Citizen",
      "offset": 344
    },
    {
      "val": "Yes",
      "offset": 354
    },
    {
      "val": "25/12/2020",
      "offset": 360
    },
    {
      "val": "25",
      "offset": 373
    },
    {
      "val": "700000",
      "offset": 378
    },
    {
      "val": "Call",
      "offset": 387
    },
    {
      "val": "Yes",
      "offset": 394
    },
    {
      "val": "No",
      "offset": 400
    },
    {
      "val": "No",
      "offset": 405
    },
    {
      "val": "C:\\Users\\TLP33\\Documents\\CV.docx",
      "offset": 410
    }
  ],
  "location": "AddingCandidate.enter_all_the_personal_and_professional_details_of_candidate(String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 33823626900,
  "status": "passed"
});
formatter.match({
  "location": "AddingCandidate.click_on_save_button()"
});
formatter.result({
  "duration": 5064519800,
  "status": "passed"
});
formatter.match({
  "location": "AddingCandidate.click_ok_on_success_popup()"
});
formatter.result({
  "duration": 3060090000,
  "status": "passed"
});
formatter.match({
  "location": "AddingCandidate.click_on_qualification_tab()"
});
formatter.result({
  "duration": 6129278300,
  "error_message": "org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element \u003ca _ngcontent-psg-c176\u003d\"\" routerlink\u003d\"qualificationdetails\" routerlinkactive\u003d\"btnMain\" title\u003d\"Qualifications Details\" class\u003d\"btn Cbtn-primary optbtn mr-1 profilebtn disabled\" href\u003d\"#/candidate/candidateprofile/qualificationdetails\"\u003e...\u003c/a\u003e is not clickable at point (223, 101). Other element would receive the click: \u003cdiv _ngcontent-psg-c176\u003d\"\" class\u003d\"col-md-8 col-lg-9 candidateprofileheader1 ipad-pl-1 pr-0 Mobile-pl-2\"\u003e...\u003c/div\u003e\n  (Session info: chrome\u003d86.0.4240.111)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-6IM5GGG\u0027, ip: \u0027192.168.0.102\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002712.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 86.0.4240.111, chrome: {chromedriverVersion: 85.0.4183.87 (cd6713ebf92fa..., userDataDir: C:\\Users\\TLP33\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:51150}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 6a79525e1bf2f74dfabc9497ddaa245b\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:567)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy18.click(Unknown Source)\r\n\tat DataValidationTC_Stepdefination.AddingCandidate.click_on_qualification_tab(AddingCandidate.java:506)\r\n\tat ✽.And click on qualification tab(DataValidation.feature:274)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "AddingCandidate.click_on_update_profile_option()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Sr.software engineer",
      "offset": 59
    },
    {
      "val": "hirecan42@gmail.com",
      "offset": 82
    },
    {
      "val": "78996685538",
      "offset": 104
    },
    {
      "val": "14/09/2020",
      "offset": 118
    },
    {
      "val": "India",
      "offset": 131
    },
    {
      "val": "sita bardi",
      "offset": 139
    },
    {
      "val": "hirecan42",
      "offset": 152
    },
    {
      "val": "hirecan42@yahoo.com",
      "offset": 164
    },
    {
      "val": "9846355555",
      "offset": 186
    },
    {
      "val": "Female",
      "offset": 199
    },
    {
      "val": "Nagpur",
      "offset": 208
    },
    {
      "val": "248966",
      "offset": 217
    },
    {
      "val": "Accenture",
      "offset": 226
    },
    {
      "val": "Sr.developer",
      "offset": 238
    },
    {
      "val": "2",
      "offset": 253
    },
    {
      "val": "Contractual Full Time",
      "offset": 257
    },
    {
      "val": "Evening Shift",
      "offset": 281
    },
    {
      "val": "Pune",
      "offset": 297
    },
    {
      "val": "can13",
      "offset": 304
    },
    {
      "val": "IT software",
      "offset": 312
    },
    {
      "val": "1.7",
      "offset": 326
    },
    {
      "val": "800000",
      "offset": 332
    },
    {
      "val": "Citizen",
      "offset": 341
    },
    {
      "val": "Yes",
      "offset": 351
    },
    {
      "val": "25/12/2020",
      "offset": 357
    },
    {
      "val": "25",
      "offset": 370
    },
    {
      "val": "700000",
      "offset": 375
    },
    {
      "val": "Call",
      "offset": 384
    },
    {
      "val": "Yes",
      "offset": 391
    },
    {
      "val": "No",
      "offset": 397
    },
    {
      "val": "No",
      "offset": 402
    },
    {
      "val": "C:\\Users\\TLP33\\Documents\\CV.docx",
      "offset": 407
    }
  ],
  "location": "AddingCandidate.assert_the_personal_and_professional_details_of_candidate(String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddingCandidate.click_on_qualification_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddingCandidate.fill_all_the_qualification_details(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddingCandidate.click_on_save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddingCandidate.click_ok_on_success_popup()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddingCandidate.assert_the_qualification_details(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddingCandidate.click_on_work_experience_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddingCandidate.fill_all_work_experience_details(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddingCandidate.click_on_save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddingCandidate.click_ok_on_success_popup()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddingCandidate.assert_work_experience_details(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddingCandidate.click_on_skills_and_designation()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "sr.Test Engineer",
      "offset": 41
    }
  ],
  "location": "AddingCandidate.fill_all_skills_and_designation_details(String,DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddingCandidate.save_the_changes()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "sr.Test Engineer",
      "offset": 31
    }
  ],
  "location": "AddingCandidate.assert_skills_and_designation(String,DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddingCandidate.click_on_certificate_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddingCandidate.fill_all_certificate_details(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddingCandidate.click_on_save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddingCandidate.click_ok_on_success_popup()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddingCandidate.assert_the_certificate_details(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddingCandidate.click_on_languages_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddingCandidate.fill_all_language_details(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddingCandidate.click_on_save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddingCandidate.click_ok_on_success_popup()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddingCandidate.assert_the_languages_details(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddingCandidate.click_on_Visa_Tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddingCandidate.fill_All_the_deatils_of_visa(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddingCandidate.click_on_save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddingCandidate.click_ok_on_success_popup()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddingCandidate.assert_the_visa_details(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddingCandidate.click_on_Experience_details_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddingCandidate.fill_all_experience_details(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddingCandidate.click_on_save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddingCandidate.click_ok_on_success_popup()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddingCandidate.asert_the_experirnce_deatils(DataTable)"
});
formatter.result({
  "status": "skipped"
});
});