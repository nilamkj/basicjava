package com.assignmentOOPS;

class Book
{
	private String bookName;
	private int bookPrice;
	private String autherName;
	
	public void setBookName(String bookName)
	{
		this.bookName=bookName;
	}
	public String getBookName()
	{
		return bookName;
	}
	public void setBookPrice(int bookPrice)
	{
		this.bookPrice=bookPrice;
	}
	public int getBookPrice()
	{
		return bookPrice;
	}
	public void setAutherName(String autherName)
	{
		this.autherName=autherName;
	}
	public String getAutherName()
	{
		return autherName;
	}
}
public class TestBook {
	private Book b;
	
	public void setBook(Book b)
	{
		this.b=b;
	}
	public Book getBook()
	{
		return b;
	}
	

	public static void main(String[] args) {
		TestBook t=new TestBook();
		t.setBook(new Book());
		t.getBook().setBookName("Java");
		t.getBook().setBookPrice(500);
		t.getBook().setAutherName("Einstein");
		
		System.out.println("Book Details");
		System.out.println("Book Name :"+t.getBook().getBookName());
		System.out.println("Book Price :"+t.getBook().getBookPrice());
		System.out.println("Auther Name :"+t.getBook().getAutherName());
		
		
	}

}
