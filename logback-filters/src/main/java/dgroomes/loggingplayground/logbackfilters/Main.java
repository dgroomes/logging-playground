package dgroomes.loggingplayground.logbackfilters;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        log.info("NOT YET IMPLEMENTED Let's learn about Logback Filters!");

        List<String> users = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            users.add("User" + i);
        }

        for (String user : users) {
            log.info("Hello {}!", user);
        }
    }
}
