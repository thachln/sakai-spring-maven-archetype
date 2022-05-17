# sakai-spring-tiles-maven-archetype
How to compile and install this project into local maven repository
-----------------------------------------
1. Execute script "install.bat".

Check the result in installed folder %USERPROFILE%\.m2\repository\org\sakaiproject\maven-archetype\sakai-spring-maven-archetype\19.2

How generate source code for Sakai app
-----------------------------------------
1. Create an empty folder for the project.
2. Execute following command:

mvn archetype:generate -DarchetypeGroupId=org.sakaiproject.maven-archetype -DarchetypeArtifactId=sakai-spring-maven-archetype -DarchetypeVersion=19.2


How to run the source code
-----------------------------------------
## For Sakai app
Run script generate.cmd

## For Web app
Modify file pom.xml by comment following block:

<parent>
</parent>
