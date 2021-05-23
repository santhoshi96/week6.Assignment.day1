Feature: Edit Lead in Leaftaps Application

Background:
Given Launch Chrome browser
When Load URL 'http://leaftaps.com/opentaps'
And Type username as 'DemoSalesManager'
And Type password as 'crmsfa'
And click Login Button
And click CRM SFA
And click Leads
And click Find Leads link

Scenario Outline: Edit Lead Multiple Data
When type firstname as <firstname>
And click Find Lead Button
And click first displaying option
And click Edit Button
And clear companyname
And update companyname as <updatedcompanyname>
And click update button
Then verify companyname is updated

Examples:
|firstname|updatedcompanyname|
|Santhoshi|Zoho|
|Santa|Google|