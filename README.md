# Quizzer
A quiz/testing application for students, teachers, and administrators with content management (CRUD + keeping track of quiz sessions / quiz grades )

# Installation
1. Download and open file in SpringToolSuite4
2. Download Java 11 or higher
3. Install MySQL & MySQL Workbench
4. Import Schema (.SQL) file into MySQL Workbench
5. Configure the application.properties file to fit your settings.
6. Right click project in SpringToolSuite4 and click Maven > Update Project
7. Right click QuizzerApplication.java and run as Spring Boot App

# Tools
Java, Spring / Security, MySQL & MySQL Workbench, Thymeleaf, HTML, CSS, Javascript, BootStrap

#Usage
1. Launch app. Enter 'user' as username and copy and paste the spring security generated password.
2. You can create a new Student account or log in with info provided by the Schema file.
3. The student will take tests and have their score submitted to the teacher dashboard
4. Signed in as a teacher, you can add or delete questions 
5. Signed in as an Admin you can add or delete any type of user at will.

