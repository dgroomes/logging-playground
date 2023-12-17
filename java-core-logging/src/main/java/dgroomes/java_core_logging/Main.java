package dgroomes.java_core_logging;

import java.lang.System.Logger.Level;

/**
 * A simple Java program to illustrate Java's core logging facilities.
 * <p>
 * I am purposely not coding to java.util.logging (JUL) and instead coding to the JDK's newer offering: {@link System.Logger}.
 * I'm not sure that I can advocate for coupling code to the JUL API. In my opinion, it's better to either code to the system
 * logger, use SLF4J or consider more advanced options if needed.
 * <p>
 * For more background on my JUL opinion, see <a href="https://stackoverflow.com/a/70561129/">this StackOverflow answer</a>.
 */
public class Main {

    private static final System.Logger log = System.getLogger(Main.class.getName());
    private static final System.Logger specialLog = System.getLogger("speciallog");

    static {
        LoggingConfig.config();
    }

    public static void main(String[] args) {
        var msg = "This message should be logged at the log level {0} and above";

        log.log(Level.ALL, msg, "ALL");
        log.log(Level.TRACE, msg, "TRACE");
        log.log(Level.DEBUG, msg, "DEBUG");
        log.log(Level.INFO, msg, "INFO");
        log.log(Level.WARNING, msg, "WARNING");
        log.log(Level.ERROR, msg, "ERROR");

        specialLog.log(Level.INFO, "Hello! This message was logged on the 'speciallogger'. Notice how the format is different than the other logs.");
    }
}
