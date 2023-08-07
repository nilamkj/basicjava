package com.basic;
import java.util.Scanner;

public class UpperLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character:");
		char ch=sc.next().charAt(0);
		
		if(ch>='a' && ch<='z')
		{
			System.out.println("This is lowercase alphabet");
		}
		else
		{
			System.out.println("This is uppercase alphabet");
		}
	}
}
