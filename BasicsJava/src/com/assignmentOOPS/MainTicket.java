package com.assignmentOOPS;
import java.util.Scanner;

public class MainTicket {

	public static void main(String[] args) {
		Ticket t=new Ticket();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of bookings:");
		int book=sc.nextInt();
		
		System.out.println("Enter the available tickets:");
		int atickets=sc.nextInt();
		t.setAvailableTicket(atickets);
		
		System.out.println("Enter the ticketid:");
		int tid=sc.nextInt();
		t.setTicketid(tid);
		
		System.out.println("Enter the price:");
		int p=sc.nextInt();
		t.setPrice(p);
		
		System.out.println("Enter the no of tickets");
		int ticket=sc.nextInt();int amount=0;
		if(ticket<=atickets)
		{
			System.out.println("Available tickets:"+t.getAvailableTicket());
			amount=t.setCalculateTicketCost(ticket);
			if(amount==-1)
				System.out.println("Tickets not available");
		}
		else {
			System.out.println("\nTotal amount: "+amount);
		}
		System.out.println("Available tickets after booking:"+t.getAvailableTicket());
			

	}

}
