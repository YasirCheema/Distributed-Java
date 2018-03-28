package edu.wctc.ycheema.week9.namesapp9.model;

import edu.wctc.ycheema.week9.namesapp9.data.AddressDAO;
import edu.wctc.ycheema.week9.namesapp9.data.NameDAO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NameService {

	

	public Name getName(String id) {
		
		return null;
	}

	public List<Name> getAllNames() throws Exception {
            NameDAO nameDao = new NameDAO();
            List<Name> nameList = nameDao.getNames();
            
		if(nameList != null){
                    AddressDAO addressDAO = new AddressDAO();
                    for(Name name : nameList){
                        name.setAddress(addressDAO.getAddress(name));
                    }
                    
                }
                return nameList;
	}

	public List<Name> findNames(String search) {
		
		return null;
	}
	
}
