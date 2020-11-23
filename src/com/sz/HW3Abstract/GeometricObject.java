package com.sz.HW3Abstract;

public abstract class GeometricObject {
	public String name;
	
	public GeometricObject(String name)
	{
		this.name = name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	public abstract int getPerimeter();
}
