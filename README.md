# Nomis-Test
Test Navigation features on Nomis Website using the automation batch file created using Selenium with Java.
Extract the Nomi.zip file to a local destination on your computer,  The Source Code is present under the folder 'SRC' as 'Nomi.java' and the results with screen capture are present in the 'Results' Folder, rest of the folders and files are other reference files like crome driver, selenium jar, class files that are needed for the execution of the automation script.

Assumptions:
Since this is for demo purpose, DB Validations, Negative scenarios and Boundary conditions for testing are out of scope as this is being executed with only limited acess to the webpage. Input has been hardcoded within the script using Send Keys function instead of passing from a Data source like an Excel Sheet. Reports and test execution status is not generated for this demo as that will involve dependency with the Framework components.


Scope:

Step 1: Navigate to the URL: https://www.nomissolutions.com/
Criteria: The webpage must be loaded sucessfully.

Step 2: Validate Navigation for Home Page -> Solutions & Products -> Mortgages
Criteria: Navigate to "Home Page -> Solutions & Products -> Mortgages" and click on Solution Brief, page must load and header must match with this text 'Solution Brief'
 
Step 3: Use the Search feature on the Home page using key words like (eg. 'NOMI') and view the search result.
Criteria: The search must be sucessful and return valid links with key word match.
 
Step 4: Click on "Get Started" Button on Home Page and pass test data to Complimentary Assessment form.
Criteria: pass the test sample data to the assessment form and submit the form.
 
Output:
Batch file for Execution
Selenium Jar file
Source code


 
