/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wctc.ycheema.productapp_week5.model;

/**
 *
 * @author Dell
 */
public class ProductDetails {
    private int qty;
    private String prodDetails;

    public ProductDetails(int qty, String prodDetails) {
        this.qty = qty;
        this.prodDetails = prodDetails;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getProdDetails() {
        return prodDetails;
    }

    public void setProdDetails(String prodDetails) {
        this.prodDetails = prodDetails;
    }
    
    
    
}
