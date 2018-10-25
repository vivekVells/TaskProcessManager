# Task Process Manager / ProcessOnitor / ProcesSanager

### Objective
- To implement the classic task manager application.  It must contain the following components: metrics collection, database storage, and a user interface.

### Project Working Demo (all demo files location: [link](https://github.com/vivekVells/TaskProcessManager/tree/master/demo-review))
- [Video Link](to be updated)
- [Working Demo - PDF sheet](to be updated)

### Tech Usage Info 
- Version 1: Java, Sigar, SQLite, Spring Boot, Maven, GitHub

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
- Used: IDE: Eclipse | OS: Windows
  - for Linux OS, executing the project is also follows similar steps

## To run the Web App
- setup java & maven env in your local machine. (reference: https://www.mkyong.com/maven/how-to-install-maven-in-windows/)
- download project (link: ) -> unzip it
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

## Version 1 - Web UI 
Initial Setup![](https://github.com/vivekVells/TaskProcessManager/blob/master/demo-review/version1/spring-boot/1st%20verison%20output%20-%20localhost_8080%20-%20Google%20Chrome%2010_24_2018%2011_47_10%20PM.png)
## Version 1 - Verifying the system level info 
System Related Information![](https://github.com/vivekVells/TaskProcessManager/blob/master/demo-review/version1/System%20Info.PNG)
CPU Related Information![](https://github.com/vivekVells/TaskProcessManager/blob/master/demo-review/version1/CPU%20info.PNG)

