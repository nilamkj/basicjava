package com.basic;

import com.lab.Customer;

public class CustomerModifier extends Customer {
	
	
	public static void main(String[] args) {
		Customer b=new Customer();
		//b.Cname("Anaya");//change visibility to public
		//b.AccBalance(20000);//change visibility to public
		//b.CEmail("nilam@gmail.com");//change visibility to public
		b.cAddress("pune");
	}

}
