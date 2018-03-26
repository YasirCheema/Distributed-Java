/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wctc.ycheema.product.week7project.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell
 */
public class ShoppingCart {
    private final List<Product> contents = new ArrayList();
    public List<Product> getContents(){
        return contents;
    }
    public int getItemsInCart(){
        return contents.size();
    }
    public void add(Product product){
        contents.add(product);
    }
    public void remove(Product product){
        contents.remove(product);
    }
    public void removeAll(){
        contents.clear();
    }
    
}
