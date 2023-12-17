package dgroomes.java_core_logging;

import java.util.logging.Logger;

/**
 * Programmatic customization of the java.util.logging (JUL) logging system.
 * <p>
 * Normally, JUL config is done in a ".properties" file but some customization is only possible programmatically in Java
 * code.
 * <p>
 * Note the interaction of the {@link System.Logger} with JUL. I should be able to configure individual JUL loggers by
 * getting them via the "getLogger" method of {@link java.util.logging.Logger}. These are the "wrapped" loggers and they
 * are wrapped by a {@link System.Logger}. See https://github.com/openjdk/jdk/blob/8b5de27ce1e4fe664e08879c2ca89d08db710c9d/src/java.logging/share/classes/sun/util/logging/internal/LoggingProviderImpl.java#L58
 * which reads:
 * <p>
 * Loggers returned by this class can therefore be configured by accessing their wrapped implementation
 * through the regular {@code java.util.logging} APIs - such as {@link java.util.logging.LogManager java.util.logging.LogManager}
 * and {@link java.util.logging.Logger java.util.logging.Logger}.
 */
public class LoggingConfig {

    /**
     * Configure the underlying logging system.
     */
    public static void config() {

        // For purposes of learning JUL, I want log statements passed to the "speciallog" logger to be printed in a special
        // format, while all other logs are printed in a traditional format. I've struggled to figure out how to do
        // this and I've failed to find an idiomatic solution, but I have figured out a way. It uses a "dead end"
        // logger.
        //
        // By default, all loggers are descendents of the root logger. This is a problem because that means the
        // speciallog passes log records to the SpecialHandler (see the config in custom-logging.properties) AND to the
        // ConsoleHandler by way of the root logger. For example, when a log is passed to speciallog, it gets passed to
        // the SpecialHandler and also gets passed to the root logger which then passes the log to the ConsoleHandler.
        // This results in the log getting printed twice: once using the special format and once using the traditional
        // format. I don't want this. What I can do is create a "dead end logger" and set this as the ancester of
        // speciallog. The dead end logger is not attached to any handlers and so a second log is never printed.
        Logger speciallog = Logger.getLogger("speciallog");

        {
            // Illustrate that by default, the parent logger is the root logger.
            // This brings up another interesting problem: how do we log when the logging system isn't yet configured?
            // This is a "bootstrapping problem". In this case, we'll just print directly to standard error.
            Logger parent = speciallog.getParent();
            System.err.printf("speciallog's parent logger: %s%n", parent);
        }

        class DeadEndLogger extends Logger {

            protected DeadEndLogger() {
                super("deadend", null);
            }
        }

        speciallog.setParent(new DeadEndLogger());

        {
            // Now, the parent logger is the dead end logger.
            Logger parent = speciallog.getParent();
            System.err.printf("speciallog's parent logger: %s%n", parent);
        }
    }
}
