package dgroomes.loggingplayground.javacorelogging;

import java.util.logging.ConsoleHandler;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

/**
 * Unfortunately it's not possible to define multiple handlers of the same type (like ConsoleHandlers) or multiple log
 * formats in a JUL properties file. We must resort to Java code. For more information about this
 * limitation, see this StackOverflow discussion: https://stackoverflow.com/a/23622011
 *
 * This class is just a simple extension of {@link ConsoleHandler} that adds a custom log format.
 */
public class SpecialHandler extends ConsoleHandler {

    public SpecialHandler() {
        var formatter = new Formatter() {
            @Override
            public String format(LogRecord record) {
                return String.format("[speciallog] %s%n", record.getMessage());
            }
        };

        setFormatter(formatter);
    }
}
