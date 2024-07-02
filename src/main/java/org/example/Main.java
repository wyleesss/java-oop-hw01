package org.example;

import java.util.Date;
import java.util.Set;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("name", new Date(), "-3", "address");
        City city = new City("city1", "country", 500000, "1207", "-1");
        Country country = new Country("country", "North America", 23000000,
                "capital", "-1", Set.of("city1", "city2", "city3"));
        Fraction fraction = new Fraction(1, 2);

        out.println(human);
        out.println(city);
        out.println(country);
        out.println(fraction.multiply(new Fraction(2, 1)));
    }
}