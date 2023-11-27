# MvcTest
This repository demonstarates use of Model View Controller Architecture Pattern in Android Design Language using Java as programming language. This is one of the oldest know design method in android 
app development and has its root in general Java Application Design applied to Android Contructs. 
## Problem Statement 
In Android, everything that occurs happens in an Activity. Activity is where the controller from the operating system reaches the user Application. The system decides which file in an array of files must 
run in some context as specified in AndroidManifest.xml. 
Ya! an XML, you might have seen the use of XML to define dependencies for JAVA SPRING APPLICATIONS, it turns out Android does the same. 
Every permission your app needs to access comes here, backgrond task info defined here, statically binding an Activity to a XML view file happens here.
But for a well defined and architected system which is Scalable, Adaptable and Extensible a coherent architecture is paramount. 
<b> That's where architectural design patterns and its type factors in. </b>
The most basic and widely used pattern (Android as well as non-Android) is MVC. 
It stands for ```Model View Controller```
1. MODEL = ``` The data model for accessing the data part of the application and abstracting the relationships between the Objects used to design the system. Let's one build and extend data capabilities of system irrespective of View```
2. VIEW = ``` The view part of MVC only provides an interface to change the view through controller and is completely decoupled from the model ```
3. CONTROLLER = ```The business logic of application resides here and it extracts the data from the Model and displays it using view methods.```
   
