package com.lab;

public class Bike {
	String bikeModel;
	String bcolor;
	int price;
	
	public Bike(String bikeModel,String bcolor,int price)
	{
		this.bikeModel=bikeModel;
		this.bcolor=bcolor;
		this.price=price;
	}
	public void show()
	{
		this.display();
	}
	public void display()
	{
		System.out.println("Bike Model= "+bikeModel);
		System.out.println("Bike color= "+bcolor);
		System.out.println("price= "+price);
	}
	public static void main(String[] args) {
		Bike b=new Bike("KTM","red",250000);
		Bike b1=new Bike("pulser","black",70000);
		//b.show();
		b.display();
		b1.display();
		
	}
	
}
