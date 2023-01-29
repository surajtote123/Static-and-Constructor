package com.stat;

import java.util.Scanner;

public class StaticMethod {
	
	public static int getSquare(int num)
	{
		return num*num;
		
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		System.out.println(StaticMethod.getSquare(num));
	}
	
	static
	{
		System.out.println("This is static method");
	}
}
