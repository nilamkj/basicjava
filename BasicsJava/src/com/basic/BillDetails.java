package com.basic;
import java.util.Scanner;


public class BillDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float totalCost=1200, itemCost, discount;
		int numofItems=8;
		String name;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Name:");
		name = sc.next();
		
		System.out.println("Number of items:"+numofItems);
				
		if(totalCost<1000)
		{
			itemCost=totalCost;
			System.out.println("\nSorry,there is no discount to apply.");
		}
		else if(totalCost>900 && totalCost<=1500)
		{
			discount = (totalCost*10)/100;
			itemCost=totalCost-discount;
			System.out.println("\nCongrates,You Have got 10% discount on the total purchase!");
			System.out.println("\nThe discount amount is:"+discount);
			
			System.out.println("\nTotal cost after discount:"+itemCost);
			
		}	
	}
		
	}


