package com.lab;

import java.util.Scanner;

public class ChocoExchange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Chocolates kids get:");
		int num=sc.nextInt();
		int count=0;
		int sum=0;
		int i=1;
		for( i=1;i<=num;i++)
		{
			count++;
			if(count==3)
			{
				count++;
			}
				//sum=num+count;
			
		}	//}i++;
		System.out.println(count);

	}

	}
