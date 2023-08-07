package com.basic;
import java.util.Scanner;

public class TomBill {
	public static void main(String args[])
	{
		int pizza, puffs,coldDrinks;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Welcome to Abhiruchi Multiplex");
		System.out.println("Enter your name:");
		String s=sc.next();
		
		System.out.println("Enter the number of pizzas :");
		pizza=sc.nextInt();
		pizza=pizza*100;
		
		System.out.println("Enter the number of puffs :");
		puffs=sc.nextInt();
		puffs=puffs*20;
		
		System.out.println("Enter the number of cold drinks:");
		coldDrinks=sc.nextInt();
		coldDrinks=coldDrinks*10;
		
		int total=pizza+puffs+coldDrinks;
		System.out.println("Your bill is"+total);
		
	}
}
