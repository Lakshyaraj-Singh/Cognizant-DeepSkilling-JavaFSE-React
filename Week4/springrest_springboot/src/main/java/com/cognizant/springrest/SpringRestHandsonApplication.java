package com.cognizant.springrest;
import com.cognizant.springrest.service.CountryService;

public class SpringRestHandsonApplication {
    public static void main(String[] args) {

        CountryService service = new CountryService();

        System.out.println(service.getCountry());

    }
}
