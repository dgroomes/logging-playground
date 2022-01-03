package dgroomes.loggingplayground.javautillogging;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * A simple Java program to illustrate Java's core logging facilities: java.util.logging.
 */
public class Main {

    private static final Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        var msg = "This message should be logged at the log level {0} and above";

        log.log(Level.FINEST, msg, "FINEST");
        log.log(Level.FINER, msg, "FINER");
        log.log(Level.FINE, msg, "FINE");
        log.log(Level.CONFIG, msg, "CONFIG");
        log.log(Level.INFO, msg, "INFO");
        log.log(Level.WARNING, msg, "WARNING");
        log.log(Level.SEVERE, msg, "SEVERE");
    }
}
