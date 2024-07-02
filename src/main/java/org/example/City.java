package org.example;

public class City {
    private String name;
    private String countryName;
    private int population;
    private String mailIndex;
    private String phoneIndex;

    public City(String name, String countryName, int population, String mailIndex, String phoneIndex) {
        this.name = name;
        this.countryName = countryName;
        this.population = population;
        this.mailIndex = mailIndex;
        this.phoneIndex = phoneIndex;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return countryName;
    }
    public void setCountry(String countryName) {
        this.countryName = countryName;
    }

    public int getPopulation() {
        return population;
    }
    public void setPopulation(int population) {
        this.population = population;
    }

    public String getMailIndex() {
        return mailIndex;
    }
    public void setMailIndex(String mailIndex) {
        this.mailIndex = mailIndex;
    }

    public String getPhoneIndex() {
        return phoneIndex;
    }
    public void setPhoneIndex(String phoneIndex) {
        this.phoneIndex = phoneIndex;
    }

    @Override
    public String toString() {
        return String.format("[City]%nName: %s%nCountry: %s%nPopulation: %d%nMail Index: %s%nPhone Index: %s",
                name, countryName, population, mailIndex, phoneIndex);
    }
}
