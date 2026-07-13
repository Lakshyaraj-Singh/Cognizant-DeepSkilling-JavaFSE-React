package com.cognizant.springrest.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import com.cognizant.springrest.model.Country;
@Service
public class CountryService {
    
    private ApplicationContext context =
    new ClassPathXmlApplicationContext("country.xml");
    public Country getCountry(String code) {

        
        if (code.equalsIgnoreCase("IN")) {
            return context.getBean("india", Country.class);
        }

        if (code.equalsIgnoreCase("US")) {
            return context.getBean("usa", Country.class);
        }

        if (code.equalsIgnoreCase("GB")) {
            return context.getBean("uk", Country.class);
        }

        return null;
    }
}