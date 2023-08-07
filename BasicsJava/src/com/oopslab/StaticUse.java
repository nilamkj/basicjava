package com.oopslab;

public class StaticUse {

	
		int x=100;
		static int y=200;
		static int counter=0;
		
		StaticUse()
		{
			counter++;
		}
		
		
		void print()
		{
			System.out.println("x="+x);
			System.out.println("y="+y);
		}
		
		static void  print1()
		{
			//System.out.println(x);
			System.out.println(y);
		}

		public static void main(String[] args) {
			StaticUse.print1();
			StaticUse d=new StaticUse();
			d.print();
			StaticUse d1=new StaticUse();
			System.out.println(d1.counter);
	}

}
