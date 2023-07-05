# slf4j-simple

A simple logging setup using SLF4J's `slf4j-simple` logging implementation.


## Instructions

Follow these instructions to build and run the example program:

1. Use Java 17
2. Build and run the program:
    * ```shell
      ./gradlew run
      ```
    * It will output something like the following.
    * ```text
      22:58:05 [main] WARN dgroomes.loggingplayground.slf4jsimple.Main - A WARN-level message
      22:58:05 [main] ERROR dgroomes.loggingplayground.slf4jsimple.Main - An ERROR-level message
      ```
    * Notice how the code specified TRACE, DEBUG and INFO level messages but only WARN and ERROR messages were logged.
      Study the logging configuration file `src/main/resources/simplelogger.properties` to see why.


## Notes

How do you debug SLF4J itself? There must be a way to turn on debug or trace logs withing SLF4J's initialization
phase...
