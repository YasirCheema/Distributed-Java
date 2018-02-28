/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wctc.ycheema.week6.namesapps6.model;

/**
 *
 * @author Dell
 */
public class Address {
    
    private String Street;
    private String city;
    private String state;
    private String zip;

    public Address(String Street, String city, String state, String zip) {
        this.Street = Street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String Street) {
        this.Street = Street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
    
    
    
}
