@ECHO OFF
REM Delete the folder "dist"
rd /S  /Q .\dist

REM call mvn clean package -Dmaven.test.skip=true
call mvn clean package

echo Prepare distribution for sakai 11.x
mkdir .\dist\components .\dist\webapps .\dist\lib
copy %USERPROFILE%\.m2\repository\org\projectlombok\lombok\1.16.14\lombok-1.16.14.jar .\dist\lib
copy .\api\target\\${artifactId}-api-${version}.jar .\dist\lib\\${artifactId}-api-0.0.1.jar

xcopy .\pack\target\\${artifactId}-pack-${version} .\dist\components\\${artifactId}-pack\ /S
copy .\tool\target\\${artifactId}-tool-${version}.war .\dist\webapps\\${artifactId}-tool.war

