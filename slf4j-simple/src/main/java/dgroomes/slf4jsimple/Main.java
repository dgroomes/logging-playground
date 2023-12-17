package dgroomes.slf4jsimple;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        log.info("Let's learn about slf4-simple!");

        log.trace("A TRACE-level message");
        log.debug("A DEBUG-level message");
        log.info("An INFO-level message");
        log.warn("A WARN-level message");
        log.error("An ERROR-level message");
    }
}
