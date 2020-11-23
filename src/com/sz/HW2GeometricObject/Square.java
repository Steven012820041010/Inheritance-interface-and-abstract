package com.sz.HW2GeometricObject;

public class Square extends GeometricObject implements Colorable {
	private int sideLength;
	
	public Square(String name, int sideLength) {
		super(name);
		this.sideLength = sideLength;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void howToColor() {
		// TODO Auto-generated method stub
		System.out.print(" ");
		for (int i=0; i<sideLength; i++)
		{
			System.out.print("-");
		}
		System.out.println();
		for (int i=0; i<sideLength-2; i++)
		{
			for (int j=0; j<sideLength; j++)
			{
				if (j==0||j==sideLength-1)
				{
					System.out.print("|");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.print(" ");
		for (int i=0; i<sideLength; i++)
		{
			System.out.print("-");
		}

	}
	public int getArea()
	{
		return sideLength*sideLength;
	}
	public int getPerimeter()
	{
		return sideLength*4;
	}
	public String toString()
	{
		return "The Geometric Object is " + name;
	}
	
}
