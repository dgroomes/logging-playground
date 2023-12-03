# jul-slf4j-bridge

Bridge `java.util.logging` (JUL) logging statements to SLF4J.


## Overview

There are competing logging frameworks and toolchains in the Java ecosystem and this can leave you in an integration and
compatibility pickle. We often use SLF4J as a logging facade, and many libraries do the same, but some libraries are more
conservative and code to the Java standard library's logging API: `java.util.logging` (JUL). This project shows how to
bridge JUL to SLF4J so that JUL-based logging statements are routed through SLF4J and the rest of your logging toolchain.
This ability is important so that you can control logging configuration like log levels and formatting using your normal
configuration mechanism (e.g. `logback.xml`, `simplelogger.properties`, etc.).


## Instructions

Follow these instructions to build and run the example program:

1. Use Java 17
2. Build and run the program:
    * ```shell
      ./gradlew run
      ```
    * It will output something like the following.
    * ```text
      23:30:11 [main] INFO dgroomes.jul_slf4j_bridge.Main - Let's route third-party library code to log through SLF4J using the JUL-to-SLF4J bridge.
      23:30:11 [main] INFO dgroomes.jul_slf4j_bridge.Main - An INFO-level message from our own source code.
      23:30:11 [main] DEBUG org.fictional_utility_library.ThirdPartyStringUtility - The string is empty.
      23:30:11 [main] INFO dgroomes.jul_slf4j_bridge.Main - The third-party 'isBlank' method returned: true
      ```
    * Notice how the log statements from our own source code and the log statements from the third-party library show
      up with the same format. This is because the third-party log statements were routed to SLF4J. We can change the
      log levels for the third-party library using `simplelogger.properties`, but it's important to note that the JUL
      log levels need to be co-managed with the main logging framework (e.g. `slf4j-simple` in this case) log levels.
      This is an important concept. If a particular JUL logger isn't enabled, then a particular JUL log event will never
      make it to SLF4J. Read the code and links carefully to understand.


## Wish List

General clean-ups, TODOs and things I wish to implement for this project:

* [x] DONE Implement
