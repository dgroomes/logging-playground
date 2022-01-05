# java-core-logging

Showcasing Java's core logging facilities: `java.util.logging` (JUL) and `java.lang.System.Logger`.

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
cp "$JAVA_HOME/conf/logging.properties" my-custom-logging.properties
```

Then, open the file and tweak some property values. Then, execute your Java program and pass a reference to your custom
configuration file via a Java system property:

```
-Djava.util.logging.config.file=my-custom-logging.properties
```

## Wish List

General clean-ups, TODOs and things I wish to implement for this project:

* [x] DONE Log messages with a parameter. Remember, MessageFormatter is used under-the-hood and supports
  format strings like `{1}`.
* [x] DONE Use a custom format string. I don't like the two-line default.
* [x] DONE Consider (update: yes, do it) coding to `java.lang.System.Logger`
* [x] DONE Defect. The log level isn't working. It should printing FINE logs but isn't.

## Reference

* [Oracle Help Center for Java: *Java Logging Overview*](https://docs.oracle.com/en/java/javase/16/core/java-logging-overview.html)
* [JavaDoc for `java.util.logging`](https://docs.oracle.com/en/java/javase/16/docs/api/java.logging/java/util/logging/package-summary.html)
* [JEP 264: "Platform Logging API and Service"](https://openjdk.java.net/jeps/264)
  * This JEP introduced `java.lang.System.Logger` which is a lightweight API that internal JDK classes code to so that
    they may be de-coupled from the `java.logging` module. 
* [JavaDoc for the class "java.text.MessageFormat"](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/text/MessageFormat.html)
  > `MessageFormat` provides a means to produce concatenated messages in a language-neutral way. Use this to construct
    messages displayed for end users.
  
  `MessageFormat` is used by JUL. It uses curly-brace style parameterization like `Hello {1}, my name is {2}`. I
  can't believe I didn't know this. I always assumed the C style format (`String.format` and `Hello %s, my name is %s`)
  was Java's only standard option.
* [My own StackOverflow answer that paints a poor picture for the development experience of the JUL API](https://stackoverflow.com/a/70561129/1333713)
