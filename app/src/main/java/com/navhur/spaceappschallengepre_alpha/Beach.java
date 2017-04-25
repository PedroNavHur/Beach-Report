package com.navhur.spaceappschallengepre_alpha;

/**
 * Created by navar on 4/25/2017.
 */

public class Beach {

    private String tittle, location, location2, country, description;

    public Beach() {
        super();
    }

    public Beach(String tittle, String location, String location2, String country, String description){
        this.tittle = tittle;
        this.location = location;
        this.location2 = location2;
        this.country = country;
        this.description = description;
    }

    public String getTittle(){
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getLocation(){
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation2(){
        return location2;
    }

    public void setLocation2(String location2) {
        this.location2 = location2;
    }

    public String getCountry(){
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
