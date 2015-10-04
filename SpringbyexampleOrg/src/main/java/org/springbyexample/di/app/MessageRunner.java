package org.springbyexample.di.app;


import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageRunner {

    final static org.slf4j.Logger logger = LoggerFactory.getLogger(MessageRunner.class);

    /**
     * Main method.
     */
    public static void main(String[] args) {

        logger.info("Initializing Spring context.");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        logger.info("Spring context initialized.");
        Message message = (Message)applicationContext.getBean("message");
        logger.info("message='" + message.getMsg() + "'");

    }

}
