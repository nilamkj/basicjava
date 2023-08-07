package com.basic;
import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int num=sc.nextInt();
		int sum=0;
		int temp=num;
		
		while(num>0)
		{
			int digit=num%10;
			int cube=digit*digit*digit;
			sum=sum+cube;
			num=num/10;
		}
		num=temp;
		System.out.println(sum+" "+num);
		
		if(sum==num)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not Armstrong number");
		}
	}

}
