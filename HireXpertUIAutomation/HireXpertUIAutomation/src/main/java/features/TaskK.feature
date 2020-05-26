Feature: Task Feature

@TC264_266
Scenario: Verify functionality of adding general task and particular task from Employer login

Given User must be registered as Employer profile 

When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials
And Go to dashboard
And Click on Add task button and enter all details employer
|Title for emp      |teamField |AssignTo |note                             |employer            |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|genral task        |pemp      |pe1      |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |particular task  |pagy         |pa1         |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com        |
And the task should display for employer
And Logout from App
And Click on Employer-Agency Signin link
And Login with employer team
And Task should also display for employer team member
And Logout from App
And Click on Employer-Agency Signin link
And Employer enters valid credentials
And Go to workbench
And Select a job
And Click on Add task button and enter all details employer
|Title for emp      |teamField |AssignTo |note                             |employer            |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|particular task    |pemp      |pe1      |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |particular task  |pagy         |pa1         |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com        |
And the task should display for employer
And Logout from App
And Click on Employer-Agency Signin link
And Login with employer team
Then Task should also display for employer team member


@TC265_267
Scenario: Verify agency can add general task and particular task.

Given User must be registered as agency profile 

When title of login page is Home
And Click on Employer-Agency Signin link
And agency enters valid credentials
And Go to dashboard
And Click on Add task button and enter all details for agency
|Title for emp      |teamField |AssignTo |note                             |employer            |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|particular task    |pemp      |pe1      |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |particular task  |pagy         |pa1         |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com        |
Then the task should display for agency
And Logout from App
And Login with agency team
Then Task should also display for agency team member 
And Logout from App
And Go to workbench
And Select a job 
And Click on Add task button and enter all details for agency
|Title for emp      |teamField |AssignTo |note                             |employer            |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|particular task    |pemp      |pe1      |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |particular task  |pagy         |pa1         |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com         |
And Go to dashboard
Then the task should display for agency
And Logout from App
And Login with agency team
Then Task should also display for agency team member 

#jobtask

@TC275
Scenario: Verify only creator of the general task can delete that general task

Given User should be registered
When title of login page is Home
And Click on Employer-Agency Signin link
And user enters valid credentials
Given team member should be added
|Name|         Email   | contact  |Nameagy  |         Emailagy  | contactagy  |team  |agyteam |
|pe1 | pe1@gmail.com   | 1234564  |pa1      |pa1@gmail.com		|1234556      |pe1   |pa1     |
|pe2 | pe2@gmail.com   | 1234564  |pa2      |pa2@gmail.com		|1234566      |pe1   |pa1	  |

And Click on Add task button and enter all details
|Title for emp    |teamField |AssignTo |note                             |employer          |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|Genral task      |pemp      |pe1      |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |Genral task      |pagy         |pa1         |Task should complete before time    |pagy   		    |pe1       |pe1@gmail.com        |
And Logout from App
And Login with team member
And Click on Delete task
And observe the message
And Logout from App
And login as agency/employer
Then Delete the task

@TC282
Scenario: Verify only creator of the particular task can delete the task

Given User should be registered
When title of login page is Home
And Click on Employer-Agency Signin link
And user enters valid credentials
Given team member should be added
|Name|         Email   | contact  |Nameagy  |         Emailagy  | contactagy  |team  |agyteam |
|pe1 | pe1@gmail.com   | 1234564  |pa1      |pa1@gmail.com		|1234556      |pe1   |pa1     |
|pe2 | pe2@gmail.com   | 1234564  |pa2      |pa2@gmail.com		|1234566      |pe1   |pa1	  |
And Go to workbench
And Select a job 
And Click on Add task button and enter all details 
|Title for emp      |teamField |AssignTo |note                             |employer            |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|particular task    |pemp      |pe1      |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |particular task  |pagy         |pa1         |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com        |
And Logout from App
And login as the team member
And try to delete
And Logout from App
And Logout from App
Then click on delete task




@TC302
Scenario: verify the functionality of edit for general tasks

Given User should be registered
When title of login page is Home
And Click on Employer-Agency Signin link
And user enters valid credentials
And Click on Add task button and enter all details
|Title for emp    |teamField |AssignTo |note                             |employer          |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|Genral task      |pemp      |pe1      |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |Genral task      |pagy         |pa1         |Task should complete before time    |pagy   		    |pe1       |pe1@gmail.com        |

And edit the task 
|Title for emp    |teamField |AssignTo |note                             |employer          |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|task1            |pemp      |pe1      |complete before 1 pm             |pemp    		    |pe1       |pe1@gmail.com        |task1            |pagy         |pa1         |complete before 1 pm                |pagy   		    |pe1       |pe1@gmail.com        |

Then verify all the edited details 
|Title for emp    |teamField |AssignTo |note                             |employer          |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|task1            |pemp      |pe1      |complete before 1 pm             |pemp    		    |pe1       |pe1@gmail.com        |task1            |pagy         |pa1         |complete before 1 pm                |pagy   		    |pe1       |pe1@gmail.com        |





@TC305
Scenario: verify the functionality of edit for particular tasks

Given User should be registered
When title of login page is Home
And Click on Employer-Agency Signin link
And user enters valid credentials
And go to workbench
And select job
And Add a task and assign that task to the team member 
|Title for emp      |teamField |AssignTo |note                             |employer          |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|particular task    |pemp      |pe1      |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |Genral task      |pagy         |pa1         |Task should complete before time    |pagy   		    |pe1       |pe1@gmail.com        |
And Go to dashboard
And edit the task 
|Title for emp    |teamField |AssignTo |note                             |employer          |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|task2            |pemp      |pe1      |complete before 1 pm             |pemp    		    |pe1       |pe1@gmail.com        |task1            |pagy         |pa1         |complete before 1 pm                |pagy   		    |pe1       |pe1@gmail.com        |

Then verify all the edited details 
|Title for emp    |teamField |AssignTo |note                             |employer          |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|task2            |pemp      |pe1      |complete before 1 pm             |pemp    		    |pe1       |pe1@gmail.com        |task1            |pagy         |pa1         |complete before 1 pm                |pagy   		    |pe1       |pe1@gmail.com        |
Then verify all the edited details 
|Title for emp    |teamField |AssignTo |note                             |employer          |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|task2            |pemp      |pe1      |complete before 1 pm             |pemp    		    |pe1       |pe1@gmail.com        |task1            |pagy         |pa1         |complete before 1 pm                |pagy   		    |pe1       |pe1@gmail.com        |


@TC294
Scenario: to verify refresh button functionality
Given User should be registered
When title of login page is Home
And Click on Employer-Agency Signin link
And user enters valid credentials
And Add the task for team member and agency/employer
|Title for emp    |teamField |AssignTo |note                             |employer          |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|Genral task      |pemp      |pe1      |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |Genral task      |pagy         |pa1         |Task should complete before time    |pagy   		    |pe1       |pe1@gmail.com        |
|task1            |pemp      |pemp     |note1                            |pemp    		    |pe1       |pe1@gmail.com        |task             |pagy         |pagy        |Task                                |pagy   		    |pe1       |pe1@gmail.com        |

And Click on My Task
Then Click on Reload Task button
And Click on Team Task
Then Again Click on Reload Task button


@TC269_271
Scenario: to verify Mark inprogress task functionality from employer employers team login
Given User should be registered
When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials
And Click on Add task button and enter all details employer
|Title for emp      |teamField |AssignTo |note                             |employer            |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|task4              |pemp      |pe1      |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |particular task  |pagy         |pa1         |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com        |
And the task should display for employer
And Task should also display for employer team member
And Click on mark in progress
And Logout as emp/agency
And Employer enters valid credentials
And Go to dashboard
And the task should display for employer
And Logout as emp/agency
And Employer enters valid credentials
And Click on Add task button and enter all details employer
|Title for emp      |teamField |AssignTo |note                             |employer            |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|task5              |pemp      |pemp     |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |particular task  |pagy         |pagy        |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com        |
And the task should display for employer
And Click on mark in progress
And Logout as emp/agency
And Login with team member
And Task should also display for employer team member

@TC273
Scenario: to verify Mark Completed task functionality from employer and employers team login
Given User should be registered
When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials
And Click on Add task button and enter all details employer
|Title for emp      |teamField |AssignTo |note                             |employer            |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|task4              |pemp      |pe1      |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |particular task  |pagy         |pa1         |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com        |
And the task should display for employer
And Task should also display for employer team member
And Click on Mark Complete
And Logout from App
And Click on Employer-Agency Signin link
And Employer enters valid credentials
And the task should not display on employer side 
And Logout from App
And Click on Employer-Agency Signin link
And Employer enters valid credentials
And Click on Add task button and enter all details employer
|Title for emp      |teamField |AssignTo |note                             |employer            |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|task5              |pemp      |pemp     |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |particular task  |pagy         |pagy        |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com        |
And the task should display for employer
And Task should also display for employer team member
And Logout from App
And Click on Employer-Agency Signin link
And Employer enters valid credentials
And the task should display for employer
And Click on Mark Complete
And Logout from App
And Click on Employer-Agency Signin link
And login as employer team
And the task should not display on employer side


@TC_270_272
Scenario: Verify general task status changed on Agency side if task assignee put task in (in-progress) 
Given User must be registered as agency profile
When title of login page is Home
And Click on Employer-Agency Signin link
And agency enters valid credentials
And Click on Add task button and enter all details for agency
|Title for emp      |teamField |AssignTo |note                             |employer            |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|task4              |pemp      |pe1      |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |particular task  |pagy         |pa1         |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com        |
And the task should display for agency
And Logout from App
And Click on Employer-Agency Signin link
And Login with agency team
And Task should also display for agency team member
And Click on mark in progress
And Logout from App
And Click on Employer-Agency Signin link
And agency enters valid credentials
And the task should display for agency
And Logout from App
And Click on Employer-Agency Signin link
And agency enters valid credentials
And Click on Add task button and enter all details for agency
|Title for emp      |teamField |AssignTo |note                             |employer            |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|task5              |pemp      |pemp     |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |particular task  |pagy         |pagy        |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com        |
And the task should display for agency
And Click on mark in progress
And Logout from App
And Click on Employer-Agency Signin link
And Login with agency team
And Task should also display for agency team member

@TC274
Scenario: verify general task is removed from Agency and team member dashboard if task mark as done
Given User should be registered
When title of login page is Home
And Click on Employer-Agency Signin link
And agency enters valid credentials
And Click on Add task button and enter all details for agency
|Title for emp      |teamField |AssignTo |note                             |employer            |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|task6             |pemp      |pe1      |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |particular task  |pagy         |pa1         |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com        |
And the task should display for agency
And Logout from App
And Click on Employer-Agency Signin link
And Login with agency team
And Task should also display for agency team member
And Click on Mark Complete
And Logout from App
And Click on Employer-Agency Signin link
And agency enters valid credentials
And the task should not display on agency side 
And Logout from App
And Click on Employer-Agency Signin link
And agency enters valid credentials
And Click on Add task button and enter all details for agency
|Title for emp      |teamField |AssignTo |note                             |employer            |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|task7              |pemp      |pemp     |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |particular task  |pagy         |pagy        |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com        |
And the task should display for agency
And Task should also display for employer team member
And Logout from App
And Click on Employer-Agency Signin link
And agency enters valid credentials
And the task should display for agency
And Click on Mark Complete
And Logout from App
And Click on Employer-Agency Signin link
And Login with agency team
And the task should not display on agency side


@TC276_278
Scenario: Verify particular job task status changed in employer if task assignee put task in (in-progress)
Given User should be registered
When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials
And Go to workbench
And Select a job 
And Click on Add task button and enter all details employer
|Title for emp      |teamField |AssignTo |note                             |employer            |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|task4              |pemp      |pe1      |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |particular task  |pagy         |pa1         |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com        |
And the task should display for employer
And Logout from App
And Click on Employer-Agency Signin link
And Login with employer team
And Task should also display for employer team member
And Click on mark in progress
And Logout from App
And Click on Employer-Agency Signin link
And Employer enters valid credentials
And Go to dashboard
And the task should display for employer
And Logout from App
And Click on Employer-Agency Signin link
And Employer enters valid credentials
And Go to workbench
And Select a job 
And Click on Add task button and enter all details employer
|Title for emp      |teamField |AssignTo |note                             |employer            |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|task5              |pemp      |pemp     |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |particular task  |pagy         |pagy        |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com        |
And the task should display for employer
And Click on mark in progress
And Logout from App
And Click on Employer-Agency Signin link
And login as employer team
And Task should also display for employer team member


@TC280
Scenario: verify particular job task removed from employer and team member dashboard if task mark as done
Given User should be registered
When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials
And Go to workbench
And Select a job 
And Click on Add task button and enter all details employer
|Title for emp      |teamField |AssignTo |note                             |employer            |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|task4              |pemp      |pe1      |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |particular task  |pagy         |pa1         |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com        |
And the task should display for employer
And Logout from App
And Click on Employer-Agency Signin link
And login as employer team
And Task should also display for employer team member
And Click on Mark Complete
And Logout from App
And Click on Employer-Agency Signin link
And Employer enters valid credentials
And the task should not display on employer side
And Logout from App
And Click on Employer-Agency Signin link
And Employer enters valid credentials
And Go to workbench
And Select a job 
And Click on Add task button and enter all details employer
|Title for emp      |teamField |AssignTo |note                             |employer            |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|task5              |pemp      |pemp     |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |particular task  |pagy         |pagy        |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com        |
And the task should display for employer
And Logout from App
And Click on Employer-Agency Signin link
And login as employer team
And Task should also display for employer team member
And Logout from App
And Click on Employer-Agency Signin link
And Employer enters valid credentials
And the task should display for employer
And Click on Mark Complete
And Logout from App
And Click on Employer-Agency Signin link
And Employer enters valid credentials
And the task should not display on employer side

@TC277_279
Scenario: Verify particular job task status changed in Agency if task assignee put task in (in-progress)
Given User must be registered as agency profile
When title of login page is Home
And Click on Employer-Agency Signin link
And agency enters valid credentials
And Go to workbench
And Select a job 
And Click on Add task button and enter all details for agency
|Title for emp      |teamField |AssignTo |note                             |employer            |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|task4              |pemp      |pe1      |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |particular task  |pagy         |pa1         |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com        |
And Go to dashboard
And the task should display for agency
And Logout from App
And Click on Employer-Agency Signin link
And Login with agency team
And Task should also display for agency team member
And Click on mark in progress
And Logout from App
And Click on Employer-Agency Signin link
And agency enters valid credentials
And the task should display for agency
And Logout from App
And Click on Employer-Agency Signin link
And agency enters valid credentials
And Go to workbench
And Select a job 
And Click on Add task button and enter all details for agency
|Title for emp      |teamField |AssignTo |note                             |employer            |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|task5              |pemp      |pemp     |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |particular task  |pagy         |pagy        |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com        |
And Go to dashboard
And the task should display for agency
And Click on mark in progress
And Logout from App
And Click on Employer-Agency Signin link
And Login with agency team
And Task should also display for agency team member

@TC281
Scenario: verify general task is removed from Agency and team member dashboard if task mark as done
Given User should be registered
When title of login page is Home
And Click on Employer-Agency Signin link
And agency enters valid credentials
And Go to workbench
And Select a job 
And Click on Add task button and enter all details for agency
|Title for emp      |teamField |AssignTo |note                             |employer            |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|task8              |pemp      |pe1      |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |task8            |pagy         |pa1         |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com        |
And Go to dashboard
And the task should display for agency
And Logout from App
And Click on Employer-Agency Signin link
And Login with agency team
And Task should also display for agency team member
And Click on Mark Complete
And Logout from App
And Click on Employer-Agency Signin link
And agency enters valid credentials
And the task should not display on agency side 
And Logout from App
And Click on Employer-Agency Signin link
And agency enters valid credentials
And Go to workbench
And Select a job 
And Click on Add task button and enter all details for agency
|Title for emp      |teamField |AssignTo |note                             |employer            |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|task9              |pemp      |pemp     |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |task9            |pagy         |pagy        |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com        |
And Go to dashboard
And the task should display for agency
And Task should also display for employer team member
And Logout from App
And Click on Employer-Agency Signin link
And agency enters valid credentials
And the task should display for agency
And Click on Mark Complete
And Logout from App
And Click on Employer-Agency Signin link
And Login with agency team
And the task should not display on agency side
