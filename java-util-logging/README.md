# java-util-logging

Showcasing Java's core logging facilities: `java.util.logging`.

## Why?

The surface area of logging solutions in the Java ecosystem is vast. Java's own standard library for logging is
infrequently used compared to logging frameworks like Log4j, Logback and the logging facade SLF4J but it is still important
to learn in my opinion. 

## Instructions

* Use Java 17
* Build and run the program:
  * `./gradlew run`
  * Notice the logs printed to the console!
* Study the configuration
  * Read the `build.gradle.kts` file and notice the system properties used when running the program
  * Read the `custom-logging.properties` file and notice the log level and file handler configurations
  
## Tips

A great way to learn about and explore Java's core logging facilities is to make a copy of Java's default logging configuration
file:

```
cp "$JAVA_HOME/conf/logging.properties my-custom-logging.properties"
```

Then, open the file and tweak some property values. Then, execute your Java program and pass a reference to your custom
configuration file via a Java system property:

```
-Djava.util.logging.config.file=my-custom-logging.properties
```

## Reference

* [Oracle Help Center for Java: *Java Logging Overview*](https://docs.oracle.com/en/java/javase/16/core/java-logging-overview.html)
* [JavaDoc for `java.util.logging`](https://docs.oracle.com/en/java/javase/16/docs/api/java.logging/java/util/logging/package-summary.html)
