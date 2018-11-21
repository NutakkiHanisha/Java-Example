package com.hanisha.primenumbers;

import java.util.Scanner;

public class Primenumber2 {
	int num;
	

	public boolean isPrime() {
		for(int i=1; i < 100; i++){

            boolean isPrime = true;

            for(int j=2; j < i ; j++){

                    if(i % j == 0){
                            isPrime = false;
                            break;
                    }
            }
	}
		return false;
	}
	public Primenumber2(int num) {
		this.num=num;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("print numbers from 1 to 100");
		int num=sc.nextInt();
		
		Primenumber2 p1 = new Primenumber2(3);
        p1.isPrime();
        boolean isPrime=false;
        
	
			if(isPrime) {
				System.out.println(" "+num);
			
		}
	}
}
	
		



