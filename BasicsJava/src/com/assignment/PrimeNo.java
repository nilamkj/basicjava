package com.assignment;
import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	       int n, d;
	            System.out.println("Enter a number");
	            n = in.nextInt();
	            while (n>0)
	            {
	                d = n%10;
	                if ( d==2 || d==3 || d==5 || d ==7 || d ==9)
	                
	                    System.out.println("Prime number in given digit: "+d);
	                n = n/10;
	                
	                //System.out.println("Not find prime digit in given number.");
	                	
	            }
	      }
	

	}


