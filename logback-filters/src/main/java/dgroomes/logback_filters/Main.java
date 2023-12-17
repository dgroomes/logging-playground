package dgroomes.logback_filters;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) throws InterruptedException {
        log.info("Let's learn about Logback Filters!");

        List<String> users = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            users.add("User" + i);
        }

        // Continuously execute a log statement over time. Experiment by making changes to the logback.xml file while
        // the program is running and see how it affects the logging output of the program.
        //noinspection InfiniteLoopStatement
        while (true) {
            for (String user : users) {
                log.info("Hello {}!", user);
                //noinspection BusyWait
                Thread.sleep(2000);
            }
            log.debug("Iterated through all {} of the users", users.size());
        }
    }
}
