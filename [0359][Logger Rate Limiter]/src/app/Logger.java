package app;

import java.util.*;

public class Logger {
    private Map<String, Integer> map;
    public Logger() {
        this.map = new HashMap<>();
    }

    public boolean shouldPrintMessage(int timestamp, String message) {
        if(!this.map.containsKey(message)) {
            map.put(message, timestamp);
            return true;
        }

        Integer oldTimestamp = map.get(message);
        if(timestamp - oldTimestamp >= 10) {
            map.put(message, timestamp);
            return true;
        }
        else {
            return false;
        }
    }
}