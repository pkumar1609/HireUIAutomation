Feature: Task Feature

@TC264_266 @BVT @task
Scenario Outline: Verify functionality of adding general task and particular task from Employer login

Given User must be registered

When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
Given team member should be added
|Name|         Email   | contact  |Nameagy  |         Emailagy  | contactagy  |team  |agyteam |
|pe1 | pe1@gmail.com   | 1234564  |pa1      |pa1@gmail.com		|1234556      |pe1   |pa1     |
|pe2 | pe2@gmail.com   | 1234564  |pa2      |pa2@gmail.com		|1234566      |pe1   |pa1	  |
And Go to workbench
And Add job
|title    |designation |industry   |jobrole        |location |budget |minexp|maxexp|
|taskjob1 |developer   |IT software|java developer |pune     |400000 |1     |2     |	
And Select a added job
And Share job with team member
|EmpTeam|Agyteam|
|pe1    |pa1    |
And Go to dashboard
And Click on Add task button and enter all details employer
|Title for emp      |teamField |AssignTo |note                             |employer            |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|genral task        |pemp      |pe1      |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |particular task  |pagy         |pa1         |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com        |
And the task should display for employer
And Logout from App
And Click on Employer-Agency Signin link
And Login with team member
And Task should also display for employer team member
And Logout from App
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And Go to workbench
And Select a added job
And Click on Add task button and enter all details employer
|Title for emp      |teamField |AssignTo |note                             |employer            |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|particular task    |pemp      |pe1      |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |particular task  |pagy         |pa1         |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com        |
And Go to dashboard
And the task should display for employer
And Logout from App
And Click on Employer-Agency Signin link
And Login with team member
Then Task should also display for employer team member
Examples:
|Username      |Password|
|pemp@gmail.com|12345   |


@TC265_267 @BVT @task
Scenario Outline: Verify agency can add general task and particular task.
Given User must be registered
When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
Given team member should be added
|Name|         Email   | contact  |Nameagy  |         Emailagy  | contactagy  |team  |agyteam |
|pe1 | pe1@gmail.com   | 1234564  |pa1      |pa1@gmail.com		|1234556      |pe1   |pa1     |
|pe2 | pe2@gmail.com   | 1234564  |pa2      |pa2@gmail.com		|1234566      |pe1   |pa1	  |
And Go to workbench
And Add job
|agytitle        |designation |industry   |jobrole        |location |budget |minexp|maxexp|Name |         Email   | contact  |
|agencyjobtask1  |developer   |IT software|java developer |pune     |400000 |1     |2     |pe1  | pe1@gmail.com   | 1234564  |
And Select a added job
And Share job with team member
|EmpTeam|Agyteam|
|pe1    |pa1    |
And Go to dashboard
And Click on Add task button and enter all details for agency
|Title for emp  |teamField |AssignTo |note                             |employer            |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|genral task 1    |pemp      |pe1      |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |particular task  |pagy         |pa1         |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com        |
Then the task should display for agency
And Logout from App
And Click on Employer-Agency Signin link
And Login with team member
Then Task should also display for agency team member 
And Logout from App
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And Go to workbench
And Select a added job
And Click on Add task button and enter all details for agency
|Title for emp      |teamField |AssignTo |note                             |employer            |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|particular task 1   |pemp      |pe1      |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |particular task  |pagy         |pa1         |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com         |
And Go to dashboard
Then the task should display for agency
And Logout from App
And Click on Employer-Agency Signin link
And Login with team member
Then Task should also display for agency team member 
Examples:
|Username      |Password|
|pagy@gmail.com|12345   |


@TC275 @BVT @task
Scenario Outline: Verify only creator of the general task can delete that general task
Given User must be registered
When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
Given team member should be added
|Name|         Email   | contact  |Nameagy  |         Emailagy  | contactagy  |team  |agyteam |
|pe1 | pe1@gmail.com   | 1234564  |pa1      |pa1@gmail.com		|1234556      |pe1   |pa1     |
|pe2 | pe2@gmail.com   | 1234564  |pa2      |pa2@gmail.com		|1234566      |pe1   |pa1	  |
And Go to workbench
And Select a job
And Share job with team member
|EmpTeam|Agyteam|
|pe1    |pa1    |
And Go to dashboard
And Click on Add task button and enter all details
|Title for emp    |teamField |AssignTo |note                             |employer          |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|task1            |pemp      |pe1      |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |Genral task      |pagy         |pa1         |Task should complete before time    |pagy   		    |pe1       |pe1@gmail.com        |
And Logout from App
And Click on Employer-Agency Signin link
And Login with team member
And Click on Delete task
And observe the message
And Logout from App
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
Then Delete the task
Examples:
|Username      |Password|
|pemp@gmail.com|12345   |
|pagy@gmail.com|12345   |


@TC282 @BVT @task
Scenario Outline: Verify only creator of the particular task can delete the task
Given User must be registered
When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And team member should be added
|Name|         Email   | contact  |Nameagy  |         Emailagy  | contactagy  |team  |agyteam |
|pe1 | pe1@gmail.com   | 1234564  |pa1      |pa1@gmail.com		|1234556      |pe1   |pa1     |
|pe2 | pe2@gmail.com   | 1234564  |pa2      |pa2@gmail.com		|1234566      |pe1   |pa1	  |
And Go to workbench
And Select a job
And Share job with team member
|EmpTeam|Agyteam|
|pe1    |pa1    |
And Go to workbench
And Select a job 
And Click on Add task button and enter all details 
|Title for emp      |teamField |AssignTo |note                             |employer            |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|task2    |pemp      |pe1      |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |particular task  |pagy         |pa1         |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com        |
And Logout from App
And Click on Employer-Agency Signin link
And Login with team member
And Click on Delete task
And Logout from App
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
Then Delete the task
Examples:
|Username      |Password|
|pemp@gmail.com|12345   |
|pagy@gmail.com|12345   |



@TC302 @BVT @task
Scenario Outline: verify the functionality of edit for general tasks
Given User must be registered
When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And team member should be added
|Name|         Email   | contact  |Nameagy  |         Emailagy  | contactagy  |team  |agyteam |
|pe1 | pe1@gmail.com   | 1234564  |pa1      |pa1@gmail.com		|1234556      |pe1   |pa1     |
|pe2 | pe2@gmail.com   | 1234564  |pa2      |pa2@gmail.com		|1234566      |pe1   |pa1	  |
And Go to workbench
And Select a job
And Share job with team member
|EmpTeam|Agyteam|
|pe1    |pa1    |
And Go to dashboard
And Click on Add task button and enter all details
|Title for emp    |teamField |AssignTo |note                             |employer          |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|Genral task      |pemp      |pe1      |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |Genral task      |pagy         |pa1         |Task should complete before time    |pagy   		    |pe1       |pe1@gmail.com        |
And Go to dashboard
And Click on edit task
And edit the task "<editedtask>"and "<editednote>"
And Click on edit task
Then verify all the edited details "<editedtask>"and "<editednote>"

Examples:
|Username      |Password|task    |team|Assignto|note                             |editedtask|editednote          |
|pemp@gmail.com|12345   |task11  |pemp|pe1     |Task should complete before time |task2     |complete before 1 pm|
|pagy@gmail.com|12345  |task11  |pagy|pa1      |Task should complete before time |task2     |complete before 1 pm|


@TC305 @BVT @task
Scenario Outline: verify the functionality of edit for particular tasks
Given User must be registered
When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And team member should be added
|Name|         Email   | contact  |Nameagy  |         Emailagy  | contactagy  |team  |agyteam |
|pe1 | pe1@gmail.com   | 1234564  |pa1      |pa1@gmail.com		|1234556      |pe1   |pa1     |
|pe2 | pe2@gmail.com   | 1234564  |pa2      |pa2@gmail.com		|1234566      |pe1   |pa1	  |
And Go to workbench
And Select a job
And Share job with team member
|EmpTeam|Agyteam|
|pe1    |pa1    |
And Go to workbench
And Select a job 
And Click on Add task button and enter all details
|Title for emp      |teamField |AssignTo |note                             |employer          |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|particular task    |pemp      |pe1      |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |Genral task      |pagy         |pa1         |Task should complete before time    |pagy   		    |pe1       |pe1@gmail.com        |
And Go to dashboard
And Click on edit task
And edit the task "<editedtask>"and "<editednote>"
And Click on edit task
Then verify all the edited details "<editedtask>"and "<editednote>"

Examples:
|Username      |Password|task    |team|Assignto|note                             |editedtask|editednote          |
|pemp@gmail.com|12345   |task11  |pemp|pe1     |Task should complete before time |task2     |complete before 1 pm|
|pagy@gmail.com|12345   |task11  |pagy|pa1     |Task should complete before time |task2     |complete before 1 pm|


@TC294 @BVT @task
Scenario Outline: to verify refresh button functionality
Given User must be registered
When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And team member should be added
|Name|         Email   | contact  |Nameagy  |         Emailagy  | contactagy  |team  |agyteam |
|pe1 | pe1@gmail.com   | 1234564  |pa1      |pa1@gmail.com		|1234556      |pe1   |pa1     |
|pe2 | pe2@gmail.com   | 1234564  |pa2      |pa2@gmail.com		|1234566      |pe1   |pa1	  |
And Go to workbench
And Select a job
And Share job with team member
|EmpTeam|Agyteam|
|pe1    |pa1    |
And Go to dashboard
And Click on Add task button and enter all details
|Title for emp    |teamField |AssignTo |note                             |employer          |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|Genral task      |pemp      |pe1      |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |Genral task      |pagy         |pa1         |Task should complete before time    |pagy   		    |pe1       |pe1@gmail.com        |
|task1            |pemp      |pemp     |note1                            |pemp    		    |pe1       |pe1@gmail.com        |task             |pagy         |pagy        |Task                                |pagy   		    |pe1       |pe1@gmail.com        |
And Click on My Task
Then Click on Reload Task button
And Click on Team Task
Then Click on Reload Task button

Examples:
|Username      |Password|
|pemp@gmail.com|12345   |
|pagy@gmail.com|12345   |



#regression task

@TC269_271
Scenario Outline: to verify Mark inprogress task functionality from employer employers team login
Given User must be registered
When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And team member should be added
|Name|         Email   | contact  |Nameagy  |         Emailagy  | contactagy  |team  |agyteam |
|pe1 | pe1@gmail.com   | 1234564  |pa1      |pa1@gmail.com		|1234556      |pe1   |pa1     |
|pe2 | pe2@gmail.com   | 1234564  |pa2      |pa2@gmail.com		|1234566      |pe1   |pa1	  |
And Click on Add task button and enter all details employer
|Title for emp      |teamField  |AssignTo |note                             |employer        |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|task5              |pemp       |pe1      |Task should complete before time |pemp    		|  pe1       |pe1@gmail.com       |taskagy  |pagy         |pa1         |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com        |
And the task should display for loggedinuser
And Logout from App
And Click on Employer-Agency Signin link
And Login with team member
And the task should display for loggedinuser
And Click on mark in progress
And Logout from App
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And Go to dashboard
And the task should display for loggedinuser with Status "Inprogress"
And Logout from App
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And Click on Add task button and enter all details employer
|Title for emp    |teamField |AssignTo |note                             |employer            |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|task6            |pemp      |pemp     |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |particular task  |pagy         |pagy        |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com        |
And the task should display for loggedinuser
And Click on mark in progress
And Logout from App
And Click on Employer-Agency Signin link
And Login with team member
And the task should display for loggedinuser with Status "Inprogress"
Examples:
|Username      |Password|
|pemp@gmail.com|12345   |
#|pagy@gmail.com|12345   |


@TC273
Scenario Outline: to verify Mark Completed task functionality from employer and employers team login
Given User must be registered
When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And Click on Add task button and enter all details employer
|Title for emp      |teamField |AssignTo |note                             |employer   |team    |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|task4              |pemp      |pe1      |Task should complete before time |pemp       |pe1     |pe1@gmail.com        |particular task  |pagy         |pa1         |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com        |
And the task should display for loggedinuser
And Logout from App
And Click on Employer-Agency Signin link
And Login with team member
And Task should also display for employer team member
And Click on Mark Complete
And Logout from App
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And the task should not display on employer side
And Logout from App
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And Click on Add task button and enter all details employer
|Title for emp      |teamField |AssignTo |note                             |employer   |team  |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|task5              |pemp      |pemp     |Task should complete before time |pemp    	|pe1   |pe1@gmail.com        |particular task  |pagy         |pagy        |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com        |
And the task should display for loggedinuser
And Logout from App
And Click on Employer-Agency Signin link
And Login with team member
And the task should display for loggedinuser
And Logout from App
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And the task should display for employer
And Click on Mark Complete
And Logout from App
And Click on Employer-Agency Signin link
And Login with team member
And the task should not display on employer side

Examples:
|Username      |Password|
#|pemp@gmail.com|12345   |
|pagy@gmail.com|12345   |


@TC276_278
Scenario Outline: Verify particular job task status changed in employer if task assignee put task in (in-progress)
Given User must be registered
When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And team member should be added
|Name|         Email   | contact  |Nameagy  |         Emailagy  | contactagy  |team  |agyteam |
|pe1 | pe1@gmail.com   | 1234564  |pa1      |pa1@gmail.com		|1234556      |pe1   |pa1     |
|pe2 | pe2@gmail.com   | 1234564  |pa2      |pa2@gmail.com		|1234566      |pe1   |pa1	  |
And Go to workbench
And Add job
|title        |designation |industry   |jobrole        |location |budget |minexp|maxexp|Name |         Email   | contact  |agytitle|
|taskjob2   |developer   |IT software|java developer |pune     |400000 |1     |2     |pe1  | pe1@gmail.com   | 1234564  |Agyjobtask|
And Select a job
And Share job with team member
|EmpTeam|Agyteam|
|pe1    |pa1    |
And Go to workbench
And Select a job
And Click on Add task button and enter all details
|Title for emp      |teamField |AssignTo |note                             |employer            |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|task2    |pemp      |pe1      |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |particular task  |pagy         |pa1         |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com        |
And Go to dashboard
And the task should display for loggedinuser
And Logout from App
And Click on Employer-Agency Signin link
And Login with team member
And the task should display for loggedinuser
And Click on mark in progress
And Logout from App
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And Go to dashboard
And the task should display for loggedinuser with Status "Inprogress"
And Logout from App
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And Go to workbench
And Select a job 
And Click on Add task button and enter all details employer
|Title for emp      |teamField |AssignTo |note                             |employer            |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|task5              |pemp      |pemp     |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |particular task  |pagy         |pagy        |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com        |
And Go to dashboard
And the task should display for loggedinuser
And Click on mark in progress
And Logout from App
And Click on Employer-Agency Signin link
And Login with team member
And the task should display for loggedinuser with Status "Inprogress"
Examples:
|Username      |Password|
|pemp@gmail.com|12345   |
|pagy@gmail.com|12345   |

@TC280
Scenario Outline: verify particular job task removed from employer and team member dashboard if task mark as done
Given User must be registered
When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And Go to workbench
And Add job
|title        |designation |industry   |jobrole        |location |budget |minexp|maxexp|Name |         Email   | contact  |agytitle|
|taskjob2   |developer   |IT software|java developer |pune     |400000 |1     |2     |pe1  | pe1@gmail.com   | 1234564  |Agyjobtask|
And Select a job
And Share job with team member
|EmpTeam|Agyteam|
|pe1    |pa1    |
And Go to workbench
And Select a job 
And Click on Add task button and enter all details employer
|Title for emp      |Title for agy    |teamField |AssignTo |note                             |employer            |team      |teamid               |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|task6              |task6            |pemp      |pe1     |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |pagy         |pa1    |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com        |
And Go to dashboard
And the task should display for loggedinuser
And Logout from App
And Click on Employer-Agency Signin link
And Login with team member
And Task should also display for employer team member
And Click on Mark Complete
And Logout from App
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
Then the task should not display on employer side
And Logout from App
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And Go to workbench
And Select a job 
And Click on Add task button and enter all details employer
|Title for emp      |Title for agy    |teamField |AssignTo |note                             |employer            |team      |teamid               |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|task7              |task7            |pemp      |pe1     |Task should complete before time |pemp    		      |pe1       |pe1@gmail.com        |pagy         |pa1        |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com        |
And Go to dashboard
And the task should display for loggedinuser
And Logout from App
And Click on Employer-Agency Signin link
And Login with team member
And the task should display for loggedinuser
And Logout from App
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And the task should display for employer
And Click on Mark Complete
And Logout from App
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And the task should not display on employer side

Examples:
|Username      |Password|
|pemp@gmail.com|12345   |
|pagy@gmail.com|12345   |



@TC330
Scenario Outline: To verify third team member can make task in progress or in completed status
Given User must be registered
When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And team member should be added
|Name|         Email   | contact  |Nameagy  |         Emailagy  | contactagy  |team  |agyteam |
|pe1 | pe1@gmail.com   | 1234564  |pa1      |pa1@gmail.com		|1234556      |pe1   |pa1     |
|pe2 | pe2@gmail.com   | 1234564  |pa2      |pa2@gmail.com		|1234566      |pe1   |pa1	  |
And Click on Add task button and enter all details employer
|Title for emp      |teamField |AssignTo |note                             |employer            |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|task11             |pemp      |pe1      |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |particular task  |pagy         |pa1         |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com        |
And the task should display for loggedinuser
And Logout from App
And Click on Employer-Agency Signin link
And Login with team member
And the task should display for loggedinuser
And Logout from App
And Click on Employer-Agency Signin link
And login as third employer team "<teamid2>"
And the task should display for loggedinuser
And Click on mark in progress
And third user should not able to put task in progress

Examples:
|Username      |Password|teamid2      |
|pemp@gmail.com|12345   |Pe2@gmail.com|
|pagy@gmail.com|12345   |pa2@gmail.com|



@TC306
Scenario Outline: verify the functionality of edit for general task assign to team member
Given User must be registered
When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And team member should be added
|Name|         Email   | contact  |Nameagy  |         Emailagy  | contactagy  |team  |agyteam |
|pe1 | pe1@gmail.com   | 1234564  |pa1      |pa1@gmail.com		|1234556      |pe1   |pa1     |
|pe2 | pe2@gmail.com   | 1234564  |pa2      |pa2@gmail.com		|1234566      |pe1   |pa1	  |
And Click on Add task button and enter all details employer
|Title for emp      |teamField |AssignTo |note                             |employer            |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|task10             |pemp      |pe1      |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |particular task  |pagy         |pa1         |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com        |
And the task should display for loggedinuser
And Logout from App
And Click on Employer-Agency Signin link
And Login with team member
And the task should display for loggedinuser
And Click on edit task
And verify All previously added details of task"<Task>","<team>","<Assignto>" and "<note>"
And edit the task "<editedtask>"and "<editednote>"
And Click on edit task
Then verify all the edited details "<editedtask>"and "<editednote>"
And Go to workbench
And Select a job 
And Click on Add task button and enter all details employer
|Title for emp      |Title for agy    |teamField |AssignTo |note                             |employer            |team      |teamid               |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|task7              |task7            |pemp      |pe1     |Task should complete before time |pemp    		      |pe1       |pe1@gmail.com        |pagy         |pa1        |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com        |
And Go to dashboard
And the task should display for loggedinuser
And Logout from App
And Click on Employer-Agency Signin link
And Login with team member
And the task should display for loggedinuser
And Click on edit task
And verify All previously added details of task"<Task>","<team>","<Assignto>" and "<note>"
And edit the task "<editedtask>"and "<editednote>"
And Click on edit task
Then verify all the edited details "<editedtask>"and "<editednote>"


Examples:
|Username      |Password|task    |team|Assignto|note                             |editedtask|editednote          |
|pemp@gmail.com|12345   |task11  |pemp|pe1     |Task should complete before time |task2     |complete before 1 pm|
#|pagy@gmail.com|12345   |task11  |pagy|pa1     |Task should complete before time |task2     |complete before 1 pm|


@TC336_350
Scenario: Verify task added for agency owner by team member display in teamtask when owner mark in progres
Given User must be registered
When title of login page is Home
And Click on Employer-Agency Signin link
And agency enters valid credentials
And team member should be added
|Name|         Email   | contact  |Nameagy  |         Emailagy  | contactagy  |team  |agyteam |
|pe1 | pe1@gmail.com   | 1234564  |pa1      |pa1@gmail.com		|1234556      |pe1   |pa1     |
|pe2 | pe2@gmail.com   | 1234564  |pa2      |pa2@gmail.com		|1234566      |pe1   |pa1	  |
And Logout from App
And Click on Employer-Agency Signin link
And Login with team member
And Click on Add task button and enter all details for agency
|Title for agy    |agyteamField |agyAssignTo |agynote                           |agency |agyteam   |agyteamid       |
|particular task  |pagy         |pagy        |Task should complete before time  |pagy   |pa1       |pe1@gmail.com   | 
And the task should display for loggedinuser
And Logout from App
And Click on Employer-Agency Signin link
And agency enters valid credentials
And the task should display for loggedinuser
And Click on mark in progress
And Logout from App
And Click on Employer-Agency Signin link
And agency enters valid credentials
And the task should display for loggedinuser with Status "Inprogress"
And Logout from App
And Click on Employer-Agency Signin link
And Login with team member
And Go to workbench
And Select a job 
And Click on Add task button and enter all details for agency
|Title for emp      |teamField |AssignTo |note                             |employer            |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|task9              |pemp      |pemp     |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |task9            |pagy         |pagy        |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com        |
And Go to dashboard
And the task should display for loggedinuser
And Logout from App
And Click on Employer-Agency Signin link
And agency enters valid credentials
And the task should display for loggedinuser
And Click on mark in progress
And Logout from App
And Click on Employer-Agency Signin link
And Login with team member
And the task should display for loggedinuser with Status "Inprogress"





@TC_300
Scenario Outline: Verify Assign To field on Add Task page from Dashboard while updating previously added task 
Given User must be registered
When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And team member should be added
|Name|         Email   | contact  |Nameagy  |         Emailagy  | contactagy  |team  |agyteam |
|pe1 | pe1@gmail.com   | 1234564  |pa1      |pa1@gmail.com		|1234556      |pe1   |pa1     |
|pe2 | pe2@gmail.com   | 1234564  |pa2      |pa2@gmail.com		|1234566      |pe1   |pa1	  |
And Go to workbench
And Add job
|title        |designation |industry   |jobrole        |location |budget |minexp|maxexp|Name |         Email   | contact  |agytitle|
|sharejob     |developer   |IT software|java developer |pune     |400000 |1     |2     |pe1  | pe1@gmail.com   | 1234564  |Agyjobtask|
And Go to workbench
And Select a added job
And Share job with team member
|EmpTeam|Agyteam|
|pe1    |pa1    |
And Click on Add task button and enter all details employer
|Title for emp      |teamField |AssignTo |note                             |employer            |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|task9              |pemp      |pemp     |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |task9            |pagy         |pagy        |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com        |
And verify the options present in teamfeild

Examples:
|Username      |Password|
#|pemp@gmail.com|12345   |
|pagy@gmail.com|12345   |


@TC268
Scenario Outline: Verify auto task generated and deleted for scheduling interview for user who added the candidate
Given User must be registered
When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
#And team member should be added
#|Name|         Email   | contact  |Nameagy  |         Emailagy  | contactagy  |team  |agyteam |
#|pe1 | pe1@gmail.com   | 1234564  |pa1      |pa1@gmail.com		|1234556      |pe1   |pa1     |
#|pe2 | pe2@gmail.com   | 1234564  |pa2      |pa2@gmail.com		|1234566      |pe1   |pa1	  |
And Go to workbench
And Add job
|title        |designation |industry   |jobrole        |location |budget |minexp|maxexp|Name |         Email   | contact  |agytitle|
|candidatejob |developer   |IT software|java developer |pune     |400000 |1     |2     |pe1  | pe1@gmail.com   | 1234564  |Agyjobtask|
And Select a added job
#And Click on add candidate
#And Enter All details of "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>" ,"<Gender>", "<NoticePeriod>","<Location>" and "<Communicationmode>"
#And verify candidate card is displaying or not in New column
And drag the candidate from new column to Schedule interview column
And Go to dashboard
And the Auto generated task should get created for the schedule interview 
And Go to workbench
And Select a added job
And again move the card to next column
And Go to dashboard
And verify the Auto generated task is getting deleted or not

Examples:
|Username      |Password|Name   |CandidateEmail   |ContactNumber|Designation   |Gender|NoticePeriod | Location|Communicationmode|
|pemp@gmail.com|12345   |Pratik |pratik@gmail.com |4564668596   |developer     |Male  |30           |pune     |Email            |
#|pagy@gmail.com|12345  |Abhijit|Abhijit@gmail.com|9856558555   |Java developer|Male  |30           |pune     |Email            |


@TC321
Scenario Outline: verify auto generated popup get closed when candidate got rejected
Given User must be registered
When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
#And team member should be added
#|Name|         Email   | contact  |Nameagy  |         Emailagy  | contactagy  |team  |agyteam |
#|pe1 | pe1@gmail.com   | 1234564  |pa1      |pa1@gmail.com		|1234556      |pe1   |pa1     |
#|pe2 | pe2@gmail.com   | 1234564  |pa2      |pa2@gmail.com		|1234566      |pe1   |pa1	  |
And Go to workbench
And Add job
|title         |designation |industry   |jobrole        |location |budget |minexp|maxexp|Name |         Email   | contact  |agytitle|
|candidatejob2 |developer   |IT software|java developer |pune     |400000 |1     |2     |pe1  | pe1@gmail.com   | 1234564  |Agyjobtask|
And Select a added job
#And Click on add candidate
#And Enter All details of "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>" ,"<Gender>", "<NoticePeriod>","<Location>" and "<Communicationmode>"
#And verify candidate card is displaying or not in New column
#And drag the candidate from new column to Schedule interview column
#And Go to dashboard
#And the Auto generated task should get created for the schedule interview 
#And Go to workbench
#And Select a adjeded job
#And click on rect icon on candidate card
And verify the candidate card it should display in reject column

Examples:
|Username      |Password|Name   |CandidateEmail   |ContactNumber|Designation   |Gender|NoticePeriod | Location|Communicationmode|
|pemp@gmail.com|12345   |Pratik |pratik@gmail.com |4564668596   |developer     |Male  |30           |pune     |Email            |
#|pagy@gmail.com|12345  |Abhijit|Abhijit@gmail.com|9856558555   |Java developer|Male  |30           |pune     |Email            |