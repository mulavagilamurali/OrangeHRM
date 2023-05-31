Feature: Test FB
Scenario Outline: Verify facbook login
Given open facebook URL
When user enter username as "<uname>"
And usre enter password as "<pass>"
Then click on login button
And close fb browser
Examples:
|uname|pass|
|Phani|phani123|
|swetha|swetha123|
