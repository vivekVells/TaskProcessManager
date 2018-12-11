**View all of my Projectworks - click over here -> [Vivek Vellaiyappan Project Works](https://github.com/vivekVells/VivekVellaiyappanProjectWorks)**

# Task Process Monitor / ProcessOnitor / ProcesSanager

[![Build Status](https://semaphoreci.com/api/v1/projects/3bb1fbdb-6c1a-4804-ad37-36a86bc09d46/2305464/badge.svg)](https://semaphoreci.com/kevshali/taskprocessmanager)

### Objective
- To implement the classic task manager application.  It must contain the following components: metrics collection, database storage, and a user interface.

### Team Info & Roles Executed for this project
|        Name        |                                   Roles                                  |         Shared Roles         |
|:------------------:|:------------------------------------------------------------------------:|:----------------------------:|
| Vivek Vellaiyappan | Scrum Master, Manager, Software Engineer, Web Developer, DevOps Engineer | Architect, Technical Writer |
| Deeksha            | Testing Engineer,  Automation Engineer                                   | Architect, Technical Writer  |
| Neha               | Testing Engineer,  Automation Engineer                                   | Architect, Technical Writer  |

### Tech Stack 
- Java, Sigar API (to get system level info), Spring Boot, Spring, Spring MVC, Spring Rest Controller, Spring Data JPA, Hibernate, Spring Scheduler, H2 - Database, Junit, HTML, CSS, JavaScript, jQuery, Bootstrap, Github, CI/CD pipeline - Semaphore, Docker, Maven, Swagger, Webjarjs, Log4j, Postman (API testing & actions)
### Project Highlights
|              |                      |                                  |                    |                           |
|--------------|----------------------|----------------------------------|--------------------|---------------------------|
| SDLC Process | Agile                | Architectural Decisions          | GitHub             | Maven                     |
| CI:Semaphore | CD: Docker container | Deployment: Heroku (in Progress) | REST API endpoints | Swagger API documentation |

### Future Plans/Enhancements
|                                                                                                                                                    |                                                            |                                                                               |
|----------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------|-------------------------------------------------------------------------------|
| Cloud Deployment  - Scaling up & delivery of this web Application to everyone by using Cloud CSPs                                                  | Exploring Microservices architecture  for this application | Developer Portal Website to expose the application API to external developers |
| Code Development Practice Related   - Hot Deploy concept in concept tryout   - Issues creation & assigning gently   automatically when buildfails  | Using Frontend Framework                                   | Implementing Adobe Analytics or such data analysis over application           |

### Quick Links:
|                                                                                          File (links)                                                                                          |                        Description                       |
|:----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------:|:--------------------------------------------------------:|
| [Work Log](https://github.com/vivekVells/TaskProcessManager/blob/master/demo-review/version2/files/What%20We%20did%20-%20Work%20Status%20Log.pdf)                                              | contains log about work done towards the project         |
| [Meeting Log](https://github.com/vivekVells/TaskProcessManager/blob/master/demo-review/version2/files/Meeting%20Log.pdf)                                                                       | contails log about meeting sync up info                  |
| [Design Document](https://github.com/vivekVells/TaskProcessManager/blob/master/demo-review/version2/files/Design%20Document.pdf)                                                               | document explaining the design approach for this project |
| [Test Approach Docuemnt](https://github.com/vivekVells/TaskProcessManager/blob/master/demo-review/version2/files/Test%20Approach%20Document.pdf)                                               | document explaining the test approach for this project   |
| [Task Process Monitor - Final Demo PPT](https://github.com/vivekVells/TaskProcessManager/blob/master/demo-review/version2/files/Task%20Process%20Monitor%20-%20Project%20-%20Final%20Demo.pdf) | Final Demo Presentation File                             |

#### Note: Will be updating this read me document more about the instrutions to run this in your windows machine, few more demo info & few more info. Kindly refer Gifs, pdfs, & Screenshots mentioned below for now - Version 2.0.

### Demo - Version 2.0 Project Images
**Project Demo Presentation slides pdf** - will be inserting few more slides. Link: [Click Me](https://drive.google.com/open?id=1-Q7_c6f8cjn-SFLiUFJT4uNpP5ndBizl)

**Total CPU Usage** - value updation in real time - [video](https://github.com/vivekVells/TaskProcessManager/blob/master/demo-review/version2/Task%20Process%20Monitor%20-%20Total%20CPU%20memory%20Usage.mp4)
**Total CPU memory usage** - The values gets updated in real time
![](
https://github.com/vivekVells/TaskProcessManager/blob/master/demo-review/version2/Task%20Process%20Monitor%20-%20Total%20CPU%20memory%20Usage.gif)
![](https://github.com/vivekVells/TaskProcessManager/blob/master/demo-review/version2/Screenshots/Total%20CPU%20Memory%20Usage.PNG)

**Project Home page** 
![](https://github.com/vivekVells/TaskProcessManager/blob/master/demo-review/version2/Screenshots/Process%20Monitor%20home%20page.PNG)
**Project Home Page - verison & a single total cpu memory usage values**
![](https://github.com/vivekVells/TaskProcessManager/blob/master/demo-review/version2/Screenshots/Process%20Monitor%20Home%20Page%20-%20Version%20%26%20Single%20CPU%20usage%20info.png)
**Maven Build System - Build success**
![](https://github.com/vivekVells/TaskProcessManager/blob/master/demo-review/version2/Screenshots/maven%20build%20output.PNG)
**Semaphore CI - Project Build Status**
- Tag on repo
![](https://github.com/vivekVells/TaskProcessManager/blob/master/demo-review/version2/Screenshots/Build%20passed%20snippet.PNG)
**Semaphore CI - Home Page **
![](https://github.com/vivekVells/TaskProcessManager/blob/master/demo-review/version2/Screenshots/Semphore%20home%20page%20of%20this%20appln.PNG)
**Docerized Application**
![](https://github.com/vivekVells/TaskProcessManager/blob/master/demo-review/version2/Screenshots/Dockerized%20the%20application.PNG)

### Project Working Demo (all demo files location: [link](https://github.com/vivekVells/TaskProcessManager/tree/master/demo-review))
- [Video Link](to be updated)
- [Working Demo - PDF sheet](to be updated)
- [Working Functionality Pictures Demo](https://github.com/vivekVells/TaskProcessManager#application-screenshots-so-farwanna-avoid-scrolling-a-lot-use-above-pdf-sheet)

### Features
- View System Level info (aimed as of now)
  - System memory statistics: total, free, shared
  - CPU statistics: load averages, user cpu, system cpu
  - Process level statistics: process arguments, memory consumption, cpu consumption, credential info, state, environment, open file descriptors
  - File system level statistics: local and remote mounted file systems (NTFS, ext, SMB, NFS, etc), capacity, utilization
  - Network interface level statistics: all available network interfaces detected and monitored for bytes received/transmitted, packets received/transmitted, collisions, errors, dropped packets 
- Monitor the processes in an intuitive way (Charts, Graphs)

### Future Enhancements
- Note: The version will be updated whenever necessary to include more enhancements (will update these later) 

#### Note
- Using SIGAR for educational purpose only. (disclaimer made to avoid licensing issues with SIGAR)

### Instructions to run this project in your machine:
- Used: IDE: IntelliJ | OS: Windows, Linux

## To run the Web App (few recent changes made. will be updating this soon)
- setup java & maven env in your local machine. 
  - Windows: https://www.mkyong.com/maven/how-to-install-maven-in-windows/
  - Linux: for maven - https://www.youtube.com/watch?v=i8hSPwXZ0UI
- download project [Refer the release branch with tag v1.0](https://github.com/vivekVells/TaskProcessManager/releases/tag/v1.0)
- run following command
  - ```mvn clean install```
  	- proceed only after you receive "BUILD SUCCESS" confirmation
  - ```java -jar target\process-monitor-0.0.1-SNAPSHOT.war```
  	- make sure you got something similar to this line in the log ```INFO 10672 --- [           main] c.t.p.p.ProcessMonitorApplication        : Started ProcessMonitorApplication in 6.17 seconds (JVM running for 6.971)```
    - Note: in the unzipped folder -> navigate to the pom.xml file such that you end up similar to this location ```..\TaskProcessManager-master\version1\maven_use\eclipse_processmonitor_ver1\spring-boot\process-monitor```
- goto url http://localhost:8080/
    - verify whether you received this "Hello Spring Boot World! Will be deploying a Process Monitoring Application soon using you!!" in the web page

## To run a pgm & retrieve low level system info
- Eclipse IDE used for this project being downloaded eclipse from here - Eclipse IDE for Java EE Developers - 64 bit zip link: https://spring.io/tools3/eclipse
- setup the java  https://www.mkyong.com/java/how-to-set-java_home-on-windows-10/ and maven https://www.mkyong.com/maven/how-to-install-maven-in-windows/ dependencies in your system 
- clone this repo
    - git clone https://github.com/vivekVells/TaskProcessManager.git 
- open eclipse and open the proejct located in this location: .\TaskProcessManager\version1\maven_use\eclipse_processmonitor_ver1
- add the **sigar.jar** file to the project "processmonitorver1" by going to its properties (right click on project -> **Properties** -> **Java Build Path** on left pane -> **Libraries** tab on right pane -> **Add External JARs** button and add the sigar.jar file in this location .\TaskProcessManager\prototype\hyperic-sigar-1.6.4\sigar-bin\lib\sigar.jar
- optional: if eclipse shouts error stating "Project is missing required library: <location of jar>", then remove that one by - navigating to project properties of "processmonitorver1" by going to its properties - right click on project -> **Properties** -> **Java Build Path** on left pane -> **Libraries** tab on right pane -> **remove any unused or errored jar file**

### Application Screenshots So Far(wanna avoid scrolling a lot, use above pdf sheet)
Beware of the lots of scrolling to come :P

## OLD Screenshots - Version 1.0
### Ver 1.1 Screenshots accordingly
#### Collage - Screen: Welcome, Version Info, CPU Usage info, Utility Info
![](https://github.com/vivekVells/TaskProcessManager/blob/master/demo-review/version1/spring-boot/collaged%20screens%20of%20welcome%20-%20cpu%20-%20version%20-%20utility.PNG)
#### Default / Home Screen - http://localhost:8080 or http://localhost:8080/home
![](https://github.com/vivekVells/TaskProcessManager/blob/SwaggerSpringBoot/demo-review/version1/spring-boot/ver1.2/v1.2-default-home-page-web-page-response.PNG)
#### Welcome Screen - http://localhost:8080/welcome
Welcome Screen![](https://github.com/vivekVells/TaskProcessManager/blob/master/demo-review/version1/spring-boot/ver1.1%20-%20welcome%20screen.PNG)
#### Version Info Screen - http://localhost:8080/version
version info Screen![](https://github.com/vivekVells/TaskProcessManager/blob/master/demo-review/version1/spring-boot/ver1.1%20-%20version%20screen%20output.PNG)
#### Cpu Usage Screen - http://localhost:8080/cpu
Cpu Usage Screen![](https://github.com/vivekVells/TaskProcessManager/blob/master/demo-review/version1/spring-boot/ver1.1%20-%20cpu%20screen.PNG)
#### Utility Info Screen - http://localhost:8080/utility
Utility Screen![](https://github.com/vivekVells/TaskProcessManager/blob/master/demo-review/version1/spring-boot/ver1.1%20-%20utlity%20screen.PNG)
#### Test Web Response - http://localhost:8080/testresponse
![](https://github.com/vivekVells/TaskProcessManager/blob/SwaggerSpringBoot/demo-review/version1/spring-boot/ver1.2/v1.2-default-home-page-web-page-response.PNG)
#### Swagger UI Web page - http://localhost:8080/swagger-ui.html
![](https://github.com/vivekVells/TaskProcessManager/blob/SwaggerSpringBoot/demo-review/version1/spring-boot/ver1.2/v1.2-swagger-ui-info.PNG)
#### Swagger Meta Data for this Application - http://localhost:8080/v2/api-docs
![](https://github.com/vivekVells/TaskProcessManager/blob/SwaggerSpringBoot/demo-review/version1/spring-boot/ver1.2/v1.2-application-swagger-meta-data-json-output.PNG)
#### Page Not Found Error Page - http://localhost:8080/404.html
![](https://github.com/vivekVells/TaskProcessManager/blob/SwaggerSpringBoot/demo-review/version1/spring-boot/ver1.2/v1.2-page-not-found-error-page.PNG)

### Old versions screenshots below. 
## Version 1 - Web UI 
Initial Setup![](https://github.com/vivekVells/TaskProcessManager/blob/master/demo-review/version1/spring-boot/1st%20verison%20output%20-%20localhost_8080%20-%20Google%20Chrome%2010_24_2018%2011_47_10%20PM.png)
## Version 1 - Verifying the system level info 
System Related Information![](https://github.com/vivekVells/TaskProcessManager/blob/master/demo-review/version1/System%20Info.PNG)
CPU Related Information![](https://github.com/vivekVells/TaskProcessManager/blob/master/demo-review/version1/CPU%20info.PNG)
