Feature: Hirexpert Job Candidate Workflow feature

@BVT @cv1
Scenario Outline: Verify the functionality of Add, Edit & Delete Candidate with Employer login

Given User must be registered

When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And Go to CV store tab
And select the basic filter from filter drop down
And enter all value in basic filter fields "<jobs>" "<designation>" "<mandatorySkills>" "<preferredSkills>" "<optionalSkills>" "<minexp>" "<maxexp>" "<salary>" "<noticeperiod>" "<city>"
#And click on search button
#Then verify the result of basic filter
#And Now select the advance filter from filter drop down
#And enter all value in advance filter fields
#And click on search button
#Then verify the result of advance filter

Examples:
|Username	   |Password|jobs    |designation   |mandatorySkills|preferredSkills|optionalSkills|minexp|maxexp|salary|noticeperiod|city|
|pemp@gmail.com|12345   |JCFW 10 |Java developer|Java 			|advance java   |javaScript    |1     |2     |400000|25          |Pune|


