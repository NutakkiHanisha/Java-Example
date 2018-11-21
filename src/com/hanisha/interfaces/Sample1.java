package com.hanisha.interfaces;

interface intgA 
{ 
    void name(); 
} 
  
interface intgB  
{ 
    void institute(); 
} 
  
interface intgC extends intgA, intgB  
{ 
    void branch(); 
} 
public class Sample1 implements intgC 
{ 
    public void name() 
    { 
        System.out.println("Hnai"); 
    } 
  
    public void institute() 
    { 
        System.out.println("AU"); 
    } 
  
    public void branch() 
    { 
        System.out.println("CSE"); 
    } 
      
    public static void main (String[] args) 
    { 
        Sample1 ob1 = new Sample1(); 
  
        
        ob1.name(); 
        ob1.institute(); 
        ob1.branch(); 
    }  

}
