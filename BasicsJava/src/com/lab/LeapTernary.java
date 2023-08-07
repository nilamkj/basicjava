package com.lab;

public class LeapTernary {

	public static void main(String[] args) {
		int year=2020;
		String result;
		result=(year%4==0&&year%100!=0||year%400==0)?"is leap year":"is not leap year";
		System.out.println(year+" "+result+"");

	}

}
