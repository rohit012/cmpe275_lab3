package edu.sjsu.cmpe275.lab3;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private String street;
	private String city;
	private String state;
	private String zip;
	
	public Address(){
		
	}
	
	public void setStreet (String street)
	{
		this.street=street;
	}

	public void setCity (String city)
	{
		this.city=city;
	}
	
	public void setState (String state)
	{
		this.state=state;
	}
	
	public void setZip (String zip)
	{
		this.zip=zip;
	}
	
	public String getStreet()
	{
		return this.street;
	}
	
	public String getCity()
	{
		return this.city;
	}
	
	public String getState()
	{
		return this.state;
	}
	
	public String getZip()
	{
		return this.zip;
	}
}
