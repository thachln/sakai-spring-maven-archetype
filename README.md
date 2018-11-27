# sakai-spring-tiles-maven-archetype
How to compile and install this project into local maven repository
-----------------------------------------
1. Execute script "install.bat".

Check the result in installed folder %USERPROFILE%\.m2\repository\org\sakaiproject\maven-archetype\sakai-spring-maven-archetype\11.3

How generate source code for Sakai app
-----------------------------------------
1. Create an empty folder for the project.
2. Execute following command:

mvn archetype:generate -DarchetypeGroupId=org.sakaiproject.maven-archetype -DarchetypeArtifactId=sakai-spring-maven-archetype -DarchetypeVersion=11.3
