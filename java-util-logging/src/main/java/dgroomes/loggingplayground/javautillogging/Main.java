package dgroomes.loggingplayground.javautillogging;

import java.util.logging.Logger;

/**
 * A simple Java program to illustrate Java's core logging facilities: java.util.logging.
 */
public class Main {

    private static final Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        log.finest("A FINEST-level message");
        log.finer("A FINER-level message");
        log.fine("A FINE-level message");
        log.config("A CONFIG-level message");
        log.info("An INFO-level message");
        log.warning("A WARNING-level message");
        log.severe("A SEVERE-level message");
    }
}
