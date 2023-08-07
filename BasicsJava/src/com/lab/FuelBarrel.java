package com.lab;

public class FuelBarrel {

	public static void main(String[] args) {
		int i,Barrelprice=89;
		for(i=1;i<=20;i++)
		{
			if(i<=10)
			{
				System.out.println("Barrel price of "+i+"= " +(i*Barrelprice));
			}
			else
			{
				System.out.println("Barrel price of "+i+"= "+(i*(Barrelprice-i)));
			}
		}
	}

}
