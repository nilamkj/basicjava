package com.assignment;
import java.util.Scanner;

public class MagicNo {

	public static void main(String[] args) {
		int magic=4;
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter the number: ");
			int num=sc.nextInt();
			if(num>magic)
			{
				System.out.println("Number is greater ..try again..!");
				continue;
			}else
			if(num<magic)
			{
				System.out.println("Number is less..try again..!");
				continue;
			}else
				if(num==magic)
				{
					System.out.println("You entered correct number..");
					break;
				}
			
		}
		
	}

}
