package com.assignmentOOPS;

public class Ticket {
	private int ticketid;
	private int price;
	static int availableTicket;
	
	
	public void setTicketid(int ticketid)
	{
		this.ticketid=ticketid;
	}
	public int getTicketid()
	{
		return ticketid;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public int getPrice()
	{
		return price;
	}
	
	public   void setAvailableTicket(int ticket)
	{
		if(ticket<=0)
			System.out.println("tickets available");
		else
			availableTicket=ticket;
//			this.availableTicket=availableTicket-nooftickets;
//		int totalprice=price*nooftickets;
	}
	public  int getAvailableTicket()
	{
		return availableTicket;
	}
	public int setCalculateTicketCost(int nooftickets)
	{
		int ticket=getAvailableTicket();
		if(ticket<nooftickets)
			return -1;
		else
			price=getPrice();
			int aticket=ticket-nooftickets;
			setAvailableTicket(aticket);
			int amount=nooftickets*price;
			return amount;
		
	}
	
	
	

	public static void main(String[] args) {
		

	}

}
