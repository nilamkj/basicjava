package com.assignment;

public class SumReturn {
	int x=10;
	int y=20;
	static int count=0;
	
	public static void sum()
	{
		count++;
		System.out.println("count:"+count);
		//System.out.println(x);
	}
	
	static
	{
		System.out.println("static loaded before the initialization of class");
	}
	
	{
		System.out.println("instance block executed when object is created  ");
	}
	
	public void sum1()
	{	//this.x=x;
		//this.y=y;
		System.out.println(count);
		if(x>y)
		{
			System.out.println("x= "+x);
		}
		else
		{
			System.out.println("y= "+y);
		}
	}
	public void display()
	{
		System.out.println("sum= "+(x+y));
	}
	
	public static void main(String[] args) {
		SumReturn s=new SumReturn();
		SumReturn s1=new SumReturn();
		s.sum1();
		s.display();
		System.out.println("count"+count);//0
		sum();
		System.out.println("count"+count);//1
		
	}

}
