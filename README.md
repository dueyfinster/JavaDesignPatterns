[![Build Status](https://travis-ci.org/dueyfinster/DesignPatterns.png)](https://travis-ci.org/dueyfinster/DesignPatterns)
[![Circle CI](https://circleci.com/gh/dueyfinster/DesignPatterns.svg?style=svg)](https://circleci.com/gh/dueyfinster/DesignPatterns)
[![Build status](https://ci.appveyor.com/api/projects/status/ael2iylv4arw5hwt?svg=true)](https://ci.appveyor.com/project/dueyfinster/designpatterns)
[![Coverage Status](https://coveralls.io/repos/dueyfinster/DesignPatterns/badge.png)](https://coveralls.io/r/dueyfinster/DesignPatterns)

# Overview 
A collection of design patterns in Java. 
My aim is to implement all of them (with documentation) as a learning resource/ reference point for myself and others.

| ~~Creational~~  		| Structural 	| Behavioral 					|
| ------------- 		| ------------- | ------------- 				|
| ~~Abstract factory~~  | ~~Adapter~~  	| ~~Chain of responsibility~~	|
| ~~Builder~~  			| ~~Bridge~~  	| ~~Command~~ 					|
| ~~Factory~~  			| ~~Composite~~ | ~~Iterator~~  				|
| ~~Prototype~~  		| ~~Decorator~~ | Mediator  					|
| ~~Singleton~~  		| ~~Facade~~  	| Memento  						|
| ~~Object pool~~  		| ~~Flyweight~~ | ~~Observer~~  				|
| 						| ~~Proxy~~  	| State  						|
| 						| 				| ~~Strategy~~  				|
| 						| 				| Template method  				|
| 						| 				| Visitor  						|

## Building
To build, just do a Maven build. Also included is findbugs, jacoco, PMD and checkstyle.

## Running 
Each pattern has a class with a main method that runs that pattern - so you can try them individually. No current method for running them all - but could be done!

## Pull Requests 
Pull requests are very much welcome! Please note, every pull request should have:

* A matching JUnit Test (with good coverage)
* Run and fixed any checkstyle errors (run `mvn checkstyle:checkstyle`) [if you don't build will fail]
* PMD (run `mvn pmd:pmd`) and Findbugs should also be run and best effort to resolve issues

## Contributors
* Neil Grogan (dueyfinster)
* Mark Howard (bark4mark)
