# Java / Maven / AngularJs seed project

## Introduction

This project aims to be a good starting point for a java / maven / angularjs project.

NOTE: Deprecated
It was a very fine and well used Proof of concept and I learned a lot from it. The artikles resulting from this POC have been read by many people, but as all things go, this project is no longer a good source of information.
Use it as you see fit, but I do not recommend using it for real projects anymore.

check it out:

```bash
git clone https://github.com/IvoNet/java-angularjs-seed.git
```

## Prerequisites
* Firefox or Chrome
* [npm](https://www.npmjs.org)
* [nodejs](http://nodejs.org)
* [JDK](http://www.oracle.com/technetwork/java/javaee/downloads/index.html)
* [IDE](http://www.jetbrains.com/)
* [bower](http://bower.io)
* [PhantomJs](http://phantomjs.org) or `brew install phantomjs`
* [Application Server](https://glassfish.java.net/download.html) or `brew install glassfish`

## Installation

```bash
mvn package
```

When running this command a couple of things happen:
* Bower install will be run
* JSLint will be run in src/main/javascript sources
* Javascript will be minified
* All the other standard maven phases.

## Status of the project

See the article on [DZone](http://ivo2u.nl/5U)

