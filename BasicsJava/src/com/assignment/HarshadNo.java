package com.assignment;
import java.util.Scanner;
//harshad no.156-if it is divisible by the sum of its digit. 

public class HarshadNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		   
	      int rem = 0, sum = 0, n;  
	          
	        n = num;  
	          	        
	        while(num > 0)
	        {  
	            rem = num%10;  
	            sum = sum + rem;  
	            num = num/10;  
	        }  
	          
	        if(n%sum == 0)  
	            System.out.println(n + " is a harshad number");  
	        else  
	            System.out.println(n + " is not a harshad number");  
	        sc.close();
	    }  
	}  

	


