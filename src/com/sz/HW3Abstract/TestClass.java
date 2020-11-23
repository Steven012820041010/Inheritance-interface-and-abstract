package com.sz.HW3Abstract;

import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();
		int s3 = sc.nextInt();
		String color = sc.next();
		boolean isFill = sc.nextBoolean();
		Triangle tri1 = new Triangle("Triangle",s1,s2,s3,color,isFill);
		System.out.println(tri1);
		System.out.println(tri1.getArea());
		System.out.println(tri1.getPerimeter());
	}

}
