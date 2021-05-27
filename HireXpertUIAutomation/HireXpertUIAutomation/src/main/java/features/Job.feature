Feature: Job 

@job 
Scenario Outline: Job is added and displayed 

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
		#		| pagy@gmail.com |    12345 |  |
		
@jobScenario2	
Scenario Outline: Verify job edit changes are displayed 
Given Employer must login and goto Application Tracking and open hamburger menu icon to edit job and update job details 
When Job provider clicks on the Submit button
Then Updated jobs details must display on the Dashboard in the job panel for logged in users and job employers
Then Updated job details should display on the Application Tracking page in Jobs dropdown
Then User should be able to edit the job details from Dashboard also
Then On the Dashboard in the job panel, User should be able to view the Job Description dialog along with all the updated job details in read only mode
Then Verify updated job city and city area is present
Then Verify updated jobs JobUpdate entry should be created
Then Verify edited jobs Audit log should be created
Examples:
|  Username       | password | JobNoticePeriod1 |City  | City Area|
|  pemp@gmail.com | 12345    |  45              |Mumbai| Kandivali|	 

@jobScenario3
Scenario Outline:  Add new skill to the added job
Given An employer logged in creates a job and shares with agency to HireXpert
And Employer selects the job and edit it to add a new skill 
When Employer clicks on the Submit button.
Then New skills should be added to existing job and should be visible to everyone with whom the job is shared.
Then On the Dashboard in the job panel user should be able to view the new added skill in the View Job Description dialog in read only mode.
And On Candidate Dashboard, newly added skills should be visible in the job panel
And Skill match score of the candidate will change according to the added skills
Then Verify the job city and city area is present
Then On JobUpdates entry should be created for newly added skills
Then On Audit log verify for newly added skill is displayed  

Examples:
|  Username       | password | JobNoticePeriod1 |City  | City Area|
|  pemp@gmail.com | 12345    |  45              |Mumbai| Kandivali|	 