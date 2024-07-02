package org.example;

import java.util.Set;

public class Country {
    private String name;
    private String continentName;
    private int population;
    private String capital;
    private String phoneCode;
    private Set<String> cities;

    public Country(String name, String continentName, int population, String capital,
                   String phoneCode, Set<String> cities) {
        this.name = name;
        this.continentName = continentName;
        this.population = population;
        this.capital = capital;
        this.phoneCode = phoneCode;
        this.cities = cities;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getContinentName() {
        return continentName;
    }
    public void setContinentName(String continentName) {
        this.continentName = continentName;
    }

    public int getPopulation() {
        return population;
    }
    public void setPopulation(int population) {
        this.population = population;
    }

    public String getCapital() {
        return capital;
    }
    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getPhoneCode() {
        return phoneCode;
    }
    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }

    public Set<String> getCities() {
        return cities;
    }
    public void setCities(Set<String> cities) {
        this.cities = cities;
    }

    @Override
    public String toString() {
        return String.format("[Country]%nName: %s%nContinent: %s%nPopulation: %d%nCapital: %s%nPhone Code: %s%nCities: %s",
                name, continentName, population, capital, phoneCode, cities);
    }
}
