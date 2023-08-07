package com.assignment;
//    *
//   ***
//  *****
// *******
//*********


public class PatternTriangle {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++)
		{
		for (int j=5; j>i; j--)
		{
		System.out.print(" ");
		}
		for (int p=1; p<=(i * 2) -1; p++)
		{
		System.out.print("*");
		}
		System.out.println();
		}
		}
	}


