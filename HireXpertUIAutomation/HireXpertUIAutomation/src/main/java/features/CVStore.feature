Feature: Hirexpert Job Candidate Workflow feature

@BVT @cv1
Scenario Outline: Verify user can see candidate added by employer/agency on CV store page

Given User must be registered

When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And Go to workbench
And Add job with All details "<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>" and "<remark3>"
|title         |agytitle 				   |designation |industry   |organization|qualification|country|city|location |zipcode|address    |noofvacancies|minexp|maxexp|minsal|maxsal|cashBenefit|minAge|maxAge|totalinterviews|noticePeriod|jobType                |considerRelocation|OverBudget|Shift          |ShiftTimings|FromEmail     |FromEmailagy  |EmailSubject  |Employer|emporganzation|functionalArea|                                                                  
|Cv store job1 |marketplacevalidation agy  |Developer   |IT software|talentxpert |BE           |India  |Pune|pune     |442001 |viman nagar|2            |1     |2     |400000|800000|400000     |25     |30   |4			    |20          | Permanent Full Time |Yes			      |No        | Day Shift |9-5         |pemp@gmail.com|pagy@gmail.com|want candidate|pemp    |dsfsdfdsfs    |Java|
And Select a added job
And Click on add candidate 
And Enter All details of "<CandidateEmail>","<profiletitle>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
And Add job with All details "<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>" and "<remark3>"
|title  	       |agytitle 				     |designation |industry   |organization|qualification|country|city|location |zipcode|address    |noofvacancies|minexp|maxexp|minsal|maxsal|cashBenefit|minAge|maxAge|totalinterviews|noticePeriod|jobType                |considerRelocation|OverBudget|Shift          |ShiftTimings|FromEmail     |FromEmailagy  |EmailSubject  |Employer|emporganzation|functionalArea   |                                                                 
|Cv Strore job 1b |marketplacevalidation agy  |Developer   |IT software|talentxpert |BE           |India  |Pune|pune     |442001 |viman nagar|2            |1     |2     |400000|800000|400000     |25     |30   |4			    |20          | Permanent Full Time  |Yes			      |No        | Day Shift |9-5         |pemp@gmail.com|pagy@gmail.com|want candidate|pemp    |dsfsdfdsfs    |java|
And Go to CV store tab
And select the basic filter from filter drop down
And enter all value in basic filter fields "<jobs>" "<Designation>" "<mandatorySkills>" "<preferredSkills>" "<optionalSkills>" "<minexp>" "<maxexp>" "<CTC>" "<noticeperiod>" "<City>"
And click on search button 
Then verify the result of basic filter "<Name>"
And Now select the advance filter from filter drop down 
And enter all value in advance filter fields "<jobs>" "<Designation>" "<mandatorySkills>" "<preferredSkills>" "<optionalSkills>" "<minexp>" "<maxexp>" "<CTC>" "<noticeperiod>" "<City>" "<updatedOn>" "<industry>" "<overBudget>" "<OnNoticePeriod>" "<CityArea>" "<Gender>" "<minage>" "<maxage>" "<jobtype>" "<shift>"
And click on search button 
Then verify the result of advance filter "<Name>"

Examples:
|Username      |Teamid         |Password |CandidateEmail      |profiletitle    |Name     |ContactNumber |Designation   |Date            |Gender  |OnNoticePeriod|NoticePeriod|LastWorkingDay|experience|CTC   |expectedCTC|Country|City  |CityArea   |ZipCode|Communicationmode|Salaryoffered|distance|permanentAddress|relocate|Skill1  |Skill2       |Skill3    |level1           |level2        |level3  |Weightage1 |Weightage2|Weightage3|certificate1|certificate2|certificate3|remark1            |remark2        |remark3         |certificateforskill1|certificateforskill2|jobs    |designation   |mandatorySkills|preferredSkills|optionalSkills|minexp|maxexp|updatedOn|industry   |overBudget|minage|maxage|jobtype            |shift|
|pemp@gmail.com|pe1@gmail.com  |12345    |hirecan31@gmail.com |developer       |hirecan31|9885685538    |Developer     |14/02/1995      |Female  |Yes           |25          |01/09/2021    |1.5       |800000|800000     | India |wardha|Arvi naka  |455966 |Call             |800000       |4       |No              |No      |JAVA    |advanced java|JavaScript|Basic Knowledge  | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |JCFW 10 |Developer     |JAVA 			|advanced java  |JavaScript    |1     |2     |         |IT software|No        |25    |30    |Permanent Full Time| Day Shift|

#TC id=408

@BVT @cv2
Scenario Outline: To verify the 'View Detail' button on candidate card on CV Store page (Employer)

Given User must be registered

When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
#And Go to workbench
#And Add job with All details "<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>" and "<remark3>"
#|title            |agytitle 			|designation |industry   |organization|qualification|country|city|location |zipcode|address    |noofvacancies|minexp|maxexp|minsal|maxsal|cashBenefit|minAge|maxAge|totalinterviews|noticePeriod|jobType                |considerRelocation|OverBudget|Shift          |ShiftTimings|FromEmail     |FromEmailagy  |EmailSubject  |Employer|emporganzation|functionalArea|                                                                  
#|Cv store job 2a  |Cv store job 2a agy  |Developer   |IT software|talentxpert |BE           |India  |Pune|pune     |442001 |viman nagar|2            |1     |2     |400000|800000|400000     |25     |30   |4			    |20          | Permanent Full Time |Yes			      |No        | Day Shift |9-5         |pemp@gmail.com|pagy@gmail.com|want candidate|pemp    |dsfsdfdsfs    |Java|
#And Select a added job
#And Click on add candidate
#And Enter All details of "<CandidateEmail>","<profiletitle>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
#And Add job with All details "<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>" and "<remark3>"
#|title  	      |agytitle 			|designation |industry   |organization|qualification|country|city|location |zipcode|address    |noofvacancies|minexp|maxexp|minsal|maxsal|cashBenefit|minAge|maxAge|totalinterviews|noticePeriod|jobType                |considerRelocation|OverBudget|Shift          |ShiftTimings|FromEmail     |FromEmailagy  |EmailSubject  |Employer|emporganzation|functionalArea   |                                                                 
#|Cv Strore job 2b |Cv store job 2b agy  |Developer   |IT software|talentxpert |BE           |India  |Pune|pune     |442001 |viman nagar|2            |1     |2     |400000|800000|400000     |25     |30   |4			    |20          | Permanent Full Time  |Yes			      |No        | Day Shift |9-5         |pemp@gmail.com|pagy@gmail.com|want candidate|pemp    |dsfsdfdsfs    |java|
And Go to CV store tab
And select the basic filter from filter drop down
And enter all value in basic filter fields "<jobs>" "<Designation>" "<mandatorySkills>" "<preferredSkills>" "<optionalSkills>" "<minexp>" "<maxexp>" "<CTC>" "<noticeperiod>" "<City>"
And click on search button
Then verify the result of basic filter "<Name>"
And Click on view detail button
Then Assert all the details of candidate on cv store page "<CandidateEmail>","<profiletitle>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<jobtype>","<shift>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"

Examples:
|Username      |Teamid         |Password |CandidateEmail      |profiletitle    |Name     |ContactNumber |Designation   |Date            |Gender  |OnNoticePeriod|NoticePeriod|LastWorkingDay|experience|CTC   |expectedCTC|Country|City  |CityArea   |ZipCode|Communicationmode|Salaryoffered|distance|permanentAddress|relocate|Skill1  |Skill2       |Skill3    |level1           |level2        |level3  |Weightage1 |Weightage2|Weightage3|certificate1|certificate2|certificate3|remark1            |remark2        |remark3         |certificateforskill1|certificateforskill2|jobs    |designation   |mandatorySkills|preferredSkills|optionalSkills|minexp|maxexp|updatedOn|industry   |overBudget|minage|maxage|jobtype            |shift|
|pemp@gmail.com|pe1@gmail.com  |12345    |hirecan31@gmail.com |Developer       |hirecan31|9885685538    |Developer     |14/2/1995      |Female  |Yes           |25          |01/09/2021    |1.5       |800000|800000     | India |wardha|Arvi naka  |455966 |Call             |800000       |4       |No              |No      |JAVA    |advanced java|JavaScript|Basic Knowledge  | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |JCFW 10 |Developer     |JAVA 			|advanced java  |JavaScript    |1     |2     |         |IT software|No        |25    |30    |Permanent Full Time| Day Shift|









