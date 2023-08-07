package com.basic;
import java.util.Scanner;

public class StudentAttendance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Your eligible to sit in exam or not");
		System.out.println("Enter the number of classes held");
		int a=sc.nextInt();

		System.out.println("Enter in how many classes you were present");
		int b=sc.nextInt();
		
		float percentage=b*100.f/a;
		
		System.out.println("your total percentage attendance is"+percentage);
		
		if(percentage>=75)
		{
			System.out.println("You are eligible to sit in the exam");
		}
		else
		{
			System.out.println("You are not eligible to sit in thge exam");
		}
		
	}

}
