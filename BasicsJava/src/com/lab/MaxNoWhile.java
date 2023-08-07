package com.lab;

import java.util.Scanner;

public class MaxNoWhile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int min;
		int max=0;
		min=num%10;
		num=num/10;
		while(num>0)
		{
			int remainder=num%10;
			if(remainder>max)
			{
				max=remainder;
			}
			
				if(remainder<min)
				{
					min=remainder;
				}num=num/10;
			
		}System.out.println("Maximum number: "+max+" Minimum number: "+min);

	}

}
