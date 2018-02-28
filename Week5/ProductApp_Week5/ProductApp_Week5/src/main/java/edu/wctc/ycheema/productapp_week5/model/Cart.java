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
public class Cart {
    private Product product;
    private ProductDetails productDetails;

    public Cart(Product product, ProductDetails productDetails) {
        this.product = product;
        this.productDetails = productDetails;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public ProductDetails getProductDetails() {
        return productDetails;
    }

    public void setProductDetails(ProductDetails productDetails) {
        this.productDetails = productDetails;
    }
    
    
}
