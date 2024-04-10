public class LogLevels {

    public static String message(String logLine) {
        int x = logLine.indexOf(':');
        return logLine.substring(x + 1).trim();
    }

    public static String logLevel(String logLine) {
        int x = logLine.indexOf(':');
        return logLine.substring(1, x - 1).toLowerCase();
    }

    public static String reformat(String logLine) {
        int x = logLine.indexOf(':');
        return LogLevels.message(logLine) + " (" + LogLevels.logLevel(logLine) + ")";
    }
}
