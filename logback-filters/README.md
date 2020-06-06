# logback-filters

NOT YET IMPLEMENTED Learning and exploring [Logback _Filters_](http://logback.qos.ch/manual/filters.html).

---

Logback Filters can be used to conditionally log some things and not others. This is useful, for example, to sample some
logs that would otherwise be too numerous if enabled 100%.

### Instructions

* Use Java 11.
* Build and run with `./gradlew run`
  
### Wish List

Items I wish to implement for this project:

 * How do I implement filters that key off of the contents of the message?
 * How do I implement filters that key off of some other kind of metadata *besides the contents of the message*? Is MDC
   the only other thing that can be keyed off of? 
