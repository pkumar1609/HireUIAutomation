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
      "line": 256,
      "value": "########Candidate data validation########"
    }
  ],
  "line": 259,
  "name": "validate the candidate details when candidate login himself and add profile details",
  "description": "",
  "id": "data-validation;validate-the-candidate-details-when-candidate-login-himself-and-add-profile-details",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 258,
      "name": "@candidatedetails"
    }
  ]
});
formatter.step({
  "line": 261,
  "name": "User must be registered",
  "keyword": "Given "
});
formatter.step({
  "line": 263,
  "name": "title of login page is Home",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 264,
      "value": "#And Click register link"
    },
    {
      "line": 265,
      "value": "#And Enter all details on register page \"\u003cName\u003e\" \"\u003cCandidateEmail\u003e\" \"\u003cContactNumber\u003e\" \"\u003cUserType\u003e\" \"\u003ctimezone\u003e\" \"\u003ccountry\u003e\""
    }
  ],
  "line": 266,
  "name": "Click on Job Seeker(Candidate) Sign In link",
  "keyword": "And "
});
formatter.step({
  "line": 267,
  "name": "candidate enters valid credentials \"\u003cCandidateEmail\u003e\",\"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 268,
  "name": "click on update profile option",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 269,
      "value": "#Then Enter all the personal and professional details of candidate \"\u003ctitle\u003e\" \"\u003cContactNumber\u003e\" \"\u003cDate\u003e\" \"\u003cCountry\u003e\" \"\u003cCityArea\u003e\" \"\u003cName\u003e\" \"\u003calternateemail\u003e\" \"\u003calternateContact\u003e\" \"\u003cGender\u003e\" \"\u003cCity\u003e\" \"\u003cZipCode\u003e\" \"\u003ccurrentorganization\u003e\" \"\u003ccurrentdesignation\u003e\" \"\u003ccurrentduration\u003e\" \"\u003cjobtype\u003e\" \"\u003cshift\u003e\" \"\u003cpreferredcity\u003e\" \"\u003csearchkeyword\u003e\" \"\u003cindustry\u003e\" \"\u003cexperience\u003e\" \"\u003cexpectedCTC\u003e\" \"\u003cresidentialstatus\u003e\" \"\u003cOnNoticePeriod\u003e\" \"\u003cLastWorkingDay\u003e\" \"\u003cNoticePeriod\u003e\" \"\u003cCTC\u003e\" \"\u003cCommunicationmode\u003e\" \"\u003cwillingtotravel\u003e\" \"\u003clookingforjob\u003e\" \"\u003crelocate\u003e\" \"\u003ccv\u003e\""
    },
    {
      "line": 270,
      "value": "#And Click on save button"
    },
    {
      "line": 271,
      "value": "#And click ok on success popup"
    },
    {
      "line": 272,
      "value": "#Then Assert the personal and professional details of candidate"
    },
    {
      "line": 273,
      "value": "#|Username      |Teamid        |Password|CandidateEmail      |title\t\t\t\t   |Name     |alternateemail     |ContactNumber |alternateContact|UserType |timezone\t\t\t    |country|currentorganization|currentdesignation |currentduration|jobtype              |shift        |preferredcity|Date         |Gender    |OnNoticePeriod|LastWorkingDay|NoticePeriod|searchkeyword|industry   |experience|CTC   |expectedCTC|City  |CityArea   |ZipCode|Communicationmode|residentialstatus|willingtotravel    |lookingforjob|relocate|cv     |"
    },
    {
      "line": 274,
      "value": "#|pemp@gmail.com|pe1@gmail.com |12345   |hirecan13@gmail.com |Sr.software engineer |hirecan13 |hirecan13@yahoo.com|7895885538    |8555855555      |Candidate|Indian Standard Time    | India |Accenture          |Sr.developer       |2   \t\t\t|Contractual Full Time|Evening Shift|Pune         |14-Sep-2020  |Female    |Yes           |25-Dec-2020   |25          |can13        |IT software|1.7       |700000|800000     |Nagpur|sita bardi |248966 |Call             |Citizen          |Yes\t\t     \t |No           |No      |CV.docx|"
    },
    {
      "line": 275,
      "value": "#And click on qualification tab"
    },
    {
      "line": 276,
      "value": "#And Fill all the qualification details"
    },
    {
      "line": 277,
      "value": "#|Major    |year|grade |college        |university|country|degree  |"
    },
    {
      "line": 278,
      "value": "#|Research |2021|90    |CUJB      \t  |cambridge |USA    |Ph.D    |"
    },
    {
      "line": 279,
      "value": "#|MBA  \t  |2019|95    |BD college     |Nagpur    |India  |Master  |"
    },
    {
      "line": 280,
      "value": "#|BE       |2017|85    |DMIETR college |Nagpur    |India  |Bachelor|"
    },
    {
      "line": 281,
      "value": "#|Science  |2013|79    |New English    |Nagpur    |India  |12\t  |"
    },
    {
      "line": 282,
      "value": "#|CBSE     |2011|80    |MVM            |Nagpur    |India  |10\t  |"
    },
    {
      "line": 283,
      "value": "#And Click on save button"
    },
    {
      "line": 284,
      "value": "#And click ok on success popup"
    },
    {
      "line": 285,
      "value": "#Then Assert the qualification details"
    },
    {
      "line": 286,
      "value": "#|Major    |year|grade |college        |university|country|degree  |"
    },
    {
      "line": 287,
      "value": "#|Research |2021|90    |CUJB      \t  |cambridge |USA    |Ph.D    |"
    },
    {
      "line": 288,
      "value": "#|MBA  \t  |2019|95    |BD college     |Nagpur    |India  |Master  |"
    },
    {
      "line": 289,
      "value": "#|BE       |2017|85    |DMIETR college |Nagpur    |India  |Bachelor|"
    },
    {
      "line": 290,
      "value": "#|Science  |2013|79    |New English    |Nagpur    |India  |12\t  |"
    },
    {
      "line": 291,
      "value": "#|CBSE     |2011|80    |MVM            |Nagpur    |India  |10\t  |"
    }
  ],
  "line": 292,
  "name": "Click on work experience tab",
  "keyword": "And "
});
formatter.step({
  "line": 293,
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
      "line": 294
    },
    {
      "cells": [
        "wipro",
        "JAN",
        "2018",
        "NOV",
        "2018",
        "Software engineer",
        "nagpur",
        "India"
      ],
      "line": 295
    },
    {
      "cells": [
        "persistant",
        "FEB",
        "2019",
        "APR",
        "2019",
        "Software engineer",
        "nagpur",
        "India"
      ],
      "line": 296
    },
    {
      "cells": [
        "Dell",
        "MAR",
        "2020",
        "DEC",
        "2020",
        "Software engineer",
        "nagpur",
        "India"
      ],
      "line": 297
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 298,
  "name": "Click on save button",
  "keyword": "And "
});
formatter.step({
  "line": 299,
  "name": "click ok on success popup",
  "keyword": "And "
});
formatter.step({
  "line": 300,
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
      "line": 301
    },
    {
      "cells": [
        "wipro",
        "JAN",
        "2018",
        "NOV",
        "2018",
        "Software engineer",
        "nagpur",
        "India"
      ],
      "line": 302
    },
    {
      "cells": [
        "persistant",
        "FEB",
        "2019",
        "APR",
        "2019",
        "Software engineer",
        "nagpur",
        "India"
      ],
      "line": 303
    },
    {
      "cells": [
        "Dell",
        "MAR",
        "2020",
        "DEC",
        "2020",
        "Software engineer",
        "nagpur",
        "India"
      ],
      "line": 304
    }
  ],
  "keyword": "Then "
});
formatter.examples({
  "comments": [
    {
      "line": 305,
      "value": "#And Click on skills and designation"
    },
    {
      "line": 306,
      "value": "#And fill all skills and designation details \"Sr.Test engineer\""
    },
    {
      "line": 307,
      "value": "#|skill\t\t  |Expertiselevel |certificate  |"
    },
    {
      "line": 308,
      "value": "#|JAVA         |Basic Knowledge|sun microsoft|"
    },
    {
      "line": 309,
      "value": "#|advanced java|Intermediate   |ad. java  \t|"
    },
    {
      "line": 310,
      "value": "#|Javascript   | Expert        |javaScript\t|"
    },
    {
      "line": 311,
      "value": "#And Click on save button"
    },
    {
      "line": 312,
      "value": "#And click ok on success popup"
    },
    {
      "line": 313,
      "value": "#And Click on certificate tab"
    },
    {
      "line": 314,
      "value": "#And fill all certificate details"
    },
    {
      "line": 315,
      "value": "#|certificate      |year|grade|issuing Authority|country|"
    },
    {
      "line": 316,
      "value": "#|best performance |2018|A    |Wipro pvt ltd    |India  |"
    },
    {
      "line": 317,
      "value": "#|cudos            |2019|A    |Dell pvt ltd     |India  |"
    },
    {
      "line": 318,
      "value": "#|Employee of month|2020|A    |Dell pvt ltd     |India  |"
    },
    {
      "line": 319,
      "value": "#And Click on save button"
    },
    {
      "line": 320,
      "value": "#And click ok on success popup"
    },
    {
      "line": 321,
      "value": "#And Click on languages tab"
    },
    {
      "line": 322,
      "value": "#And Fill all language details"
    },
    {
      "line": 323,
      "value": "#|language|proficiency\t\t\t\t\t\t|certificate            |"
    },
    {
      "line": 324,
      "value": "#|English | Professional working proficiency |Certificate of merit   |"
    },
    {
      "line": 325,
      "value": "#|French  | Limited working proficiency      |Certificate of merit   |"
    },
    {
      "line": 326,
      "value": "#|spanish |  Elementary proficiency          |Certificate of persuing|"
    },
    {
      "line": 327,
      "value": "#And Click on save button"
    },
    {
      "line": 328,
      "value": "#And click ok on success popup"
    },
    {
      "line": 329,
      "value": "#And Click on Visa Tab"
    },
    {
      "line": 330,
      "value": "#And Fill All the deatils of visa"
    },
    {
      "line": 331,
      "value": "#|country\t|VisaType    |ValidUpto     |year|month|"
    },
    {
      "line": 332,
      "value": "#|USA\t\t|Work Visa   |28-Oct-2030   |2030|Oct  |"
    },
    {
      "line": 333,
      "value": "#|Singapore\t|Student Visa|30-Apr-2025\t|2025|Apr  |"
    },
    {
      "line": 334,
      "value": "#|Australia\t|Tourist Visa|1-Jan-2023    |2023|Jan  |"
    },
    {
      "line": 335,
      "value": "#And Click on save button"
    },
    {
      "line": 336,
      "value": "#And click ok on success popup"
    },
    {
      "line": 337,
      "value": "#And Click on Experience details tab"
    },
    {
      "line": 338,
      "value": "#And Fill all experience details"
    },
    {
      "line": 339,
      "value": "#|title   |organization|fromDate   |toDate     |technologies |client|"
    },
    {
      "line": 340,
      "value": "#|paypal  |talentxpert |20-Jan-2020|21-Sep-2020|Java selenium|Alexu |"
    },
    {
      "line": 341,
      "value": "#And Click on save button"
    },
    {
      "line": 342,
      "value": "#And click ok on success popup"
    }
  ],
  "line": 346,
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
        "title",
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
      "line": 347,
      "id": "data-validation;validate-the-candidate-details-when-candidate-login-himself-and-add-profile-details;;1"
    },
    {
      "cells": [
        "pemp@gmail.com",
        "pe1@gmail.com",
        "12345",
        "hirecan13@gmail.com",
        "Sr.software engineer",
        "hirecan13",
        "hirecan13@yahoo.com",
        "7895885538",
        "8555855555",
        "Candidate",
        "Indian Standard Time",
        "India",
        "Accenture",
        "Sr.developer",
        "2",
        "Contractual Full Time",
        "Evening Shift",
        "Pune",
        "14-Sep-2020",
        "Female",
        "Yes",
        "25",
        "25-Dec-2020",
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
      "line": 348,
      "id": "data-validation;validate-the-candidate-details-when-candidate-login-himself-and-add-profile-details;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 348,
  "name": "validate the candidate details when candidate login himself and add profile details",
  "description": "",
  "id": "data-validation;validate-the-candidate-details-when-candidate-login-himself-and-add-profile-details;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 258,
      "name": "@candidatedetails"
    }
  ]
});
formatter.step({
  "line": 261,
  "name": "User must be registered",
  "keyword": "Given "
});
formatter.step({
  "line": 263,
  "name": "title of login page is Home",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 264,
      "value": "#And Click register link"
    },
    {
      "line": 265,
      "value": "#And Enter all details on register page \"\u003cName\u003e\" \"\u003cCandidateEmail\u003e\" \"\u003cContactNumber\u003e\" \"\u003cUserType\u003e\" \"\u003ctimezone\u003e\" \"\u003ccountry\u003e\""
    }
  ],
  "line": 266,
  "name": "Click on Job Seeker(Candidate) Sign In link",
  "keyword": "And "
});
formatter.step({
  "line": 267,
  "name": "candidate enters valid credentials \"hirecan13@gmail.com\",\"12345\"",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 268,
  "name": "click on update profile option",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 269,
      "value": "#Then Enter all the personal and professional details of candidate \"\u003ctitle\u003e\" \"\u003cContactNumber\u003e\" \"\u003cDate\u003e\" \"\u003cCountry\u003e\" \"\u003cCityArea\u003e\" \"\u003cName\u003e\" \"\u003calternateemail\u003e\" \"\u003calternateContact\u003e\" \"\u003cGender\u003e\" \"\u003cCity\u003e\" \"\u003cZipCode\u003e\" \"\u003ccurrentorganization\u003e\" \"\u003ccurrentdesignation\u003e\" \"\u003ccurrentduration\u003e\" \"\u003cjobtype\u003e\" \"\u003cshift\u003e\" \"\u003cpreferredcity\u003e\" \"\u003csearchkeyword\u003e\" \"\u003cindustry\u003e\" \"\u003cexperience\u003e\" \"\u003cexpectedCTC\u003e\" \"\u003cresidentialstatus\u003e\" \"\u003cOnNoticePeriod\u003e\" \"\u003cLastWorkingDay\u003e\" \"\u003cNoticePeriod\u003e\" \"\u003cCTC\u003e\" \"\u003cCommunicationmode\u003e\" \"\u003cwillingtotravel\u003e\" \"\u003clookingforjob\u003e\" \"\u003crelocate\u003e\" \"\u003ccv\u003e\""
    },
    {
      "line": 270,
      "value": "#And Click on save button"
    },
    {
      "line": 271,
      "value": "#And click ok on success popup"
    },
    {
      "line": 272,
      "value": "#Then Assert the personal and professional details of candidate"
    },
    {
      "line": 273,
      "value": "#|Username      |Teamid        |Password|CandidateEmail      |title\t\t\t\t   |Name     |alternateemail     |ContactNumber |alternateContact|UserType |timezone\t\t\t    |country|currentorganization|currentdesignation |currentduration|jobtype              |shift        |preferredcity|Date         |Gender    |OnNoticePeriod|LastWorkingDay|NoticePeriod|searchkeyword|industry   |experience|CTC   |expectedCTC|City  |CityArea   |ZipCode|Communicationmode|residentialstatus|willingtotravel    |lookingforjob|relocate|cv     |"
    },
    {
      "line": 274,
      "value": "#|pemp@gmail.com|pe1@gmail.com |12345   |hirecan13@gmail.com |Sr.software engineer |hirecan13 |hirecan13@yahoo.com|7895885538    |8555855555      |Candidate|Indian Standard Time    | India |Accenture          |Sr.developer       |2   \t\t\t|Contractual Full Time|Evening Shift|Pune         |14-Sep-2020  |Female    |Yes           |25-Dec-2020   |25          |can13        |IT software|1.7       |700000|800000     |Nagpur|sita bardi |248966 |Call             |Citizen          |Yes\t\t     \t |No           |No      |CV.docx|"
    },
    {
      "line": 275,
      "value": "#And click on qualification tab"
    },
    {
      "line": 276,
      "value": "#And Fill all the qualification details"
    },
    {
      "line": 277,
      "value": "#|Major    |year|grade |college        |university|country|degree  |"
    },
    {
      "line": 278,
      "value": "#|Research |2021|90    |CUJB      \t  |cambridge |USA    |Ph.D    |"
    },
    {
      "line": 279,
      "value": "#|MBA  \t  |2019|95    |BD college     |Nagpur    |India  |Master  |"
    },
    {
      "line": 280,
      "value": "#|BE       |2017|85    |DMIETR college |Nagpur    |India  |Bachelor|"
    },
    {
      "line": 281,
      "value": "#|Science  |2013|79    |New English    |Nagpur    |India  |12\t  |"
    },
    {
      "line": 282,
      "value": "#|CBSE     |2011|80    |MVM            |Nagpur    |India  |10\t  |"
    },
    {
      "line": 283,
      "value": "#And Click on save button"
    },
    {
      "line": 284,
      "value": "#And click ok on success popup"
    },
    {
      "line": 285,
      "value": "#Then Assert the qualification details"
    },
    {
      "line": 286,
      "value": "#|Major    |year|grade |college        |university|country|degree  |"
    },
    {
      "line": 287,
      "value": "#|Research |2021|90    |CUJB      \t  |cambridge |USA    |Ph.D    |"
    },
    {
      "line": 288,
      "value": "#|MBA  \t  |2019|95    |BD college     |Nagpur    |India  |Master  |"
    },
    {
      "line": 289,
      "value": "#|BE       |2017|85    |DMIETR college |Nagpur    |India  |Bachelor|"
    },
    {
      "line": 290,
      "value": "#|Science  |2013|79    |New English    |Nagpur    |India  |12\t  |"
    },
    {
      "line": 291,
      "value": "#|CBSE     |2011|80    |MVM            |Nagpur    |India  |10\t  |"
    }
  ],
  "line": 292,
  "name": "Click on work experience tab",
  "keyword": "And "
});
formatter.step({
  "line": 293,
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
      "line": 294
    },
    {
      "cells": [
        "wipro",
        "JAN",
        "2018",
        "NOV",
        "2018",
        "Software engineer",
        "nagpur",
        "India"
      ],
      "line": 295
    },
    {
      "cells": [
        "persistant",
        "FEB",
        "2019",
        "APR",
        "2019",
        "Software engineer",
        "nagpur",
        "India"
      ],
      "line": 296
    },
    {
      "cells": [
        "Dell",
        "MAR",
        "2020",
        "DEC",
        "2020",
        "Software engineer",
        "nagpur",
        "India"
      ],
      "line": 297
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 298,
  "name": "Click on save button",
  "keyword": "And "
});
formatter.step({
  "line": 299,
  "name": "click ok on success popup",
  "keyword": "And "
});
formatter.step({
  "line": 300,
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
      "line": 301
    },
    {
      "cells": [
        "wipro",
        "JAN",
        "2018",
        "NOV",
        "2018",
        "Software engineer",
        "nagpur",
        "India"
      ],
      "line": 302
    },
    {
      "cells": [
        "persistant",
        "FEB",
        "2019",
        "APR",
        "2019",
        "Software engineer",
        "nagpur",
        "India"
      ],
      "line": 303
    },
    {
      "cells": [
        "Dell",
        "MAR",
        "2020",
        "DEC",
        "2020",
        "Software engineer",
        "nagpur",
        "India"
      ],
      "line": 304
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "AddingCandidate.user_must_be_registered()"
});
formatter.result({
  "duration": 38351368200,
  "status": "passed"
});
formatter.match({
  "location": "AddingCandidate.title_of_login_page_is_Home()"
});
formatter.result({
  "duration": 7593100,
  "status": "passed"
});
formatter.match({
  "location": "AddingCandidate.click_on_Job_Seeker_Candidate_Sign_In_link()"
});
formatter.result({
  "duration": 5242353100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "hirecan13@gmail.com",
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
  "duration": 50280358400,
  "status": "passed"
});
formatter.match({
  "location": "AddingCandidate.click_on_update_profile_option()"
});
formatter.result({
  "duration": 4339944400,
  "status": "passed"
});
formatter.match({
  "location": "AddingCandidate.click_on_work_experience_tab()"
});
formatter.result({
  "duration": 3098177500,
  "error_message": "org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element \u003ca _ngcontent-xyn-c9\u003d\"\" class\u003d\"btn Cbtn-primary optbtn mr-1 profilebtn\" routerlink\u003d\"experiencedetails\" routerlinkactive\u003d\"btnMain\" title\u003d\"Professional Work Experience\" href\u003d\"#/candidate/candidateprofile/experiencedetails\"\u003e...\u003c/a\u003e is not clickable at point (941, 106). Other element would receive the click: \u003cdiv _ngcontent-xyn-c2\u003d\"\" class\u003d\"ngx-overlay loading-foreground\" style\u003d\"background-color: rgba(40, 40, 40, 0.8); border-radius: 0px;\"\u003e...\u003c/div\u003e\n  (Session info: chrome\u003d85.0.4183.121)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-6IM5GGG\u0027, ip: \u0027192.168.43.34\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002712.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 85.0.4183.121, chrome: {chromedriverVersion: 85.0.4183.87 (cd6713ebf92fa..., userDataDir: C:\\Users\\TLP33\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:60254}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 15f7307b328985d4d41f6fab7528050b\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:567)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy18.click(Unknown Source)\r\n\tat DataValidationTC_Stepdefination.AddingCandidate.click_on_work_experience_tab(AddingCandidate.java:482)\r\n\tat ✽.And Click on work experience tab(DataValidation.feature:292)\r\n",
  "status": "failed"
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
});