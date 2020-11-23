package com.sz.HW1Person;

public class Employee extends Person {
	private String office;
	private double salary;
	
	public Employee(String name, String address, String phoneNumber, String email,String office, double salary) {
		super(name, address, phoneNumber, email);
		this.office = office;
		this.salary = salary;
	}
	
	public String getOffice()
	{
		return office;
	}
	public double getSalary()
	{
		return salary;
	}
	@Override
	public String toString()
	{
		return super.toString() + "I'm an employee. \nMy office is in " + office + " and my salary is $" + salary + "\n";
	}

}
