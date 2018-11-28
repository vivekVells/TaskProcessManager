# Task Process Manager / ProcessOnitor / ProcesSanager

[![Build Status](https://semaphoreci.com/api/v1/projects/3bb1fbdb-6c1a-4804-ad37-36a86bc09d46/2305464/badge.svg)](https://semaphoreci.com/kevshali/taskprocessmanager)

### Objective
- To implement the classic task manager application.  It must contain the following components: metrics collection, database storage, and a user interface.

### Project Working Demo (all demo files location: [link](https://github.com/vivekVells/TaskProcessManager/tree/master/demo-review))
- [Video Link](to be updated)
- [Working Demo - PDF sheet](to be updated)
- [Working Functionality Pictures Demo](https://github.com/vivekVells/TaskProcessManager#application-screenshots-so-farwanna-avoid-scrolling-a-lot-use-above-pdf-sheet)

### Tech Usage Info 
- Version 1: Java, Spring Boot, Maven, GitHub, Semaphore CI, Apache Derby, Sigar, Log4j

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
