# logging-playground

📚 Learning and experimenting with logging libraries in the Java ecosystem.


## Standalone subprojects

This repository illustrates different concepts, patterns and examples via standalone subprojects. Each sub-project is
completely independent of the others and do not depend on the root project. This _standalone sub-project constraint_
forces the subprojects to be complete and maximizes the reader's chances of successfully running, understanding, and
re-using the code.

The subprojects include:


### `slf4j-simple/`

A simple logging setup using SLF4J's `slf4j-simple` logging implementation.

See the README in [slf4j-simple/](slf4j-simple/). 


### `logback-filters/`

Using [Logback _Filters_](http://logback.qos.ch/manual/filters.html) to conditionally log some things and not others.
Useful, for example, to sample some logs that would otherwise be too numerous if enabled 100%.

See the README in [logback-filters/](logback-filters/).


### `java-core-logging/`

Showcasing Java's core logging facilities: `java.util.logging` (JUL) and `java.lang.System.Logger`.

See the README in [java-core-logging/](java-core-logging/).


### `jul-slf4j-bridge/`

Bridge `java.util.logging` (JUL) logging statements to SLF4J.

See the README in [jul-slf4j-bridge/](jul-slf4j-bridge/).
