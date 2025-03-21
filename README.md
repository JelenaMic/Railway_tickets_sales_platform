# Ltglink Automation Test

### Reference: https://ltglink.lt/

## Description:

#### Automated tests chosen scenarios for [ltglink](https://ltglink.lt/):

* Positive login test with valid user email and password
* Negative login test with no user email
* Negative login test with no user password
* Positive logout test
* Positive trip search test one way
* Positive trip search test two ways

## Technologies:

* Java with Maven for project management

#### Dependencies:

* Selenium for browser automation
* WebDriverManager for managing browser drivers
* Explicit Waits for handling dynamic web elements
* TestNG for test management and execution
* Screenshot Capture for recording test failures

# Test Scenarios:

### 1. Positive login test with valid user email and password

* Enter user email
* Enter user password
* Click on button "Patvirtinti"
* Read url Account page
* Read account name();

### 2. Negative login test with no user email

* Enter user password
* Click on button "Patvirtinti"
* Read error message "Neteisingi duomenys"

### 3. Negative login test with no user password

* Enter user email
* Click on button "Patvirtinti"
* Read error message "Informacija privaloma"
* Read error message "Įveskite slaptažodį"

### 4. Positive logout test

* Click account dropdown
* Click logout link
* Read Home page url
* Read label "Mano Paskyra"

### 5. Positive trip search test one way

* Click buy tickets
* Select trip From
* Select trip To
* Select trip data
* Select passenger type
* click to search
* click travel class option
* Click to payment
* Read url Pay page
* Read route From To forward

### 6. Positive trip search test two ways

* Click buy tickets
* Select trip From
* Select trip To
* Select trip data
* Select trip data backward
* Select passenger type
* Click to search
* Click travel class option
* Click continue ordering
* Click travel class option
* Click to payment From To
* Read url Pay page
* Read route From To forward
* Read route From To backward

### Video recording of tests

[![Watch the video](https://img.icons8.com/clouds/100/000000/video.png)](https://drive.google.com/file/d/1EPkttStA-oKEIdWLtEE5DHnlzLgrYuYg/view?usp=share_link)




