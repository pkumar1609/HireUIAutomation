Feature: Job 

@job 
Scenario Outline: User adds new job and should be displayed to all 

	Given User logged in to HireXpert "<username>" and "<Password>" 
	And Add job 
		| title     | agytitle         | designation | industry    | location | budget | minexp | maxexp | minsal | maxsal | Name | Email         | contact | totalinterviews | organization | agyorganization | functionalArea |
		| Developer | Agynew Developer | developer   | IT software | pune     | 400000 |      1 |      2 | 450000 | 800000 | pe1  | pe1@gmail.com | 1234564 |               2 | Hirexpert    | rahitech        | java           |
	When  Job provider clicks on the Submit button. 
	Then Added jobs must display on the Dashboard in the job panel for logged in users and job employers. 
	Then User should be able to add job from Dashboard also 
		| title     | agytitle         | designation  | industry    | location | budget | minexp | maxexp | minsal | maxsal | Name | Email         | contact | totalinterviews | organization | agyorganization | functionalArea |
		| Developer | Agynew Developer | developer1   | IT software | pune     | 400000 |      1 |      2 | 450000 | 800000 | pe1  | pe1@gmail.com | 1234564 |               2 | Hirexpert    | rahitech        | java           |
	Then Added job should display on Select Job To Add Candidate Dialog. 
	Then Added jobs should display on the Application Tracking page in Jobs dropdown. 
	Then Added job should also display on CV Store and CV parser page in Jobs drop-down list 
	Then For newly added job audit log should be generated 
	Then For newly added job, Job update entry should be created 
	And At least one agency should be added 
		| Name | Email          | contact |
		| pagy | pagy@gmail.com | 1234564 |
	When Employer share job with an agency 
	Then Share job should be display on applicant tracking page at agency side "<agencyName>"
	Examples: 
		| username       | Password |agencyName      |
		| pemp@gmail.com |    12345 | pagy@gmail.com |

		
@jobScenario2	
Scenario Outline: User edits added job by adding new changes 
Given User logged in to HireXpert "<Username>" and "<Password>" 
And Add job 
		| title     | agytitle         | designation | industry    | location | budget | minexp | maxexp | minsal | maxsal | Name | Email         | contact | totalinterviews | organization | agyorganization | functionalArea |
		| Developer | Agynew Developer | developer   | IT software | pune     | 400000 |      1 |      2 | 450000 | 800000 | pe1  | pe1@gmail.com | 1234564 |               2 | Hirexpert    | rahitech        | java           | 
When Job provider clicks on the Submit button.
And Employer edit added job and update job details "<JobNoticePeriod>" and "<City>"and "<City Area>"
Then Updated details should display in Edit Job on Application Tracking "<JobNoticePeriod>" and "<City>"and "<City Area>"
Then On Employer Dashboard updated job details in read only mode must be displayed on clicking View Job Description "<JobNoticePeriod>" and "<City>"and "<City Area>"
Then User should be able to edit the job details from Dashboard also "<JobNoticePeriodForDashboard>"
Then On Employer Dashboard updated job details in read only mode must be displayed on clicking View Job Description "<JobNoticePeriodForDashboard>"
Then Verify JobUpdate entry should be created
Then Verify Audit log should be created
Examples:
|  Username       | Password  | JobNoticePeriod |City    | City Area | JobNoticePeriodForDashboard|
|  pemp@gmail.com | 12345678  |  50             |Chennai | Vandalur  | 30                          |


@jobScenario3 
Scenario Outline: User adds new skill to the added job 
	Given User logged in to HireXpert "<Username>" and "<Password>" 
	Given job must be added and share with agency "<agencyName>" 
		| title     | agytitle         | designation | industry    | location | budget | minexp | maxexp | minsal | maxsal | Name | Email         | contact | totalinterviews | organization | agyorganization | functionalArea |
		| Developer | Agynew Developer | developer   | IT software | pune     | 400000 |      1 |      2 | 450000 | 800000 | pe1  | pe1@gmail.com | 1234564 |               2 | Hirexpert    | rahitech        | java           |
	And Add candidate to selected job "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>"	
#	And Verify Skill match score of candidate
	When user edit the job and Add new skills "<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>" 
	And update the candidate skill "<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>" 
	Then New skills "<Skill1>","<Skill2>","<Skill3>" should be added to existing job and should be visible to everyone with whom the job is shared. 
	When user navigate to dashbaord page
	Then Then On Dashboard, in the job panel the job will be updated with newly added skills "<Skill1>","<Skill2>","<Skill3>"
	When user login as candidate "<CandidateEmail>"
	Then On Candidate Dashboard under Job Hiring section click on job link and verify newly added skills should be visible in the job details dialog "<Skill1>","<Skill2>","<Skill3>"
	And Skill match score of the candidate will change according to the added skills "<Username>" "<Password>"
	Then Verify the job city "<City>" and city area "<CityArea>" is present 
	Then On JobUpdates entry should be created for newly added skills 
	Then On Audit log verify for newly added skill is displayed 
	
	Examples: 
	|Username      |agencyName      |Password |CandidateEmail      |profiletitle         |Name     |ContactNumber |Designation   |Date            |Gender  |OnNoticePeriod|NoticePeriod|LastWorkingDay|experience|CTC   |expectedCTC|Country|City  |CityArea   |ZipCode|Communicationmode|Salaryoffered|distance|permanentAddress|relocate|Skill1  |Skill2       |Skill3    |level1           |level2        |level3  |Weightage1 |Weightage2|Weightage3|certificate1|certificate2|certificate3|remark1            |remark2        |remark3         |certificateforskill1|certificateforskill2|
	|pemp@gmail.com|pagy@gmail.com  |12345678 |hirecan32@gmail.com |jr software developer|hirecan32|8890685538    |Sr.developer  |14/02/1995      |Female  |Yes           |25          |01/09/2021    |1.5       |800000|800000     | India |wardha|Arvi naka  |455966 |Call             |800000       |4       |No              |No      |JAVA    |advanced java|JavaScript|Basic Knowledge  | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |

@jobScenario4
Scenario Outline: User Remove an existing skill from the added job
Given An employer logged in creates a job adds a candidate to the job and shares with agency
And Employer selects added job to edit the job and removes an existing skill
When Job provider clicks on the Submit button.
And Agency logs in to view shared job and checks removed skill is not displayed
And On Candidate Dashboard under Job Hiring section click on job link and verify removed skill should not be displayed in the job details dialog
And Skill match score of the candidate will change according to the removed skills.
Then On JobUpdates entry should be created for removed skills
Then On Audit log verify for removed skill is displayed
Examples:
|  Username       | password | JobNoticePeriod1 |City  | City Area|
|  pemp@gmail.com | 12345    |  45              |Mumbai| Kandivali|	


@jobScenario5  
Scenario Outline: User try to Close existing Job
Given User logged in to HireXpert "<Username>" and "<Password>" 
Given job must be added and share with agency "<Agency Name>" 
		| title     | agytitle         | designation | industry    | location | budget | minexp | maxexp | minsal | maxsal | Name | Email         | contact | totalinterviews | organization | agyorganization | functionalArea |
		| Developer | Agynew Developer | developer   | IT software | pune     | 400000 |      1 |      2 | 450000 | 800000 | pe1  | pe1@gmail.com | 1234564 |               2 | Hirexpert    | rahitech        | java           |
Then On Application Tracking page Employer clicks Close job option and click No button on confirmation popup
Then verify job do not get closed
And Employer selects Close job option and clicks Yes on popup
Then Verify job is now not displayed in the Select Job dropdown on Application Tracking page 
And On Agency Dashboard the job should be displayed in Jobs section with membership as Open "<Agency Name>" and "<Agency Password>" 
And On Agency side application tracking page job should be display with status as Closed in job dropdown 
And Agency try sharing this closed job with its team member verify it shd not get shared and display proper message
Examples:
|  Username       | Password |  Agency Name    | Agency Password|
|  pemp@gmail.com | 12345678 | 	pagy@gmail.com | 12345          |


@jobScenario6 
Scenario Outline:  User try to Re-Open Closed Job
Given An employer logged in and creates a job
Then On Employer dashboard in Job Section Employer Closes the added job
And On Employer dashboard in Job section job Membership is displayed as Closed
And On Application Tracking job is now not displayed
And On Employer dashboard in Job section from Action dropdown select ReOpen Job and select Yes on confirm popup dialog
Then On Employer dashboard in Job section job status displayed as active and membership as Open
And On application tracking job should be displayed with status as Active
Examples:
|  Username       | password | JobNoticePeriod1 |City  | City Area|
|  pemp@gmail.com | 12345    |  45              |Mumbai| Kandivali|	


@jobScenario7
Scenario Outline:  User try to verify Change Status of Job as-Active
Given An employer logged in and creates a job
Then On Application Tracking job staus should be displayed as Active
And On Employer dashboard in Job section job status displayed as active and membership as Open
And On CVStore in Jobs dropdown job status should be displayed as Active
And On CVParser in Jobs dropdown job status should be displayed as Active
Examples:
|  Username       | password | JobNoticePeriod1 |City  | City Area|
|  pemp@gmail.com | 12345    |  45              |Mumbai| Kandivali|	


@jobScenario8
Scenario Outline: User try to verify Change Status of Job as-OnHold
Given An employer logged in creates a job and shares with agency
Then On Application Tracking Employer clicks hamberger menu and selects option Hold Job and clicks Yes on confirm popup
And On Application Tracking Job dropdown status of job is displayed as OnHold
And On Employer dashboard in Job section job status displayed as OnHold and membership as Open
And On CVStore in Jobs dropdown job status should be displayed as OnHold
And On CVParser in Jobs dropdown job status should be displayed as OnHold
And On Agency side in Application tracking Job dropdown status of job is displayed as OnHold
And On Agency dashboard in Job section status of job is displayed as OnHold
And Agency side On CVStore in Jobs dropdown job status should be displayed as OnHold
And Agency side On CVParser in Jobs dropdown job status should be displayed as OnHold
Then On Employer dashboard in Job section from Action dropdown select UnHold Job and select Yes on confirm popup dialog
And On Employer dashboard in Job section job status displayed as Active and membership as Open
And On Application Tracking Job dropdown status of job is displayed as Active
And On CVStore in Jobs dropdown job status should be displayed as Active
And On CVParser in Jobs dropdown job status should be displayed as Active
And On Agency dashboard in Job section status of job is displayed as Active
And On Agency side in Application tracking Job dropdown status of job is displayed as Active
And Agency side On CVStore in Jobs dropdown job status should be displayed as Active
And Agency side On CVParser in Jobs dropdown job status should be displayed as Active
Examples:
|  Username       | password | JobNoticePeriod1 |City  | City Area|
|  pemp@gmail.com | 12345    |  45              |Mumbai| Kandivali|	


@jobScenario9
Scenario Outline: User try to Clone existing Job
Given An employer logged in and creates a job
Then On Employer dashboard in Job section from Action dropdown select Clone Job and select Yes on confirm popup dialog
And On Application Tracking cloned job is displayed
And On CVStore in Jobs dropdown cloned job is displayed
And On CVParser in Jobs dropdown cloned job is displayed
Examples:
|  Username       | password | JobNoticePeriod1 |City  | City Area|
|  pemp@gmail.com | 12345    |  45              |Mumbai| Kandivali|	


