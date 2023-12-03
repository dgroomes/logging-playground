package dgroomes.jul_slf4j_bridge;

import org.fictional_utility_library.ThirdPartyStringUtility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.bridge.SLF4JBridgeHandler;

import java.util.logging.Level;
import java.util.logging.LogManager;

/**
 * Please see the README for more information.
 */
public class Main {

    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        installLoggingBridge();

        log.info("Let's route third-party library code to log through SLF4J using the JUL-to-SLF4J bridge.");

        log.debug("A DEBUG-level message from our own source code.");
        log.info("An INFO-level message from our own source code.");

        boolean isBlank = ThirdPartyStringUtility.isBlank(" ");
        log.info("The third-party 'isBlank' method returned: {}", isBlank);
    }

    /**
     * Install the JUL-to-SLF4J bridge. This is the standard boilerplate to make this work, but you should study the
     * performance impact of this configuration. The JavaDoc in {@link SLF4JBridgeHandler} explains it well.
     *  <p>
     * Also see <a href="https://stackoverflow.com/a/9117188">this StackOverflow answer</a> for more information about this
     * topic. In particular, you need to blanket enable all logs in JUL if you want them to all be routed to SLF4J.
     */
    private static void installLoggingBridge() {
        SLF4JBridgeHandler.removeHandlersForRootLogger();
        SLF4JBridgeHandler.install();
        LogManager.getLogManager().getLogger("").setLevel(Level.FINEST);
    }
}
