/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wctc.ycheema.week9.namesapp9.beans;

import edu.wctc.ycheema.week9.namesapp9.model.Name;
import edu.wctc.ycheema.week9.namesapp9.model.ShoppingCart;
import edu.wctc.ycheema.week9.namesapp9.model.ShoppingCartService;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.context.FacesContext;

/**
 *
 * @author Dell
 */
@Named(value = "cartBean")
@SessionScoped
public class CartBean implements Serializable {

    /**
     * Creates a new instance of CartBean
     */
    private final String sessionId;
    private final ShoppingCart cart;
    private final ShoppingCartService cartService = new ShoppingCartService();
    
    public CartBean() {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        sessionId = facesContext.getExternalContext().getSessionId(true);
        cart = cartService.getContents(sessionId);
    }
    public int getItemInCart(){
        return cart.getItemsInCart();
    }
    public void addToCart(Name name){
        cart.add(name);
        cartService.update(sessionId, cart);
    }
    
}
