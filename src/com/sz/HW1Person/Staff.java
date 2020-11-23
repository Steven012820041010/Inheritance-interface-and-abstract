package com.sz.HW1Person;

public class Staff extends Employee {
	private String title;
	
	public Staff(String name, String address, String phoneNumber, String email, String office, double salary, String title) {
		super(name, address, phoneNumber, email, office, salary);
		this.title = title;
	}
	
	public String getTitle()
	{
		return title;
	}
	@Override
	public String toString()
	{
		return super.toString() + "Title: " + title + "\n";
	}

}
