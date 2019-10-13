package net.kzn.PageRankOnline.handler;

import org.springframework.stereotype.Component;

import net.kzn.PageRankBackend.dto.Address;
import net.kzn.PageRankBackend.dto.User;
import net.kzn.PageRankOnline.model.RegisterModel;

@Component
public class RegisterHandler 
{
	public RegisterModel init()
	{
		return new RegisterModel();
	}
	
	public void addUser(RegisterModel registerModel, User user)
	{
		registerModel.setUser(user);
	}
	
	public void addBilling(RegisterModel registerModel, Address billing)
	{
		registerModel.setBilling(billing);
	}

}
