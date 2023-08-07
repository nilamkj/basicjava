package com.lab;

public class Customer 
	{
		String cName;
		private int accBalance;
		protected String cEmail;
		String cAddress;
		
		
		void Cname(String cName)
		{
			System.out.println(cName);
		}
		private void AccBalance(int accBalance)
		{
			System.out.println(accBalance);
		}
		protected void CEmail(String cEmail)
		{
			System.out.println(cEmail);
		}
		public void cAddress(String cAddress)
		{
			System.out.println(cAddress);
		}
			
						
		
		public static void main(String[] args) {
		Customer c=new Customer();
		c.Cname("nilam");
		c.AccBalance(20000);
		c.CEmail("nilam@gmail.com");
		c.cAddress("pune");
		

	}

}
