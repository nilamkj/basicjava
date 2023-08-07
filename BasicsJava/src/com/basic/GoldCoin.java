package com.basic;
import java.util.Scanner;

public class GoldCoin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Meenu's Age:");
		int ans=sc.nextInt();
		
		int age=ans*ans*ans;
		
		System.out.println(+age+" coins get into Meenu's "+ans+" bday ");
	}

}
