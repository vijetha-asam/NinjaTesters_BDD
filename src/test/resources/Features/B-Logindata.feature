Feature: login datadriven

Scenario Outline: login with different set of data
Given usre on login page
When  user fills the sheet from given sheetname "<SheetName>" andrownumber <RowNumber>
And user click login button
Then user enters homepage

Examples:
|SheetName|RowNumber|
|login|0|
|login|1|
|login|2|