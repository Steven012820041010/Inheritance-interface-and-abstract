package com.sz.HW1Person;

public class Faculty extends Employee {
	private int officeHours;
	private char rank;
	public Faculty(String name, String address, String phoneNumber, String email, String office, double salary, int officeHours, char rank) {
		super(name, address, phoneNumber, email, office, salary);
		this.officeHours = officeHours;
		this.rank = rank;
	}
	
	public int getOfficeHours()
	{
		return officeHours;
	}
	
	public char getRank()
	{
		return rank;
	}
	@Override
	public String toString()
	{
		return super.toString() + "Office Hours: " + officeHours + "\nRank: " + rank + "\n"; 
	}
	
}
