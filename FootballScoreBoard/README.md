This is a Maven project that provides an implementation of the Football World Cup Score Board. 

- ### CL

#### Run application @CL

> Clone the repository branch "FootballScoreBoard", cd to project dir

> mvn clean compile package

> java -jar target/dwivedi-1.0-SNAPSHOT.jar

#### Run test cases

> mvn test

- ### IntelliJ

#### Run application @IntelliJ

> You need to run the project in IntelliJ

> Clone the repository, load it in IntelliJ as project

> Right click on 'Main.java' and click 'Run'

#### Run test cases

> Right click on project name and click "Run 'All Tests'"

- ### Cloud

#### Run application @Cloud

> http://gitpod.io/#https://github.com/sauravdwivedi/Java/tree/main/FootballScoreBoard

pom.xml file takes care of dependencies required for Junit 5 tests. First line in input file 'FootballScoreBoard_input.txt' refers to number of matches. Following lines in input file refer to home team, away team, home team's score and away team's score, seperated by ','. Project takes care of any extra spaces in the input file. 
