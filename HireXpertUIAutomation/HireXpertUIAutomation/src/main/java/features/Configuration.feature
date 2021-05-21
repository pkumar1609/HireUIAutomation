Feature: configuration Feature

@ManageAgencyEmployee
Scenario:  Agency Organization admin see configuration tab.
Given A user with organization admin permission exists
When An agency organization admin logged in to HireXpert
Then Login user should see configuration tab
And Login users should see the Manage Employee tab.
And Login user should see Manage Vendor tab
And Login users should see the “Manage Employer” tab.

@ManageAgencyEmployee2
Scenario: To Verify the functionality of Agency able to add employee
Given agency with different organization exist
| timezone                                        | country  |  Name   |   Email         | contactnumber  | UserType|organization|Address|
| (GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi | India    | cagy    |  cagy@gmail.com | 211314644      | Agency  |Test	     |kharadi|	   
Given An agency logged in to HireXpert
When Org admin and Org status is active only this user can see configuration tab
And go to the configuration tab
And Click on add Button Fill all the mandatory details for Manage Employee
|Nameagy|         Emailagy   | contact  |Roleagy        |
|pa1    | pa1@gmail.com      | 1234564  |Job Coordinator|
And Newly added employees should be displayed in Manage Employees.
And Employee status should be Active and admin value should be “No”.
And Agency should not be able to add another organization employee. It's showing an error message “This user already registered with another organization. So you can not add it as an employee in your organization ” 
|Nameagy |         Emailagy   | contact  |Roleagy          |
|cagy    | cagy@gmail.com     | 1234564  |Job Coordinator  |
And Agency should not be able to add duplicate employees. It’s showing an error message “Employee with email id… already exists.”

@ManageAgencyEmployee3
Scenario: To Verify the functionality of Edit Employee. 
Given An agency logged in to HireXpert
When Org admin and Org status is active only this user can see configuration tab
And go to the configuration tab
And Select existing employees and click on the Action dropdown
And Edit the employee button
And Agency should not be able to update employee details like email,name,contact number and country
And Agency should be able to only update the Role
|Role          |RoleAgy              |
|Recruitment HR|Candidate Coordinator|
When Login users click on the Submit button
Then Agency should be able to update employee details successfully
And Verify the employee role is updated or not



