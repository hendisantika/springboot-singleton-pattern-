package com.hendisantika.springbootsingletonpattern.model;

import com.hendisantika.springbootsingletonpattern.util.LogLevel;
import org.springframework.context.annotation.Description;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-singleton-pattern
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 05/01/20
 * Time: 06.15
 */
@Description(value = "Class that represents Singleton.")
public class LoggingSingleton {

    private static LoggingSingleton loggingSingleton;

    /**
     * Private constructor - can not be instantiated.
     */
    private LoggingSingleton() {
    }


    /**
     * Method for getting current / new instance of Logging Singleton.
     *
     * @return single instance of logging class.
     */
    public static LoggingSingleton getInstance() {
        if (loggingSingleton == null) {
            loggingSingleton = new LoggingSingleton();
        }
        return loggingSingleton;
    }

    /**
     * Method that logs provided message and set up log level
     *
     * @param message  - provided message to be logged
     * @param logLevel - log level (INFO, ERROR, WARN)
     */
    public void logSomething(String message, LogLevel logLevel) {
        System.out.println(logLevel + ": " + message);
    }
}