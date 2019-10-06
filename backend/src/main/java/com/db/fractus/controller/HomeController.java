package com.db.fractus.controller;

import com.db.fractus.bean.Employee;
import com.db.fractus.entity.Country;
import com.db.fractus.service.CountryService;
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

    @GetMapping("/{name}")
    @ApiOperation(value = "welcome user")
    public String welcomeUser(@PathVariable("name")String name){
        return "Welcome " + name;
    }

    @GetMapping(value = "/countries/{id}")
    public Country getCountry(@PathVariable("id")String id){
        Optional<Country> countryById = countryService.getCountryById(Integer.parseInt(id));
        return countryById.orElseGet(Country::new);
    }

    @GetMapping(value="/countries")
    public List<Country> getAllcountries(){
        return countryService.getAllCountry();
    }

    @GetMapping("")
    public Employee welCome(){
        Employee emp = new Employee();
        emp.setName("Welcome to Fractus");
        return emp;
    }
}
