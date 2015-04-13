@echo off

color 0a

cls

cd ../../

REM : Compile
javac -d bin -sourcepath source source\edu\oakland\production\ClassProject\ClassProject.java

REM : Run class
java -cp bin;c:\junit\3.8.2\junit.jar; edu.oakland.production.ClassProject.ClassProject
