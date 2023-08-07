package com.basic;
import java.util.Scanner;

public class BankOperation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ATM name:");
		String atm=sc.next();
		
		System.out.println("Enter the user name:");
		String name=sc.next();
		
		System.out.println("Enter the pin");
		int pin=sc.nextInt();
		int bal=1000;
		
		System.out.println("Welcome...1\n1.Deposite \n2.Withdrawl \n3.Check Balance \n4.Exit ");
		
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:System.out.println("Enter deposite amount:");
				int dep=sc.nextInt();
				System.out.println("Your current balance:"+(bal=bal+dep));
		break;
		case 2:System.out.println("Enter the withdraw amount:");
				int withdrawl=sc.nextInt();
				System.out.println("Your current balance is:"+(bal=bal-withdrawl));
		break;
		case 3:System.out.println("Check Balance:"+(bal));
		break;
		case 4:System.out.println("Exit");
				System.exit(0);
		break;
		}

	}

}
