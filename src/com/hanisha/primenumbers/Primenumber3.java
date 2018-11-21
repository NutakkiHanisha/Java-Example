package com.hanisha.primenumbers;

import java.util.Scanner;

public class Primenumber3 {
	 public static boolean checkForPrime(int n)
	    {
	        boolean isItPrime = true;
	         
	        if(n <= 1) 
	        {
	            isItPrime = false;
	             
	            return isItPrime;
	        }
	        else
	        {
	            for (int i = 2; i < n; i++) 
	            {
	                if ((n % i) != 0)
	                {
	                    isItPrime = false;
	                     
	                    break;
	                }
	            }
	             
	            return isItPrime;
	        }
	    }
	     
	    public static void main(String[] args) 
	    {
	        Scanner sc = new Scanner(System.in);
	         
	        System.out.println("Enter a number :");
	         
	        int n = sc.nextInt();
	         
	        boolean isItPrime = checkForPrime(n);
	         
	        if (isItPrime)
	        {
	            System.out.println(n+" is a prime number.");
	        }
	        else
	        {
	            System.out.println(n+" is not a prime number.");
	        }
	         
	        
	    }

}
