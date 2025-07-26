package com.cognizant.orm_learn.service;

import java.util.List;
import java.util.Optional;

import com.cognizant.orm_learn.repository.CountryRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cognizant.orm_learn.model.Country;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public Country getCountry(String code){
        Optional<Country> result = countryRepository.findById(code);
        return result.orElse(null);
    }

    public Country addCountry(Country country){
        return countryRepository.save(country);
    }

    public List<Country> getCountryByKeyword(String keyword){
        return countryRepository.findByNameContaining(keyword);
    }

    @Transactional
    public List<Country> getAllCountries(){
        return countryRepository.findAll();
    }


}
