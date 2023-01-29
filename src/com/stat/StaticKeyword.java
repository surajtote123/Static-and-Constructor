package com.stat;

public class StaticKeyword {
	
	static int num1=10;
	
	int num2=10;
	
	public void getNum()
	{
		
		
		System.out.println("Static value = " + num1++);
		
		System.out.println("Non static value = " + num2++);
	}
	
	public static void main(String[] args) {
		
		StaticKeyword sk1=new StaticKeyword();
		
		sk1.getNum();
		
		StaticKeyword sk2=new StaticKeyword();
		
		sk2.getNum();
	}

}
