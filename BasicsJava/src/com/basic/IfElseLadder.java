package com.basic;

public class IfElseLadder {
	public static void main(String args[])
	{
	 float per=70f;
	 char grade;
	 if(per>=90)
	 grade='A';
	   	else if(per>=75)
	   		grade='B';
	   		else if(per>=60)
	   			grade='C';
	   		 	else if(per>=40)
	   		 		grade='D';
	   		 		else
	   		 			grade='F';
	 System.out.println(per+":"+grade);
    }
}	
