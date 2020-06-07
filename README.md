# logging-playground

Learning and experimenting with logging libraries in the Java ecosystem.

---

The project illustrates different concepts, patterns and examples via standalone sub-projects:

### `slf4j-simple/`

A simple logging setup using SLF4J's `slf4j-simple` logging implementation.

See [slf4j-simple/README.md](slf4j-simple/README.md). 

### `logback-filters/`

Using [Logback _Filters_](http://logback.qos.ch/manual/filters.html) to conditionally log some things and not others.
Useful, for example, to sample some logs that would otherwise be too numerous if enabled 100%.

See [logback-filters/README.md](logback-filters/README.md).
