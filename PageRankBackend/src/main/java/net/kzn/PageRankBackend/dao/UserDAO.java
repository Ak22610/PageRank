package net.kzn.PageRankBackend.dao;

import java.util.List;

import net.kzn.PageRankBackend.dto.Address;
import net.kzn.PageRankBackend.dto.Cart;
import net.kzn.PageRankBackend.dto.User;


public interface UserDAO 
{

		// user related operation
		User getByEmail(String email);
		User get(int id);

		boolean add(User user);
		
		// adding and updating a new address
		Address getAddress(int addressId);
		boolean addAddress(Address address);
		boolean updateAddress(Address address);
		Address getBillingAddress(User user);
		List<Address> listShippingAddresses(User user);
		

}
