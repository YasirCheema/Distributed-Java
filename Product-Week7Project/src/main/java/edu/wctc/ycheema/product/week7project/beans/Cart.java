/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wctc.ycheema.product.week7project.beans;

import edu.wctc.ycheema.product.week7project.model.Product;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author Dell
 */
@Named(value = "cart")
@SessionScoped
public class Cart implements Serializable{
    private List<Product> product = new ArrayList<>();
    /**
     * Creates a new instance of Cart
     */
    public Cart() {
    }
    public void add(Product p){
        product.add(p);
        
    }
    public void remove(Product p){
        product.remove(p);
    }
    public int getCartCount(){
        return product.size();
    }
}
