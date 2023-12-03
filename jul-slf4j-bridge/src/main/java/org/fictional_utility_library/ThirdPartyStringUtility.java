package org.fictional_utility_library;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class stands in as a contrived example of a third-party library that logs using JUL (java.util.logging). We
 * don't have control over the source code, so we can't change it to code to SLF4J. However, from our own source code,
 * we can install the JUL-to-SLF4J bridge and then the third-party library's JUL logs will be routed to SLF4J.
 */
public class ThirdPartyStringUtility {

    private static final Logger log = Logger.getLogger(ThirdPartyStringUtility.class.getName());

    /**
     * Determine if a string is blank. A string is blank if it is null, empty, or contains only whitespace.
     *
     * @param s the string to check
     * @return true if the string is blank
     */
    public static boolean isBlank(String s) {
        if (s == null) {
            log.log(Level.FINE, "The string is null.");
            return true;
        }

        if (s.trim().isEmpty()) {
            log.log(Level.FINE, "The string is empty.");
            return true;
        }
        return false;
    }
}
