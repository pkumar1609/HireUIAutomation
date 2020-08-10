Feature: HireXpert Bell icon on candidate card feature


Scenario Outline: Verify functionality of bell icon on candidate card.

Given Open browser
When click on Employer-Agency SignIn link
And login with Employer credential.
And Go to Workbench 
And Add a new Job as employer with at list one skill "<Title>" "<Designation>" "<Industry>" "<JobRole>" "<Location>" "<Budget>" "<MinExp>" "<MaxExp>" "<NoOfInterviews>"
And Select the same job from job drop down
And Click on Add Candidate button.
And Enter valid "<CandidateEmail>" 
And click on find button 
And fill all the information "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>" and "<relocate>"
And upload candidate resume
And Keep expertise level as Not answer "<ExpertiseLevel1>" "<ExpertiseLevel2>"
And Click on save button 
Then The candidate whose skill expert level is set as Not answer for that candidate card there should show bell icon
And Click on Edit Candidate icon on candidate card "<Name>"
And select different expertise level for the skill which is having expert level as not answer "<expertiselevel1>" "<expertiselevel2>"
And click on save button
Then when user set expertise level other than Not answer in edit candidate at that time bell icon should removed from candidate card
And click on close job button and delete the job


Examples:
   | Title    | Designation   | Industry    | JobRole  | Location    | Budget | MinExp | MaxExp | NoOfInterviews |    CandidateEmail       |  Name   |   ContactNumber  |   Designation     | Date        | Gender | OnNoticePeriod | NoticePeriod |experience | CTC    | expectedCTC | Country|City  | CityArea    |ZipCode |  Communicationmode |Salaryoffered|distance|permanentAddress|relocate|   contactnumber   | ExpertiseLevel1 | ExpertiseLevel2 | expertiselevel1 | expertiselevel2 |
   | Engineer | Test Engineer | IT-Software | Engineer | Viman Nagar | 500000 | 2      | 3      | 3              | candidate02@gmail.com   | Can02   |   912349699666   |   Software Tester |  04/08/1999 | Male   |     No         |     30       |      2.5  | 450000 |     600000  | India  | Pune |  Viman Nagar| 411014 |        SMS         | 700000      | 4      | No             | No     | 1234567891        | Not Answered    |  Not Answered   |  Expert         | Intermediate    |
  
#  TC :- 374