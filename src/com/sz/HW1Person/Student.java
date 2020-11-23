package com.sz.HW1Person;

public class Student extends Person {
	private final String classStatus;
	
	public Student(String name, String address, String phoneNumber, String email,String classStatus) {
		super(name, address, phoneNumber, email);
		this.classStatus = classStatus;
	}
	public String getClassStatus()
	{
		return classStatus;
	}
	@Override
	public String toString()
	{
		
		return super.toString() + "I'm a student. \nMy class status is " + classStatus+"\n";
	}

}
