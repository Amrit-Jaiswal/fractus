package com.db.fractus.service;

import com.db.fractus.entity.Country;
import com.db.fractus.repository.ICountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {

    @Autowired
    private ICountryRepository countryRepository;

    public Optional<Country> getCountryById(Integer cId){
        return countryRepository.findById(cId);
    }

    public List<Country> getAllCountry(){
        return countryRepository.findAll();
    }
}
