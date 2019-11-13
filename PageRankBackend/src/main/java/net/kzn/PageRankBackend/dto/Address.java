package net.kzn.PageRankBackend.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

@Entity
public class Address implements Serializable
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*
	 * Private fields
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	/*----------------------- */
	@ManyToOne
	private User user;
	
	public User getUser() 
	{
		return user;
	}
	public void setUser(User user) 
	{
		this.user = user;
	}
	
	
	/*----------------------- */
	
	
	


	private int userId;
	@Column(name = "address_line_one")
	@NotBlank(message = "Please enter Address Line One")
	private String addressLineOne;
	
	@Column(name = "address_line_two")
	@NotBlank(message = "Please enter Address Line Two")
	private String addressLineTwo;
	
	@NotBlank(message = "Please enter City Name")
	private String city;
	
	@NotBlank(message = "Please enter State Name")
	private String state;
	
	@NotBlank(message = "Please enter Country Name")
	private String country;
	
	
	@Column(name = "postal__code")
	@NotBlank(message = "Please enter Postal Code")
	private String postalCode;
	
	@Column(name = "is_shipping")
	private boolean shipping;
	
	@Column(name = "is_billing")
	private boolean billing;
	
	
	/*
	 * setters and getters
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getAddressLineOne() {
		return addressLineOne;
	}
	public void setAddressLineOne(String addressLineOne) {
		this.addressLineOne = addressLineOne;
	}
	public String getAddressLineTwo() {
		return addressLineTwo;
	}
	public void setAddressLineTwo(String addressLineTwo) {
		this.addressLineTwo = addressLineTwo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public boolean isShipping() {
		return shipping;
	}
	public void setShipping(boolean shipping) {
		this.shipping = shipping;
	}
	public boolean isBilling() {
		return billing;
	}
	public void setBilling(boolean billing) {
		this.billing = billing;
	}
	
	
	
	/*
	 * toString mthod
	 */
	
	
	@Override
	public String toString() {
		return "Address [id=" + id + ", userId=" + userId + ", addressLineOne=" + addressLineOne + ", addressLineTwo="
				+ addressLineTwo + ", city=" + city + ", state=" + state + ", country=" + country + ", postalCode="
				+ postalCode + ", shipping=" + shipping + ", billing=" + billing + ", getId()=" + getId()
				+ ", getUserId()=" + getUserId() + ", getAddressLineOne()=" + getAddressLineOne()
				+ ", getAddressLineTwo()=" + getAddressLineTwo() + ", getCity()=" + getCity() + ", getState()="
				+ getState() + ", getCountry()=" + getCountry() + ", getPostalCode()=" + getPostalCode()
				+ ", isShipping()=" + isShipping() + ", isBilling()=" + isBilling() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	
	
}
	