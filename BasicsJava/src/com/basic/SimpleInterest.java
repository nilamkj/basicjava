package com.basic;
import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Principle Amount :");
		float p_amt=sc.nextFloat();
		
		System.out.println("Enter the Rate :");
		float rate=sc.nextFloat();
		
		System.out.println("Enter the Time  :");
		float time=sc.nextFloat();
		
		float S_interest=(p_amt*time*rate)/100;
		System.out.println("Simple Interest is:"+S_interest);
	}

}
