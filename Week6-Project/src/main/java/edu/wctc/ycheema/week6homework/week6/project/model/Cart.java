/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wctc.ycheema.week6homework.week6.project.model;

/**
 *
 * @author Dell
 */
public class Cart {
    private int qty;
    private Product product;
    private ProductDetail prodDetail;

    public Cart(int qty, Product product, ProductDetail prodDetail) {
        this.qty = qty;
        this.product = product;
        this.prodDetail = prodDetail;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public ProductDetail getProdDetail() {
        return prodDetail;
    }

    public void setProdDetail(ProductDetail prodDetail) {
        this.prodDetail = prodDetail;
    }
    
    
    
}
