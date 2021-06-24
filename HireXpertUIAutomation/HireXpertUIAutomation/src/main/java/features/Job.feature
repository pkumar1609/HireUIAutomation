Feature: Job 

@Job
Scenario Outline: User adds new job and should be displayed to all 
Given User logged in to HireXpert "<Username>" and "<Password>" 
And Logged-In user creates new job 
| title     | agytitle         | designation | industry    | location | budget | minexp | maxexp | minsal | maxsal | Name | Email         | contact | totalinterviews | organization | agyorganization | functionalArea |
| Developer | Agynew Developer | developer   | IT software | pune     | 400000 |      1 |      2 | 450000 | 800000 | pe1  | pe1@gmail.com | 1234564 |               2 | Hirexpert    | rahitech        | java           |
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
Then Share job should be display on applicant tracking page at agency side "<AgencyName>" 
Examples: 
| Username       | Password | AgencyName      |
| pemp@gmail.com | 12345    | pagy@gmail.com |
		
		
@Job
Scenario Outline: User edits added job by adding new changes 
Given User logged in to HireXpert "<Username>" and "<Password>" 
And Logged-In user creates new job
| title     | agytitle         | designation | industry    | location | budget | minexp | maxexp | minsal | maxsal | Name | Email         | contact | totalinterviews | organization | agyorganization | functionalArea |
| Developer | Agynew Developer | developer   | IT software | pune     | 400000 |      1 |      2 | 450000 | 800000 | pe1  | pe1@gmail.com | 1234564 |               2 | Hirexpert    | rahitech        | java           | 
And Employer edit added job and update job details "<JobNoticePeriod>" and "<City>"and "<City Area>" 
Then Updated details should display in Edit Job on Application Tracking "<JobNoticePeriod>" and "<City>"and "<City Area>" 
Then On Employer Dashboard updated job details in read only mode must be displayed on clicking View Job Description "<JobNoticePeriod>" and "<City>"and "<City Area>" 
Then User should be able to edit the job details from Dashboard also "<JobNoticePeriodForDashboard>" 
Then On Employer Dashboard updated job details in read only mode must be displayed on clicking View Job Description "<JobNoticePeriodForDashboard>" 
Then Verify JobUpdate entry should be created 
Then Verify Audit log should be created 
Examples: 
|Username       | Password | JobNoticePeriod |City    | City Area | JobNoticePeriodForDashboard|
|pemp@gmail.com | 12345    |  50             |Chennai | Vandalur  | 30                         |
				
				
@Job
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
|Username      |agencyName      |Password |CandidateEmail              |profiletitle         |Name             |ContactNumber|Designation   |Date      |Gender|OnNoticePeriod|NoticePeriod|LastWorkingDay|experience|CTC   |expectedCTC|Country|City  |CityArea |ZipCode|Communicationmode|Salaryoffered|distance|permanentAddress|relocate|Skill1  |Skill2       |Skill3    |level1          |level2        |level3  |Weightage1 |Weightage2|Weightage3|certificate1|certificate2|certificate3|remark1            |remark2        |remark3         |certificateforskill1|certificateforskill2|
|pemp@gmail.com|pagy@gmail.com  |12345    |hirecanNewSkill01@gmail.com |jr software developer|hirecanNewSkill01|8810685538   |Sr.developer  |14/02/1995|Female|Yes           |25          |01/09/2021    |1.5       |800000|800000     | India |Mumbai|Vikroli  |455966 |Call             |800000       |4       |No              |No      |JAVA    |advanced java|JavaScript|Basic Knowledge | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|Sun microsoft       |advanced version    |

						
@Job
Scenario Outline: User Remove an existing skill from the added job 
Given User logged in to HireXpert "<Username>" and "<Password>" 
And job must be added with skill and share with agency "<agencyName>" "<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>" 
| title     | agytitle         | designation | industry    | location | budget | minexp | maxexp | minsal | maxsal | Name | Email         | contact | totalinterviews | organization | agyorganization | functionalArea |
| Developer | Agynew Developer | developer   | IT software | pune     | 400000 |      1 |      2 | 450000 | 800000 | pe1  | pe1@gmail.com | 1234564 |               2 | Hirexpert    | rahitech        | java           |
And Add candidate to selected job "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>" 
When Employer selects added job to edit the job and removes an existing skill "<Skill1>","<Skill2>","<Skill3>" 
Then Agency "<agencyName>" "<Password>" logs in to view shared job and checks removed skill is not displayed "<Skill1>","<Skill2>","<Skill3>" 
When user login as candidate "<CandidateEmail>" 
Then On Candidate Dashboard under Job Hiring section click on job link and verify removed skill should not be displayed in the job details dialog "<Skill1>","<Skill2>","<Skill3>" 
And Skill match score of the candidate will change according to the removed skills "<Username>" "<Password>" 
Then On JobUpdates entry should be created for removed skills 
Then On Audit log verify for removed skill is displayed 
Examples: 
|Username      |agencyName      |Password |CandidateEmail      |profiletitle         |Name     |ContactNumber |Designation   |Date       |Gender  |OnNoticePeriod|NoticePeriod|LastWorkingDay|experience|CTC   |expectedCTC|Country|City  |CityArea   |ZipCode|Communicationmode|Salaryoffered|distance|permanentAddress|relocate|Skill1  |Skill2       |Skill3    |level1           |level2        |level3  |Weightage1 |Weightage2|Weightage3|certificate1|certificate2|certificate3|remark1            |remark2        |remark3         |certificateforskill1|certificateforskill2|
|pemp@gmail.com|pagy@gmail.com  |12345    |hirecanNewSkill02@gmail.com |jr software developer|hirecanNewSkill02|8820685538    |Sr.developer  |14/02/1995 |Female  |Yes           |25          |01/09/2021    |1.5       |800000|800000     | India |Mumbai| Panvel  |455966 |Call             |800000       |4       |No              |No      |JAVA    |advanced java|JavaScript|Basic Knowledge  | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |
								
								
@Job
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
And Agency try sharing this closed job with its team member verify it shd not get shared and display proper message "<Agency Team Member>" 
Then Employer should be able closed the job from Dashboard "<Username>" and "<Password>" 
| title     | agytitle         | designation | industry    | location | budget | minexp | maxexp | minsal | maxsal | Name | Email         | contact | totalinterviews | organization | agyorganization | functionalArea |
| Developer | Agynew Developer | developer   | IT software | Mumbai   | 600000 |   2    |   5    | 450000 | 700000 | pe1  | pe1@gmail.com | 1234564 |    2            | Hirexpert    | rahitech        | java           |
Examples: 
|  Username       | Password |  Agency Name    | Agency Password|Agency Team Member |
|  pemp@gmail.com | 12345    | 	pagy@gmail.com | 12345          | pa1               |
										
										
@Job
Scenario Outline: User try to Re-Open Closed Job 
Given User logged in to HireXpert "<Username>" and "<Password>" 
Then Employer add job in dashboard and should be able closed the job from Dashboard 
| title     | agytitle         | designation | industry    | location | budget | minexp | maxexp | minsal | maxsal | Name | Email         | contact | totalinterviews | organization | agyorganization | functionalArea |
| Developer | Agynew Developer | developer   | IT software | Vandalur   | 600000 |   2    |   5    | 450000 | 700000 | pe1  | pe1@gmail.com | 1234564 |    2            | Hirexpert    | rahitech        | java           |
And On Employer dashboard in Job section job membership is displayed as closed 
And On Employer dashboard in Job section from action dropdown select reOpen job and select yes on confirm popup 
Then Verify job status displayed as active and membership as open 
And On application tracking job should be displayed with status as active 
Examples: 
|  Username       | Password | 
|  pemp@gmail.com | 12345    |
												
												
@Job
Scenario Outline: User try to verify Change Status of Job as-Active 
Given User logged in to HireXpert "<Username>" and "<Password>" 
And Logged-In user creates new job 
| title     | agytitle         | designation | industry    | location | budget | minexp | maxexp | minsal | maxsal | Name | Email         | contact | totalinterviews | organization | agyorganization | functionalArea |
| Developer | Agynew Developer | developer   | IT software | pune     | 400000 |      1 |      2 | 450000 | 800000 | pe1  | pe1@gmail.com | 1234564 |               2 | Hirexpert    | rahitech        | java           | 
Then On Application Tracking job status should be displayed as Active 
And On Employer dashboard in Job section job status displayed as active and membership as Open 
And On CVStore in Jobs dropdown job status should be displayed as Active 
And On CVParser in Jobs dropdown job status should be displayed as Active 
Examples: 
|  Username       | Password |
|  pemp@gmail.com | 12345    |	
														
														
@Job
Scenario Outline: User try to verify Change Status of Job as-OnHold 
Given User logged in to HireXpert "<Username>" and "<Password>" 
Given job must be added and share with agency "<Agency Name>" 
| title     | agytitle         | designation | industry    | location | budget | minexp | maxexp | minsal | maxsal | Name | Email         |contact    |totalinterviews | organization | agyorganization | functionalArea |
| Developer | Agynew Developer | developer   | IT software | pune     | 400000 |  2     |  5     | 200000 | 500000 | pe1  | pe1@gmail.com |9812034564 |  2             | Hirexpert    | rahitech        | java           | 
Then Employer selects newly created job and clicks Hold Job option on Application Tracking 
And verify job status changed to Hold 
And On Agency Dashboard the job should be displayed in Jobs section with membership as Open "<Agency Name>" and "<Agency Password>" 
And On Agency side application tracking page job should be display with status as Hold in job dropdown 
And Agency try sharing this Hold job with its team member verify it should not get shared and display proper message "<Agency Team Member>" 
And On Agency CVStore in jobs dropdown job status should be displayed as OnHold 
And On Agency CVParser in jobs dropdown job status should be displayed as OnHold 
And On Employer dashboard in job section job status should be displayed as OnHold and membership as Open "<Username>" and "<Password>" 
And On Employer CVStore in jobs dropdown job status should be displayed as OnHold 
And On Employer CVParser in jobs dropdown job status should be displayed as OnHold 
Then On Employer dashboard in job section from Action dropdown select UnHold Job and select Yes on confirm popup 
And On Employer dashboard in job section job status should be displayed as Active and membership as Open 
And On Employer Application Tracking status of job is displayed as Active 
And On CVStore in jobs dropdown job status should be displayed as Active 
And On CVParser in jobs dropdown job status should be displayed as Active 
And On Agency dashboard in job section status of job is displayed as Active "<Agency Name>" and "<Agency Password>" 
And On Agency Application tracking status of job is displayed as Active 
And On Agency CVStore in jobs dropdown job status should be displayed as Active 
And On Agency CVParser in jobs dropdown job status should be displayed as Active 
Examples: 
|  Username       | Password |  Agency Name    | Agency Password|Agency Team Member |
|  pemp@gmail.com | 12345    | 	pagy@gmail.com | 12345          |  pa1              |
																
																
@Job
Scenario Outline: User try to Clone existing Job 
Given User logged in to HireXpert "<Username>" and "<Password>" 
And Logged-In user creates new job 
| title     | agytitle         | designation | industry    | location | budget | minexp | maxexp | minsal | maxsal | Name | Email         | contact | totalinterviews | organization | agyorganization | functionalArea |
| Developer | Agynew Developer | developer   | IT software | pune     | 400000 |      1 |      2 | 450000 | 800000 | pe1  | pe1@gmail.com | 1234564 |               2 | Hirexpert    | rahitech        | java           | 
Then On Application Tracking job status should be displayed as Active 
Then On Employer dashboard in Job section from Action dropdown select Clone Job and select Yes on confirm popup dialog 
And On Application Tracking cloned job is displayed 
And On CVStore in Jobs dropdown cloned job is displayed 
And On CVParser in Jobs dropdown cloned job is displayed 
Examples: 
|  Username       | Password |
|  pemp@gmail.com | 12345    |	
																		
																		
