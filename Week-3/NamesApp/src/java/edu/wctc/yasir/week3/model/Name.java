/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wctc.yasir.week3.model;

/**
 *
 * @author Dell
 */
public class Name {
    private String id;
    private String first;
    private String last;

    public Name(String id, String first, String last) {
        this.id = id;
        this.first = first;
        this.last = last;
    }

    public String getId() {
        return id;
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public void setLast(String last) {
        this.last = last;
    }
    
    
}
