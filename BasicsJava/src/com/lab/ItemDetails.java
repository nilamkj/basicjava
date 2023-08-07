package com.lab;
import java.util.Scanner;

public class ItemDetails {
	int Item_id;
	String Item_name;
	int price;
	
	public void acceptDetails(int ID, String IName,int IPrice) {
	Item_id=ID;
	Item_name=IName;
	price=IPrice;
}
	
	public void display()
	{
				
		System.out.println(Item_id + " "+ Item_name+" "+price);
	}

	public static void main(String[] args) {
		
		ItemDetails id=new ItemDetails();
		id.acceptDetails(001,"pen",2000);
		id.display();
		
	}

}
