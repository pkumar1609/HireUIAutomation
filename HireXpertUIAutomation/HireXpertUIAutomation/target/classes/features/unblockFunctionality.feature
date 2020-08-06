Feature: Job Management

@bvt_agencyunblock
  Scenario Outline: Verify the Unblock functionality for Agency with Employer login
  
  	Given User is on Home page of application
    
    When title of page is HireXpert
    And Click on Employer-Agency Signin link
    And enter valid "<username>" and "<password>" for registered employer and click on Sign in button
#    And Click on Agencies tab
#    And Agency should be added previously
#    |Name  |Email             | contact  |
#	|pagy  |pagy@gmail.com    | 1234564  |
#	And Click on close button
    And Go to workbench
	And Add job
	|title    |designation |industry   |jobrole        |location |budget |minexp|maxexp|agytitle   |
	|abc job  |developer   |IT software|java developer |pune     |400000 |1     |2     |blockjobAGY|
	And Select a added job
    And click on Share With Agency button and select the Share checkbox present in front of the "<agyEmailId>" to share the job 
    And click on the Block/Unblock to unblock checkbox present in front of agency whom you shared the job "<agyEmailId>"
    Then Employer should be able to unblock the agency
    And Click on close button
    And logout with employer and login with Agency "<agyEmailId>" and "<passward>" valid credentials which you blocked on Share Job page 
	And Go to workbench   
	And Select a added job
	And click on Add Candidate button
	And Enter All details of "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>" and "<relocate>"
    Then Unblocked agency should be able to add candidate
#   And close the browser

 Examples:
 |username      |agyEmailId    |Teamid        |password|CandidateEmail        |Name    |ContactNumber|Designation   |Date            |Gender  |OnNoticePeriod|NoticePeriod|experience|CTC   |expectedCTC|Country|City  |CityArea   |ZipCode|Communicationmode|Salaryoffered|distance|permanentAddress|relocate|
 |pemp@gmail.com|pagy@gmail.com|pe1@gmail.com |12345   |vishwani@gmail.com    |vishvani|8956652538   |jr.developer  |04/08/1999      |Female  |No            |25          |2.0       |400000|800000     |India  |wardha|Arvi naka  |455966 |Call             |800000       |4       |No              |No      |

@bvt_teamunblock
  Scenario Outline: Verify the Unblock functionality for team member with Employer and Agency login
  
  	Given User is on Home page of application
    
    When title of page is HireXpert
    And Click on Employer-Agency Signin link
    And enter valid "<username>" and "<password>" for registered employer and click on Sign in button
  	Given team member should be added
	|Name|         Email   | contact  |Nameagy  |         Emailagy  | contactagy  |team  |agyteam |
	|pe1 | pe1@gmail.com   | 1234564  |pa1      |pa1@gmail.com		|1234556      |pe1   |pa1     |
	|pe2 | pe2@gmail.com   | 1234564  |pa2      |pa2@gmail.com		|1234566      |pe1   |pa1	  | 
   	And Go to workbench
	And Add job
	|title           |designation |industry   |jobrole        |location |budget |minexp|maxexp|agytitle   |
	|unblockteamjob  |developer   |IT software|java developer |pune     |400000 |1     |2     |blockjobAGY|
	And Select a added job
    And click on Share With Team button and select the Share checkbox present in front of the team member "<Teamid>"
    And click on the Block/Unblock to unblock checkbox present in front of team with whom you shared the job "<Teamid>"
    Then User should be able to unblock the team member
    And Click on close button
    And Logout from App
	And Click on Employer-Agency Signin link
	And Employer enters valid credentials "<Teamid>","<password>"
    And Go to workbench
    And Select a added job
   	And Click on add candidate
	And Enter All details of "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>" and "<relocate>"
    Then Unblocked team member should be able add candidate "<Name>"
#    And close the browser
    
Examples:
 |username       |Teamid        |password|CandidateEmail                |Name    |ContactNumber|Designation   |Date           |Gender  |OnNoticePeriod|NoticePeriod|experience|CTC   |expectedCTC|Country|City  |CityArea   |ZipCode|Communicationmode|Salaryoffered|distance|permanentAddress|relocate|
# |pemp@gmail.com |pe1@gmail.com |12345   |vishwaniThakare@gmail.com     |vishvani|8956652538   |jr.developer  |04/08/1999     |Female  |No            |25          |2.0       |400000|800000     |India  |wardha|sindi      |455966 |Call             |800000       |4       |No              |No      |
 |pagy@gmail.com |pa1@gmail.com |12345   |Abhijitg@gmail.com           |Abhijitg|9856558555   |Java developer|02/08/1999     |Male    |No            |30          |4.9       |800000|800000     |India  |wardha|Arvi naka  |455966 |Call             |800000       |9       |No              |No      |



#TC ID - 236,237,238    
