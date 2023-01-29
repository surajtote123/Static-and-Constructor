package com.constructor;

public class Student {
	
	public Student()
	{
		System.out.println("This is constructor");
	}
	
	public Student(int a)
	{
		System.out.println("Value of a = " + a);
	}
	
	public Student(String name)
	{
		System.out.println("name = " + name);
	}
	
	public static void main(String[] args) {
		
		Student s=new Student("suraj");
		
		System.out.println("sucess");
	}

}
