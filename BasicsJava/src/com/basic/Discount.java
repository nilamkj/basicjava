package com.basic;
import java.util.Scanner;

public class Discount {
	public static void main(String args[])
	{
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Welcome to Abhiruchi Multiplex");
		System.out.println("Enter movie name:");
		String s=sc.next();
		
		
		
		System.out.println("Enter Movie ticket price:");
		double price=sc.nextInt();
		
		System.out.println("Do you have coupan code");
		String discount=sc.next();
		
		
		if(discount.equals("yes"))
		{
			price=(price*10)/100;
			System.out.println("Congrates you have got 10% discount");
			System.out.println("Total cost after discount"+price);
			System.out.println("Enjoy the show..!");
		}
	}

}
