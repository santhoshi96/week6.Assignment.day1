Feature: Duplicating existing Lead in Leaftaps Application

Background:
Given Launch Chrome browser
When Load URL 'http://leaftaps.com/opentaps'
And Type username as 'DemoSalesManager'
And Type password as 'crmsfa'
And click Login Button
And click CRM SFA
And click Leads
And click Find Leads link
And click Email Tab

Scenario Outline: Duplicating existing Lead with Mupltiple Data
When type Email ID as <emailID>
And click Find Lead Button
And click first displaying option
And click Duplicate Lead Button
And click Create Lead button
Then verify Duplicate Lead is created successfully

Examples:
|emailID|
|test@xyzd.com|
|santhoshi1996@gmail.com|