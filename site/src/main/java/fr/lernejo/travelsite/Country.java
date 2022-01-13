package fr.lernejo.travelsite;

public class Country {
    public final String country;
    public final double temperature;

    public Country(String pays, double temperature) {
        this.country = pays;
        this.temperature = temperature;
    }

    public Country() {
        this.country = null;
        this.temperature = 1;
    }
}
