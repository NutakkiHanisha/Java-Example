package com.hanisha.debugging;

public class Example1 {
public static void main(String[] args) {
	Counter counter=new Counter();
	counter.count();
	System.out.println(" we have counted"+counter.getResult());
}
}
