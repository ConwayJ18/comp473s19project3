# comp473s19project3

This is the repository for Project 3 of COMP 363/463, offered by Loyola University Chicago in Spring 2019. The owners of this project are Jess Conway and Sophie Von Hatten. The official guidelines for the assignment can be found in the Specifications folder.

This project is essentially a copy of Project 2, with the addition of implementations of the Bridge and Observer Patterns.

The Bridge Pattern is implemented in src/facilitymanager/model/inspection among all the files found within. In this new code, the implementation and abstraction of Inspections and their InspectionTypes are separated.

The Observer Pattern is implemented in src/facilitymanager/model/use among FacilityUser and UseSchedule. Whenever a Facility's use schedule is updated, each FacilityUser observing it is notified. They update their personal schedules accordingly.

The initial submission of this project is due on 7 Apr 2019.
