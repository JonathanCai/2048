# Spring2048

## Introduction

Simple wrapper with Spring, provides login and register services, and data persistence of 2048 scores, etc.

~~Just for fun~~

## Requirements

* Java7+
* Spring4+
* Hibernate3.6+
* Bootstrap3.2+
* MySQL5+
* Tomcat7+

## Project Setup

1. Lombok
  * For eclipse
    1. place the lombok.jar together with the eclipse.ini
    2. open the eclipse.ini and add `-javaagent:lombok.jar` at the end of the file
  * For IntellJ
    1. add the lombok plugin
  * Add the dependency into the pom.xml
2. MySQL Database
  * sql> source spring2048.sql
3. Import maven project
  * mvn jetty:run for the quick development
  * mvn package for the output

## Configurations



## License

Origin license please see [HERE](LICENSE/LICENSE.txt).