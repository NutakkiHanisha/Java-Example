package com.hanisha.primenumbers;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateElements3 {
	public  int DuplicateRemoval(int array[], int n){  
	       if (n==1){  
	           return n;  
	       }    
	       int j = 0;
	       for (int i=0; i < n-1; i++){  
	           if (array[i] != array[i+1]){  
	               array[j++] = array[i];  
	           }  
	       }  
	       array[j++] = array[n-1];  
	       return j;  
	   }  
	      
	   public static void main (String[] args) {  
	       Scanner sc=new Scanner(System.in);
	       System.out.println("Enter the size of array:");
	       int n=sc.nextInt();
	       
	       int arr[]=new int[n]; 
	       System.out.println("Enter the elements one by one:");
	       for (int s=0;s<arr.length;s++){
	           arr[s]=sc.nextInt();
	       }
	       Arrays.sort(arr);
	       DuplicateElements3 def = new DuplicateElements3();
	       
	       int k= def.DuplicateRemoval(arr, arr.length);  
	       System.out.println(" Array after removing the Duplicate Elements:");
	       for (int i=0; i<k; i++)  {
	          System.out.print(arr[i]+" ");  
	       }
	       sc.close();
	    }
}
