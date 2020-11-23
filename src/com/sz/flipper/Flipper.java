package com.sz.flipper;

import java.util.ArrayList;
import java.util.Scanner;

public class Flipper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Character> arr = new ArrayList<Character>();
		String str = sc.nextLine();
		for (int i=0; i<str.length(); i++)
		{
			arr.add(str.charAt(i));
		}
		int [][] chart = {{1,2},{3,4}};
		for (char c:arr)
		{
			if (c=='H')
			{
				int curr1 = chart[0][0];
				chart[0][0] = chart[1][0];
				chart[1][0] = curr1;
				int curr2 = chart[0][1];
				chart[0][1] = chart[1][1];
				chart[1][1] = curr2;
			}
			if (c=='V')
			{
				int curr1 = chart[0][0];
				chart[0][0] = chart[0][1];
				chart[0][1] = curr1;
				int curr2 = chart[1][0];
				chart[1][0] = chart[1][1];
				chart[1][1] = curr2;
			}
		}
		for (int i=0; i<2; i++)
		{
			for (int j=0; j<2; j++)
			{
				System.out.print(chart[i][j]);
				if (j==0)
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	
	}

}
