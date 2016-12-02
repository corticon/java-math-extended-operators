# java-math-extended-operators
Corticon extended operators for Java.Math library

## Overview
Adds java.math commands as extended operators.

## Quick Start
This project includes a gradle script, however it can be built and run without having gradle installed using the gradlew scripts.

Before starting ensure you have java 7 installed.

1. Download the source repository, (either through git or as an archive)
2. If using an archive extract it.
3. Copy your CcExtensionAPI.jar file to the "Java Math Extended Operators" directory. This can be found in your CORTICON_HOME/Studio/lib directory. On windows machines you can generally find this jar in C:/Program Files/Progress/Corticon [version number]/Studio/lib
4. Open a command window in the "Java Math Extended Operators" directory and execute the following command:

 `gradlew build`

5. Assuming the build was successful, you should have the resulting jar file in the build/libs directory.

### common errors
#### Could not find tools.jar
 This is likely caused by using a java 8 JDK for compilation. Try installing a java 7 JDK and running the following command:
 `gradlew build -Dorg.gradle.java.home=/PATH_TO_JAVA_7_JDK`

## Performing your own build

 1. Clone the repository
 `git clone https://github.com/corticon/java-math-extended-operators.git`

 2. Perform a gradle build
 `cd java-math-extended-operators`
 `gradle build`

### Development
You can modify these extended operators by simply modifying the source files, we recommend that you import the two projects (Java Math Extended Operators and Java Math Tests) into corticon studio. From here, you can easily modify the existing operators or add your own.

### Testing
When adding new operators, or modifying old ones be sure to run the updated operators against the existing set of ruletests (found in the Java Math Tests project). If you are creating new operators be sure to create tests for the extended operator, to ensure it is working properly.

### Updating the gradle Wrapper scripts
If you make substantial modifications to the project's directory structure, it may become necessary to regenerate the gradle wrapper scripts. Run the following command and check the gradlew and gradlew.bat files into your fork of the repository.
