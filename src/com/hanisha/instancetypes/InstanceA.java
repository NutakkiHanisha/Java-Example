package com.hanisha.instancetypes;

public class InstanceA {

	
	public String name;
	public int a;
	
	public static boolean function1() {
		System.out.println("From function1 of instanceA class");
		return false;
	}
	
	public int function2() {
		System.out.println("From function2 of instanceA class");
		
		return 2;
	}
	
	public String function3() {
		return "sai";
	}
	public InstanceA(String name, int a) {
		this.name=name;
		this.a= a;
	}
	
	public static void main(String[] args) {
		function1();
		InstanceA a= new InstanceA("hanisha",24);
		System.out.println("value of a is:-"+a.name);
		
		a.name="sai";
		a.a=20;
		System.out.println(a.name+a.a);
	
		a.function2();
		
	}
}
