package com.basic;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int Ans;
		System.out.println("Enter the first number:");
		int num1=sc.nextInt();
		
		System.out.println("Enter the second number:");
		int num2=sc.nextInt();
		
		System.out.println("Select the order of operation:");
		char operator=sc.next().charAt(0);
		
		if(operator=='+')
		{
			Ans=(num1+num2);
			System.out.println("Answer:"+Ans);
			
		}
		if(operator=='-')
		{
			Ans=(num1-num2);
			System.out.println("Answer:"+Ans);
			
		}
		if(operator=='*')
		{
			Ans=(num1*num2);
			System.out.println("Answer:"+Ans);
		}
		if(operator=='/')
		{
			Ans=(num1/num2);
			System.out.println("Answer:"+Ans);
		}
		
	}

}
