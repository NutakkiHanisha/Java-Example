package com.hanisha.primenumbers;

import java.util.Scanner;

public class Primenumber1 {
	public int n;
	public boolean checkForPrime() {
        boolean isItPrime = true;
         if(this.n<=1) {
            isItPrime = false;
             return isItPrime;
        }
        else {
        for (int i = 2; i < this.n; i++) {
                if ((this.n % i) == 0)
                {
                    isItPrime = false;
                    break;
                }
                    
            }
          return isItPrime;
        }
    }
	public Primenumber1(int n) {
		this.n=n;
	}
	
      public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
       
        Primenumber1 p = new Primenumber1(n);
       
       boolean isItPrime= p.checkForPrime(); 
           if(isItPrime)
      {
          System.out.println(" It is a prime number."+n);
      }
              else
      {
          System.out.println(" It is not a prime number."+n);
      }
    }

}
