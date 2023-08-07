package com.basic;
import java.util.Scanner;

public class BasicSalary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the employee basic salary:");
		double salary=sc.nextDouble();
		
		if(salary<=10000)
		{
			salary=salary+0.20+0.80;
			System.out.println("The gross salary is:"+salary);
		}
		else
			if(salary<=20000)
			{
				salary=salary+0.25+0.90;
				System.out.println("The gross salary is:"+salary);
			}
			else
				if(salary>20000)
				{
					salary=salary+0.30+0.95;
					System.out.println("The gross salary is:"+salary);
				}

	}

}
