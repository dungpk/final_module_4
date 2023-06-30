package com.codegym.cms.service.countryService;

import com.codegym.cms.model.Country;
import com.codegym.cms.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryServiceImpl implements CountryService{
    @Autowired
    public CountryRepository countryRepository;

    @Override
    public Iterable<Country> findAll() {
        return countryRepository.findAll();
    }
}
