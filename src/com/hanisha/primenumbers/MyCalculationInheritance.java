package com.hanisha.primenumbers;

public class MyCalculationInheritance extends CalculationInheritance {
public static void main(String[] args) {
	int i=20;
	int j=30;
	MyCalculationInheritance mci= new MyCalculationInheritance();
	mci.addition(i,j);
	mci.subtraction(i,j);
	mci.multiplication(i,j);
}
}
