package com.cognizant.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.service.BookService;

public class LibraryApp {
    public static void main(String[] args) {

        ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService =context.getBean("bookService", BookService.class);
        System.out.println("Dependency Injection Success");
            }
}

