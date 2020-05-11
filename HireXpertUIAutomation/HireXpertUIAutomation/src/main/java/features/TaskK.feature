Feature: Task Feature

@TC264_266
Scenario: Verify functionality of adding general task and particular task from Employer login

Given User must be registered as Employer profile 

When title of login page is Home
And Employer enters valid credentials 
And Go to dashboard
And In task section click on add task (+) icon
And In add task popup, Fill all the mandatory details 
|Title            |Note            |
|genral Task1     |gen Tast Note   |
And Click on submit
And the task should display for both employer
And Task should also display for team member
And Go to workbench
And Select a job and click on add task button
And In add task popup, Fill all the mandatory details and assign to Himeself
|Title            |Note        |
|particular task  |Task Note   |
And Click on submit 
Then the task added should display on employer 
Then the task should also display on team member login


@TC265_267
Scenario: Verify agency can add general task and particular task.

Given User must be registered as agency profile 

When title of login page is Home
And agency enters valid credentials 
And Go to dashboard
And In task section click on add task (+) icon
And In add task popup, Fill all the mandatory details 
|Title                |Note            |
|Agy genral Task1     |gen Tast Note   |
And Click on submit
Then the task should display for both agency
Then Task should also display for team member
And Go to workbench
And Select a job and click on add task button
And In add task popup, Fill all the mandatory details and assign to Himeself
|Title            |Note        |
|particular task  |Task Note   |
And Click on submit 
Then the task added should display on agency 
Then the task should also display on team member login

@TC275
Scenario: Verify only creator of the general task can delete that general task

Given User should be registered
Given team member should be added

When title of login page is Home
And user enters valid credentials
And Add task and assign it to team member
|Title for emp    | 
|Genral task      |
And Logout as emp/agency
And Login with team member
And Click on Delete task
And observe the message
And logout as team member
And login as agency/employer
Then Delete the task

@TC282
Scenario: Verify only creator of the particular task can delete the task

Given User should be registered
When title of login page is Home
And user enters valid credentials
And team member should be added
|Name|         Email   | contact  |Nameagy  |         Emailagy  | contactagy  |team  |agyteam |
|pe1 | pe1@gmail.com   | 1234564  |pa1      |pa1@gmail.com		|1234556      |pe1   |pa1     |
|pe2 | pe2@gmail.com   | 1234564  |pa2      |pa2@gmail.com		|1234566      |pe1   |pa1	  |

And go to workbench
And select job
And Add a task and assign that task to the team member 
|Title for emp      |teamField |AssignTo |note                             |employer            |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|particular task    |pemp      |pe1      |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |particular task  |pagy         |pa1         |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com        |
And Logout as emp/agency
And login as the team member
And try to delete
And logout as a team member
And login as Employer/Agency
Then click on delete task

@TC302
Scenario: verify the functionality of edit for general tasks

Given User should be registered
When title of login page is Home
And user enters valid credentials
And Add the task 
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
And user enters valid credentials
And click on workbench and select job
And Add the task 
|Title for emp      |teamField |AssignTo |note                             |employer          |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|particular task    |pemp      |pe1      |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |Genral task      |pagy         |pa1         |Task should complete before time    |pagy   		    |pe1       |pe1@gmail.com        |

And edit the task 
|Title for emp    |teamField |AssignTo |note                             |employer          |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|task2            |pemp      |pe1      |complete before 1 pm             |pemp    		    |pe1       |pe1@gmail.com        |task1            |pagy         |pa1         |complete before 1 pm                |pagy   		    |pe1       |pe1@gmail.com        |

Then verify all the edited details 
|Title for emp    |teamField |AssignTo |note                             |employer          |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|task2            |pemp      |pe1      |complete before 1 pm             |pemp    		    |pe1       |pe1@gmail.com        |task1            |pagy         |pa1         |complete before 1 pm                |pagy   		    |pe1       |pe1@gmail.com        |

@TC294
Scenario: to verify refresh button functionality
Given User should be registered
When title of login page is Home
And user enters valid credentials
And Add the task for team member and agency/employer
|Title for emp    |teamField |AssignTo |note                             |employer          |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|Genral task      |pemp      |pe1      |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |Genral task      |pagy         |pa1         |Task should complete before time    |pagy   		    |pe1       |pe1@gmail.com        |
|task1            |pemp      |pemp     |note1                            |pemp    		    |pe1       |pe1@gmail.com        |task             |pagy         |pagy        |Task                                |pagy   		    |pe1       |pe1@gmail.com        |

And Click on My Task
Then Click on Reload Task button
And Click on Team Task
Then Again Click on Reload Task button






