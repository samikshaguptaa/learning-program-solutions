package com.cognizant.springlearn.controller;

import com.cognizant.springlearn.model.Country;
import com.cognizant.springlearn.service.CountryService;
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

    ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
    Country country = (Country)context.getBean("country");
    @GetMapping("/country")
    public Country getCountryIndia(){

        return country;
    }
    @GetMapping("/countries")
    public ArrayList<Country> getAllCountries(){
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        ArrayList<Country> countries = (ArrayList<Country>)context.getBean("countryList");
        return countries;
    }
    @Autowired
    private CountryService countryService;

    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code){
        return countryService.getCountry(code);
    }

}
