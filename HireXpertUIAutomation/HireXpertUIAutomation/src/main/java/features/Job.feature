Feature: Job 

@job 
Scenario Outline: Verify the Block functionality for Agency with Employer login 

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
	   