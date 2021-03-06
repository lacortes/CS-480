@if "%DEBUG%" == "" @echo off
@rem ##########################################################################
@rem
@rem  AI_Practice startup script for Windows
@rem
@rem ##########################################################################

@rem Set local scope for the variables with windows NT shell
if "%OS%"=="Windows_NT" setlocal

set DIRNAME=%~dp0
if "%DIRNAME%" == "" set DIRNAME=.
set APP_BASE_NAME=%~n0
set APP_HOME=%DIRNAME%..

@rem Add default JVM options here. You can also use JAVA_OPTS and AI_PRACTICE_OPTS to pass JVM options to this script.
set DEFAULT_JVM_OPTS=

@rem Find java.exe
if defined JAVA_HOME goto findJavaFromJavaHome

set JAVA_EXE=java.exe
%JAVA_EXE% -version >NUL 2>&1
if "%ERRORLEVEL%" == "0" goto init

echo.
echo ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH.
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:findJavaFromJavaHome
set JAVA_HOME=%JAVA_HOME:"=%
set JAVA_EXE=%JAVA_HOME%/bin/java.exe

if exist "%JAVA_EXE%" goto init

echo.
echo ERROR: JAVA_HOME is set to an invalid directory: %JAVA_HOME%
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:init
@rem Get command-line arguments, handling Windows variants

if not "%OS%" == "Windows_NT" goto win9xME_args

:win9xME_args
@rem Slurp the command line arguments.
set CMD_LINE_ARGS=
set _SKIP=2

:win9xME_args_slurp
if "x%~1" == "x" goto execute

set CMD_LINE_ARGS=%*

:execute
@rem Setup the command line

set CLASSPATH=%APP_HOME%\lib\AI_Practice.jar;%APP_HOME%\lib\guava-22.0.jar;%APP_HOME%\lib\java-sdk-4.0.0.jar;%APP_HOME%\lib\jsr305-1.3.9.jar;%APP_HOME%\lib\error_prone_annotations-2.0.18.jar;%APP_HOME%\lib\j2objc-annotations-1.1.jar;%APP_HOME%\lib\animal-sniffer-annotations-1.14.jar;%APP_HOME%\lib\alchemy-4.0.0.jar;%APP_HOME%\lib\conversation-4.0.0.jar;%APP_HOME%\lib\discovery-4.0.0.jar;%APP_HOME%\lib\document-conversion-4.0.0.jar;%APP_HOME%\lib\language-translator-4.0.0.jar;%APP_HOME%\lib\natural-language-classifier-4.0.0.jar;%APP_HOME%\lib\natural-language-understanding-4.0.0.jar;%APP_HOME%\lib\personality-insights-4.0.0.jar;%APP_HOME%\lib\retrieve-and-rank-4.0.0.jar;%APP_HOME%\lib\speech-to-text-4.0.0.jar;%APP_HOME%\lib\text-to-speech-4.0.0.jar;%APP_HOME%\lib\tone-analyzer-4.0.0.jar;%APP_HOME%\lib\tradeoff-analytics-4.0.0.jar;%APP_HOME%\lib\visual-recognition-4.0.0.jar;%APP_HOME%\lib\core-4.0.0.jar;%APP_HOME%\lib\logging-interceptor-3.8.0.jar;%APP_HOME%\lib\okhttp-urlconnection-3.8.0.jar;%APP_HOME%\lib\okhttp-3.8.0.jar;%APP_HOME%\lib\gson-2.8.0.jar;%APP_HOME%\lib\commons-lang3-3.5.jar;%APP_HOME%\lib\jersey-jsr166e-2.25.1.jar;%APP_HOME%\lib\okio-1.13.0.jar

@rem Execute AI_Practice
"%JAVA_EXE%" %DEFAULT_JVM_OPTS% %JAVA_OPTS% %AI_PRACTICE_OPTS%  -classpath "%CLASSPATH%" App %CMD_LINE_ARGS%

:end
@rem End local scope for the variables with windows NT shell
if "%ERRORLEVEL%"=="0" goto mainEnd

:fail
rem Set variable AI_PRACTICE_EXIT_CONSOLE if you need the _script_ return code instead of
rem the _cmd.exe /c_ return code!
if  not "" == "%AI_PRACTICE_EXIT_CONSOLE%" exit 1
exit /b 1

:mainEnd
if "%OS%"=="Windows_NT" endlocal

:omega
