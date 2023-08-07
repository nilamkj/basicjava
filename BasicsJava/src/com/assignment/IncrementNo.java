package com.assignment;


public class IncrementNo {

	public static void main(String[] args) {
		int num=15234;
		int flag=0;
		
		while(num>0)
		{
			int inc=num%10;
			int temp=num;
			
			while(temp>0)
			{
				int rem=temp%10;
				if(rem<inc)
				{
					flag=1;
					break;
				}
				temp=temp/10;
			}
		num=num/10;
		
		}
		if(flag==0)	
		{
			System.out.println("increasing");
		}else
		{
			System.out.println("Not increasing");
		}
		//sc.close();
		
		
	}

}
