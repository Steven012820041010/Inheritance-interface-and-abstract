package com.sz.HW1Person;

public class Person {
	public String name;
	public String address;
	public String phoneNumber;
	public String email;
	
	public Person(String name, String address, String phoneNumber, String email)
	{
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
	public void setName (String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	public String getAddress()
	{
		return address;
	}
	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public String getEmail ()
	{
		return email;
	}
	
	public String toString()
	{
		return "Hi, my name is " + this.name + " \nPhone number: " + this.phoneNumber+". \nAddress: " + this.address + "\nEmail address: " + this.email+"\n";
	}
}
