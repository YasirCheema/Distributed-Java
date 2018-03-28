/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wctc.ycheema.week9.namesapp9.data;

import edu.wctc.ycheema.week9.namesapp9.model.Name;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell
 */
public class NameDAO {
    
    public List<Name> getNames() throws Exception {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try{
            conn = ConnectionUtil.getConnection();
            stmt = conn.prepareStatement("select * from name");
            rs = stmt.executeQuery();
            List<Name> nameList = new ArrayList<>();
            while(rs.next()){
                String id = rs.getString("id");
                String firstName = rs.getString("firstname");
                String lastname = rs.getString("lastname");
                
                Name name = new Name(id,firstName, null, null);
                nameList.add(name);
            }
            return nameList;
        }
        finally {
        if(rs != null) rs.close();
        if(stmt != null) stmt.close();
        if(conn != null) conn.close();
        }
        
    }
    
}