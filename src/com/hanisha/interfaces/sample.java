package com.hanisha.interfaces;
 

interface intfA 

{ 
 void name();
}
 
interface intfB extends intfA 
{ 
 void institute(); 
} 

 public class sample implements intfB 
{ 
	
	 public void name() 
	 { 
		 System.out.println("Hanisha"); 
	 } 

	
	 public void institute() 
	 { 
	     System.out.println("AU"); 
	 } 

	 public static void main (String[] args) 
	 { 
	     sample ob1 = new sample(); 
	     ob1.name(); 
	     ob1.institute(); 
	 } 
}
	


