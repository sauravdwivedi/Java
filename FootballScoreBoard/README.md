This is a Maven application based on Model View Controller architecture, that provides an implementation of the Football World Cup Score Board. The game starts with capturing home team and away team names, with initial scoreboard 0 - 0, and updates scoreboard by capturing teams' scores. Finally app clears score board and finishes a game. The summary of games is listed by highest total scores. In case of total score clash, most recent game listed appears first.

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

> http://gitpod.io/#https://github.com/sauravdwivedi/ModelViewController

pom.xml file takes care of dependencies required for Junit 5 tests.
