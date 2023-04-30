package com.k2pan.api.logs;

public class Logger {
    private static Logger instance = null;

    private Logger(){}

    public static synchronized Logger getInstance() {
        if(instance == null){
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("Logging message: "+message);      
    }
    public void log(Object message) {
        System.out.println(message);      
    }
}
