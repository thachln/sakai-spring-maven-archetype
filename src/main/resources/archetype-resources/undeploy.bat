@ECHO OFF
SET TOMCAT_SAKAI=D:\jPackages\sakai11.3-tomcat-8.5.12

ECHO Removing FileMSakai appplication from the Sakai %TOMCAT_SAKAI%

ECHO Remove folders/packages from the webapps
del /S /Q %TOMCAT_SAKAI%\webapps\\${artifactId}.war
rd /S  /Q %TOMCAT_SAKAI%\webapps\\${artifactId}-tool

ECHO Remove folder from the components
rd /S  /Q %TOMCAT_SAKAI%\components\\${artifactId}-pack

ECHO Remove libraries from the lib
del /S /Q %TOMCAT_SAKAI%\lib\\${artifactId}-api-0.0.1.jar




