package org.example.application;

import org.example.console.ConsoleApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        ConsoleApplication consoleApplication = applicationContext.getBean("consoleApplication", ConsoleApplication.class);
        consoleApplication.run();
    }
}
