package com.codegym.cms.model;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Table
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull ()
    @Column(name = "city_name")
    private String name;

    @ManyToOne
    @NotNull()
    @JoinColumn(name = "country_id")
    private Country country;

    @JoinColumn(name = "city_area")
    @NotNull ()
    private Integer totalArea;

    @JoinColumn(name = "city_population")
    @NotNull ()
    private Integer population;

    @NotNull ()
    private Integer gdp;

    @NotNull
    private String description;

    public City() {
    }

    public City(String name, Country country, Integer totalArea, Integer population, Integer gdp, String description) {
        this.name = name;
        this.country = country;
        this.totalArea = totalArea;
        this.population = population;
        this.gdp = gdp;
        this.description = description;
    }

    public Integer getGdp() {
        return gdp;
    }

    public void setGdp(Integer gdp) {
        this.gdp = gdp;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(Integer totalArea) {
        this.totalArea = totalArea;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
