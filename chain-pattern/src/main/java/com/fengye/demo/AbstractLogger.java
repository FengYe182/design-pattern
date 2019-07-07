package com.fengye.demo;

/**
 * @ClassName AbstractLogger
 * @Description
 */
public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;
    protected int level;
    protected AbstractLogger nextLogger;


    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    void logMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }

        System.out.println("输出日志消息");
    }

    void write(String message) {
        System.out.println("写日志");
    }

}
