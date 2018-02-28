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
public class Product {
    private String id;
    private String prodName;
    private double price;
    private ProductDetails prodDetail;

    public Product(String id, String prodName, double price, 
            ProductDetails prodDetail) {
        this.id = id;
        this.prodName = prodName;
        this.price = price;
        this.prodDetail = prodDetail;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ProductDetails getProdDetail() {
        return prodDetail;
    }

    public void setProdDetail(ProductDetails prodDetail) {
        this.prodDetail = prodDetail;
    }
    
    
    
}
