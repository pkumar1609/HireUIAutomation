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
Scenario Outline: To Verify the functionality of Agency able to add employee
Given agency with different organization exist
| timezone                                        | country  |  Name   |   Email         | contactnumber  | UserType|organization|Address|
| (GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi | India    | cagy    |  cagy@gmail.com | 211314644      | Agency  |Test	     |kharadi|	   
Given An agency logged in to HireXpert
When Org admin and Org status is active only this user can see configuration tab
And go to the configuration tab  & click on the add manage Employee.
And Click on add Button Fill all the mandatory details for Manage Employee
|Nameagy|         Emailagy   | contact  |Roleagy        |
|pa1    | pa1@gmail.com      | 1234564  |Job Coordinator|
And Newly added employees should be displayed in Manage Employees.
And Employee status should be Active and admin value should be “No”.
And Agency should not be able to add another organization employee. It's showing an error message “This user already registered with another organization. So you can not add it as an employee in your organization ” 
|Nameagy |         Emailagy   | contact  |Roleagy          |
|cagy    | cagy@gmail.com     | 1234564  |Job Coordinator  |
And Agency should not be able to add duplicate employees. It’s showing an error message “Employee with email id… already exists.”

 Examples:
 |Username      |Password|
 |pagy@gmail.com|12345   |