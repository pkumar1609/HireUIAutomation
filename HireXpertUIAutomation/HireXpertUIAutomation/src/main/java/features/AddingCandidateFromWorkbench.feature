Feature: Adding Candidate from workbench

@employerAgency
Scenario Outline: Add the Candidate from workbench and verify details on edit candidate and candidate details page
	
Given User must be registered

When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And Go to workbench
And Add job
|title             |designation |industry   |jobrole        |location |budget |minexp|maxexp|
|softwre developer |developer   |IT software|java developer |pune     |400000 |1     |2     |	
And Select a added job
And Click on add candidate
And Enter All details of "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>" ,"<Gender>", "<NoticePeriod>","<Location>","<Communicationmode>","<Date>","<OnNoticePeriod>","<Designation>" ,"<Gender>", "<NoticePeriod>","<Location>","<Communicationmode>","<Date>", "<OnNoticePeriod>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<Salaryoffered>","<distance>","<permanentAddress>" and "<relocate>"
And verify candidate card is displaying or not in New column "<Name>"
And Click on Edit Candidate icon on candidate card 
And Assert the details of candidate "<CandidateEmail>","<Name>","<ContactNumber>","<Date>","<OnNoticePeriod>","<Designation>" ,"<Gender>", "<NoticePeriod>","<Location>","<Communicationmode>","<Date>", "<OnNoticePeriod>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<Salaryoffered>","<distance>","<permanentAddress>" and "<relocate>"
#And Click Candidate details eye icon on candidate card
#And Assert the details of candidate "<CandidateEmail>","<Name>","<ContactNumber>","<Date>","<OnNoticePeriod>","<Designation>" ,"<Gender>", "<NoticePeriod>","<Location>","<Communicationmode>","<Date>", "<OnNoticePeriod>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<Salaryoffered>","<distance>","<permanentAddress>" and "<relocate>"

Examples:
|Username      |Password |Name   |CandidateEmail   |ContactNumber|Designation   |Gender|NoticePeriod | Location|Communicationmode|Date|OnNoticePeriod|experience|CTC     |expectedCTC|Country|City|Salaryoffered|distance|permanentAddress|relocate|
|pemp@gmail.com|12345    |Pratik |pratik@gmail.com |4564668596   |developer     |Male  |30           |pune     |Email            |19  |Yes		     |4.5       |400000  |500000 	 | India |pune|500000       |40		 |Yes             |No      |
#|pagy@gmail.com|12345   |Abhijit|Abhijit@gmail.com|9856558555   |Java developer|Male  |30           |pune     |Email            |3   |No            |2.0       |500000  |700000     | India |ngp |600000       |25		 |No              |Yes	   |
