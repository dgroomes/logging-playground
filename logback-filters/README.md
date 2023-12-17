# logback-filters

Learning and exploring [Logback _Filters_](http://logback.qos.ch/manual/filters.html).


## Overview

Logback Filters can be used to conditionally log some things and not others. This is useful, for example, to sample some
logs that would otherwise be too numerous if enabled 100%.


## Instructions

Follow these instructions to build and run the example program:

1. Pre-requisite: Java 21
2. Build the program distribution
   * ```shell
     ./gradlew installDist
     ```
3. Run the program
   * ```shell
     build/install/logback-filters/bin/logback-filters
     ```
   * Study the log output carefully and compare it to the log statements in the Java source code. Notice how the logs
     show "Hello User7!" but not "Hello User6!", "Hello User5!", etc. That's because of the filter! The logs should look
     something like this:
     ```text
     ... Logback debugging info. Omitted  ...
     19:25:33 [main] INFO  dgroomes.logback_filters.Main - Let's learn about Logback Filters!
     19:25:45 [main] INFO  dgroomes.logback_filters.Main - Hello User7!
     19:25:53 [main] DEBUG dgroomes.logback_filters.Main - Iterated through all 10 of the users
     ```


## Wish List

General clean-ups, TODOs and things I wish to implement for this project:

 * [ ] How do I implement filters that key off of the contents of the message?
 * [ ] How do I implement filters that key off of some other kind of metadata *besides the contents of the message*? Is MDC
   the only other thing that can be keyed off of? 
