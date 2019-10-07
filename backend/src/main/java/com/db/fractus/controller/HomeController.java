package com.db.fractus.controller;

import com.db.fractus.bean.Employee;
import com.db.fractus.entity.Country;
import com.db.fractus.entity.QuestionnaireEntity;
import com.db.fractus.service.CountryService;
import com.db.fractus.service.QuestionnaireService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/fractus/v1")
@Api(value="Fractus", description="Backend")
public class HomeController {

    @Autowired
    private CountryService countryService;

    @Autowired
    private QuestionnaireService questionnaireService;

    @GetMapping(value="/questionnaires")
    public List<QuestionnaireEntity> getAllQuestions(){
        return questionnaireService.getAllQuestions();
    }

    @GetMapping(value = "/countries/{id}")
    public Country getCountry(@PathVariable("id")String id){
        Optional<Country> countryById = countryService.getCountryById(Integer.parseInt(id));
        return countryById.orElseGet(Country::new);
    }

    @GetMapping(value="/countries")
    public List<Country> getAllCountries(){
        return countryService.getAllCountry();
    }

    /*@GetMapping("")
    public Employee welCome(){
        Employee emp = new Employee();
        emp.setName("Welcome to Fractus");
        return emp;
    }*/
}
