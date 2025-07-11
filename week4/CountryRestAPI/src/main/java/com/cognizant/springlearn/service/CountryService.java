package com.cognizant.springlearn.service;

import com.cognizant.springlearn.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CountryService {

    private ArrayList<Country> countryList;


    public CountryService() {
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        this.countryList = (ArrayList<Country>) context.getBean("countryList");
    }
    public Country getCountry(String code) {
        Country result = null;
        for (Country country : countryList){
            if (country.getCode().equalsIgnoreCase(code)){
                result = country;
                break;
            }
        }
        return result;
    }
}
