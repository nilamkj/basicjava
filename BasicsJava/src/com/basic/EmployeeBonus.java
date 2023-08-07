package com.basic;
import java.util.Scanner;

public class EmployeeBonus {
	public static void main(String args[])
	{
		int salary,year;
		double d;
		System.out.println("Enter Total year of services:");
		
		Scanner sc=new Scanner(System.in);
		year=sc.nextInt();
		if(year>5)
		{
			System.out.println("Congrates..! Your service year is more than 5 years.\nPlease enter your salary:");
			salary=sc.nextInt();
			
			System.out.println("Your salary is:"+salary);
			System.out.println("Your 5% bonus is :"+salary*0.05);
			System.out.println("Your net bonus with salary is:"+(salary+(salary*0.05)));
		}	
		else
		{
			System.out.println("No Bonus..");
		}
	}
}
