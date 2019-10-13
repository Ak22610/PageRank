package net.kzn.PageRankOnline.model;

import java.io.Serializable;

import net.kzn.PageRankBackend.dto.Address;
import net.kzn.PageRankBackend.dto.User;

public class RegisterModel implements Serializable
{
	private User user;
	private Address billing;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Address getBilling() {
		return billing;
	}
	public void setBilling(Address billing) {
		this.billing = billing;
	}

}
