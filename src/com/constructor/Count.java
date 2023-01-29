package com.constructor;

public class Count {
	
	static int count=1;
	
	public Count()
	{
		System.out.println(count);
		count++;
		
	}
	
	public static void main(String[] args) {
		
		Count c1=new Count();
		
		
		Count c2=new Count();
		
		
		Count c3=new Count();
	
		
		System.out.println(count);
	}
	

}
