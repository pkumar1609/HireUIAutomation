Feature: Job Update

@BVTC @jobupdate
  Scenario Outline: To verify user is able to add and edit job for Employer and Agency login
  
    Given User must be registered
	And Click on Employer-Agency Signin link
	And Employer enters valid credentials
	And Go to workbench
	And Click on add job button
	And Add job
	|title		  |agytitle		   |designation      |industry    |location |budget |minexp|maxexp|minsal|maxsal|Name |         Email   | contact  |totalinterviews|organization|agyorganization|functionalArea|
	|Ux Developer |Uxagy Developer |developer        |IT software |pune     |400000 |1     |2     |450000|800000|pe1  | pe1@gmail.com   | 1234564  |2			    |Hirexpert   |rahitech       |java|
	And Select a added job
    And click on Edit Job button to make changes in job
    And make any changes in the job "<JobNoticePeriod1>"
    And click on submit button
    And click on Edit Job button to make changes in job
    And Now Click on Add Skill button to add more than ten skills
    Then Verify that user get an alert message as "User should not add more than 10 skills" for adding more than ten skills
    And click on Delete Skill button in front of any skill
    
    
Examples:
|    email address     |  password  |  JobNoticePeriod1 |
|  pemp@gmail.com      |   12345    |    60             | 
|  pagy@gmail.com      |   12345    |    45             | 


#TC ID - 15,21,22,46,74,76,94

# If DB clear, register the employer first = employermain01@gmail.com and agency = agencymain01@gmail.com . 
#otherwise no change required

