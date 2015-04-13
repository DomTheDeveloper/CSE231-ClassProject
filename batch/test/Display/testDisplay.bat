
@echo off

color 0a

cls

cd ../../../

REM : Compile
javac -d bin -classpath c:\junit3.8.2\junit.jar; -sourcepath source source\edu\oakland\test\ClassProject\Display\TestDisplay.java

REM : Test class
java -cp bin;c:\junit3.8.2\junit.jar; junit.swingui.TestRunner edu.oakland.test.ClassProject.Display.TestDisplay