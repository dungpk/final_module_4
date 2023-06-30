package com.codegym.cms.service.cityService;

import com.codegym.cms.model.City;
import com.codegym.cms.service.IGeneralService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface CityService extends IGeneralService<City> {
    Iterable<City> findAll();

    Optional<City> findById(Integer id);

    City save(City city);

    void delete(City city);
}
