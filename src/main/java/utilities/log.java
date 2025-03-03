package utilities;


import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

public class log {
    //Initialize Log4j instance
    public static final Logger Log = getLogger(log.class.getName());

    //We can use it when starting tests
    public static void startLog(String startMsg) {
        Log.info(startMsg);
    }

    //We can use it when ending tests
    public static void endLog(String endMsg) {
        Log.info(endMsg);
    }

    //Info Level Logs
    public static void info(String message) {
        Log.info(message);
    }

    //Warn Level Logs
    public static void warn(String message) {
        Log.warn(message);
    }

    //Error Level Logs
    public static void error(String message) {
        Log.error(message);
    }

    //Debug Level Logs
    public static void debug(String message) {
        Log.debug(message);
    }
}
