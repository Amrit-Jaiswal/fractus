package com.db.fractus.repository;

import com.db.fractus.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICountryRepository extends JpaRepository<Country, Integer> {
    Country findByCId(Integer id);
}
