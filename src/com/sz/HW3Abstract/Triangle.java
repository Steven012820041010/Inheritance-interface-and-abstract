package com.sz.HW3Abstract;

public class Triangle extends GeometricObject {

	private int sideLength1;
	private int sideLength2;
	private int sideLength3;
	private boolean isFill;
	private String color;
	public Triangle(String name,int sideLength1,int sideLength2, int sideLength3, String color,boolean isFill) {
		super(name);
		this.sideLength1 = sideLength1;
		this.sideLength2 = sideLength2;
		this.sideLength3 = sideLength3;
		this.color = color;
	}

	public int getPerimeter() {
		return sideLength1+sideLength2+sideLength3;
	}
	
	public double getArea() {
		double p = (sideLength1+sideLength2+sideLength3)/2;
		p = p * (p-sideLength1) * (p-sideLength2) * (p-sideLength3);
		return Math.sqrt(p);
	}
	
	public String toString()
	{
		return "The Geometric Object is triangle. \nSide Length 1: "+ sideLength1 +"\nSide Length 2: "+ sideLength2 +"\nSide Length 3: " + sideLength3
				+ "\nThe triangle's color is " + color + "\nFilled or not: " + isFill ; 
	}

}
