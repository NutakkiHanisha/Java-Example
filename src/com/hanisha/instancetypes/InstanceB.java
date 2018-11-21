package com.hanisha.instancetypes;

public class InstanceB {
	
	public String functionB() {
		InstanceA a= new InstanceA();
		
		a.function2();
		return "Hanisha";
	}
	
	public static void main(String[] args) {
		boolean bl=InstanceA.function1();
		InstanceB b=new InstanceB();
		String name=b.functionB();
		System.out.println("name is:-"+name);
	}
}
