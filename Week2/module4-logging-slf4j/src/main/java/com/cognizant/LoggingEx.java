package com.cognizant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class LoggingEx {
    private static final Logger logger = LoggerFactory.getLogger(LoggingEx.class);

    public static void main(String[] args) {

        logger.info("started");

        try {
            int a = 10;
            int b = 0;
            int result = a / b; 
            logger.info("Result: " + result);

        } catch (Exception e) {
            logger.error("An error occurred: Division by zero", e);
        }
        logger.warn("This is just warning message");
        logger.info("Applicatio ended");
    }
}
