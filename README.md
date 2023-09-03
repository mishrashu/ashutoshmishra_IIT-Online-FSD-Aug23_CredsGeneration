## ashutoshmishra_IIT-Online-FSD-Aug23_CredsGeneration
This project creates credentials for new hires e.g. email and password by taking first & last name of the new hire
#### In brief,  application  does the following:
* Generates an email with the syntax firstNamelastName@department.company.com
* Determines the department (Technical, Admin, Human Resource, Legal)
* Generates a random password which will contain (number, capital letter, small letter & special character)
* Displays the generated credentials
* Uses parameterized constructor of class Employee, to pass firstName, lastName.
* Creates a separate CredentialService which will have generatePassword, generateEmailAddress, & showCredentials method.
