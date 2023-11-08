
# Login Register using Spring-MVC
Developed login and register application using Spring mvc.



## Description

- The user can be able to login and register once login successful, in the home page all the users who have registered will visible.



## 🛠 Technology used

- Spring MVC
- JSP
- JDBC
- CSS
- Bootstrap
- MySQL

## 🛠 Tools used

- IntelliJ
- MySQL Workbench

## 🔲 Architecture

- Controller

        1. Home Controller
        2. Login Controller
        3. Register Controller

- DAO

        1. Home DAO
        2. Login DAO
        3. Register DAO

- DB

        1. Database Connection

- Pages

        1. Home.jsp
        2. Login.jsp
        3. Register.jsp



## 🔃Working of project

- Login Controller

        - Initially Login Controller starts runs.
        - In web.xml, i have given the servlet mapping url pattern as (/) where in login Controller in get mapping index .jsp page navigates
        - After submitting the form in index.jsp again the login controller starts authentication

- Register Controller

        - There will be a register button in index.jsp after clicking it, register.jsp page works.
        - Once after submitting the register register controller runs where it will check validation for field required and password match.
        - Finally the index page navigates where the user can login now.

- Home Controller

        - After login, the datum in the workbence will  be stored in the list using home Dao.
        - I used the model.addattribute and set the list.
        - Now the page navigates to the home.jsp page where the list will be looped and displayed in the table.
## For Storage purpose,

Used MySQL workbench for Storage purpose. 

## Screenshots
- Login:

<img src = "src/main/java/com/springmvc/screenshots/Login.png">

- Register

<img src = "src/main/java/com/springmvc/screenshots/Register.png">

- Home

<img src = "src/main/java/com/springmvc/screenshots/Home.png">
