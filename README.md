# Task Process Manager

### Objective
- To implement the classic task manager application.  It must contain the following components: metrics collection, database storage, and a user interface.

### Project Working Demo (all demo files location: [link]())
- [Video Link](to be updated)
- [Working Demo - PDF sheet](to be updated)


### Tech Usage Info 
- Version 1: Java, Sigar, SQLite, Spring, Maven, GitHub

### Features
- View System Level info (aimed as of now)
  - System memory statistics: total, free, shared
  - CPU statistics: load averages, user cpu, system cpu
  - Process level statistics: process arguments, memory consumption, cpu consumption, credential info, state, environment, open file descriptors
  - File system level statistics: local and remote mounted file systems (NTFS, ext, SMB, NFS, etc), capacity, utilization
  - Network interface level statistics: all available network interfaces detected and monitored for bytes received/transmitted, packets received/transmitted, collisions, errors, dropped packets 

### Future Enhancements
- Note: The version will be updated whenever necessary to include more enhancements (will update these later) 

### Note
- Using SIGAR for educational purpose only. (disclaimer made to avoid licensing issues with SIGAR)

### Instructions to run this code in your machine:
#### In Eclipse or such IDE
- This is very simple, just open the file project pointing to this code repo's src folder
#### In console (Tested in Windows using GitBash cmd)
- Make sure JAVA setup is available in your machine (coded when java was on version 1.8.0_144)
- Open console command prompt or gitbash (I love git bash. Try this one)
- Pull this code to your machine and run it (Install git and use git bash for the followings)
  - Create a folder and do 
    - **git init**
  - Add this repo as your remote origin 
    - **git remote add origin https://github.com/vivekVells/MSCS721-roomScheduler.git**
  - Pull the code in this repo to your remote origin 
    - **git pull origin master**   
  - Type the followings (running the program in a particular path matters)
    - if you are in the created folder then, run like the following
        - Vivek-Pc@kev MINGW64 /e/Marist/Semester2/SoftwareVerificationAndMaintenance/RoomScheduler (master)
        - $ **java -jar src/resources/files/roomExportedFiles/exportedRoomScheduler.jar** 
    - Or move into all the way to roomExportedFiles folder and then try like the following
        - Vivek-Pc@kev MINGW64 /e/Marist/Semester2/SoftwareVerificationAndMaintenance/RoomScheduler/src/resources/files/roomExportedFiles (master)
        - $ **java -jar exportedRoomScheduler.jar**
        
### Application Screenshots So Far(wanna avoid scrolling a lot, use above pdf sheet)
Beware of the lots of scrolling to come :P

## Prototype
![]()

## Version 1
![]()

