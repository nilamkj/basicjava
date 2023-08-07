package com.basic;
import java.util.Scanner;

public class Square {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		float length , breadth, area;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the square:");
		length=sc.nextFloat();
		System.out.println("Enter the breadth of the square:");
		breadth=sc.nextFloat();
		area=length*breadth;
		
		if (length==breadth)
		{
			System.out.println("It is a Square");
		}
		else if(length!=breadth)
		 	{
				System.out.println("It is not a Square");
		 	}
			
	}

}
