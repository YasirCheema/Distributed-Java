/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wctc.ycheema.week6homwwork.week6.project.bean;

import edu.wctc.ycheema.week6homework.week6.project.model.Product;
import edu.wctc.ycheema.week6homework.week6.project.model.ProductService;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.AjaxBehaviorEvent;

/**
 *
 * @author Dell
 */
public class ProductBean implements Serializable {
    private final ProductService prodService = new ProductService();
    private Product product;
    private List<Product> prodList;

    public ProductBean() {
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public List<Product> getProdList() {
        return prodList;
    }

    public void setProdList(List<Product> prodList) {
        this.prodList = prodList;
    }
    
    public String allNames(){
        prodList = prodService.getAllNames();
        return "nameList";
    }
    public void nameDetail(AjaxBehaviorEvent event){
        try{
            FacesContext.getCurrentInstance().getExternalContext()
                    .redirect("prodDetail.xhtml?id=" + product.getId());
        } catch (IOException ex) {
            FacesMessage msg = new FacesMessage("IOException", product.getId());
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
    }
    
}
