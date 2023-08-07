package com.basic;
import java.util.Scanner;

public class VowelConstant {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Character:");
		char ch=sc.next().charAt(0);
		
		if(ch=='a' || ch=='e' || ch=='o' || ch=='i' || ch=='u')
		{
			System.out.println("Charater is vowel..");
		}
		else
		{
			System.out.println("Chareacter is Consonant..");
		}
	}

}


//krishnmurti number
//int num=sc.nextInt();
//int copy=num;
//int sum=0;
//while(num>0)
//{
//	int digit=num%10;
//	int fact=1;
//	for(int i=1;i<=digit;i++)
//	{
//	fact=fact*1;
//	}
//	sum=sum+fact;
//	num=num/10;
//}
//System.out.println(sum);
//if(sum==copy)
//{ System.out.println(krishnmurthi Number );}
//else { system.out.println(Not krushnmurthi);
//}
//}

//Disarium
//System.out.println("Enter the number: ");
//int num=sc.nextInt();
//int temp=num;
//int count=0;
//while(num>0)
//{
//	count++;
//	num=num/10;
//}
//System.out.println(count);
//num=temp;
//while(num>0)
//{
//	int digit=num%10;
//	int power=1;
//	for(int i=1;i<=count;i++)
//	{
//		power=power*digit;
//	}
//	sum=sum+power;
//	count--;
//	num=num/10;
//}
//Sys(sum);
//num=temp;
//if(sum==num)
//{
//	Sys("disarium");
//}else
//{
//	Sysout("not");
//}}

//primeno for 1 to 10
//for(int num=1;num<=10;num++)
//{
//	boolean isprime=true;
//	for(int i=2;i<num;i++)
//	{
//		if(num%i==0)
//		{
//			isprime=false;
//			break;
//		}
//	}
//	if(isprime==true)
//	{
//		sysout(num);
//	}

//character pattern
//for(char i='A';i<='D';i++)
//{
//	for(char j='A';j<=i;j++)
//	{
//		sys(j);
//	}sys();}		
//2nd type
//for(int i=1;i<='5';i++)
//{
//	for( j=1;j<=i;j++)
//	{
//		System.out.print(char)(64+j)));
//	}
//}

