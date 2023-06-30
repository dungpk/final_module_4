package com.codegym.cms.repository;

import com.codegym.cms.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CityRepository extends JpaRepository<City, Integer> {

}
