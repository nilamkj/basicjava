package com.lab;

import java.util.Scanner;

public class AutomorphicNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int count=0;
		int square=num*num;
		int t=num;
		while(num>0)
		{
			int rem=num%10;
			count++;
			num=num/10;
		}
		int temp=1;
		for(int i=1;i<=count;i++)
		{
			temp=temp*10;
		}
		if(square%temp==t)
		{
				System.out.println(num+" Number is automorphic");
		}
		else
		{
		System.out.println(num+" Number is not automorphic");
		}
	}

}
