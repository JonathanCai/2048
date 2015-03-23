# Spring2048

## Introduction

Basic wrapper with Spring, provides login and register services, and data persistence of 2048 scores, etc.

## Requirements

* Java7+
* Spring3+
* Hibernate3.6+
* Bootstrap3.2+
* MySQL5+
* HSQL1.8+
* Tomcat7+

## Quick Run

* Download the project and run `mvn jetty:run` and open the http://localhost:8555
* Download the war and deploy to a local Tomcat and open the configured host

## Project Setup

1. Lombok
  * For eclipse
    1. place the lombok.jar together with the eclipse.ini
    2. open the eclipse.ini and add `-javaagent:lombok.jar` at the end of the file
  * For IntellJ
    1. add the lombok plugin
  * Add the dependency into the pom.xml
2. Import as a maven project
  * mvn jetty:run for the quick development
  * mvn package for the war output

## Extension

1. How to configure a verification code in the sign in/sign up screen to avoid robot registrations?
2. How to switch to the persistent DB instead of memory DB?
3. How to enable session management when e.g. session is timeout but game is not over

## License

Origin license please see [HERE](LICENSE/LICENSE.txt).