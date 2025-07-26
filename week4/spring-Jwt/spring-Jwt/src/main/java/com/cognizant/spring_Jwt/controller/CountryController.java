package com.cognizant.spring_Jwt.controller;

import com.cognizant.spring_Jwt.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class CountryController {


    @GetMapping("/country")
    public ArrayList<Country> getAllCountries(){

        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        ArrayList<Country> countries = (ArrayList<Country>)context.getBean("countryList");
        return countries;
    }


}
