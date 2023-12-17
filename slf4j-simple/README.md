# slf4j-simple

A simple logging setup using SLF4J's `slf4j-simple` logging implementation.


## Instructions

Follow these instructions to build and run the example program:

1. Pre-requisite: Java 21
2. Build the program distribution
    * ```shell
      ./gradlew installDist
      ```
3. Run the program
    * ```shell
      build/install/slf4j-simple/bin/slf4j-simple
      ```
    * It will output something like the following.
    * ```text
      19:18:27 [main] WARN dgroomes.slf4jsimple.Main - A WARN-level message
      19:18:27 [main] ERROR dgroomes.slf4jsimple.Main - An ERROR-level message
      ```
    * Notice how the code specified TRACE, DEBUG and INFO level messages but only WARN and ERROR messages were logged.
      Study the logging configuration file `src/main/resources/simplelogger.properties` to see why.


## Notes

How do you debug SLF4J itself? There must be a way to turn on debug or trace logs withing SLF4J's initialization
phase...
