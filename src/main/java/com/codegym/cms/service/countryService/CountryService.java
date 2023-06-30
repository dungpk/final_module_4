package com.codegym.cms.service.countryService;

import com.codegym.cms.model.Country;

public interface CountryService {
    Iterable<Country> findAll();
}
