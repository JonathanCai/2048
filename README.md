# Spring2048

## Introduction

Basic wrapper with Spring, provides login and register services, and data persistence of 2048 scores, etc.

## Requirements

* Java7+
* Spring4+: spring3 is suitable
* Hibernate3.6+
* Bootstrap3.2+
* MySQL5+
* Tomcat7+

## Quick Run

1. Download the war file
  * `mvn jetty:run` and open the http://localhost:8585
  * Configure to a Tomcat

## Project Setup

1. Lombok
  * For eclipse
    1. place the lombok.jar together with the eclipse.ini
    2. open the eclipse.ini and add `-javaagent:lombok.jar` at the end of the file
  * For IntellJ
    1. add the lombok plugin
  * Add the dependency into the pom.xml
2. MySQL Database
  * sql> source mysql-spring2048.sql
3. Import maven project
  * mvn jetty:run for the quick development
  * mvn package for the output

## Extension

1. How to configure a verification code in the sign in/sign up screen to avoid robot registrations?
2. How to switch to the persistent DB instead of memory DB?
3. How to enable session management when e.g. session is timeout but game is not over

## License

Origin license please see [HERE](LICENSE/LICENSE.txt).