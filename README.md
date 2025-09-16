# QA Automation Framework – Web Application Testing

## Project Overview
This is a modular automation framework built using Selenium WebDriver, TestNG, Java, and Apache POI to automate web application testing in a structured, reusable, and data-driven manner.  
It automates the login functionality of a web application using industry-standard best practices.

## Technologies Used
- Selenium WebDriver  
- TestNG  
- Java  
- Apache POI (for Excel-based Data-Driven Testing)  
- Page Object Model (POM) Design Pattern  
- Maven (for dependency management)  
- Explicit Waits for stable test execution  

## Key Features
- Modular framework design using Page Object Model (POM)  
- Data-driven tests powered by Excel input data  
- Explicit waits (ExpectedConditions) to handle dynamic elements  
- Configurable setup via config.properties file  
- Clean separation of locators, test data, and test logic  

## Project Structure
seleniumdemo/
├── src/
│ ├── main/java/
│ ├── test/java/
│ │ ├── Base/
│ │ ├── testcases/
│ │ └── utilities/
│ └── test/resources/
│ ├── configfiles/
│ └── testdata.xlsx
├── pom.xml
├── testng.xml
├── .gitignore
├── README.md


## How to Run
1. Install Java (JDK 8 or higher) and Maven.  
2. Clone the repository:  
   `git clone https://github.com/yourusername/your-repo.git`  
3. Navigate to the project folder:  
   `cd seleniumdemo`  
4. Execute tests using Maven:  
   `mvn test`  

## Author
Kuldip Padole – Aspiring QA Automation Engineer  
LinkedIn: https://linkedin.com/in/kuldippadole04  
