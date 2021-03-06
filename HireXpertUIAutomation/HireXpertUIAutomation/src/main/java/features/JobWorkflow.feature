Feature: Job Workflow

 @JobWorkflow 
 Scenario Outline: Verify the Block functionality for Agency with Employer login
    Given User is on Home page of application
    When title of page is HireXpert
    And Click on Employer-Agency Signin link
    And enter valid "<Username>" and "<Password>" for registered employer and click on Sign in button
    And Go to workbench
    And Click on add job button
    And Add job
      | title     | agytitle         | designation | industry    | location | budget | minexp | maxexp | minsal | maxsal | Name | Email         | contact | totalinterviews | organization | agyorganization | functionalArea |
      | Developer | Agynew Developer | developer   | IT software | pune     | 400000 |      1 |      2 | 450000 | 800000 | pe1  | pe1@gmail.com | 1234564 |               2 | Hirexpert    | rahitech        | java           |
    And Select a added job
    And click on share with agency
    And search the agency "<AgencyName>" and share job with it
    And block the agency "<AgencyName>"
    And Click on close button
    And Logout from App
    And Click on Employer-Agency Signin link
    And Employer enters valid credentials "<AgyEmailId>","<Password>"
    Given Click on add Button Fill all the mandatory details for Manage Employee
      | Nameagy    | Emailagy         | contact | Roleagy                 |
      | pa1        | pa1@gmail.com    | 1234564 | Recruitment Agency Head |
    And Go to workbench
    And Select a added job
    And Click on add candidate
    And enter "<CandidateEmail>"of candidate and click on Find button and observe
    Then Blocked agency should not be able to add candidate for the job and error message message should display and he should be able to see all candidate status which are added for that job
    And click on Close button from Add Candidate page and click on Yes button from confirmation popup
    And click on share with Team
    And search the team "<Team>" and share job with it
    Then user should able to search team member and blocked agency should not able to share job with any team members and error message should display
    And Click on close button
    Examples: 
      | Username       | Password | AgencyName | AgyEmailId     | CandidateEmail   | Team | Teamid        | ContactNumber|
      | pemp@gmail.com | 12345    | pagy       | pagy@gmail.com | pratik@gmail.com | pa1  | pa1@gmail.com |  689498595   |

  
  #TC ID - 61,65,66,384
  @JobWorkflow
  Scenario Outline: Verify the Block functionality for vendor with Agency login
    Given User is on Home page of application
    When title of page is HireXpert
    And Click on Employer-Agency Signin link
    And user enters valid credentials "<Username>","<Password>"
    And vendor should be added
      | Name | Email          | contact |
      | cagy | cagy@gmail.com | 1234564 |
    And Go to workbench
    And Click on add job button
    And Add job
      | title     | agytitle         | designation | industry    | location | budget | minexp | maxexp | minsal | maxsal | Name | Email         | contact | totalinterviews | organization | agyorganization | functionalArea |
      | Developer | Agynew Developer | developer   | IT software | pune     | 400000 |      1 |      2 | 450000 | 800000 | pe1  | pe1@gmail.com | 1234564 |               2 | Hirexpert    | rahitech        | java           |
    And Select a added job
    And click on share with vendor
    And search the vendor "<Vendor>" and share job with it
    And block the vendor "<Vendor>"
    And Click on close button
    And Logout from App
    And Click on Employer-Agency Signin link
    And Vendor user enters valid credentials "<Vendor>","<Password>","<VendorOrg>","<VendorOrgWebsite>","<City>","<VendorAddress>"
    Given Employee should be added
      | Nameagy | Emailagy      | contact | Role           | Roleagy                 |
      | ca1     | ca1@gmail.com | 1234556 | Recruitment HR | Recruitment Agency Head |
    And Go to workbench
    And Select a added job
    And Click on add candidate
    And enter "<CandidateEmail>"of candidate and click on Find button and observe
    Then Blocked vendor should not be able to add candidate for the job and error message message should display and he should be able to see all candidate status which are added for that job
    And Click on close button and confirm Yes button
    And click on share with Team
    And search the team "<Team>" and share job with it
    Then user should able to search team member and blocked agency should not able to share job with any team members and error message should display
    And Click on close button
    And Logout from App
    And Click on Employer-Agency Signin link
    And user enters valid credentials "<Username>","<Password>"
    And Go to Workbench
    And Select a added job
    And click on share with vendor
    And unblock the vendor "<Vendor>"
    And Click on close button
    And Logout from App
    And Click on Employer-Agency Signin link
    And user enters valid credentials "<Vendor>","<Password>"
    And Go to Workbench
    And Select a added job
    And Click on Add Candidate button
    And Enter All details of "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
    And observe candidate is getting added in New column
    Examples: 
      | Username       | Password | Vendor         |VendorOrg |VendorOrgWebsite|VendorAddress| CandidateEmail   | Team | CandidateEmail      | profiletitle            | Name      | ContactNumber | Designation  | Date       | Gender | OnNoticePeriod | NoticePeriod | LastWorkingDay | experience | CTC    | expectedCTC | Country | City   | CityArea  | ZipCode | Communicationmode | Salaryoffered | distance | permanentAddress | relocate | Skill1 | Skill2        | Skill3     | level1          | level2       | level3 | Weightage1 | Weightage2 | Weightage3 | certificate1 | certificate2 | certificate3 | remark1             | remark2         | remark3          | certificateforskill1 | certificateforskill2 |
      | pagy@gmail.com | 12345    | cagy@gmail.com |cagyORG   |cagyORG.com     |Churchgate   | pratik@gmail.com | ca1  | hirecan31@gmail.com | jr software developer 1 | hirecan31 |   78950685538 | Sr.developer | 14/02/1995 | Female | Yes            |           25 | 01/09/2021     |        1.5 | 800000 |      800000 | India   | Mumbai | Thane     |  455966 | Call              |        800000 |  4       | No               | No       | JAVA   | advanced java | JavaScript | Basic Knowledge | Intermediate | Expert | Mandatory  | Preferred  | Optional   | Yes          | No           | No           | provide certificate | spring,hybernet | advanced version | sun microsoft        | advanced version     |

  
 @JobWorkflow
  Scenario Outline: Verify the Block functionality for Team member with Employer and Agency login
    Given User is on Home page of application
    When title of page is HireXpert
    And Click on Employer-Agency Signin link
    And enter valid "<Username>" and "<Password>" for registered employer and click on Sign in button
    Given Employee should be added
      | Name | Email         | contact | Nameagy | Emailagy      | contact | Role           | Roleagy                 |
      | pe1  | pe1@gmail.com | 1234564 | pa1     | pa1@gmail.com | 1234556 | Recruitment HR | Recruitment Agency Head |
      | pe2  | pe2@gmail.com | 1234564 | pa2     | pa2@gmail.com | 1234566 | Recruitment HR | Recruitment Agency Head |
    And Go to workbench
    And Click on add job button
    And Add job
      | title         | agytitle   | designation | industry    | location | budget | minexp | maxexp | minsal | maxsal | Name | Email         | contact | totalinterviews | organization | agyorganization | functionalArea |
      | New Developer | New8agyjob | developer   | IT software | pune     | 400000 |      1 |      2 | 450000 | 800000 | pe1  | pe1@gmail.com | 1234564 |               2 | Hirexpert    | rahitech        | java           |
    And Select a added job
    And click on share with Team
    And search the team "<team>" and share job with it
    And block the team "<team>"
    And Click on close button
    And Logout from App
    And Click on Employer-Agency Signin link
    And enter valid "<teamId>" and "<Password>" for registered employer and click on Sign in button "<TeamIdMemberCity>","<TeamIdMemberAddress>"
    And Go to workbench
    And Select a added job
    And click on Add Candidate button
    And enter "<CandEmailId>"of candidate and click on Find button and observe
    Then Blocked team member should not be able to add candidate
    And Click on close button and confirm Yes button
    Examples: 
      | Username       | Password | team | teamId        | CandEmailId     |TeamIdMemberCity|TeamIdMemberAddress|
      | pemp@gmail.com | 12345    | pe1  | pe1@gmail.com | can12@gmail.com |  Mumbai        |  Thane            |
      | pagy@gmail.com | 12345    | pa1  | pa1@gmail.com | can13@gmail.com |  Mumbai        |  Thane            |

  
  #TC ID - 67,72,73
 @JobWorkflow 
  Scenario Outline: Verify the Unblock functionality for Agency with Employer login
    Given User is on Home page of application
    When title of page is HireXpert
    And Click on Employer-Agency Signin link
    And enter valid "<Username>" and "<Password>" for registered employer and click on Sign in button
    And Click on add Button Fill all the mandatory details for Recruitment Agencies
      | Name | Email          | contact |
      | pagy | pagy@gmail.com | 1234564 |
    And Go to workbench
    And Click on add job button
    And Add job
      | title        | designation | industry    | location | budget | minexp | maxexp | minsal | maxsal | Name | Email         | contact | totalinterviews | organization | agyorganization | functionalArea |
      | Jobworkflow5 | developer   | IT software | pune     | 400000 |      1 |      2 | 450000 | 800000 | pe1  | pe1@gmail.com | 1234564 |               2 | Hirexpert    | rahitech        | java           |
    And Select a added job
    And click on share with agency
    And search the agency "<agencyName>" and share job with it
    And block the agency "<agencyName>"
    And Unblock the agency "<agencyName>"
    Then Employer should be able to unblock the agency
    And Click on close button
    And Logout from App
    And Click on Employer-Agency Signin link
    And Employer enters valid credentials "<agyEmailId>","<Password>"
    And Go to workbench
    And Select a added job
    And click on Add Candidate button
    And Enter All details of "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
    Then Unblocked agency should be able add candidate "<Name>"
    Examples: 
      | Username       | agencyName | agyEmailId     | Teamid        | Password | CandidateEmail     | profiletitle          | Name      | ContactNumber | Designation  | Date       | Gender | OnNoticePeriod | NoticePeriod | LastWorkingDay | experience | CTC    | expectedCTC | Country | City   | CityArea  | ZipCode | Communicationmode | Salaryoffered | distance | permanentAddress | relocate | Skill1 | Skill2        | Skill3     | level1          | level2       | level3 | Weightage1 | Weightage2 | Weightage3 | certificate1 | certificate2 | certificate3 | remark1             | remark2         | remark3          | certificateforskill1 | certificateforskill2 |
      | pemp@gmail.com | pagy       | pagy@gmail.com | pe1@gmail.com | 12345    |hirecan08@gmail.com | jr software developer | hirecan08 |    9890685538 | Sr.developer | 14/02/1995 | Female | Yes            |           25 | 01/09/2021     |        1.5 | 800000 |      800000 | India   | wardha | Arvi naka |  455966 | Call              |        800000 |        4 | No               | No       | JAVA   | advanced java | JavaScript | Basic Knowledge | Intermediate | Expert | Mandatory  | Preferred  | Optional   | Yes          | No           | No           | provide certificate | spring,hybernet | advanced version | sun microsoft        | advanced version     |

  
 @JobWorkflow
  Scenario Outline: Verify the UnBlock functionality for Team member with Employer and Agency login
    Given User is on Home page of application
    When title of page is HireXpert
    And Click on Employer-Agency Signin link
    And enter valid "<Username>" and "<Password>" for registered employer and click on Sign in button
    Given Employee should be added
      | Name | Email         | contact | Nameagy | Emailagy      | contact | Role           | Roleagy                 |
      | pe1  | pe1@gmail.com | 1234564 | pa1     | pa1@gmail.com | 1234556 | Recruitment HR | Recruitment Agency Head |
      | pe2  | pe2@gmail.com | 1234564 | pa2     | pa2@gmail.com | 1234566 | Recruitment HR | Recruitment Agency Head |
    And Go to workbench
    And Click on add job button
    And Add job
      | title        | agytitle        | designation | industry    | location | budget | minexp | maxexp | minsal | maxsal | Name | Email         | contact | totalinterviews | organization | agyorganization | functionalArea |
      | Jobworkflow6 | Jobworkflow6agy | developer   | IT software | pune     | 400000 |      1 |      2 | 450000 | 800000 | pe1  | pe1@gmail.com | 1234564 |               2 | Hirexpert    | rahitech        | java           |
    And Select a added job
    And click on share with Team
    And search the team "<Team>" and share job with it
    And block the team "<Team>"
    And Unblock the team "<Team>"
    Then User should be able to unblock the team member
    And Click on close button
    And Logout from App
    And Click on Employer-Agency Signin link
    And enter valid "<Teamid>" and "<Password>" for registered employer and click on Sign in button "<TeamIdMemberCity>","<TeamIdMemberAddress>"
    And Go to workbench
    And Select a added job
    And Click on add candidate
    And Enter All details of "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
    Then Unblocked team member should be able add candidate "<Name>"
    Examples: 
      | Username       | Team | Teamid        | Password | CandidateEmail      | profiletitle            | Name      | ContactNumber | Designation  | Date       | Gender | OnNoticePeriod | NoticePeriod | LastWorkingDay | experience | CTC    | expectedCTC | Country | City   | CityArea  | ZipCode | Communicationmode | Salaryoffered | distance | permanentAddress | relocate | Skill1 | Skill2        | Skill3     | level1          | level2       | level3 | Weightage1 | Weightage2 | Weightage3 | certificate1 | certificate2 | certificate3 | remark1             | remark2         | remark3          | certificateforskill1 | certificateforskill2 |TeamIdMemberCity|TeamIdMemberAddress|
      | pemp@gmail.com | pe1  | pe1@gmail.com |  12345   | hirecan30@gmail.com | jr software developer   | hirecan30 | 9890685538    | Sr.developer | 14/02/1995 | Female | Yes            |  25          | 01/09/2021     |        1.5 | 800000 |      800000 | India   | wardha | Arvi naka |  455966 | Call              |        800000 |        4 | No               | No       | JAVA   | advanced java | JavaScript | Basic Knowledge | Intermediate | Expert | Mandatory  | Preferred  | Optional   | Yes          | No           | No           | provide certificate | spring,hybernet | advanced version | sun microsoft        | advanced version     |  Mumbai        |  Thane            |
      | pagy@gmail.com | pa1  | pa1@gmail.com |  12345   | hirecan31@gmail.com | jr software developer 1 | hirecan31 | 78950685538   | Sr.developer | 14/02/1995 | Female | Yes            |  25          | 01/09/2021     |        1.5 | 800000 |      800000 | India   | wardha | Arvi naka |  455966 | Call              |        800000 |        4 | No               | No       | JAVA   | advanced java | JavaScript | Basic Knowledge | Intermediate | Expert | Mandatory  | Preferred  | Optional   | Yes          | No           | No           | provide certificate | spring,hybernet | advanced version | sun microsoft        | advanced version     |  Mumbai        |  Thane            |

  
  #TC ID - 236,237,238
 @JobWorkflow
  Scenario Outline: Verify user having only one primary contact with Employer and Agency login
    Given User is on Home page of application
    When title of page is HireXpert
    And Click on Employer-Agency Signin link
    And enter valid "<Email>" and "<Password>" for registered employer and click on Sign in button
    And Go to workbench
    And Click on add job button
    And Add job
      | title     | agytitle          | designation | industry    | location | budget | minexp | maxexp | minsal | maxsal | Name | Email         | contact | totalinterviews | organization | agyorganization | Employer | functionalArea |
      | Primary12 | Primaryagy123 Job | developer   | IT software | pune     | 400000 |      1 |      2 | 450000 | 800000 | pe1  | pe1@gmail.com | 1234564 |               2 | Hirexpert    | rahitech        | pemp     | java           |
    Given Employee should be added
      | Name | Email         | contact | Nameagy | Emailagy      | contact | Role           | Roleagy                 |
      | pe1  | pe1@gmail.com | 1234564 | pa1     | pa1@gmail.com | 1234556 | Recruitment HR | Recruitment Agency Head |
      | pe2  | pe2@gmail.com | 1234564 | pa2     | pa2@gmail.com | 1234566 | Recruitment HR | Recruitment Agency Head |
      | pe3  | pe3@gmail.com | 1234564 | pa3     | pa3@gmail.com | 1234556 | Recruitment HR | Recruitment Agency Head |
    And Go to Workbench
    And Select a added job
    And click on share with Team
    And search the team "<Team>" and share job with it
    And verify by default job owner is primary contact
    And make team "<Team>" as primary contact
    And search the team "<Team2>" and share job with it
    And make team "<Team2>" as primary contact
    Then user should not able to make multiple team members as primary contact "<Team>"
    And Click on close button
    Examples: 
      | Email          | Password | Team | Teamid        | contact  | anotherteam | thridteam     | Team2 | Team3 |
      | pemp@gmail.com | 12345    | pe1  | pe1@gmail.com | 16546856 | pe2         | pe3@gmail.com | pe2   | pe3   |
      | pagy@gmail.com | 12345    | pa1  | pa1@gmail.com | 98598695 | pa2         | pa3@gmail.com | pa2   | pa3   |
      
      

