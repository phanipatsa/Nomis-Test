# Nomis-Test
Test Navigation features on Nomis Website using the automation batch file created using Selenium with Java, generate execution report.

Assumptions:
DB Validations, Negative scenarios and Boundary conditions for testing are out of scope as this is only a POC with limited acess to the webpage.

Scope:

Step 1: Navigate to the URL: https://www.nomissolutions.com/
Criteria: The webpage must be loaded sucessfully.

Step 2: Validate Navigation for Home Page -> Solutions & Products -> Mortgages
Criteria: Navigate to "Home Page -> Solutions & Products -> Mortgages" and click on Solution Brief, page must load and header must match with this text 'Solution Brief'
 
Step 3: Search for a key words like MPO (Pass the text from Excel Sheet so that multiple search can be made using the same function) and select first link from search result.
Criteria: The search must be sucessful and return valid links with key word match, First link must open and key word should be matched on the page.
 
Step 4: Click on "Get Started" Button on Home Page and pass test data from Excel sheet to Complimentary Assessment form.
Criteria: pass the test sample data to the assessment form and submit the form.
 
Output:
Batch file for Execution
Excel sheet (Data, Objects, workflow)
Selenium Jar file
Source code
Screen Shots and Execution Report.


 
