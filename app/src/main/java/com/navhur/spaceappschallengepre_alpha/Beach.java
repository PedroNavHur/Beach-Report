package com.navhur.spaceappschallengepre_alpha;

/**
 * Created by navar on 4/25/2017.
 */

public class Beach {

    private String tittle, location, location2, country, description,
            temperature, wind, precipitation, humidity, uvlight, visibility, url;

    public Beach() {
        super();
    }

    public Beach(String tittle, String location, String location2, String country, String description,
                 String temperature, String wind, String precipitation,
                 String humidity, String uvlight, String visibility, String url){
        this.tittle = tittle;
        this.location = location;
        this.location2 = location2;
        this.country = country;
        this.description = description;
        this.temperature = temperature;
        this.wind = wind;
        this.precipitation = precipitation;
        this.humidity = humidity;
        this.uvlight = uvlight;
        this.visibility = visibility;
        this.url = url;
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

    public String getTemperature(){
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getWind(){
        return wind;
    }

    public void setWind(String wind) {
        this.wind = wind;
    }

    public String getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(String precipitation) {
        this.precipitation = precipitation;
    }

    public String getHumidity(){
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getUvlight() {
        return uvlight;
    }

    public void setUvlight(String uvlight) {
        this.uvlight = uvlight;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
