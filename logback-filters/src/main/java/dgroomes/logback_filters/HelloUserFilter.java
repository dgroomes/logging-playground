package dgroomes.logback_filters;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.filter.Filter;
import ch.qos.logback.core.spi.FilterReply;

/**
 * Filtering out specific log events from being appended based on the contents of the log message. Specifically, it
 * looks for the log message "Hello User", and if it is "Hello User7" it allows that log, else it excludes that log.
 * <p>
 * Wait, what is the point? There might be a particular log statement which occurs at a very high volume and it can't be
 * disabled simply by adjusting the log levels and appender levels because other useful log statements would be disabled
 * by too. So it's possible to target a specific log statement with a Logback "Filter". (Now I'm wondering, can I do
 * this filtering in the "Logger"? Or do the "Logger"s only have the "basic selection rule" http://logback.qos.ch/manual/architecture.html#basic_selection
 * as the mechanism for allowing/blocking logs?)
 */
public class HelloUserFilter extends Filter<ILoggingEvent> {

    @Override
    public FilterReply decide(ILoggingEvent event) {
        var formattedMessage = event.getFormattedMessage();
        if (!formattedMessage.contains("Hello User")) {
            return FilterReply.ACCEPT;
        } else if (formattedMessage.contains("Hello User7")) {
            return FilterReply.ACCEPT;
        } else {
            return FilterReply.DENY;
        }
    }
}
